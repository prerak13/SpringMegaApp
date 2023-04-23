package com.prerak.Books;

import com.prerak.Books.controller.BookController;
import com.prerak.Books.entity.Book;
import com.prerak.Books.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.lang.reflect.Array;
import java.util.Arrays;

@WebMvcTest(BookController.class)
public class BookControllerTest {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    BookService bs;

    @InjectMocks
    BookController bc;

    @Test
    public void testGetAllBook() throws Exception {
        Mockito.when(bs.getAllBook()).thenReturn(Arrays.asList(new Book("Book1", "B1", "A1")));
        mockMvc.perform(get("/books")).andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(1))
                .andDo(print());;

    }
}
