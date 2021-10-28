package com.ppkwu.stringapi;

/**
 * Class responsible for keeping information about processed string.
 */
public class Response {

    private Long uppercase;
    private Long lowercase;
    private Long numbers;
    private Long specialChars;
    private Boolean combination;

    public Response() {
    }

    public void setUppercase(Long uppercase) {
        this.uppercase = uppercase;
    }

    public void setLowercase(Long lowercase) {
        this.lowercase = lowercase;
    }

    public void setNumbers(Long numbers) {
        this.numbers = numbers;
    }

    public void setSpecialChars(Long specialChars) {
        this.specialChars = specialChars;
    }

    public void setCombination(Boolean combination) {
        this.combination = combination;
    }

    @Override
    public String toString() {
        return "Response{" +
            "uppercase=" + uppercase +
            ", lowercase=" + lowercase +
            ", numbers=" + numbers +
            ", specialChars=" + specialChars +
            ", combination=" + combination +
            '}';
    }
}
