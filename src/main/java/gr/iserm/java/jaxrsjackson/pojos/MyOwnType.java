package gr.iserm.java.jaxrsjackson.pojos;

import java.util.List;

/**
 * Created by sermojohn on 26/2/2016.
 */
public class MyOwnType {
    List<Path> paths;

    public MyOwnType(List<Path> paths) {
        this.paths = paths;
    }

    @Override
    public String toString() {
        return "MyOwnType{" +
                "paths=" + paths +
                '}';
    }
}
