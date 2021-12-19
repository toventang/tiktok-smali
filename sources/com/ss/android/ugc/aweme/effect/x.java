package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f88993a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final x f88994b = new x();

    private x() {
    }

    public static final boolean a() {
        try {
            return SettingsManager.a().a("tools_switch_okhttp_to_ttnet", true);
        } catch (Throwable unused) {
            return f88993a;
        }
    }

    static {
        Covode.recordClassIndex(55972);
    }
}
