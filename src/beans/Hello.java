package beans;

public class Hello {
    static {
        System.out.println("Hello bean class loading...");
    }

    public Hello() {
        System.out.println("Hello bean class instantiating...");
    }
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void helloUser(){
        System.out.println("Hello " + this.userName + "! Have a nice day!!");
    }
}
