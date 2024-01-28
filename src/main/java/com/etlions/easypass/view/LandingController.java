package com.etlions.easypass.view;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@CrossOrigin
@Controller
@AllArgsConstructor
public class LandingController {

  @GetMapping("/")
  public String index(){
    return "landing/home";
  }

  @GetMapping("/home")
  public String home(){
    return "landing/home";
  }

  @GetMapping("/about-us")
  public String AboutUs(){
    return "landing/about-us";
  }

  @GetMapping("/services")
  public String services(){
    return "landing/services";
  }

  @GetMapping("/contact")
  public String contact(){
    return "landing/contact";
  }

}
