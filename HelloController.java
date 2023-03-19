package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello Spring Boot!";
    }
        
  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  void deleteSOMETHING(@PathVariable Long id) {
    SOMETHINGService.deleteById(id);
  }
    
  }
}
