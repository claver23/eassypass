package com.etlions.easypass.view;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin
@Controller
@AllArgsConstructor
public class TicketController {

  @GetMapping("/my-tickets")
  public String myTickets(){
    return "my-tickets";
  }

}
