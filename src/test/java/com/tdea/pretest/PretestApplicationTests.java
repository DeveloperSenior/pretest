package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void shouldPasswordEqual() {
        UserUtils util = new UserUtils();
        assertTrue(util.isPasswordEqual("123","123"));
    }



}
