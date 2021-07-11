package com.example.webapp;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class RegistrationController {
     @RequestMapping("/regform")
  public String Register() {
    	 return "Registration";
     }
}
 