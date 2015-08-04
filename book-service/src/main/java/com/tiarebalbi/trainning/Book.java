package com.tiarebalbi.trainning;

import java.util.UUID;

/**
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
public class Book {

    private String id, name, category;

    public Book() {
        this.id = UUID.randomUUID().toString();
    }

    public Book(String name, String category) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
