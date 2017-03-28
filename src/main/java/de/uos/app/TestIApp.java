package de.uos.app;

import com.airhacks.afterburner.injection.Injector;
import de.uos.apptest.IApp;
import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assume;

/**
 *
 * @author dziegenhagen
 */
public class TestIApp {

    @Inject
    IApp instance;

    @Before
    public void setUp() {
        try {
            Injector.injectMembers(TestIApp.class, this);
        } catch (Exception e) {
            // ignore, "assume" will prevent illegal access in the test 
        }
    }

    /**
     * Test of sth method, of class IApp.
     */
    @Test
    public void testSth() {
        // "Assume" will prevent the test from failing if there is no instance injected.
        // This is necessary in order to build and install the AppTest Module correctly.
        Assume.assumeTrue(null != instance);

        System.out.println("testing the injected methof sth():");
        instance.sth();
    }

}
