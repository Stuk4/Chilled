package chilled.logic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stuk4 on 5/24/2016.
 */
public class VelocityHandlerTest {


    VelocityHandler vHandler;

    @Test
    public void testValidMerge(){

        String $template = "hi $name . this is a template";
        String $templateName = "template";
        String[] $keys = {"name"};
        Object[] $values = {"Carlos"};

        vHandler = new VelocityHandler($templateName, $template);
        assertEquals("hi Carlos . this is a template", vHandler.merge($keys, $values));
    }



}