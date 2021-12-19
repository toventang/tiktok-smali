package com.ss.mediakit.fetcher;

import com.bytedance.covode.number.Covode;

public interface AVMDLFetcherMakerInterface {
    static {
        Covode.recordClassIndex(101106);
    }

    AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3);
}
