package edu.escuelaing.arep.retos;

/**
 *
 * @author sergio.pena
 */
public class WebService {
    
    @Web
    public static String hello(){
        return "<!doctype html>\n"
                + "<html lang=en>\n"
                + "<head>\n"
                + "<meta charset=utf-8>\n"
                + "<title>blah</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<p>Hello</p>\n"
                + "</body>\n"
                + "</html>";
    }
}