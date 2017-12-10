package explanatory_methods;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class YearShould {


    @Test
    public void not_be_a_leap_year_if_not_divisible_by_4() {
        assertThat(isLeapYear(1997), is(false));
    }

    @Test
    public void be_a_leap_year_if_divisible_by_4() {
        assertThat(isLeapYear(1996), is(true));
    }

    @Test
    public void be_a_leap_year_if_divisible_by_400() {
        assertThat(isLeapYear(1600), is(true));
    }

    @Test
    public void not_be_a_leap_year_if_divisible_by_100_but_not_by_400() {
        assertThat(isLeapYear(1800), is(false));
    }

    private Boolean isLeapYear(int year) {
        return new Year(year).isLeapYear();
    }


}
