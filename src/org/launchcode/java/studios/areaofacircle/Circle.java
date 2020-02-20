package org.launchcode.java.studios.areaofacircle;

import java.text.DecimalFormat;
import static java.lang.Math.PI;

public class Circle {
   static DecimalFormat fm = new DecimalFormat("#.###");
    public static Double getArea(Double radius) {
        return Double.valueOf( fm.format(PI * radius * radius));
    }
}
