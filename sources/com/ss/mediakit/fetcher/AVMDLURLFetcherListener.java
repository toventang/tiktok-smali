package com.ss.mediakit.fetcher;

import com.bytedance.covode.number.Covode;

public interface AVMDLURLFetcherListener {
    static {
        Covode.recordClassIndex(101110);
    }

    void onCompletion(int i2, String str, String str2, String[] strArr);
}
