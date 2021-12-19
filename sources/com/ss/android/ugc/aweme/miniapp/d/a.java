package com.ss.android.ugc.aweme.miniapp.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f109651a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f109652b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(70169);
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("miniapp_init_enable", false);
        } catch (Throwable unused) {
            return f109651a;
        }
    }
}
