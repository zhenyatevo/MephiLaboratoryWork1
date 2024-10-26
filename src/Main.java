import java.util.ArrayList;
public class Main {

    // метод для отчисления не успевающих и перевода успевающих студентов
    private static void studentsMarks(ArrayList<Student> students){
        Student [] student = new Student[students.size()];
        students.toArray(student);
        for(int i = 0; i< student.length; i++) {
            int mark = 0;
            int value = 0;
            ArrayList<Integer> points = student[i].getPoints();
            for(int j = 0; j< points.size(); j++) {
                mark += points.get(j);
                value ++;
            }
            mark = mark/value;
            if (mark < 3) {
                students.remove(student[i]);
            }
            else{
                student[i].setCourse(student[i].getCourse()+1);
            }
        }
    }
    private static void printStudents(ArrayList<Student> students, int course){
        for (Student student : students) {
            if(student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    public static void main(String[] args) {

        var student1 =  new Student("Vasya", 37, 3, "2 3 4 5 5 4 3");
        var student2 = new Student("Nikita", 42, 4, "5 5 4 5 5 3 5");
        var student3 = new Student("Lyuba", 14, 2, "3 3 2 3 3 3");
        var student4 = new Student("Misha", 14, 2, "4 4 3 4 5");
        var student5 = new Student("Thoma", 13, 2, "5 5 2 5 5 5 5 5");
        var student6 = new Student("Dima", 37, 3, "3 3 3 3 3");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("Студенты 2го курса:");
        printStudents(students, 2);
        System.out.println("*Прошла комиссия*");
        studentsMarks(students);
        System.out.println("Кого-то отчислили, кото-то перевели, в группе остались(теперь уже на группу старше):");
        printStudents(students, 3);

    }
}