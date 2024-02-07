package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();
    private HashMap<String, Product> nameToProductMap = new HashMap<>();
    private HashMap<String, Product> idToProductMap = new HashMap<>();
    int idCounter = 0;

    public Product create(Product product) {
        Product existingProduct = nameToProductMap.get(product.getProductName());

        if (existingProduct != null) {
            int currentQuantity = existingProduct.getProductQuantity() + product.getProductQuantity();
            existingProduct.setProductQuantity(currentQuantity);
            return existingProduct;
        } else {
            productData.add(product);
            nameToProductMap.put(product.getProductName(), product);
            product.setProductId(""+idCounter);
            idToProductMap.put(product.getProductId(), product);
            idCounter++;
        }
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product edit(Product product) {
        Product existingProduct = findById(product.getProductId());
        System.out.println(product.getProductId());

        if(existingProduct != null) {
            existingProduct.setProductName(product.getProductName());
            existingProduct.setProductQuantity(product.getProductQuantity());
            return existingProduct;
        }
        return null;
    }

    public Product findById(String id) {
        return idToProductMap.get(id);
    }

    public void delete(String id) {
        Product toBeDeleted = findById(id);
        productData.remove(toBeDeleted);
        idToProductMap.remove(id);
        nameToProductMap.remove(toBeDeleted.getProductName());
    }
}