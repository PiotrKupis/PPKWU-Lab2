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

    /**
     * Method responsible for analyzing passed string.
     *
     * @param string    passed string to analyze
     * @param substring passed substring
     * @return object of type {@link ResponseEntity} containing information about passed string
     */
    @GetMapping("string/{string}/{substring}")
    public ResponseEntity<String> analyzeString(@PathVariable("string") String string,
        @PathVariable("substring") String substring) {
        Response response = new Response();

        long uppercase = string.chars()
            .filter(Character::isUpperCase)
            .count();

        long lowercase = string.chars()
            .filter(Character::isLowerCase)
            .count();

        long numbers = string.chars()
            .filter(Character::isDigit)
            .count();

        long specialChars = 0;
        for (char c : string.toCharArray()) {
            if (isSpecialLetter(c)) {
                ++specialChars;
            }
        }

        boolean contains = string.contains(substring);
        boolean combination = uppercase != 0 && lowercase != 0 && numbers != 0 && specialChars != 0;

        response.setUppercase(uppercase);
        response.setLowercase(lowercase);
        response.setNumbers(numbers);
        response.setSpecialChars(specialChars);
        response.setContains(contains);
        response.setCombination(combination);
        return ResponseEntity.ok(new Gson().toJson(response));
    }

    private boolean isSpecialLetter(char letter) {
        return "/!@#$%^&*()_+-=;':\"{}[]".indexOf(letter) != -1;
    }
}
