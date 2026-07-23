package org.example.Facade_Pattern.BadDesign;

import java.util.Random;

public class RollNumberGenerator {

    public String generateRollNumber(){

        Random random=new Random();

        return "PCPS-"+(1000+random.nextInt(9000));

    }

}