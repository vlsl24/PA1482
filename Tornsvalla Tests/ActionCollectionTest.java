



import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;




public class ActionCollectionTest {

    @Test
    public void testGetPlaneActionsLancaster() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("lancaster");
        assertNotNull("Actions list should not be null for 'lancaster'", actions);
        assertTrue("Actions list should be empty for 'lancaster'", actions.isEmpty());
    }

    @Test
    public void testGetPlaneActionsBlenheim() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("blenheim");
        assertNotNull("Actions list should not be null for 'blenheim'", actions);
        assertTrue("Actions list should be empty for 'blenheim'", actions.isEmpty());
    }

    @Test
    public void testGetPlaneActionsMosquito() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("mosquito");
        assertNotNull("Actions list should not be null for 'mosquito'", actions);
        assertEquals("Actions list size should be 1 for 'mosquito'", 1, actions.size());
        assertTrue("First action should be an instance of LogFlightCode for 'mosquito'", actions.get(0) instanceof LogFlightCode);
    }

    @Test
    public void testGetPlaneActionsUnknown() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("unknown");
        assertNull("Actions list should be null for 'unknown'", actions);
    }
}