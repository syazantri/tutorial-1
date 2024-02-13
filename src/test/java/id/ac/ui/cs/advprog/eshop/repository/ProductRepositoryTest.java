package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension. ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductRepositoryTest {

    @InjectMocks
    ProductRepository productRepository;
    @BeforeEach
    void setUp() {
    }

    @Test
    void testCreate_NewProduct() {
        Product product = new Product();
        product.setProductName("Sampo Cap Bambang");
        product.setProductQuantity(1);

        Product createdProduct = productRepository.create(product);

        assertNotNull(createdProduct);
        assertEquals(product.getProductName(), createdProduct.getProductName());
        assertEquals(product.getProductQuantity(), createdProduct.getProductQuantity());
    }

    @Test
    void testCreate_ExistingProduct() {
        Product existingProduct = new Product();
        existingProduct.setProductName("Produk 2");
        existingProduct.setProductQuantity(100);
        productRepository.create(existingProduct);

        Product productBaru = new Product();
        productBaru.setProductName("Produk 2");
        productBaru.setProductQuantity(150);

        Product updatedProduct = productRepository.create(productBaru);

        assertNotNull(updatedProduct);
        assertEquals(existingProduct.getProductId(), updatedProduct.getProductId()); // The ID should remain the same
        assertEquals(existingProduct.getProductName(), updatedProduct.getProductName());
        assertEquals(existingProduct.getProductQuantity(), updatedProduct.getProductQuantity()); // Quantity should be updated
    }

    @Test
    void testFindAllIfEmpty() {
        Iterator<Product> productIterator = productRepository.findAll();
        assertFalse(productIterator.hasNext());
    }
    @Test
    void testFindAllIfMoreThanOneProduct() {
        Product product1 = new Product();
        product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(100);
        productRepository.create(product1);

        Product product2 = new Product();
        product2.setProductId("a0f9de46-90b1-437d-a0bf-d0821dde9096");
        product2.setProductName("Sampo Cap Usep");
        product2.setProductQuantity(150);
        productRepository.create(product2);

        Iterator<Product> productIterator = productRepository.findAll();
        assertTrue(productIterator.hasNext());
        Product savedProduct = productIterator.next();
        assertEquals(product1.getProductId(), savedProduct.getProductId());
        savedProduct = productIterator.next();
        assertEquals(product2.getProductId(), savedProduct.getProductId());
        assertFalse (productIterator.hasNext());
    }

    @Test
    void testEdit() {
        Product product = new Product();
        product.setProductName("Mama ini tes ngedit produk");
        product.setProductQuantity(888888);
        productRepository.create(product);

        product.setProductName("Keubah gak yah");
        product.setProductQuantity(909009017);
        Product editedProduct = productRepository.edit(product);

        assertEquals("Keubah gak yah", editedProduct.getProductName());
        assertEquals(909009017, editedProduct.getProductQuantity());
    }

    @Test
    void testEditIfNull() {
        Product fakeProduct = new Product();
        fakeProduct.setProductName("Nonexistent Product");
        fakeProduct.setProductQuantity(10);

        Product editedProduct = productRepository.edit(fakeProduct);

        assertNull(editedProduct);
    }

    @Test
    void testFindById() {
        Product product = new Product();
        product.setProductName("Cari aku donk");
        product.setProductQuantity(77);
        productRepository.create(product);

        Product foundProduct = productRepository.findById(product.getProductId());

        assertNotNull(foundProduct);
        assertEquals(product.getProductId(), foundProduct.getProductId());
        assertEquals(product.getProductName(), foundProduct.getProductName());
        assertEquals(product.getProductQuantity(), foundProduct.getProductQuantity());
    }

    @Test
    void testDelete() {
        Product product = new Product();
        product.setProductName("Mama aku tes dulu yah");
        product.setProductQuantity(14141414);
        productRepository.create(product);

        productRepository.delete(product.getProductId());

        assertNull(productRepository.findById(product.getProductId()));
    }
}