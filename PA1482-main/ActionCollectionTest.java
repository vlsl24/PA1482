
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
        assertTrue("First action should be LogFlightCode for 'mosquito'", actions.get(0) instanceof LogFlightCode);
    }

    @Test
    public void testGetPlaneActionsHurricane() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("hurricane");
        assertNotNull("Actions list should not be null for 'hurricane'", actions);
        assertEquals("Actions list size should be 1 for 'hurricane'", 1, actions.size());
        assertTrue("First action should be LogFlightCode for 'hurricane'", actions.get(0) instanceof LogFlightCode);
    }

    @Test
    public void testGetPlaneActionsSpitfire() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("spitfire");
        assertNotNull("Actions list should not be null for 'spitfire'", actions);
        assertEquals("Actions list size should be 1 for 'spitfire'", 1, actions.size());
        assertTrue("First action should be LogFlightCode for 'spitfire'", actions.get(0) instanceof LogFlightCode);
    }

    @Test
    public void testGetPlaneActionsMessershmitt() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("messershmitt");
        assertNotNull("Actions list should not be null for 'messershmitt'", actions);
        assertEquals("Actions list size should be 1 for 'messershmitt'", 1, actions.size());
        assertTrue("First action should be NotifyFighterCommand for 'messershmitt'", actions.get(0) instanceof NotifyFighterCommand);
    }

    @Test
    public void testGetPlaneActionsFockeWulf() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("focke-wulf");
        assertNotNull("Actions list should not be null for 'focke-wulf'", actions);
        assertEquals("Actions list size should be 2 for 'focke-wulf'", 2, actions.size());
        assertTrue("First action should be LogFlightCode for 'focke-wulf'", actions.get(0) instanceof LogFlightCode);
        assertTrue("Second action should be NotifyFighterCommand for 'focke-wulf'", actions.get(1) instanceof NotifyFighterCommand);
    }

    @Test
    public void testGetPlaneActionsDornier() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("dornier");
        assertNotNull("Actions list should not be null for 'dornier'", actions);
        assertEquals("Actions list size should be 1 for 'dornier'", 1, actions.size());
        assertTrue("First action should be TrackRoute for 'dornier'", actions.get(0) instanceof TrackRoute);
    }

    @Test
    public void testGetPlaneActionsHenkel() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("henkel");
        assertNotNull("Actions list should not be null for 'henkel'", actions);
        assertEquals("Actions list size should be 1 for 'henkel'", 1, actions.size());
        assertTrue("First action should be TrackRoute for 'henkel'", actions.get(0) instanceof TrackRoute);
    }

    @Test
    public void testGetPlaneActionsJunker() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("junker");
        assertNotNull("Actions list should not be null for 'junker'", actions);
        assertEquals("Actions list size should be 2 for 'junker'", 2, actions.size());
        assertTrue("First action should be TrackRoute for 'junker'", actions.get(0) instanceof TrackRoute);
        assertTrue("Second action should be NotifyFighterCommand for 'junker'", actions.get(1) instanceof NotifyFighterCommand);
    }

    @Test
    public void testGetPlaneActionsUnknown() {
        ArrayList<Actions> actions = ActionCollection.getPlaneActions("unknown");
        assertNull("Actions list should be null for 'unknown'", actions);
    }
}