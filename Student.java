public class Student {
    String sur;
    String name;
    int school;
    int math;
    int rus;
    int inf;

    public Student() {
        sur = "";
        name = "";
        school = 0;
        math = 0;
        rus = 0;
        inf = 0;
    }

    public Student(String sur, String name, int school, int math, int rus, int inf) {
        this.sur = sur;
        this.name = name;
        this.school = school;
        this.math = math;
        this.rus = rus;
        this.inf = inf;
    }

    public String getSur() {
        return sur;
    }

    public String getName() {
        return name;
    }

    public int getSchool() {
        return school;
    }

    public int getMath() {
        return math;
    }

    public int getRus() {
        return rus;
    }

    public int getInf() {
        return inf;
    }
}
