package Bussines.concretes;

import Bussines.abstracts.ProductService;
import Core.LoggerService;
import DataAccess.abstracts.ProductDao;
import DataAccess.concretes.HibernateProductDao;
import Entities.concretes.Product;
import jLogger.JLoggerManager;
import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;
    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }
    @Override
    public void add(Product product) {
        //Is kodlari
        if(product.getCategoryId()==1){
            System.out.println("Bu kategoride urun kabul edilemiyor ");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSytstem("Urun eklendi : " + product.getName() );
    }
    @Override
    public List<Product> getAll() {
        return null;
    }
}
