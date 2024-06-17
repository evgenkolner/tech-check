package mate.techcheck.practice.handler.handlers;

import mate.techcheck.practice.handler.Handler;
import org.springframework.stereotype.Component;

@Component("email")
public class EmailHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("email handler was called");
    }
}
