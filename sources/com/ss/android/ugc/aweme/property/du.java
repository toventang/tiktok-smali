package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class du {

    /* renamed from: a  reason: collision with root package name */
    public static final dv f118467a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final du f118468b = new du();

    private du() {
    }

    static {
        Covode.recordClassIndex(76948);
    }

    public static dv a() {
        try {
            dv dvVar = (dv) SettingsManager.a().a("share_post", dv.class, f118467a);
            if (dvVar == null) {
                return new dv();
            }
            return dvVar;
        } catch (Throwable unused) {
            return new dv();
        }
    }
}
