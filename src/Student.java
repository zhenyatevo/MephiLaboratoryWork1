import java.util.ArrayList;

public class Student {
    private String name;
    private int group;
    private  int course;
    ArrayList<Integer> points = new ArrayList<>();
    public Student(String name, int group, int course, String points){
        this.name = name;
        this.group = group;
        this.course = course;
        String[] studentPoints = points.split(" ");
        for (String point : studentPoints) {
            this.points.add(Integer.parseInt(point));
        }

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }
}
