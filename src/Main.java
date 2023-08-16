import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username = "Furkan", password = "1234Koc";
        int girisHakki = 3, select, ATMselect;
        double bakiye = 17118.00, tutar;
        Scanner input = new Scanner(System.in);
        while (girisHakki > 0){
            System.out.println("Lütfen username bilginizi giriniz!");
            username = input.nextLine();
            System.out.println("Lütfen şifrenizi giriniz!");
            password = input.nextLine();

            if (username.equals("Furkan") && password.equals("1234Koc")){
                System.out.println("Kullanıcı giriş bilgileriniz doğru!!!");
                System.out.println("Bankamıza hoş geldiniz. Yapmak istediğiniz işlemi seçiniz :\n1- Para Çekme\n2- Para Yatırma\n3- Bakiye Sorgulama");

                while (girisHakki > 0){
                    ATMselect = input.nextInt();

                    if (ATMselect == 1){
                        System.out.println("Lütfen çekmek istediğiniz tutarı giriniz");
                        tutar = input.nextInt();
                        bakiye -= tutar;
                        System.out.println("Güncel bakiyeniz : " + bakiye + "TL'dir");
                        System.out.println("Yapmak istediğiniz işlemi seçiniz :\n2- Para Yatırma\n3- Bakiye Sorgulama");

                    } else if (ATMselect == 2){
                        System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz");
                        tutar = input.nextInt();
                        bakiye += tutar;
                        System.out.println("Güncel bakiyeniz : " + bakiye + "TL'dir");
                        System.out.println("Yapmak istediğiniz işlemi seçiniz :\n1- Para Çekme\n3- Bakiye Sorgulama");

                    } else {
                        System.out.println("Güncel bakiyeniz : " + bakiye + "TL'dir");
                        System.out.println("Yapmak istediğiniz işlemi seçiniz :\n1- Para Çekme\n2- Para Yatırma");

                    }
                }
                break;
            } else if (username.equals("Furkan") && !password.equals("1234Koc")) {
                System.out.println("Şifrenizi yanlış girdiniz. Bilgilerinizi kontrol edip tekrar giriniz!");
                --girisHakki;
            } else if (!username.equals("Furkan") && password.equals("1234Koc")) {
                System.out.println("Kullanıcı adınızı yanlış girdiniz. Bilgilerinizi kontrol edip tekrar giriniz!");
                --girisHakki;
            } else {
                System.out.println("Username ve şifrenizi yanlış girdiniz. Bilgilerinizi kontrol edip tekrar giriniz!");
                --girisHakki;

                if ( girisHakki == 0) {
                    System.out.println("3 kez hatalı giriş yaptınız. Tekrar giriş yapabilmek için 1'e, Çıkış yapmak için 2'e basınız.");
                    select = input.nextInt();
                    if (select == 1){
                        girisHakki = 3;
                    }
                }
            }
        }
    }
}