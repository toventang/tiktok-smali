package org.apache.http;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public interface HttpConnection extends Closeable {
    static {
        Covode.recordClassIndex(106369);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
