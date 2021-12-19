package org.apache.http.conn.scheme;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class SchemeRegistry {
    private final ConcurrentHashMap<String, Scheme> registeredSchemes = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(106399);
    }

    public final Scheme register(Scheme scheme) {
        if (scheme != null) {
            return this.registeredSchemes.put(scheme.getName(), scheme);
        }
        throw new IllegalArgumentException("Scheme must not be null.");
    }
}
