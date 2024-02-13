package id.ac.ui.cs.advprog.eshop.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class HomepageControllerTest {
    @Mock
    private Model model;

    @InjectMocks
    private HomepageController homepageController;

    @Test
    void testHomePage() {
        String viewName = homepageController.homePage(model);
        assertEquals("HomePage", viewName);
    }

    @Test
    void testProductListPage() {
        String viewName = homepageController.productListPage(model);
        assertEquals("redirect:/product/list", viewName);
    }
}
