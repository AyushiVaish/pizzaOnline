/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;


import java.io.Serializable;

public class FormBean implements Serializable {
    private int id;
    private String username,number,pass,email,address,zip;
    private boolean Valid;
    FormBean()
    {
        
    }
   public int getId()
   {
       return id;
   }
    
   public void setId(int id){
       this.id=id;
   }
     public String getNumber()
   {
       return number;
   }
    
   public void setNumber(String number){
       this.number=number;
   }
   public String getUserName()
   {
       return username;
       
   }
   public void setUserName(String username)
   {
       this.username=username;
   }
   public String getPass()
   {
       return pass;
   }
   public void setPass(String pass)
   {
       this.pass=pass;
   }
   public String getEmail()
   {
       return email;
   }
   public void setEmail(String email)
   {
       this.email=email;
   }
    public String getAddress()
   {
       return address;
       
   }
   public void setAddress(String address)
   {
       this.address=address;
   }
    public String getZip()
   {
       return zip;
       
   }
   public void setZip(String zip)
   {
       this.zip=zip;
   }
   public boolean Valid()
   {
       return Valid;
   }
   public void setValid(boolean Valid) {
       this.Valid=Valid;
   }

    boolean valid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

