package mate.techcheck.practice.handler.handlers;

import mate.techcheck.practice.handler.Handler;
import org.springframework.stereotype.Component;

@Component("sms")
public class SmsHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("sms handler was called");
    }
}
