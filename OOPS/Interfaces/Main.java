public class Main {
    public static void main(String[] args) {
        // Car car = new Car(45);
        
        // System.out.println(car.a);
        // System.out.println(Engine.PRICE);
        // car.acc();
        // car.brake();
        // car.start();
        // car.stop();

        
        NiceCar car = new NiceCar();
        car.start();
        car.MusicStart();
        

        Engine car2 = new ElectricEngine();
        // NiceCar car3 = new NiceCar(car2);
        // car3.start();
        // car3.MusicStart();

        car.upgrade(car2);
        car.start();
        car.MusicStart();
        
        
    }
}
