package com.tiarebalbi.trainning;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
@RestController
@RequestMapping(value = "/store")
public class StoreRestController {

    private static final Logger LOGGER = Logger.getLogger("c.t.t.StoreRestController");

    @Autowired
    private BookClient storeClient;

    @HystrixCommand(fallbackMethod = "getFallbackBooks")
    @RequestMapping(value = "/available-products", method = RequestMethod.GET)
    public List<Book> getBooks() {
        return this.storeClient.getBooks();
    }


    public List<Book> getFallbackBooks() {
        LOGGER.severe("Não foi possível acessar os livros");
        return Arrays.asList();
    }
}