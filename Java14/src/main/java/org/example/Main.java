package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("Roman", "Korchemnyi");

        ObjectMapper me = new ObjectMapper();
        System.out.println("JSON ==> " + me.writeValueAsString(user));
    }
}