
public class GenericDemo<T> {

    T data[] =(T[]) new Object[3];

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo();
        gd.data[0] = "Hi";
        gd.data[1] = "bye";
//        gd.data[2] = 10;
        String str = gd.data[0];
    }
}
