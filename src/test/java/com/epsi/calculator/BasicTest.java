package com.epsi.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicTest {

    @Test
    public void shouldAddTwoNumbers() {
        //given
    	Calculatrice calc = new Calculatrice();

        //when
        int res = calc.addition(5, 5);

        //then
        assertThat(res).isEqualTo(10);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        //given
    	Calculatrice calc = new Calculatrice();

        //when
        int res = calc.soustraction(10, 8);

        //then
        assertThat(res).isEqualTo(2);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        //given
    	Calculatrice calc = new Calculatrice();

        //when
        int res = calc.multiplication(7, 7);

        //then
        assertThat(res).isEqualTo(49);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        //given
    	Calculatrice calc = new Calculatrice();

        //when
        int res = calc.division(20, 2);

        //then
        assertThat(res).isEqualTo(10);
    }
}
