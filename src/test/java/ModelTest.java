import mvc.Model;
import org.junit.Assert;
import org.junit.Test;


public class ModelTest extends Assert {

    @Test
    public void testCompairing() {
        Model model = new Model();
        assertTrue("must be true when comparing: \" HeLlo \" & \"hello\"" +
                        model.validateInput(" HeLlo ", "hello"),
                model.validateInput(" HeLlo ", "hello"));
    }
}
