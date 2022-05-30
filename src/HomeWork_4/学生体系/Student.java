package HomeWork_4.学生体系;

public class Student {
    String name;
    String sex;
    int no;

    Student(int no, String name, String sex) {
        this.no = no;
        this.name = name;
        this.sex = sex;
    }

    public void attendClass(String className) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNo() {
        return no;
    }

    public void print() {
        System.out.println("no: " + no);
        System.out.println("name: " + name);
        System.out.println("sex: " + sex);
    }

    public void setNo(int no) {
        this.no = no;
    }
}
