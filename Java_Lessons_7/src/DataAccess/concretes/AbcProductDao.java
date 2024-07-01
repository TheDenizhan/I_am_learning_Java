package DataAccess.concretes;

import DataAccess.abstracts.ProductDao;
import Entities.concretes.Product;

import java.util.List;

public class AbcProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("ABC ile eklendi :"+product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
