package com.statickev.financeappdemo.Values;

import java.util.Map;

public class ColorPalette {

    private static final Map<String, String> colorPalette = Map.of(
            "Espresso", "#1a120b",
            "Mocha", "#3c2a21",
            "Latte", "#d5c7a3",
            "Cream", "#e5decb",
            "Light-caramel", "#d4a339",
            "Matcha", "#52681d",
            "Thai-tea", "#ab5a35"
    );
    private ColorPalette() {}

    public static String get(String colorName) {
        return colorPalette.get(colorName);
    }

}
