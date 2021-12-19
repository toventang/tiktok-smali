package com.ss.mediakit.fetcher;

import com.bytedance.covode.number.Covode;

public interface AVMDLURLFetcherInterface {
    static {
        Covode.recordClassIndex(101109);
    }

    void close();

    String[] getURLs();

    int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener);
}
