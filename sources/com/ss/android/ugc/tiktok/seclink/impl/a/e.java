package com.ss.android.ugc.tiktok.seclink.impl.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f149012a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final e f149013b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(98149);
    }

    public static d a() {
        try {
            SettingsManager a2 = SettingsManager.a();
            d dVar = f149012a;
            d dVar2 = (d) a2.a("seclink_white_list_config", d.class, dVar);
            return dVar2 == null ? dVar : dVar2;
        } catch (Throwable unused) {
            return f149012a;
        }
    }
}
