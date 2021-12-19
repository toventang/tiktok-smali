package com.ss.android.ugc.aweme.services.shoutout;

import com.bytedance.covode.number.Covode;

public interface ShoutoutVideoDownloadListener {
    static {
        Covode.recordClassIndex(79796);
    }

    void onFail();

    void onSuccess(String str);
}
