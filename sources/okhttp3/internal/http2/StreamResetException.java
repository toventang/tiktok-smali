package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    static {
        Covode.recordClassIndex(106288);
    }

    public StreamResetException(ErrorCode errorCode2) {
        super("stream was reset: ".concat(String.valueOf(errorCode2)));
        this.errorCode = errorCode2;
    }
}
