package id.ac.ui.cs.advprog.eshop.controller;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {
    @Mock
    private ProductService productService;

    @Mock
    private Model model;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCreateProductPage() {
        String viewName = productController.createProductPage(model);

        assertEquals("CreateProduct", viewName);
        verify(model).addAttribute(eq("product"), any(Product.class));
    }

    @Test
    void testCreateProductPost() {
        Product product = new Product();
        String viewName = productController.createProductPost(product, model);

        verify(productService).create(product);
        assertEquals("redirect:list", viewName);
    }

    @Test
    void testProductListPage() {
        List<Product> productList = new ArrayList<>();
        when(productService.findAll()).thenReturn(productList);
        String viewName = productController.productListPage(model);

        assertEquals("ListProduct", viewName);
        verify(model).addAttribute(eq("products"), eq(productList));
    }

    @Test
    void testEditProductPage() {
        String productId = "1";
        Product product = new Product();
        when(productService.findById(productId)).thenReturn(product);
        String viewName = productController.editProductPage(productId, model);

        assertEquals("EditProduct", viewName);
        verify(model).addAttribute(eq("product"), eq(product));
    }

    @Test
    void testEditProductPost() {
        Product product = new Product();
        String viewName = productController.editProductPost(product, model);

        verify(productService).edit(product);
        assertEquals("redirect:list", viewName);
    }

    @Test
    void testDeleteProductPage() {
        String productId = "1";
        Product product = new Product();
        product.setProductId(productId);
        when(productService.findById(productId)).thenReturn(product);
        String viewName = productController.deleteProductPage(productId, model);

        verify(productService).delete(productId);
        assertEquals("redirect:/product/list", viewName);
    }

}