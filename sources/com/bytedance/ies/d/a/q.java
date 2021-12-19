package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    static k f33244a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final q f33245b = new q();

    public static final class a implements k {
        static {
            Covode.recordClassIndex(19865);
        }

        @Override // com.bytedance.ies.d.a.k
        public final void a(String str) {
            l.c(str, "");
        }

        @Override // com.bytedance.ies.d.a.k
        public final void a(String str, Throwable th) {
            l.c(str, "");
            l.c(th, "");
        }

        a() {
        }
    }

    private q() {
    }

    static {
        Covode.recordClassIndex(19864);
    }

    public static void a(String str) {
        l.c(str, "");
        f33244a.a(str);
    }

    public static void b(String str) {
        l.c(str, "");
        f33244a.a(str);
    }

    public static void a(String str, Throwable th) {
        l.c(str, "");
        if (th == null) {
            f33244a.a(str);
        } else {
            f33244a.a(str, th);
        }
    }

    public static void b(String str, Throwable th) {
        l.c(str, "");
        if (th == null) {
            f33244a.a(str);
        } else {
            f33244a.a(str, th);
        }
    }
}
