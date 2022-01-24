
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(2, 3, 4);
        // Box box2 = new Box(box1);

        // System.out.println(box2.l + " " + box2.h);
        Boxweight box3 = new Boxweight(2, 3, 4, 5);
        // System.out.println(box3.weight);

        Box box5 = new Boxweight(2, 3, 4, 5);
        System.out.println(box5.l + " " + box5.h + " " + box5.w);   // not giving any error
        System.out.println(box5.weight);    //giving an error because its the type of reference variable(here Box) and not the type of the object(here Boxweight) that determines what all members are accessible


        // // there are many variables in both parent and child classes
        // // you are given access to variables that are in the ref type i.e. BoxWeight
        // // hence, you should have access to weight variable
        // // this also means, that the ones you are trying to access should be initialised
        // // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // // this is why error
        Boxweight box6 = new Box(2,3,4);    //if we consider the type of the reference then we should be able to access the members of Boxweight class. But am i initializing the weight variable. FUCKING NO, i am calling the constructor of the parent class. Watch Kunal OOP3 Lecture, Timestamp 33:00 - 35:00 
        System.out.println(box6);

        Box box7 = new Boxweight(box3);
        System.out.println(box7.l); 

        Boxprice box9 = new Boxprice(2, 3, 4, 5, 6);
        Boxprice box8 = new Boxprice(box9);
        System.out.println(box9.weight);
    }
}
