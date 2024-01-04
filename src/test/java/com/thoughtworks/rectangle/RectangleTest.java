package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldReturnAreaOf24WhenTheLengthIs6AndBreadthIs4(){

        Rectangle rectangle1 = new Rectangle(6,4);
        Rectangle rectangle2 = new Rectangle(5.1,7.5);

        double expected1 = 24;
        double expected2 = 38.25;
        
        double actualArea1 = rectangle1.area();
        double actualArea2 = rectangle2.area();

        assertThat(actualArea1, is(closeTo(expected1,0.001)));
        assertThat(actualArea2, is(closeTo(expected2,0.001)));

    }

}
