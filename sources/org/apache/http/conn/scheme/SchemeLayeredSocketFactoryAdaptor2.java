package org.apache.http.conn.scheme;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SchemeLayeredSocketFactoryAdaptor2 implements SchemeLayeredSocketFactory {
    private final LayeredSchemeSocketFactory factory;

    static {
        Covode.recordClassIndex(106398);
    }

    SchemeLayeredSocketFactoryAdaptor2(LayeredSchemeSocketFactory layeredSchemeSocketFactory) {
        this.factory = layeredSchemeSocketFactory;
    }
}
