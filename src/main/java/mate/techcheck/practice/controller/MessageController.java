package mate.techcheck.practice.controller;

import lombok.RequiredArgsConstructor;
import mate.techcheck.practice.handler.Handler;
import mate.techcheck.practice.handler.HandlerStrategy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/notification/send")
public class MessageController {
    private final HandlerStrategy handlerStrategy;

    @PostMapping
    public String sendNotification(@RequestParam String handler) {
        Handler notificationHandler = handlerStrategy.getHandler(handler);
        notificationHandler.handle();
        return handler + " handler was called";
    }
}
