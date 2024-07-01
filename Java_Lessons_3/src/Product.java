public class Product {


    //constructor yapisi
    //encapsulation
    //final keyword ve private keywordunu arastir
    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;
    private double unitPriceAfterDiscount;


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
        System.out.println("Indirim Yapilmadi");
    }
    public Product(int id,String name, double unitPrice,String detail, double discount,double unitPriceAfterDiscount){

            this(); // this() yazmak ilk olusturdugumuz sinifin bos olaninida calistirir demektir
            //this(id); // ve ilk satirdan baska satira yazilamaz
            this.id =id;
            this.name = name;
            this.unitPrice =unitPrice;
            this.detail = detail;
            this.discount = discount;
            this.unitPriceAfterDiscount =unitPriceAfterDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice-(this.unitPrice*this.discount/100);
    }



}
