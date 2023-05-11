package com.example.novels.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String name;
    public String id;
    public String aid;

}
