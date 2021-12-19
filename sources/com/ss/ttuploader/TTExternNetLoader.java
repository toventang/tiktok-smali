package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public interface TTExternNetLoader {
    static {
        Covode.recordClassIndex(101382);
    }

    void cancelTask();

    int sendRequest(TTExternRequestInfo tTExternRequestInfo, TTExternNetLoaderListener tTExternNetLoaderListener);
}
