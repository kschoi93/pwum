package com.meaningfullife.pwum;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Home {
  @GetMapping("/")
  public String Home(){
    return "/home";
  }
}