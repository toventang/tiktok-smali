package com.snapchat.kit.sdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.snapchat.kit.sdk.core.a.a;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private volatile a f57318a;

    /* renamed from: b  reason: collision with root package name */
    private final SecureSharedPreferences f57319b;

    /* renamed from: c  reason: collision with root package name */
    private final l f57320c;

    static {
        Covode.recordClassIndex(35841);
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (!TextUtils.isEmpty(e())) {
            return true;
        }
        return false;
    }

    public final synchronized String d() {
        MethodCollector.i(7295);
        if (this.f57318a == null) {
            MethodCollector.o(7295);
            return null;
        }
        String accessToken = this.f57318a.getAccessToken();
        MethodCollector.o(7295);
        return accessToken;
    }

    /* access modifiers changed from: package-private */
    public final synchronized String e() {
        MethodCollector.i(7298);
        if (this.f57318a == null) {
            MethodCollector.o(7298);
            return null;
        }
        String refreshToken = this.f57318a.getRefreshToken();
        MethodCollector.o(7298);
        return refreshToken;
    }

    public final synchronized boolean b() {
        MethodCollector.i(7081);
        if (this.f57318a == null) {
            MethodCollector.o(7081);
            return false;
        } else if (this.f57318a.isExpired()) {
            MethodCollector.o(7081);
            return true;
        } else {
            boolean willBeExpiredAfter = this.f57318a.willBeExpiredAfter(300000L);
            MethodCollector.o(7081);
            return willBeExpiredAfter;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized String c() {
        MethodCollector.i(7199);
        if (this.f57318a != null && !this.f57318a.isExpired()) {
            if (!this.f57318a.willBeExpiredAfter(300000L)) {
                String accessToken = this.f57318a.getAccessToken();
                MethodCollector.o(7199);
                return accessToken;
            }
        }
        MethodCollector.o(7199);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void g() {
        MethodCollector.i(7320);
        this.f57318a = null;
        SecureSharedPreferences secureSharedPreferences = this.f57319b;
        if (secureSharedPreferences != null) {
            secureSharedPreferences.clearEntry("auth_token");
        }
        this.f57320c.clearEntry("auth_token");
        MethodCollector.o(7320);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a() {
        MethodCollector.i(7023);
        if (this.f57318a == null || this.f57318a.isComplete()) {
            MethodCollector.o(7023);
            return false;
        }
        MethodCollector.o(7023);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(a aVar) {
        MethodCollector.i(7377);
        if (this.f57318a == null || this.f57318a.getLastUpdated() <= aVar.getLastUpdated()) {
            this.f57318a = aVar;
            this.f57320c.put("auth_token", this.f57318a);
            SecureSharedPreferences secureSharedPreferences = this.f57319b;
            if (secureSharedPreferences != null) {
                secureSharedPreferences.clearEntry("auth_token");
            }
        }
        MethodCollector.o(7377);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(String str) {
        MethodCollector.i(6855);
        if (this.f57318a == null || !this.f57318a.hasAccessToScope(str)) {
            MethodCollector.o(6855);
            return false;
        }
        MethodCollector.o(6855);
        return true;
    }

    e(SecureSharedPreferences secureSharedPreferences, l lVar) {
        this.f57319b = secureSharedPreferences;
        this.f57320c = lVar;
        this.f57318a = (a) lVar.get("auth_token", a.class);
        if (this.f57318a == null && secureSharedPreferences != null) {
            this.f57318a = (a) secureSharedPreferences.get("auth_token", a.class);
        }
    }
}
