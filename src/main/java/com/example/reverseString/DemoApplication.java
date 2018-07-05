package com.example.reverseString;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
@RequestMapping("/")
public class DemoApplication {
    @ResponseBody
		@RequestMapping(value="/{string}", method=RequestMethod.GET)
    public String reverse(@PathVariable String string) {
      return string;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
