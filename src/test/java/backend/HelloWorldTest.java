package backend;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloWorldUnitTest {

    @Test
    void mainMethodStartsSpringBoot() {
        HelloWorld.main(new String[]{"--server.port=0"});
        assertTrue(true, "Application has no exceptions thrown!");
    }
}