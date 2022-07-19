package ru.ribenjyeo.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.ribenjyeo.webflux.domain.Message;
import ru.ribenjyeo.webflux.repo.MessageRepo;

@Service
public class MessageService {
    private final MessageRepo messageRepository;

    @Autowired
    public MessageService(MessageRepo messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Flux<Message> list() {
        return messageRepository.findAll();
    }

    public Mono<Message> addOne(Message message) {
        return messageRepository.save(message);
    }
}