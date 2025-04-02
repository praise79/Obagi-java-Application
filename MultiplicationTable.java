public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5; 
        int i = 1;
        
        System.out.println("Multiplication table of " + num + ":");
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}
