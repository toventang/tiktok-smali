package org.apache.http.conn.scheme;

import com.bytedance.covode.number.Covode;

public class PlainSocketFactory implements SchemeSocketFactory, SocketFactory {
    static {
        Covode.recordClassIndex(106394);
    }

    public static PlainSocketFactory getSocketFactory() {
        return new PlainSocketFactory();
    }
}
