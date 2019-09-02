package controllers;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Home {

  @RequestMapping("/")
  String home() {
    return "Hello World!";
  }

  @PostMapping("/card/{id}")
  String card(@PathVariable("id") String id) {
    return "your new card id is " + id;
  }

  public static void main(String[] args) {
    SpringApplication.run(Home.class, args);
  }
}
