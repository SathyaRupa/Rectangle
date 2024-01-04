package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldReturnAreaOf24WhenTheLengthIs6AndBreadthIs4(){
        int length = 6;
        int breadth = 4;
        int expected = 24;

        Rectangle rectangle = new Rectangle();

        assertThat(rectangle.area(length,breadth), equalTo(expected));

    }
}
