public class Boxprice extends Boxweight {
    
    double cost;

    Boxprice(){
        super();
        this.cost = -1;
    }

    Boxprice(Boxprice other) {
        super(other);
        this.cost = other.cost;
    }

    Boxprice(double l,double w, double h, double weight, double cost){
        super(l, h, w, weight);
        this.cost = cost;
    }

}
