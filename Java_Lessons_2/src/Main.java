

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Object Orrianted Programming");

        Product product1 = new Product(1,"Lenova V14",25000," 16 GB Ram"); // ornek olusturma,referans olusturma, intance

        Product product2 = new Product(); // ornek olusturma,referans olusturma, intance
        product2.id = 2;
        product2.name = "Lenova V15";
        product2.unitPrice = 30000;
        product2.detail = " 32 GB Ram";

        Product product3 = new Product(); // ornek olusturma,referans olusturma, intance
        product3.id = 3;
        product3.name = "HP 5";
        product3.unitPrice = 15000;
        product3.detail = " 8 GB Ram";

        Product[] products = {
                product1,
                product2,
                product3
        };

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Telefon";

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);

        System.out.println(products.length);
        for(Product product : products){

            System.out.println(String.valueOf(product.id)+'-'+product.name+','+product.unitPrice+','+product.detail);
        }

    }
}
