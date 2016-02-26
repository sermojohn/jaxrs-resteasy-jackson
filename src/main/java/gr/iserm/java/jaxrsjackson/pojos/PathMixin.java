package gr.iserm.java.jaxrsjackson.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sermojohn on 26/2/2016.
 */
public class PathMixin extends Path {
    public PathMixin(@JsonProperty("key") String key, @JsonProperty("value") String value) {
        super(key, value);
    }
}
