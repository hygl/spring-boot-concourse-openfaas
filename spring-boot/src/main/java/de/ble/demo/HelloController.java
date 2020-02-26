package de.ble.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  
  @RequestMapping("/")
  public @ResponseBody String getHello(){
    return "Hello.";
  }
}