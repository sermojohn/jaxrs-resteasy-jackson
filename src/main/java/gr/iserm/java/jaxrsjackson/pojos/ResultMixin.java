package gr.iserm.java.jaxrsjackson.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sermojohn on 26/2/2016.
 */
public abstract class ResultMixin<T> extends Result<T> {
    public ResultMixin(@JsonProperty("url") String url, @JsonProperty("representation") T representation) {
        super(url, representation);
    }
}
