package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.networking.FetchCodeVerifierCallback;

public interface ConnectFromSnapchatHandler {
    static {
        Covode.recordClassIndex(35542);
    }

    void fetchCodeVerifier(String str, FetchCodeVerifierCallback fetchCodeVerifierCallback);

    boolean needsLoginRedirect();
}
