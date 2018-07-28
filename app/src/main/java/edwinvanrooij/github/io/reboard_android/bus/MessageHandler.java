package edwinvanrooij.github.io.reboard_android.bus;

import javax.websocket.Session;

public abstract class MessageHandler {
    public abstract void handleMessage(String text);
}
