public class City extends Student {
    private Student[] students;
    public double mathAv;
    public double rusAv;
    public double infAv;
    public double allAv;

    public City(Student[] arr) {
        students = new Student[arr.length];
        mathAv = 0;
        for (int i = 0; i < arr.length; i++) {
            mathAv += arr[i].math;
        }
        mathAv /= arr.length;
        rusAv = 0;
        for (int i = 0; i < arr.length; i++) {
            rusAv += arr[i].rus;
        }
        rusAv /= arr.length;
        infAv = 0;
        for (int i = 0; i < arr.length; i++) {
            infAv += arr[i].inf;
        }
        infAv /= arr.length;

        allAv = (mathAv + rusAv + infAv) / 3;
    }
}
