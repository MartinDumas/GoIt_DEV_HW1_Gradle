package org.example;

import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        JsonObject person = new JsonObject();
        person.addProperty("My name: ", "Martin");
        person.addProperty("My lastname: ", "Dumas");

        System.out.println(person);
    }
}