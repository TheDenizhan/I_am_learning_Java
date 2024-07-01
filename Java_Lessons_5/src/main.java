public class main {


    /*
sout: System.out.println(); kod parçasını otomatik olarak oluştururken kullanılır. Kod satırında sout yazıp Tab tuşuna basarsanız, otomatik olarak
System.out.println(); kodu oluşturulur ve imleç parantezlerin içine yerleştirilir.

psvm: public static void main(String[] args) metodu oluştururken kullanılır. Kod satırında psvm yazıp Tab tuşuna basarsanız, main metodu otomatik olarak oluşturulur.

fori: Bir for döngüsü oluştururken kullanılır. Kod satırında fori yazıp Tab tuşuna basarsanız, otomatik olarak bir for döngüsü yapısı oluşturulur.

iter: Bir koleksiyon üzerinde döngü oluştururken kullanılır. Kod satırında iter yazıp Tab tuşuna basarsanız, koleksiyon üzerinde dönen bir döngü yapısı oluşturulur.

psf: Bir sabit (final) alan tanımlarken kullanılır. Kod satırında psf yazıp Tab tuşuna basarsanız, final bir değişken tanımlanır.

Ctrl + Space: Kod önerilerini görüntülemek için kullanılır. Bu kombinasyonu kullanarak IntelliSense veya kod önerilerini açabilirsiniz.

Ctrl + Alt + L (Windows/Linux) veya Cmd + Option + L (Mac): Kodu otomatik olarak düzenler ve biçimlendirir.

Ctrl + D (Windows/Linux) veya Cmd + D (Mac): Seçilen satırı kopyalar veya çoğaltır.

Ctrl + / (Windows/Linux) veya Cmd + / (Mac): Seçili satır veya satırları yorum satırına dönüştürür veya yorum satırından çıkarır.

Ctrl + Alt + O (Windows/Linux) veya Cmd + Option + O (Mac): Kullanılmayan import ifadelerini kaldırır.

Ctrl + Shift + F10 (Windows/Linux) veya Shift + F10 (Mac): Proje içindeki son çalıştırılan işlemi yeniden çalıştırır.

Ctrl + Shift + F9 (Windows/Linux) veya Shift + F9 (Mac): Projeyi yeniden derler.

Ctrl + Shift + F7 (Windows/Linux) veya Option + F7 (Mac): Seçilen değişkenin veya metodu proje içinde kullanıldığı yerleri vurgular.

Alt + Enter: Hata ayıklama veya kod önerilerini açar.

Ctrl + E (Windows/Linux) veya Cmd + E (Mac): En son açılan dosyaları listeler.

Ctrl + Shift + S (Windows/Linux) veya Cmd + Shift + S (Mac): Dosyayı kaydeder.

     */
    public static void main(String[] args){

       CustomerManager customerManager = new CustomerManager();
       customerManager.add(new emailLogger());

    }
}
