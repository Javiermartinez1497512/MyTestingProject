/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyTestingProject;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void testSomeLibraryMethod2() {
        Library classUnderTest = new Library();
        assertFalse("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    
}
