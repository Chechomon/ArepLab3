package edu.escuelaing.arep.ejercicio1;

import java.net.URL;

/**
 *
 * @author sergio.pena
 */
public class URLReader {
    static URL google;
    public static void main(final String[] args) throws Exception {
        google = new URL("http://www.google.com:8080/test.html?name=prueba#loquepega");
        getMethods();
    }
    public static void getMethods() {
        System.out.println("metodo getProtocol() " + google.getProtocol());
        System.out.println("metodo getAuthority() " + google.getAuthority());
        System.out.println("metodo getHost() " + google.getHost());
        System.out.println("metodo getPort() " + google.getPort());
        System.out.println("metodo getPath() " + google.getPath());
        System.out.println("metodo getQuery() " + google.getQuery());
        System.out.println("metodo getFile() " + google.getFile());
        System.out.println("metodo getRef() " + google.getRef());
    }
}
