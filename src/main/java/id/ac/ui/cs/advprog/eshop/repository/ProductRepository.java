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

    public Product create(Product product) {
        Product existingProduct = nameToProductMap.get(product.getProductName());

        if (existingProduct != null) {
            int currentQuantity = existingProduct.getProductQuantity() + product.getProductQuantity();
            existingProduct.setProductQuantity(currentQuantity);
            return existingProduct;
        } else {
            productData.add(product);
            nameToProductMap.put(product.getProductName(), product);
        }
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }
}