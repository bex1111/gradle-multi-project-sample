package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FeriRepositoryImplTest {

    @Test
    void testSomeLibraryMethod() {
        FeriRepositoryImpl classUnderTest = new FeriRepositoryImpl();
        assertEquals("Feri", classUnderTest.findName());
    }
}
