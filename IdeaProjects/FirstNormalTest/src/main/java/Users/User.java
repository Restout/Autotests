package Users;

public class User{
    private String Ulogin ;
    private  String Fullname;
    private String Upassword=null;
    private String id;
    public User(String name, String login, String password){
        Fullname=name;
        Ulogin=login;
        Upassword=password;

    }
    public String GetFullName(){
        return  Fullname;
    }
    public String GetUlogin(){
        return Ulogin;
    }
    public String GetUpassword(){
        return Upassword;
    }
}

