package gr.iserm.java.jaxrsjackson.pojos;

import java.util.List;

public class JsonOutput<T> {

    int counter;
    long totalTime;
    List<Result<MyOwnType>> results;

    public JsonOutput(int counter, long totalTime, List<Result<MyOwnType>> results) {
        this.counter = counter;
        this.totalTime = totalTime;
        this.results = results;
    }

    @Override
    public String toString() {
        return "JsonOutput{" +
                "counter=" + counter +
                ", totalTime=" + totalTime +
                ", results=" + results +
                '}';
    }
}
