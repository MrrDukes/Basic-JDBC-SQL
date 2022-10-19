import java.sql.*;

public class BasicJDBC {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        try { //Use a try/catch block to catch any database exceptions
            //Create a connection to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", "root", "admin");

            //Create a new SQL statement using the connection
            Statement stmt = con.createStatement();

            //Execute the SQL statement to retrieve a result set of records from the database.
            ResultSet rs = stmt.executeQuery("select * from categories");  //This SQL query will retrieve all of the records in the categories table

            //Use a while loop to iterate through the resul [tset of records
            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
                        rs.getString(3) + "  " + rs.getString(4));
            }//end while look

            //Insert a record in the database
            stmt.executeUpdate("INSERT INTO CATEGORIES (categoryID, CategoryName, Description) VALUES (20, \"Paper Products\", \"Paper plates and napkins\")");

            //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from categories");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()){
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
                        rs.getString(3) + "  " + rs.getString(4));
            }//end while look*/

            //Delete a record from the database
            stmt.executeUpdate("DELETE FROM CATEGORIES WHERE CategoryID = 20;");

            //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from categories");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()){
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
                        rs.getString(3) + "  " + rs.getString(4));
            }//end while loop

            ///////-----Lab challenge


            //--------lab challenge 1
             rs = stmt.executeQuery("Select FirstName, LastName From Employees");  //This SQL query will retrieve all of the records in the categories table

            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getString(1) + "  " + rs.getString(2));

            }//end while loop*/


            rs = stmt.executeQuery("Select * From order_details");

            while (rs.next()) {
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + " " +rs.getString(3) +
                    "  " + rs.getString(4) + "  " + rs.getString(5) + "  " + rs.getString(6));

            }//end while loop

            stmt.executeUpdate("INSERT Into employees (LastName, FirstName, BirthDate, HireDate)  Values (\"mohammed\", \"dobby\", \"2004-9-27\", \"2004-9-27\")");

            rs = stmt.executeQuery("select * from employees");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()){
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            }//end while loop
            //Close the connection to the database


            stmt.executeUpdate("UPDATE employees  SET Extension = 'x7890' WHERE LastName = 'osman'");


            stmt.executeUpdate("INSERT Into employees (LastName, FirstName, BirthDate, HireDate)  Values (\"Dwight\", \"Schrute\", \"2004-9-27\", \"2004-9-27\")");

            rs = stmt.executeQuery("select * from employees");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()){
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            }//end while loop

            //Delete a record from the database
            stmt.executeUpdate("DELETE FROM employees WHERE LastName ='Dwight'");

            //Execute the SQL statement to retrieve a result set of records from the database.
            rs = stmt.executeQuery("select * from employees");  //This SQL query will retrieve all of the records in the categories table

//Use a while loop to iterate through the resultset of records
            while (rs.next()){
                //print out the data in each of the columns in the current record
                //The first column contains an integer, so we are calling the getInt method.
                //The remaining three columns are text values, so we are calling the getString method.
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
                        rs.getString(3) + "  " + rs.getString(4));
            }//end while loop

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        } //end try catch




    }
}//end class