package gr.iserm.java.jaxrsjackson.pojos;

/**
 * Created by sermojohn on 26/2/2016.
 */
public class Result<T> {
    String url;
    T representation;

    public Result(String url, T representation) {
        this.url = url;
        this.representation = representation;
    }

    @Override
    public String toString() {
        return "Result{" +
                "url='" + url + '\'' +
                ", representation=" + representation +
                '}';
    }
}
