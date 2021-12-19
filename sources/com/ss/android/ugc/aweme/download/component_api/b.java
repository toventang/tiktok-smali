package com.ss.android.ugc.aweme.download.component_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f83095a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final b f83096b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(51796);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("download_component_exp_switch", false);
        } catch (Throwable unused) {
            return f83095a;
        }
    }
}
