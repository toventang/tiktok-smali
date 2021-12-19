package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;

public interface RefreshAccessTokenResult {
    static {
        Covode.recordClassIndex(35785);
    }

    void onRefreshAccessTokenFailure(b bVar);

    void onRefreshAccessTokenSuccess(String str);
}
