import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String userName, password;

        Scanner inp = new Scanner (System.in);
        int right = 3;
        int balance = 2000;
        int  select;
        int price; 

        while (right > 0){
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = inp.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = inp.nextLine();

            if(userName.equals("java") && password.equals("kahve")){
                System.out.println("bugsbunny bankasına hoşgeldiniz.");
              
                do{ 
                System.out.println("1-Para yatırma\n"+
                "2-Para çekme\n"+
                "3-Bakiye sorgulama\n" +
                "4-Çkış yap"); 

                System.out.print("Lütfen yapmak istediğiniz işlemi belirtiniz : ");
                select = inp.nextInt();
                
                switch(select){
                    case 1 :
                    System.out.print("Para miktarı : ");
                    price = inp.nextInt();
                    balance += price;
                    break;

                    case 2 :
                    System.out.print("Para miktarı : ");
                    price = inp.nextInt();
                    
                    if(price > balance){
                        System.out.println("Yetersiz bakiye!");
                    }else{
                        balance -=price;
                    }
                    break;

                    case 3 : 
                    System.out.println("Mevcut bakiyeniz : " + balance);
                    break;
               } 
            }while(select !=4);

            System.out.println("Görüşmek Üzereee!");
            break; 

           } else{
            right--;
            if(right==0){
                System.out.println("Hesabnınız bloke olmuştur bugsbunny ile iletişime geçiniz!");
            }else{
                System.out.println("Kullanıcı adı veya şifreniz yanlıştır. tekrar deneyiniz \n kalan hakkınız : "+ right);
                }
            }
        }
    }
}