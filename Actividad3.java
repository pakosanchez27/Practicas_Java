public class Actividad3 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
           int b = 1;
           while (b <= 10){
               System.out.print("\t" + num*b);
               b++;
           }
            System.out.println(" ");
           num++;
        }

    }
}
