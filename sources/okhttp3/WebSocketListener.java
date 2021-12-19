package okhttp3;

import com.bytedance.covode.number.Covode;
import k.i;

public abstract class WebSocketListener {
    static {
        Covode.recordClassIndex(106187);
    }

    public void onClosed(WebSocket webSocket, int i2, String str) {
    }

    public void onClosing(WebSocket webSocket, int i2, String str) {
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
    }

    public void onMessage(WebSocket webSocket, String str) {
    }

    public void onMessage(WebSocket webSocket, i iVar) {
    }

    public void onOpen(WebSocket webSocket, Response response) {
    }
}
