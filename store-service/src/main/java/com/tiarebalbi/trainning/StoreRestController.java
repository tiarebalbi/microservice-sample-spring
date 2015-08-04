package com.tiarebalbi.trainning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
@RestController
@RequestMapping(value = "/store")
public class StoreRestController {

    @Autowired
    private StoreClient storeClient;

    @RequestMapping(value = "/available-products", method = RequestMethod.GET)
    public List<Book> getBooks() {
        return this.storeClient.getBooks();
    }
}