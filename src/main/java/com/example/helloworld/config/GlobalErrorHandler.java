package com.example.helloworld.config;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import com.example.helloworld.models.ErrorMessage;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public record GlobalErrorHandler() {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public ErrorMessage handleNotFound(final HttpServletRequest request, final Exception error) {
        return ErrorMessage.from("Not Found");
    }

    @Cacheable
    public ServerResponse handleInternalError(final Throwable error, final ServerRequest request) {
        return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorMessage.from(error.getMessage()));
    }
}
