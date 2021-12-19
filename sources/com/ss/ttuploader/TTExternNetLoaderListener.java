package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public interface TTExternNetLoaderListener {
    static {
        Covode.recordClassIndex(101383);
    }

    void onComplete(TTExternResponseInfo tTExternResponseInfo);

    void onFailed(String str, Throwable th);

    int readFileData(byte[] bArr, long j2, int i2);
}
