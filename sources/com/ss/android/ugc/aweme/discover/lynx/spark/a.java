package com.ss.android.ugc.aweme.discover.lynx.spark;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.lynx.delegate.j;
import h.a.i;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f81556a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final a f81557b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(50681);
    }

    private static String[] a() {
        Object a2 = SettingsManager.a().a("spark_card_list", String[].class, f81556a);
        if (a2 == null) {
            l.b();
        }
        return (String[]) a2;
    }

    public static boolean a(String str) {
        l.d(str, "");
        return i.a(a(), j.a.a(str));
    }
}
