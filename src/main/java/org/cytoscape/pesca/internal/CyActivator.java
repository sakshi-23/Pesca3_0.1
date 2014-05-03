//package org.cytoscape.pesca.internal;
package org.cytoscape.pesca.internal;

import java.util.Properties;
import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.application.swing.CySwingApplication;
import org.cytoscape.application.swing.CytoPanelComponent;
import org.cytoscape.service.util.AbstractCyActivator;
import org.cytoscape.service.util.CyServiceRegistrar;
//import org.cytoscape.application.CyApplicationManager;
//import org.cytoscape.application.swing.CySwingApplication;
//import org.cytoscape.application.swing.CytoPanelComponent;
//import org.cytoscape.service.util.AbstractCyActivator;
import org.osgi.framework.BundleContext;

public class CyActivator extends AbstractCyActivator {
 public CyApplicationManager cyApplicationManager;
    public CySwingApplication cyDesktopService;
    public CyServiceRegistrar cyServiceRegistrar;
    
    
	@Override
	public void start(BundleContext context) throws Exception {
		
		
		CySwingApplication cytoscapeDesktopService = getService(context,CySwingApplication.class);
		             
		  this.cyApplicationManager = getService(context, CyApplicationManager.class);
        this.cyDesktopService = getService(context, CySwingApplication.class);
        this.cyServiceRegistrar = getService(context, CyServiceRegistrar.class);
		//PescaStartMenu pescastartmenu = new PescaStartMenu(cyApplicationManager, cytoscapeDesktopService);
		//Sample02 sample02Action = new Sample02(cytoscapeDesktopService,myCytoPanel);
		
		//registerService(context,pescastartmenu,CytoPanelComponent.class, new Properties());
		//registerService(bc,sample02Action,CyAction.class, new Properties());

                
                
                
                
		MenuAction action = new MenuAction( "Pesca", this);
		
		Properties properties = new Properties();
		
		registerAllServices(context, action, properties);
	}
        
        
        
         public CyServiceRegistrar getcyServiceRegistrar() {
        return cyServiceRegistrar;
    }

    public CyApplicationManager getcyApplicationManager() {
        return cyApplicationManager;
    }

    public CySwingApplication getcytoscapeDesktopService() {
        return cyDesktopService;
    }

}
