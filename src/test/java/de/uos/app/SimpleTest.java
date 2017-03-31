/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.uos.app;


import com.airhacks.afterburner.injection.Injector;
import de.uos.apptest.IApp;
import de.uos.intellij.ActionSetup;
import de.uos.netbeans.Installer;
import de.uos.netbeans.Startable;
import org.junit.Test;


public class SimpleTest extends TestIApp {

    
    @Test
    public void funnyTest() {
        System.out.println("Diese Nachricht ist nicht zu übersehen.");
        MainApp iAppImpl = Injector.instantiateModelOrService(MainApp.class);
    
        Injector.setModelOrService(IApp.class, iAppImpl);
        // let the subclass perform the injection
        super.setUp();
    }
    
    /**
     * @brief Test if in all IDEs the hooks were set correctly
     */
    @Test
    public void InitializeTest(){
        
       /* Installer StartingPoint = Injector.instantiateModelOrService(Installer.class);
        StartingPoint.restored();
        Injector.setModelOrService(Installer.class, StartingPoint);
        super.setUp(); */
        
        ActionSetup AS = Injector.instantiateModelOrService(ActionSetup.class);
       // AS.actionPerformed(null);
        Injector.setModelOrService(ActionSetup.class, AS);
        super.setUp();
    }
}
