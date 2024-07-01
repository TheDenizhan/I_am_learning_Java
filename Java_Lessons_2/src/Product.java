public class Product {

    public Product(){//Constructor
        System.out.println("Ben Calistim");
    }

    public Product(int id){//Constructor
        System.out.println("sadece id calisti");
    }
    public Product(int id,String name, double unitPrice,String detail){

            this(); // this() yazmak ilk olusturdugumuz sinifin bos olaninida calistirir demektir
            //this(id); // ve ilk satirdan baska satira yazilamaz
            this.id =id;
            this.name = name;
            this.unitPrice =unitPrice;
            this.detail = detail;
    }

    int id;
    String name;
    double unitPrice;
    String detail;


}
