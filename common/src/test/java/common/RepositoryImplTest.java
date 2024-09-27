package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepositoryImplTest {

    @Test
    void testSomeLibraryMethod() {
        RepositoryImpl classUnderTest = new RepositoryImpl();
        assertEquals("Feri", classUnderTest.findName());
    }
}
