package com.friendlys.app.friendlysAppofficial.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controlador para verificar palimdromos.
 */

@RestController
public class PalindromeController {

    /**
     * Endpoint para verificar si una palabra es palindromo.
     * @param word La palabra a verificar.
     * @return Un mensaje indicandono si la palabra es un palindromo o no.
     */

    @GetMapping("/validar-palindromo/{word}")
    public String Palindrome(@PathVariable String word) {
        if (isPalindrome(word)) {
            return "La palabra" + word +  "es un palindromo";
        } else {
            return "La palabra" + word + "es no palindromo";
        }
    }
    private boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;

            }
        }
        return true;
    }
}
