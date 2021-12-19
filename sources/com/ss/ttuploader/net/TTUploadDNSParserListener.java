package com.ss.ttuploader.net;

import com.bytedance.covode.number.Covode;

public interface TTUploadDNSParserListener {
    static {
        Covode.recordClassIndex(101433);
    }

    void onCompletion(int i2, String str, String str2, long j2, String str3);
}
