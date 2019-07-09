import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * program <code>Main</code>
 *
 * @author andre
 * @task stepik-levin-2.5.3
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String tmp = in.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String t = in.nextLine();
            String[] s = t.split(" ");
            students[i] = new Student(s[0], s[1],
                    Integer.valueOf(s[2]), Integer.valueOf(s[3]), Integer.valueOf(s[4]), Integer.valueOf(s[5]));
        }
        City msk = new City(students);
        System.out.print("Отчет по городу: ");
        System.out.format("математика - %.1f, ", msk.mathAv);
        System.out.format("русский язык - %.1f, ", msk.rusAv);
        System.out.format("информатика - %.1f, ", msk.infAv);
        System.out.format("общий средний балл - %.1f\n", msk.allAv);

        System.out.println("Отчет по школам:");
        Set<Integer> setSchoolNum = new HashSet<>();
        for (int i = 0; i < n; i++) {
            setSchoolNum.add(students[i].school);
        }
        System.out.println("number of schools=" + setSchoolNum.size());
        /*Arrays.sort(students, Comparator.comparing(Student::getSur).reversed().thenComparing(Student::getSchool));
        for (Student t : students) {
            System.out.print(t.sur + " " + t.name + "\n");
        }*/

        /*Arrays.sort(students, Comparator.comparing(Student::getSur).reversed().thenComparing(Student::getSchool));
        System.out.print("Лучший результат по математике - ");
        for (Student t : students) {
            System.out.print(t.sur + " " + t.name + "\n");
        }*/
    }
}
/*
7
Иванов Иван 32 80 80 80
Петров Петр 71 91 89 100
Олег Т 1 15 60 30
Воронов Максим 32 100 100 100
Зеленская Екатерина 1 75 99 67
Столярова Анна 17 78 87 77
Логинова Полина 89 66 54 78

Отчет по городу: математика - 72.1, русский язык - 81.3, инфрматика - 76.0, общий средний балл - 76.5
Отчет по школам:
Школа № 71: математика - 91.0, русский язык - 89.0, инфрматика - 100.0, общий средний балл - 93.3
Школа № 32: математика - 90.0, русский язык - 90.0, инфрматика - 90.0, общий средний балл - 90.0
Школа № 17: математика - 78.0, русский язык - 87.0, инфрматика - 77.0, общий средний балл - 80.7
Школа № 89: математика - 66.0, русский язык - 54.0, инфрматика - 78.0, общий средний балл - 66.0
Школа № 1: математика - 45.0, русский язык - 79.5, инфрматика - 48.5, общий средний балл - 57.7
Лучший результат по математике - Воронов Максим - 100
Лучший результат по русскому языку - Воронов Максим - 100
Лучший результат по информатике - Воронов Максим - 100
Лучший результат по информатике - Петров Петр - 100
*/