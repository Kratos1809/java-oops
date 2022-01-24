public class Box {
    double l;
    double w;
    double h;


    static void greeting(){
        System.out.println("Hey, I am in Box Class. Greeting");
    }

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double h, double w){
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
            this.l = old.l;
            this.h = old.h;
            this.w = old.w;
    }
}
