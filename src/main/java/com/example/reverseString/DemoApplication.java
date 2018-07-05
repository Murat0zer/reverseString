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
    public String reverse(@RequestParam(value="param1", required=true) String param1) {
      return new StringBuilder(param1).reverse().toString()
;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
