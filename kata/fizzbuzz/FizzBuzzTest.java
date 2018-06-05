import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest
{
    // Signature: public static Object[] GetNumbers()
    //
    // Test Cases:
    // -----------
    // Result: 100 Elements
    // 1: "1"
    // 2: "2"
    // 3: "Fizz"
    // 4: "4"
    // 5: "Buzz"
    // 6: "Fizz"
    // 10: "Buzz"
    // 15: "FizzBuzz"
    // 16: "16"
    // 30: "FizzBuzz"

    @Test
    void result_shouldHave100Elements()
    {
        assertEquals( 100, FizzBuzzWithSimpleIfs.GetNumbers().length, "Unexpected length of result." );
    }

    @Test
    void firstElement_shouldEqual1()
    {
        assertEquals( 1, FizzBuzzWithSimpleIfs.GetNumbers()[0], "Unexpected 1st element." );
    }

    @Test
    void secondElement_shouldEqual2()
    {
        assertEquals( 2, FizzBuzzWithSimpleIfs.GetNumbers()[1], "Unexpected 2nd element." );
    }

    @Test
    void thirdElement_shouldEqualFizz()
    {
        assertEquals( "Fizz", FizzBuzzWithSimpleIfs.GetNumbers()[2], "Unexpected 3rd element." );
    }

    @Test
    void fourthElement_shouldEqual4()
    {
        assertEquals( 4, FizzBuzzWithSimpleIfs.GetNumbers()[3], "Unexpected 4th element." );
    }

    @Test
    void fifthElement_shouldEqualBuzz()
    {
        assertEquals( "Buzz", FizzBuzzWithSimpleIfs.GetNumbers()[4], "Unexpected 5th element." );
    }

    @Test
    void sixthElement_shouldEqualFizz()
    {
        assertEquals( "Fizz", FizzBuzzWithSimpleIfs.GetNumbers()[5], "Unexpected 6th element." );
    }

    @Test
    void tenthElement_shouldEqualBuzz()
    {
        assertEquals( "Buzz", FizzBuzzWithSimpleIfs.GetNumbers()[9], "Unexpected 10th element." );
    }

    @Test
    void fifteenthElement_shouldEqualFizzBuzz()
    {
        assertEquals( "FizzBuzz", FizzBuzzWithSimpleIfs.GetNumbers()[14], "Unexpected 15th element." );
    }

    @Test
    void sixteenthElement_shouldEqual16()
    {
        assertEquals( 16, FizzBuzzWithSimpleIfs.GetNumbers()[15], "Unexpected 16th element." );
    }

    @Test
    void thirtiethElement_shouldEqualFizzBuzz()
    {
        assertEquals( "FizzBuzz", FizzBuzzWithSimpleIfs.GetNumbers()[29], "Unexpected 30th element." );
    }
}
