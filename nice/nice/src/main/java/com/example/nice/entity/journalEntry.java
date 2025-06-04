package com.example.nice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class journalEntry {
    long id;
    String title;
    String content;
}
