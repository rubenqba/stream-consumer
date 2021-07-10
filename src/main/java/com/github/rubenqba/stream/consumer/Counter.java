package com.github.rubenqba.stream.consumer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.ToString;

@ToString
class Counter {
    private String name;
    private Integer count;

    @JsonCreator
    public Counter(
            @JsonProperty("name") String name,
            @JsonProperty("count") Integer count) {
        this.name = name;
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}

