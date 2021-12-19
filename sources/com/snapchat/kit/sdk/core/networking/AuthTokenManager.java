package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.a.f;

public interface AuthTokenManager {
    static {
        Covode.recordClassIndex(35780);
    }

    void clearToken();

    String getAccessToken();

    boolean hasAccessToScope(String str);

    boolean isUserLoggedIn();

    void refreshAccessToken(RefreshAccessTokenResult refreshAccessTokenResult);

    void startTokenGrant();

    void startTokenGrantWithOptions(f fVar);
}
