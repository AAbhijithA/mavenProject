package com.example.app;
import com.example.app.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    Calculator c = new Calculator(4, 4);
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(8, c.Add());
        assertEquals(0, c.Subtract());
        assertEquals(1, c.Divide());
        assertEquals(16, c.Multiply());
    }
}
