package com.epam.demo;

import java.util.List;
import org.apache.commons.lang3.math.NumberUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args.size() == 0){
            return false;
        } boolean isPositive = true;
        for (String str:args ) {
            if (!NumberUtils.isCreatable(str)){
                return false;
            }
            if (NumberUtils.createNumber(str).doubleValue() <= 0) {
                return false;
            }

        }
        return isPositive;
    }
}