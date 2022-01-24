public class Boxweight extends Box {
    double weight;

    Boxweight(){
        super();
        this.weight = -1;
    }

    // @Override
    static void greeting(){
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
    }
    
    Boxweight(Boxweight other){
        super(other);
        this.weight = 7;
    }

    Boxweight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    Boxweight(double l, double h, double w, double weight){
        super(l,h,w);   // calling the parent class constructor, used to initialize the values present in parent class first
        this.weight = weight;
    }
}
