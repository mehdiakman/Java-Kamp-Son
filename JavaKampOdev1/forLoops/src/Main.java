public class Main {
    public static void main(String[] args) {
        //Birbirine benzeyen işleri tekrarlamaya yarar.

        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");


        //i+=2 demek sayıyı 2 şer olarak arttır'
        for(int i=1;i<=10;i+=2) {
            System.out.println(i);
        }

        int i =2;
        //While
        while(i<10) {
            System.out.println(i);
            i+=2;
        }
        //infinite loop
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j =1;
        do {
            System.out.println(j);
            i+=2;
        }while(j<10);

        System.out.println("Do-While Döngüsü Bitti");
    }
}