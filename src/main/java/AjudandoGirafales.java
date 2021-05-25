import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class AjudandoGirafales {
    public static void main(String[] args) throws IOException {
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        int numStudents = Integer.parseInt(line.readLine());

        ArrayList<Student> students = new ArrayList<Student>();
        List<String> colorAndSize;

        String name, color, size;
        Integer sizeNum;

        for (int i = 0; i < numStudents; i++){
            name = line.readLine();
            colorAndSize = Arrays.stream(line.readLine().split(" ")).collect(Collectors.toList());
            color = colorAndSize.get(0);
            size = colorAndSize.get(1);

            sizeNum = size.equals("P")?1:size.equals("M")?2:3;

            students.add(new Student(name, color, size, sizeNum));


        }

        Collections.sort(students, Comparator.comparing(Student::getColor)
                .thenComparing(Student::getSizeNum).thenComparing(Student::getName));


        students.forEach(System.out::println);
    }


    public static class Student{
        String name;
        String color;
        String size;
        Integer sizeNum;

        public Student(String name, String color, String size, Integer sizeNum) {
            this.name = name;
            this.color = color;
            this.size = size;
            this.sizeNum = sizeNum;
        }

        public Integer getSizeNum() {
            return sizeNum;
        }

        public void setSizeNum(Integer sizeNum) {
            this.sizeNum = sizeNum;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return this.color + " " + this.size + " " + this.name;
        }

    }
}


