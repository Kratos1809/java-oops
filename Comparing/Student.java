public class Student {
    
    int roll;
    int marks;


    public Student(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }


    public String toString(){
        return marks + " ";
    }

    // @Override
    // public int compareTo(Student o) {
    //     int diff = this.marks - o.marks;
    //     return diff;
    // }
}
