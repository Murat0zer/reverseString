package com.example.reverseString;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping
    public String reverse(@RequestParam(value="input", required=false, defaultValue="Hello World") String input, Model model) {
			String reverse = new StringBuilder(input).reverse().toString();
			model.addAttribute("reverse", reverse);
      return "reverse";
    }


}
