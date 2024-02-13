package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCreateProduct() {
        Product product = new Product();
        when(productRepository.create(product)).thenReturn(product);

        Product createdProduct = productService.create(product);
        assertEquals(product, createdProduct);
    }

    @Test
    void testFindAll() {
        // Mocking repository behavior
        List<Product> productList = new ArrayList<>();
        when(productRepository.findAll()).thenReturn(productList.iterator());

        // Calling the service method
        List<Product> allProducts = productService.findAll();

        // Verifying the result
        assertEquals(productList, allProducts);
    }

    @Test
    void testFindById() {
        // Create a sample product
        Product product = new Product();
        String productId = "sampleId";
        product.setProductId(productId);

        // Mocking repository behavior
        when(productRepository.findById(productId)).thenReturn(product);

        // Calling the service method
        Product foundProduct = productService.findById(productId);

        // Verifying the result
        assertEquals(product, foundProduct);
    }

    @Test
    void testEdit() {
        // Create a sample product
        Product product = new Product();
        String productId = "sampleId";
        product.setProductId(productId);

        // Mocking repository behavior
        when(productRepository.edit(product)).thenReturn(product);

        // Calling the service method
        Product editedProduct = productService.edit(product);

        // Verifying the result
        assertEquals(product, editedProduct);
    }

    @Test
    void testDelete() {
        // Define a sample product ID
        String productId = "sampleId";

        // Calling the service method
        productService.delete(productId);

        // Verifying that the delete method of repository is called with correct ID
        verify(productRepository, times(1)).delete(productId);
    }
}