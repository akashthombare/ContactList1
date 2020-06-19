package Com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Com.dto.Contact;

public class ContactModel {
    public int save(Contact c) {
    	int count=0;
    	Connection con=null;
    	try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
    		PreparedStatement pst=con.prepareStatement("insert into phbook values(contlist.nextval,?,?,?)");
    		pst.setString(1,c.getName());
    		pst.setString(2,c.getContact());
    		pst.setString(3,c.getEmail());
    		count=pst.executeUpdate();
    		con.close();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	return count;
    }
}
