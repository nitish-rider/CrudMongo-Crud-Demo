package com.nitish.crudmongo.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Book")
public class Book {
    @Id private int id;
    private String bookName;
    private String authorName;

}
