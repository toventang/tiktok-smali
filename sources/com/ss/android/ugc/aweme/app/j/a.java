package com.ss.android.ugc.aweme.app.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f66810a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f66811b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(41128);
    }

    public static boolean a() {
        try {
            return SettingsManager.a().a("rn_schema_seclink_switch", false);
        } catch (Throwable unused) {
            return f66810a;
        }
    }
}
