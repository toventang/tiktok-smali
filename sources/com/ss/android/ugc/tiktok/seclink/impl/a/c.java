package com.ss.android.ugc.tiktok.seclink.impl.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f149009a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final c f149010b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(98147);
    }

    public static a a() {
        try {
            SettingsManager a2 = SettingsManager.a();
            a aVar = f149009a;
            a aVar2 = (a) a2.a("seclink_config", a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f149009a;
        }
    }
}
