package com.snapchat.kit.sdk.creative.api;

import com.bytedance.covode.number.Covode;

public interface SnapCreativeKitCompletionCallback {
    static {
        Covode.recordClassIndex(35822);
    }

    void onSendFailed(b bVar);

    void onSendSuccess();
}
