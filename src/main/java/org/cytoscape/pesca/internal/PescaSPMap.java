/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cytoscape.pesca.internal;

import java.util.*;
import java.util.Iterator;

/**
 *
 * @author scardoni
 */
public class PescaSPMap {
    HashMap pescaSPmap;
    
public PescaSPMap() {
    pescaSPmap = new HashMap();    
}

public void update(Integer value) {
    
    if (pescaSPmap.containsKey(value)) {
        Integer sizecount = (Integer)pescaSPmap.get(value);
        pescaSPmap.put(value, sizecount+1);
    }
    else {
        pescaSPmap.put(value, new Integer(1));
    }
    
}

public String toString() {
    
    Iterator it = pescaSPmap.entrySet().iterator();
    String tmp = "";
    while (it.hasNext()) {
        Map.Entry pairs = (Map.Entry)it.next();
        tmp = tmp + "  " +pairs.getKey() + "   |    " + pairs.getValue() + "\n";
      //  it.remove(); // avoids a ConcurrentModificationException
    }


return tmp;
    
}

public Vector MaptoVector() {
    Vector result = new Vector();
    Iterator it = pescaSPmap.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pairs = (Map.Entry)it.next();
        result.addElement(pairs);
  //      System.out.println("aggiunto = "+ pairs.getKey() + " = " + pairs.getValue() + "\n" );
      //  it.remove(); // avoids a ConcurrentModificationException
    }
    
    
    return result;
}


}


