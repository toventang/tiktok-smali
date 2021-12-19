package com.facebook.login;

import com.bytedance.covode.number.Covode;

public enum d {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);
    
    public final boolean allowsCustomTabAuth;
    public final boolean allowsDeviceAuth;
    public final boolean allowsFacebookLiteAuth;
    public final boolean allowsGetTokenAuth;
    public final boolean allowsKatanaAuth;
    public final boolean allowsWebViewAuth;

    static {
        Covode.recordClassIndex(29473);
    }

    private d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.allowsGetTokenAuth = z;
        this.allowsKatanaAuth = z2;
        this.allowsWebViewAuth = z3;
        this.allowsDeviceAuth = z4;
        this.allowsCustomTabAuth = z5;
        this.allowsFacebookLiteAuth = z6;
    }
}
