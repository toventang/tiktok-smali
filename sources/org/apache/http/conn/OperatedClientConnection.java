package org.apache.http.conn;

import com.bytedance.covode.number.Covode;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpInetConnection;

public interface OperatedClientConnection extends HttpClientConnection, HttpInetConnection {
    static {
        Covode.recordClassIndex(106381);
    }
}
