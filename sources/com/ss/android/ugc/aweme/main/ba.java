package com.ss.android.ugc.aweme.main;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.b.a.c;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class ba {

    /* renamed from: a  reason: collision with root package name */
    private final h f109187a = i.a(m.SYNCHRONIZED, a.f109188a);

    static {
        Covode.recordClassIndex(69923);
    }

    private final ay b() {
        return (ay) this.f109187a.getValue();
    }

    static final class a extends h.f.b.m implements h.f.a.a<ay> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f109188a = new a();

        static {
            Covode.recordClassIndex(69924);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ay invoke() {
            return c.a(d.a(), ay.class);
        }
    }

    public final String a() {
        String str = "";
        try {
            String d2 = b().d(str);
            l.b(d2, str);
            str = d2;
            return str;
        } catch (Throwable th) {
            b.a(th, "MainTabPreferences AbstractMethodError");
            return str;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        try {
            b().c(str);
        } catch (Throwable th) {
            b.a(th, "MainTabPreferences AbstractMethodError");
        }
    }
}
