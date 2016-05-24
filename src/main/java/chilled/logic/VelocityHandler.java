package chilled.logic;

import com.jcabi.aspects.Immutable;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.StringResourceLoader;
import org.apache.velocity.runtime.resource.util.StringResourceRepository;

import java.io.StringWriter;

/**
 * <p>
 *
 * @author Carlos Larico (clarico@kiwisoft.pe) [stuk4]
 * @version $Id$
 * @since 0.1
 */
@Immutable
public final class VelocityHandler {


    /**
     * Template name
     */
    private final transient String templateName;


    /**
     * template
     */
    private final transient String templateValue;



    /* Velocity Variables*/
    private VelocityEngine engine;

    private Template template;

    private StringResourceRepository repo;

    private VelocityContext ctx;

    private StringWriter writer;

    /**
     *
     * @param templateName
     * @param templateValue
     */
    public VelocityHandler(String templateName, String templateValue) {
        this.templateName = templateName;
        this.templateValue = templateValue;

        //execute
        loadEngine();
        loadRepository();
    }

    /**
     * Load Engine
     */
    private void loadEngine(){
        engine = new VelocityEngine();
        engine.setProperty(RuntimeConstants.RUNTIME_LOG_LOGSYSTEM_CLASS, "org.apache.velocity.runtime.log.Log4JLogChute");
        engine.setProperty(org.apache.velocity.app.Velocity.RESOURCE_LOADER, "string");
        engine.addProperty("string.resource.loader.class", StringResourceLoader.class.getName());
        engine.addProperty("string.resource.loader.repository.static", "false");
        engine.init();
    }


    /**
     *
     */
    private void loadRepository(){
        repo = (StringResourceRepository) engine.getApplicationAttribute(StringResourceLoader.REPOSITORY_NAME_DEFAULT);
        repo.putStringResource(templateName, Query.INSERT);
    }

    /**
     * Merge template and get parse text
     * @param keys keys
     * @param values attributes
     * @return String parsed
     */
    public String merge(String[] keys, Object[] values){
        template = engine.getTemplate(templateName);
        writer = new StringWriter();
        ctx = new VelocityContext();
        fill(keys, values);
        template.merge(ctx, writer);
        return writer.toString();
    }

    /**
     * put all parameters in context
     */
    private void fill(String[] keys, Object[] values){
        for (int i = 0; i < keys.length; i++) {
            ctx.put(keys[i], values[i]);
        }
    }



}
