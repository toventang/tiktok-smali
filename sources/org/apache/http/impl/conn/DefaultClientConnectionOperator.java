package org.apache.http.impl.conn;

import com.bytedance.covode.number.Covode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.scheme.SchemeRegistry;

public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    protected final DnsResolver dnsResolver;
    private final Log log = LogFactory.getLog(getClass());
    protected final SchemeRegistry schemeRegistry;

    static {
        Covode.recordClassIndex(106417);
    }

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            this.dnsResolver = new SystemDefaultDnsResolver();
            return;
        }
        throw new IllegalArgumentException("Scheme registry amy not be null");
    }
}
