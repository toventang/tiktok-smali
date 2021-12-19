package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class ConnectionShutdownException extends IOException {
    static {
        Covode.recordClassIndex(106248);
    }
}
