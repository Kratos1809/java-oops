public class Objectdemo extends Object {

    int num;
    // int value;

    Objectdemo(int num){
        this.num = num;
    }
    
    //Overiding methods present the Object class
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    
    public static void main(String[] args) {
        Objectdemo obj = new Objectdemo(50);
        Objectdemo obj2 = new Objectdemo(50);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        // System.out.println(obj.getClass());
    }

}
