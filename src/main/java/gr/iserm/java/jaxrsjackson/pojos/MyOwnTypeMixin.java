package gr.iserm.java.jaxrsjackson.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by sermojohn on 26/2/2016.
 */
public class MyOwnTypeMixin extends MyOwnType {
    public MyOwnTypeMixin(@JsonProperty("paths") List<Path> paths) {
        super(paths);
    }
}
