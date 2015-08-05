package com.tiarebalbi.trainning;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

/**
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
@FeignClient("book-service")
public interface BookClient {

    @RequestMapping(method = RequestMethod.GET, value = "/books")
    List<Book> getBooks();

}
