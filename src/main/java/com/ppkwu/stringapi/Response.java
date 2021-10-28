package com.ppkwu.stringapi;

/**
 * Class responsible for keeping information about processed string.
 */
public class Response {

    private Long uppercase;
    private Long lowercase;
    private Long numbers;
    private Long specialChars;
    private Boolean contains;

    public Response(Long uppercase, Long lowercase, Long numbers, Long specialChars,
        Boolean contains) {
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.numbers = numbers;
        this.specialChars = specialChars;
        this.contains = contains;
    }
}
