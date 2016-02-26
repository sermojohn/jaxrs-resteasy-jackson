package gr.iserm.java.jaxrsjackson.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;

/**
 * Created by sermojohn on 26/2/2016.
 */
public abstract class JsonOutputMixin extends JsonOutput {
    public JsonOutputMixin(@JsonProperty("counter") int counter, @JsonProperty("totalTime") long totalTime, @JsonProperty("results") List<Result<MyOwnType>> results) {
        super(counter, totalTime, results);
    }
}
