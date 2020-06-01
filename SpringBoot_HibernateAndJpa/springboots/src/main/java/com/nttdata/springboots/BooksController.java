package com.nttdata.springboots;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
@GetMapping("/books")
public List<Book> getBooks()
{
	return Arrays.asList(new Book(1l,"mastering spring mvc 5.1","gangakaran"));
	
}
}
