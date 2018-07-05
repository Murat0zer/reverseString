package com.example.reverseString;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {
    @ResponseBody
		@RequestMapping("/")
    public String reverse(@RequestParam(value="input", required=false, defaultValue="Hello World") String input Model model) {
			String reverse = new StringBuilder(input).reverse().toString();
			model.addAttribute("reverseString", reverse);
      return
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
