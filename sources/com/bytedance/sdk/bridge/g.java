package com.bytedance.sdk.bridge;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f43875a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(26819);
    }

    public static void a(String str, String str2) {
        Boolean bool;
        l.c(str, "");
        l.c(str2, "");
        a aVar = c.f43852a;
        if (aVar != null) {
            bool = aVar.a();
        } else {
            bool = null;
        }
        l.a((Object) bool, (Object) true);
    }
}
