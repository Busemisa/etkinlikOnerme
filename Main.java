import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float sicaklik;

        System.out.print("Lutfen bir sıcaklık giriniz :");

        Scanner input=new Scanner(System.in);
        sicaklik=input.nextFloat();

        if(sicaklik<5){
            System.out.print("SİZE KAYAK YAPMAYI ÖNERİYORUM");
        }
        else if((5<sicaklik) && (sicaklik<15)){
            System.out.print("SİZE SİNEMA ETKİNŞİĞİNİ ÖNERİYORUM");
        }
        else if((10<sicaklik) && (sicaklik<15)){
            System.out.print("SİZE PİKNİK ETKİNLİĞİNİ ÖNERİYORUM");
        }

        else if(25<sicaklik){
            System.out.print("SİZE YÜZME ETKİNLİĞİNİ ÖNERİYORUM");
        }


    }
}
