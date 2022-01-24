public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circles();
        Triangle triangle = new Triangle();

        circle.area();  // will access the area function of the child class Circle even though the reference variable is of type SHapes

        /* We know when a reference variable is of type parent class and the obejct is of type child class,
        what functions or variables are accessible depends upon the type of the reference variable i.e. the left hand side and not the type of the object.
        But, in Overriding, when both the parent and child class contains a function of the same name, which function it should call depends upon the type of the object.
        So, what functions are accesible depends on the type of reference and which function will it call depends on the object type. */
        
        triangle.areas(); // will check for areas function inside its child class first then will search for areas function inside parent class
    }

}
