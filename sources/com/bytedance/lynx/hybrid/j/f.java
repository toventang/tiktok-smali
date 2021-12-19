package com.bytedance.lynx.hybrid.j;

import android.view.View;
import com.bytedance.android.monitorV2.k.b;
import com.bytedance.android.monitorV2.k.d;
import com.bytedance.android.monitorV2.k.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f41015a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(25126);
    }

    public static void a(String str, b bVar) {
        l.c(str, "");
        l.c(bVar, "");
        d.a(str, bVar);
    }

    public static void a(String str, String str2, long j2) {
        l.c(str, "");
        l.c(str2, "");
        d.a(str, str2, j2);
    }

    public static void a(String str, String str2, View view) {
        l.c(str, "");
        l.c(str2, "");
        l.c(view, "");
        d.a(str, new e(view, str2));
    }

    public static void a(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        d.a(str, str2, str3);
    }
}
