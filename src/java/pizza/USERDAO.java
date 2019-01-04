/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.sql.*;


/**
 *
 * @author USER
 */
public class USERDAO {
    static Connection currentCon = null;
    static ResultSet rs=null;
    public static FormBean login(FormBean bean)
    {
        PreparedStatement ps= null;
        String email=bean.getEmail();
        String password=bean.getPass();
        String sql="select * from login where email=? and password=?";
        try
        {
            currentCon=DBConnection.getConnection();
            ps=currentCon.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2,password);
            rs=ps.executeQuery();
            if(rs.next())
            {
                System.out.println("welcome " + email);
                bean.setEmail(email);
                bean.setValid(true);
                
            }
            else{
                System.out.println("Login Failed");
                bean.setValid(false);
            }
        }
             catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     
        return bean;
    }    
    
}

