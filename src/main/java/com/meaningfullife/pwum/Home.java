package com.meaningfullife.pwum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
  @GetMapping("/home")
  public String Home(){
    return "/home";
  }

  @GetMapping("/")
  public String returnMapping(@RequestParam(value = "code") String code) {
    System.out.println(code);
    return "/home";
  }
}