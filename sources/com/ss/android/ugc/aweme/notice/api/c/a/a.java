package com.ss.android.ugc.aweme.notice.api.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f112701a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final a f112702b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(72431);
    }

    public static final String[] a() {
        try {
            Object a2 = SettingsManager.a().a("boe_ws_host_list", String[].class);
            l.b(a2, "");
            return (String[]) a2;
        } catch (Throwable unused) {
            return new String[0];
        }
    }
}
