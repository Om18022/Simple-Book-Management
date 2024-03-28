package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> findall() {
        return bookRepository.findAll();
    }

    public List<Book> saveall(List<Book> list) {
         return bookRepository.saveAll(list);
//         return list;
    }

    public Optional<Book> getbyId(int id) {
        return bookRepository.findById(id);
    }

    public String deletebyId(int id) {
        bookRepository.deleteById(id);
        return "Deleted Book";
    }
}
