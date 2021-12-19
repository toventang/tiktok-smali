package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;

public interface AVMDLDNSParserListener {
    static {
        Covode.recordClassIndex(101137);
    }

    void onCompletion(int i2, String str, String str2, long j2, String str3, int i3);
}
