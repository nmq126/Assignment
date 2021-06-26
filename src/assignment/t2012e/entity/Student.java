package assignment.t2012e.entity;

public class Student {
    private String rollNumber;
    private String fullName;
    private String email;
    private String phone;

    @Override
    public String toString() {
        return String.format("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s\n",
                "", rollNumber, "",
                "", fullName, "",
                "", email, "",
                "", phone, "");
    }

    public Student() {
    }

    public Student(String rollNumber, String fullName, String email, String phone) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
