package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;

public interface FirebaseTokenManager {
    static {
        Covode.recordClassIndex(35784);
    }

    void startFirebaseTokenGrant();
}
