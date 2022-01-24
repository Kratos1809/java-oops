 public class A {
    private int num;    //When no access modifier is mentioned, you cannot access it outside the package
    protected int num2;
    int num3;
    String name;
    int[] arr;

    public int getNum(){
        return num;
    }

     A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
