package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.Socket;

public interface Connection {
    static {
        Covode.recordClassIndex(106131);
    }

    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
