package com.bytedance.sdk.bdlynx.a.a;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f43640a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(26709);
    }

    public static void a(String str, String str2) {
        l.c(str, "");
        LLog.b("BDLynx_".concat(String.valueOf(str)), str2);
    }

    public static void b(String str, String str2) {
        l.c(str, "");
        LLog.a("BDLynx_".concat(String.valueOf(str)), str2);
    }

    public static void c(String str, String str2) {
        l.c(str, "");
        LLog.d("BDLynx_".concat(String.valueOf(str)), str2);
    }
}
