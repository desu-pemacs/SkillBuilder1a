import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

/**
 * The test class SkillBuilder3Test.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SkillBuilder1aTest extends OutputTest {
    /**
     * Default constructor for test class SkillBuilder2Test
     */
    public SkillBuilder1aTest() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    /**
     * Tears down the test fixture.
     * <p>
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public void testMain_1() {
        setTestInput("Jean Claude\n2.34");
        SkillBuilder1a.main(new String[]{});
        String expected = "Well Jean Claude, the spice value resulted in 1\\.504\\d+\n";
        expected += "And the converted value is 1\\.50?[^0-9]*";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n" + expected + "\nActual:\n" + actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s", ""))
                .matcher(actual.replaceAll("\\s", "")).find(), message);
    }

    @Test
    public void testMain_2() {
        setTestInput("Jean Claude\n3.01");
        SkillBuilder1a.main(new String[]{});
        String expected = "Well Jean Claude, the spice value resulted in 1\\.411\\d+\n";
        expected += "And the converted value is 1\\.41[^0-9]*";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n" + expected + "\nActual:\n" + actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s", ""))
                .matcher(actual.replaceAll("\\s", "")).find(), message);
    }
}
