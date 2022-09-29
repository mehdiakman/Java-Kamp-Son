public class Main {
    public static void main(String[] args) {
        char harf = 'e';

        switch (harf) {
            case 'A','a':
            case 'I','ı':
            case 'O','o':
            case 'U','u':
                System.out.println("Kalın sesli haf");
                break;

            case 'E','e':
            case 'İ','i':
            case 'Ö','ö':
            case 'Ü','ü':
                System.out.println("İnce Sesli harf");
                break;
            default:
                System.out.println("Geçersiz Karakter Seçimi");

        }
    }
}