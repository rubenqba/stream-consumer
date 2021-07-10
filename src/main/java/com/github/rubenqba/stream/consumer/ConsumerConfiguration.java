package com.github.rubenqba.stream.consumer;

import lombok.extern.slf4j.Slf4j;
import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Slf4j
public class ConsumerConfiguration {

    @Bean
    public Consumer<Event<Counter>> counter(CounterHolder holder) {
        return event -> {
            log.info("counter: {}", event);
            // holder.update(event.getBody().getName());
        };
    }
}