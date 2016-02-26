package gr.iserm.java.jaxrsjackson.pojos;

/**
 * Created by sermojohn on 26/2/2016.
 */
public class Path {
    String key;
    String value;

    public Path(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Path{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
