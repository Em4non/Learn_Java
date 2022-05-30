package HomeWork_4.学生体系;

public class CollegeStudent extends Student {
    String major;

    CollegeStudent(int no, String name, String sex, String major) {
        super(no, name, sex);
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void print() {
        System.out.println("no: " + no);
        System.out.println("name: " + name);
        System.out.println("sex: " + sex);
        System.out.println("major: " + major);
    }


}
