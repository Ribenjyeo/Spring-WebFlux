package ru.ribenjyeo.webflux.repository;

import ru.ribenjyeo.webflux.domain.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
}
