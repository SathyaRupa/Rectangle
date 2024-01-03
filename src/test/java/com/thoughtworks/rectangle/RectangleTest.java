package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldReturnTwentyFourWhenTheLenghtAndBreadthAreSixAndFour(){
        int length = 6;
        int breadth = 4;
        int expected = 24;

        Rectangle rectangle = new Rectangle();

        int area = rectangle.area(length,breadth);

        assertEquals(expected,rectangle.area(length,breadth));

    }
}
