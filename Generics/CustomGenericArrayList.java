import java.util.Arrays;


// here T should be either Number class or its subclasses
public class CustomGenericArrayList<T extends Number> {
    
        private Object[] data;
        private int DEFAULT_SIZE = 10;
        private int size = 0;
    
        public CustomGenericArrayList() {
            data = new Object[DEFAULT_SIZE];
        }
    
        public void add(T num){
            if(this.isFull()){
                resize();
            }
    
            data[size] = num;
            size++;
        }
    
        private void resize() {
            Object[] temp = new Object[data.length + 2];
    
            for (int i = 0; i < temp.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
    
        public T remove(){
            T remove = (T)(data[--size]);
            return remove;
        }
        
        public T getValue(int index){
            return (T)data[index];
        }
    
        public int Size(){
            return size;
        }
    
        public void Set(int index, T value){
            data[index] = value;
        }
    
        private boolean isFull() {
            return size == data.length;
        }

        public String toString(){
            return "CustomGenericArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + "}";
        }
    
        public static void main(String[] args) {
            CustomGenericArrayList<Number> list = new CustomGenericArrayList<>();
            list.add(5);
            list.add(9);
            list.add(7);
            list.add(7.999);
    
    
            System.out.println(list);
        }
    
    
    }
