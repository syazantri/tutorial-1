package id.ac.ui.cs.advprog.eshop.controller;

import id.ac.ui.cs.advprog.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomepageController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String homePage(Model model) {
        return "HomePage";
    }
    @GetMapping("/list")
    public String productListPage(Model model) {
        return "redirect:/product/list";
    }
}