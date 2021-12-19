package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;

public interface AVMDLCustomHTTPDNSParser {
    static {
        Covode.recordClassIndex(101129);
    }

    AVMDLCustomHTTPDNSParserResult parseHost(String str);
}
