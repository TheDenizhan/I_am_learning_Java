import Bussines.abstracts.ProductService;
import Bussines.concretes.ProductManager;
import Core.JLoggerManagerAdapter;
import DataAccess.concretes.AbcProductDao;
import DataAccess.concretes.HibernateProductDao;
import Entities.concretes.Product;
import jLogger.JLoggerManager;

public class Main {

    //SOAP
    //KURUMSAL MIMARILER
    //NLAYEREDDEMO
    //data-hiberneate-jabc

    public static void main(String[] args) {

        //ALTIN KURAL: Bir projede 'Entity' ler haric newliyorsaniz anla ki ilerde problemler yasayacaksin.
        //ToDo : Spring IoC ile cozulecek
        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());

        Product product =new Product(1,2,"Elma",12,50);

        productService.add(product);


    }
}
