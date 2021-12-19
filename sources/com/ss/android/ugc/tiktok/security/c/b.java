package com.ss.android.ugc.tiktok.security.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f149049a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final b f149050b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(98174);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("webview_csrf_switch", false);
        } catch (Throwable unused) {
            return f149049a;
        }
    }
}
