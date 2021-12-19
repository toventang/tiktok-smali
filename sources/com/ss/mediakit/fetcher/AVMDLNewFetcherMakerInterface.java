package com.ss.mediakit.fetcher;

import com.bytedance.covode.number.Covode;

public interface AVMDLNewFetcherMakerInterface {
    static {
        Covode.recordClassIndex(101107);
    }

    AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3, String str4);
}
