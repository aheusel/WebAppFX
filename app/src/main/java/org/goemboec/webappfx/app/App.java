/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.goemboec.webappfx.app;

import org.goemboec.webappfx.list.LinkedList;

import static org.goemboec.webappfx.utilities.StringUtils.join;
import static org.goemboec.webappfx.utilities.StringUtils.split;
import static org.goemboec.webappfx.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
