package com.example.helloworld.handlers;

import static org.springframework.web.servlet.function.ServerResponse.ok;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import com.example.helloworld.services.MessageService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MessageHandler {

    private final MessageService messageService;

    @Cacheable
    public ServerResponse getPublic(final ServerRequest request) {
        final var message = messageService.getPublicMessage();

        return ok().body(message);
    }

    @Cacheable
    public ServerResponse getProtected(final ServerRequest request) {
        final var message = messageService.getProtectedMessage();

        return ok().body(message);
    }

    @Cacheable
    public ServerResponse getAdmin(final ServerRequest request) {
        final var message = messageService.getAdminMessage();

        return ok().body(message);
    }
}
