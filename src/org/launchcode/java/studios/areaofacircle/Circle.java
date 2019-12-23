package org.launchcode.java.studios.areaofacircle;

import java.text.DecimalFormat;

public class Circle {
   static DecimalFormat fm = new DecimalFormat("#.###");
    public static Double getArea(Double radius) {
        return Double.valueOf( fm.format(Math.PI * radius * radius));
    }
}
