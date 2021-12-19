package com.bytedance.lobby.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f40247a = a("com.google.android.gms.auth.api.signin.GoogleSignInClient");

    /* renamed from: b  reason: collision with root package name */
    static final boolean f40248b = a("com.google.android.gms.auth.api.identity.SignInCredential");

    /* renamed from: c  reason: collision with root package name */
    static final boolean f40249c = a("com.facebook.login.LoginManager");

    /* renamed from: d  reason: collision with root package name */
    static final boolean f40250d = a("com.linecorp.linesdk.auth.LineLoginApi");

    /* renamed from: e  reason: collision with root package name */
    static final boolean f40251e = a("com.twitter.sdk.android.core.identity.TwitterAuthClient");

    /* renamed from: f  reason: collision with root package name */
    static final boolean f40252f = a("com.kakao.auth.KakaoSDK");

    /* renamed from: g  reason: collision with root package name */
    static final boolean f40253g = a("com.vk.api.sdk.VK");

    static {
        Covode.recordClassIndex(24807);
    }

    private static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
