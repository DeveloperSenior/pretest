package com.tdea.pretest;

import com.intuit.karate.junit5.Karate;

public class KarateRun {

    @Karate.Test
    Karate testKarate(){
     return Karate.run("classpath:com.tdea.pretest/karate");
    }
}
