package beans;

public class Welcome {
    static {
        System.out.println("Welcome bean class loading...");
    }

    public Welcome(){
        System.out.println("Welcome bean class instantiating...");
    }

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void welcomeUser(){
        System.out.println("Hello " + this.userName + "! Welcome to IG!!");
    }
}
