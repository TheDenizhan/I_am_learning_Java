

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Object Orrianted Programming");

        Product product1 = new Product(1,"Lenova V14",25000," 16 GB Ram"); // ornek olusturma,referans olusturma, intance

        Product product2 = new Product(); // ornek olusturma,referans olusturma, intance
        product2.setId(2);
        product2.setName("Lenova V15");
        product2.setUnitPrice(16000);
        product2.setDetail("16GB RAM");
        product2.setDiscount(15);
        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Bilgisayar");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Telefon");

        System.out.println(category1.getName());
        System.out.println(category2.getName());

    }
}
