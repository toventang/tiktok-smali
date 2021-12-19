package org.apache.http.impl.conn;

import com.bytedance.covode.number.Covode;
import java.net.ProxySelector;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;

public class ProxySelectorRoutePlanner implements HttpRoutePlanner {
    protected ProxySelector proxySelector;
    protected final SchemeRegistry schemeRegistry;

    static {
        Covode.recordClassIndex(106419);
    }

    public ProxySelectorRoutePlanner(SchemeRegistry schemeRegistry2, ProxySelector proxySelector2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            this.proxySelector = proxySelector2;
            return;
        }
        throw new IllegalArgumentException("SchemeRegistry must not be null.");
    }
}
