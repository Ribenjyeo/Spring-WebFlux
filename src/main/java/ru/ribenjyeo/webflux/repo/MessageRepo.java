package ru.ribenjyeo.webflux.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.ribenjyeo.webflux.domain.Message;


public interface MessageRepo extends ReactiveCrudRepository<Message, Long> {
}