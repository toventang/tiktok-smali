package com.ss.bduploader.net;

import com.bytedance.covode.number.Covode;

public interface BDUploadDNSParserListener {
    static {
        Covode.recordClassIndex(100682);
    }

    void onCompletion(int i2, String str, String str2, long j2, String str3);
}
