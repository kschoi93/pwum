package com.meaningfullife.pwum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kakao")
public class KakaoRestApi {

  @GetMapping("/oauth")
  public void KakaoAuth(){

  }
}
