package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController{

    @Autowired
    BookService bookService;

    @PostMapping("save")
    public void save(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @GetMapping("/alldata")
    public @ResponseBody List<Book> getalldata(){
        return bookService.findall();
    }

    @PostMapping("/saveall")
    public @ResponseBody List<Book> saveall(@RequestBody List<Book> list){
        return bookService.saveall(list);
    }
    @GetMapping("/getbyId/{id}")
    public Optional<Book> getbyId(@PathVariable int id){
        return bookService.getbyId(id);
    }

    @DeleteMapping("/deletebyId/{id}")
    public String deletebyId(@PathVariable("id") int id){
        bookService.deletebyId(id);
        return "Deleted Book";
    }
}
