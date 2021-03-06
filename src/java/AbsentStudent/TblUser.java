package AbsentStudent;
// Generated Sep 30, 2021 10:24:13 PM by Hibernate Tools 4.3.1

import Login.Login;
import java.util.List;
import javax.faces.bean.ManagedBean;




/**
 * TblUser generated by hbm2java
 */
@ManagedBean
public class TblUser  implements java.io.Serializable {


     private int idUser;
     private String username;
     private String password;
     
     public void save_siswa()
     {
         Login add = new Login();
         add.add_user(this);
     }
     
     public String login_user()
     {
         Login uLog = new Login();
         List<TblUser> us = uLog.getBy(username, password);
         try {
             if(us != null) {
                username =  us.get(0).username;
                password = us.get(0).password;
                return "Home";
             } 
         } catch (Exception e) {
             System.out.println(e);
         }
         return "Failed";
     }

    public TblUser() {
    }

    public TblUser(int idUser, String username, String password) {
       this.idUser = idUser;
       this.username = username;
       this.password = password;
    }
   
    public int getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


