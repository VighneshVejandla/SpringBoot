import javax.sound.midi.Soundbank;
import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Addition {

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>(Arrays.asList(
                new Employee (1,"Vighnesh", "Intern", 45000),
                new Employee(2, "Sowmya", "Intern", 4000),
                new Employee(3, "Vamsi", "Hr", 50000)
        ));

        emp.add(new Employee(4, "Chakrish", "Student", 30000));
        emp.add(new Employee(5, "Preetham ", "Program Analysist", 45550));
        emp.add(new Employee(6, "Roith", "Program Analysist", 45500));

//        emp.remove(2);
        System.out.println(emp);
        System.out.println();
        emp.forEach(System.out::println);

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

        emp.stream().filter(i -> i.getDept().equals("Student"))
                .forEach(System.out::println);

        long count = emp.size();
        System.out.println("count : " + count);

        long count1 = emp.stream().filter(i -> i.getSalary()>40000).count();
        System.out.println("Count employees salary > 40000 : " + count1);


        System.out.println("----------------------------------------------");

        String str = "Vighnesh";
        String str1 = "Vighnesh";
        System.out.println(str1.equals(str));

        System.out.println("-----------------------------------------------");

        Student stu = new Student();
        stu.setName("vamsi");

        Student stu1 = new Student();
        stu.setName("vamsi");

        System.out.println(stu.getName().equals(stu1.getName()));




    }
}
