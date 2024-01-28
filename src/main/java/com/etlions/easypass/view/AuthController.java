package com.etlions.easypass.view;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "*")
@Slf4j
@Controller
public class AuthController {

  @GetMapping("/loginEP")
  public String login(){
    return "loginEP";
  }

}
