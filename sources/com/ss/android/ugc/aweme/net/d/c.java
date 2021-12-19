package com.ss.android.ugc.aweme.net.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f112295a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(72161);
    }

    public static String[] a() {
        try {
            Object a2 = SettingsManager.a().a("rrq_path_white_list", String[].class);
            l.b(a2, "");
            return (String[]) a2;
        } catch (Throwable unused) {
            return new String[]{"/aweme/v1/aweme/stats/"};
        }
    }
}
