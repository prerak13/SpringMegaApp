package com.example.novels;

import com.example.novels.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookWithAuthorPojo {
    String bookName;
    String authorName;
}
