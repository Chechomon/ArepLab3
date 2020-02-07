package edu.escuelaing.arep.retos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.*;

/**
 *
 * @author sergio.pena
 */
public class BetterSpringBoot {
    
    public static void main() throws IllegalArgumentException, InvocationTargetException{
        String className = "edu.escuelaing.arep.areplab4.WebService";
        try{
            Class c = Class.forName(className);
            Method[] methods = c.getMethods();
            for (Method m : methods){
                if(m.isAnnotationPresent(Web.class)){
                    try{
                        System.out.println(m.invoke(null));
                    }catch(IllegalAccessException ex){
                        Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    }catch(IllegalArgumentException ex){
                        Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    }catch(InvocationTargetException ex){
                        Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(BetterSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}