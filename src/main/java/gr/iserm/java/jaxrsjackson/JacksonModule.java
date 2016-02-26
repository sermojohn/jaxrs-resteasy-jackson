package gr.iserm.java.jaxrsjackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import gr.iserm.java.jaxrsjackson.pojos.*;

/**
 * Created by sermojohn on 26/2/2016.
 */
public class JacksonModule extends Module {
    @Override
    public String getModuleName() {
        return "MyJacksonModule";
    }

    @Override
    public Version version() {
        return new Version(1, 0, 0, "", "1", "2");
    }

    @Override
    public void setupModule(SetupContext setupContext) {
        setupContext.setMixInAnnotations(JsonOutput.class, JsonOutputMixin.class);
        setupContext.setMixInAnnotations(Result.class, ResultMixin.class);
        setupContext.setMixInAnnotations(MyOwnType.class, MyOwnTypeMixin.class);
        setupContext.setMixInAnnotations(Path.class, PathMixin.class);


    }
}
