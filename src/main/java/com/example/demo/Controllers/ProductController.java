package com.example.demo.Controllers;


import com.example.demo.Controllers.Entity.Product;
import com.example.demo.Controllers.reprositery.prroductRepristory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private prroductRepristory repristory;

    @GetMapping("/AddProduct")
    public String index(Model model) {
        model.addAttribute("pro", new Product());
        return "addproduct";
    }

    @PostMapping("/AddProduct")
    public String submit(Model model, @ModelAttribute Product pro) {
        model.addAttribute("pro", new Product());
        if (repristory.existsById(pro.getName())) {
            return "addproduct";
        }
        repristory.save(pro);
        return "addproduct";
    }
}
