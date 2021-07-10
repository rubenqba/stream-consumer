package com.github.rubenqba.stream.consumer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import lombok.Data;


@Data
class Event<T> {
    private final String type;
    private final T body;
    private final Instant createdAt;

    @JsonCreator
    public Event(
            @JsonProperty("type") String type,
            @JsonProperty("body") T body,
            @JsonProperty("createAt") Instant createdAt) {
        this.type = type;
        this.body = body;
        this.createdAt = createdAt;
    }
}
