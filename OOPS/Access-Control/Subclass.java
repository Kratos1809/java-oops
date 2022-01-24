 class Subclass extends A {

    public Subclass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(33, "Akash");
        // int a = obj.num; // num declared private cant be accessed in subclass same package
        int n = obj.num2; // num2 declared protected can be accessed in subclass same pacakge and as well as diff package
        int b = obj.num3; // no modifier can be accessed in subclass same pacakge but not in subclass diff pacakge 
    }
}
