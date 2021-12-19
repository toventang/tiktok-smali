package okhttp3;

import com.bytedance.covode.number.Covode;
import k.i;

public interface WebSocket {

    public interface Factory {
        static {
            Covode.recordClassIndex(106186);
        }

        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    static {
        Covode.recordClassIndex(106185);
    }

    void cancel();

    boolean close(int i2, String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(i iVar);
}
