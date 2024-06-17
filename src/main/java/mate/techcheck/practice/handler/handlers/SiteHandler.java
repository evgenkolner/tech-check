package mate.techcheck.practice.handler.handlers;

import mate.techcheck.practice.handler.Handler;
import org.springframework.stereotype.Component;

@Component("site")
public class SiteHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("site handler was called");
    }
}
