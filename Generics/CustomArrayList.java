public class CustomArrayList {
    
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }

        data[size] = num;
        size++;
    }

    private void resize() {
        int[] temp = new int[data.length + 2];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int remove = data[--size];
        return remove;
    }
    
    public int getVale(int index){
        return data[index];
    }

    public int Size(){
        return size;
    }

    public void Set(int index, int value){
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(9);
        list.add(7);


        System.out.println(list);
    }


}
