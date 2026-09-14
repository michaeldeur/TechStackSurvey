package backend;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ModelMap;

import static org.junit.jupiter.api.Assertions.*;

class AppControllerTest {

    @Test
    void indexReturnsCorrectViewAndMessage() {
        AppController controller = new AppController();
        ModelMap model = new ModelMap();

        String viewName = controller.index(model);

        assertEquals("index", viewName);
        assertEquals("Hello World", model.get("message"));
    }
}
