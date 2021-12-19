package com.ss.android.ugc.aweme.commercialize.l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f74492a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final b f74493b = new b();

    private b() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("enable_preload_component", true);
        } catch (Throwable unused) {
            return f74492a;
        }
    }

    static {
        Covode.recordClassIndex(45943);
    }
}
