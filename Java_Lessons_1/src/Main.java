public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        System.out.println("Bunu Yazan Tosun okuyana kosun ");
        //camelCase
        //don't repeat yourself
        String internetSubeButonu = "Internet Subes";
        int vade = 36;
        boolean dustuMu = true;
        double dolarBugun = 8.57;
        String[] krediler =
                {
                        "Hizli kredi",
                        "Mutlu emekli kredisi",
                        "Konut kredisi",
                        "Ciftci kredisi",
                        "Msb kredisi",
                        "Meb kredisi"

                };
        //foreach dongusu
        for(String kredi : krediler){
            System.out.println(kredi);
        }
        System.out.println("///////////////////////////ikinci yontem///////////////////////////////////////");
        for (int i = 1; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }

        for (int i = 1; i <= 5; i++) {

            System.out.printf(internetSubeButonu);
            System.out.println("i = " + i);
        }

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);
        //O anki degeri kullandigi icin sonraki verilen degerleri tutmaz.
        int[] sayilar1 = {1,2,3,4,5,6};
        int[] sayilar2 = {10,20,30,40,50,60};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);
        //Adres degiskenlerini tutugu icin sayilar1 in ilk degerleri pasif konumuna duser ve sayilar2 nin degerleri guncel olarak sayilar1 de tutulur
        String sehir1 = "adana";
        String sehir2 = "istanbul";
        sehir1 = sehir2;
        sehir2 = "ankara";
        System.out.println(sehir1);
        //stringlerde  ayni sekilde o anki degeri anlik olarak atar
    }
}
