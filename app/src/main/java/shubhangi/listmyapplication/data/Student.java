package shubhangi.listmyapplication.data;

public class Student {

    String name;
    String address;
    String phone;
    String classname;
    String collegename;

    public Student(String name, String address, String phone, String classname, String collegename) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.classname = classname;
        this.collegename = collegename;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }
}
