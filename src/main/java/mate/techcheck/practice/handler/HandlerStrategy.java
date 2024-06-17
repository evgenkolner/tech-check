package mate.techcheck.practice.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class HandlerStrategy {
    private final Map<String, Handler> handlerMap;

    public Handler getHandler(String handlerType) {
        Handler handler = handlerMap.get(handlerType);
        if (handler == null) {
            throw new RuntimeException("HandlerType is not correct");
        }
        return handler;
    }
}
