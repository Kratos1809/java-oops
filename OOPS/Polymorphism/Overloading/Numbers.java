package Overloading;

// Same name but types, arguments, return types, ordering of types can be different
public class Numbers {
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        
        Numbers obj = new Numbers();

        obj.sum(5, 5);  //Same function name inviked
        obj.sum(4,5,6); //same function name invoked with different arguments
    }
}

