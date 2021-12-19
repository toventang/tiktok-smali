package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31789a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(18586);
    }

    public static final void a(String str) {
        l.c(str, "");
        j a2 = j.a();
        l.a((Object) a2, "");
        if (a2.b()) {
            System.out.println((Object) "@=>abmock  ".concat(String.valueOf(str)));
        }
    }
}
