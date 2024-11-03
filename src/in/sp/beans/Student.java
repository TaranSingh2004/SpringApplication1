package in.sp.beans;

public class Student {
    private String email;
    private String name;
    private int rollno;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void display(){
        System.out.println("Name:" + name);
        System.out.println("rollno:" + rollno);
        System.out.println("email:" + email);
    }
}
