package chilled.logic;

import com.jcabi.log.Logger;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.StringResourceLoader;
import org.apache.velocity.runtime.resource.util.StringResourceRepository;

import java.io.StringWriter;

/**
 * Created by stuk4 on 5/24/2016.
 */
public class BasicQueryHandler implements QueryHandler {


    public String insert(String[] fields, String[] values) {
        return null;
    }

    public String update(String[] fields, String[] values) {
        return null;
    }

    public String selectAll(String[] fields, String[] values) {
        return null;
    }

    public String delete(String[] fields, String[] values) {
        return null;
    }


    public static void main(String[] args) {
        System.out.println(new BasicQueryHandler().insert(new String[]{"a", "b"}, new String[]{"a", "b"}));
    }

}
