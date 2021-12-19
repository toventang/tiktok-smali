package org.apache.http.impl.conn;

import com.bytedance.covode.number.Covode;
import org.apache.http.conn.DnsResolver;

public class SystemDefaultDnsResolver implements DnsResolver {
    static {
        Covode.recordClassIndex(106421);
    }
}
