import javax.print.attribute.standard.MediaSize.Other;

public class Human implements Cloneable{
    
    int age;
    String name;
    int[]arr;
    
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,7,8,9,6};
    }

    // public Human(Human other) {
    //     this.age = other.age;
    //     this.name = other.name;
    // }
    
    @Override
    public Object clone() throws CloneNotSupportedException{        //this is shallow copy
        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];            
        }
        
        return twin;
    }

    

}
