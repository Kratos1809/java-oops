import java.util.Arrays;
import java.util.Comparator;

public class Main {
    
    public static void main(String[] args) {
        Student rajiul = new Student(17, 19);
        Student kunal = new Student(16, 43);
        Student aranya = new Student(43, 99);
        Student rhythim = new Student(30, 94);
        Student santanu = new Student(56, 50);
        Student priya = new Student(6, 67);

        Student[] list = {rajiul, kunal, aranya, rhythim, santanu,priya};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                
                return -(o1.marks - o2.marks);
            }
            
        });

        System.out.println(Arrays.toString(list));


        // if(rajiul.compareTo(kunal) < 0){
        //     System.out.println(rajiul.compareTo(kunal));
        //     System.out.println("Kunal has more marks");
        // }
       
    }
}
