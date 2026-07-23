package org.example.Facade_Pattern.GoodDesign;

import java.util.Random;

public class RollNumberGenerator {

    public String generateRollNumber() {

        Random random = new Random();

        return "PCPS-" + (10000 + random.nextInt(90000));

    }

}