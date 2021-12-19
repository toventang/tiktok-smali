package com.snapchat.kit.sdk.core.controller;

import com.bytedance.covode.number.Covode;

public enum a {
    UNKNOWN_ERROR,
    INVALID_OAUTH_RESPONSE,
    OAUTH_TOKEN_GRANT_FAILURE,
    FIREBASE_CUSTOM_TOKEN_FETCH_FAILURE;
    
    public String errorDescription;

    static {
        Covode.recordClassIndex(35589);
    }
}
