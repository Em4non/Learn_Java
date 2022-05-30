package HomeWork_4.学生体系;

public class GraduateStudent extends CollegeStudent {
    String supervisor;

    GraduateStudent(int no, String name, String sex, String major, String supervisor) {
        super(no, name, sex, major);
        this.supervisor = supervisor;
    }

    public void doResearch() {
        System.out.println(name + " is doing research");
    }

    @Override
    public void print() {
        System.out.println("no: " + no);
        System.out.println("name: " + name);
        System.out.println("sex: " + sex);
        System.out.println("major: " + major);
        System.out.println("supervisor: " + supervisor);
    }
}
