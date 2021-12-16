package com.meaningfullife.pwum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kakao")
public class KakaoRestApi {

  @GetMapping("/authorization")
  public String KakaoAuth(){
    return "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=e72268454236ad2f3ade25ad2751af22&redirect_uri=http://localhost:8080";
  }
}
