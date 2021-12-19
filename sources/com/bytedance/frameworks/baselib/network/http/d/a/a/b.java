package com.bytedance.frameworks.baselib.network.http.d.a.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class b implements Serializable {
    public List<String> ipv4List = new ArrayList();
    public List<String> ipv6List = new ArrayList();
    public a source = a.HTTPDNS_CACHE;

    static {
        Covode.recordClassIndex(17046);
    }

    public enum a {
        UNKNOWN,
        HTTPDNS_CACHE,
        HTTPDNS_STALE_CACHE,
        HTTPDNS_REQUEST,
        LOCALDNS_REQUEST,
        LOCALDNS_CACHE,
        HARDCODE_IPS;

        static {
            Covode.recordClassIndex(17047);
        }
    }
}
