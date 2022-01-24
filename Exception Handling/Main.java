public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        
        try {
            // int c = a / b;
            // divide(a, b);
            // throw new Exception("Just for fun");
            throw new MyException("Hehe");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
        //  catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // finally{
        //     System.out.println("This will alwys execute");
        // }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Dont divide by zero");
        }

        return a / b;
    }
}
