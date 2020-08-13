package com.in28minutes.inspringboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> getAllBooks(){
       return   Arrays.asList(new Book(1l,"Mastering Spring 5.0","Anyone"));
    }
}
