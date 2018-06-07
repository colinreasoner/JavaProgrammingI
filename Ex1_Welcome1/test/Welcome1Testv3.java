import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;
import junit.runner.Version;

public class Welcome1Testv3 extends TestCase {
    public static String newline = System.getProperty("line.separator");

    public void testHelloWorld() {
        System.out.println("JUnit version is: " + Version.id());
        PrintStream stdout = System.out; // IntelliJ hack

        final ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturedOut));

        String[] arr = {};
        Welcome1.main(arr);
//        System.out.flush(); // Seen on a StackOverflow example. Make sure all output is available for test assertions?
//        System.setOut(stdout); // IntelliJ hack

        assertEquals("ERROR: Non-conformant output!", "Welcome to Java Programming!" + newline, capturedOut.toString());
        //assertTrue(true);
    }
}
