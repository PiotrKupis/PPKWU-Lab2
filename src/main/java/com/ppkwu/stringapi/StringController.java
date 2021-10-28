package com.ppkwu.stringapi;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller responsible for handling operations connected with strings.
 */
@RestController
public class StringController {

    @GetMapping("string/{string}/{substring}")
    public ResponseEntity<String> countUpper(@PathVariable("string") String string,
        @PathVariable("substring") String substring) {
        Response response = new Response();

        long uppercase = string.chars()
            .filter(Character::isUpperCase)
            .count();

        long lowercase = string.chars()
            .filter(Character::isLowerCase)
            .count();

        response.setUppercase(uppercase);
        response.setLowercase(lowercase);

        return ResponseEntity.ok(new Gson().toJson(response));
    }
}
