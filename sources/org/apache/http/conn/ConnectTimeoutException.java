package org.apache.http.conn;

import com.bytedance.covode.number.Covode;
import java.io.InterruptedIOException;

public class ConnectTimeoutException extends InterruptedIOException {
    private static final long serialVersionUID = -4816682903149535989L;

    static {
        Covode.recordClassIndex(106379);
    }

    public ConnectTimeoutException() {
    }

    public ConnectTimeoutException(String str) {
        super(str);
    }
}
