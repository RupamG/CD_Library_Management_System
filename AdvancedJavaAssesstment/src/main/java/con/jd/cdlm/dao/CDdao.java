package con.jd.cdlm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jd.cdlm.bean.CDBean;
import com.jd.cdlm.connection.DBUtil;




public class CDdao {
	static Connection con = DBUtil.getConnection();
	public boolean addCD(CDBean cb) throws SQLException, ClassNotFoundException{
		
		int cdId=cb.getCdId();							
		String cdName=cb.getCdName();						
		int releaseYear=cb.getReleaseYear();					
		double price=cb.getPrice();
		
		
		PreparedStatement pst = con.prepareStatement("insert into CD values(?,?,?,?)");
		pst.setInt(1, cdId);	
		pst.setString(2, cdName);
		pst.setInt(3, releaseYear);
		pst.setDouble(4,price);
		
		
		int x = pst.executeUpdate();
		if (x > 0)           
            return true;           
        else           
            return false;
		
	}
	
	public int deleteCD(int cdId) throws SQLException{
		Statement stmt = con.createStatement();
	    
	    String q1 = "DELETE from CD WHERE cdId = '" +cdId + "'";
	    int x= stmt.executeUpdate(q1);
	   return x;
	    
	}

	public void updateCDPrice(int cdId, double price) throws SQLException{
		Statement stmt = con.createStatement();
	    
	    String q1 = "UPDATE CD set price = '" + price +
	            "' WHERE cdId = '" +cdId + "'";
	    stmt.executeUpdate(q1);
	     
	    
	}
	
	public List<CDBean> viewAllCDs() throws SQLException {
		List<CDBean> eList = new ArrayList<CDBean>();
        try {
            Statement st = con.createStatement();
            String q = "select * from CD";
            ResultSet r = st.executeQuery(q);
           
            
            while (r.next()) {
            	CDBean e = new CDBean(r.getInt(1), r.getString(2), r.getInt(3),r.getDouble(4));
                eList.add(e);
            }
        } catch (Exception e) {
            // TODO: handle exception
        	e.printStackTrace();
        }

 

        return eList;
	}
	
	public List<CDBean> viewSearchedCDs(int releaseYear) throws SQLException {
		List<CDBean> eList = new ArrayList<CDBean>();
        try {
            Statement st = con.createStatement();
            String q1 = "SELECT * from CD where releaseYear = '" + releaseYear + "'";
            ResultSet r = st.executeQuery(q1);
            while (r.next()) {
            	CDBean e = new CDBean(r.getInt(1), r.getString(2), r.getInt(3),r.getDouble(4));
                eList.add(e);
            }
        } catch (Exception e) {
            // TODO: handle exception
        	e.printStackTrace();
        }

 

        return eList;
	}

}


