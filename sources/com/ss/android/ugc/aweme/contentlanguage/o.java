package com.ss.android.ugc.aweme.contentlanguage;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.b.a.c;
import com.ss.android.ugc.aweme.main.ay;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final h f78214a = i.a(m.SYNCHRONIZED, a.f78215a);

    static {
        Covode.recordClassIndex(48501);
    }

    private final ay e() {
        return (ay) this.f78214a.getValue();
    }

    static final class a extends h.f.b.m implements h.f.a.a<ay> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f78215a = new a();

        static {
            Covode.recordClassIndex(48502);
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

    public final void d() {
        try {
            e().g();
        } catch (Throwable th) {
            b.a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final String b() {
        String str = "";
        try {
            String d2 = e().d(str);
            l.b(d2, str);
            str = d2;
            return str;
        } catch (Throwable th) {
            b.a(th, "MainTabPreferences AbstractMethodError");
            return str;
        }
    }

    public final boolean c() {
        try {
            return e().f();
        } catch (Throwable th) {
            b.a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    public final boolean a() {
        try {
            return e().e();
        } catch (Throwable th) {
            b.a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    public final void a(boolean z) {
        try {
            e().a(z);
        } catch (Throwable th) {
            b.a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final void a(String str) {
        l.d(str, "");
        try {
            e().c(str);
        } catch (Throwable th) {
            b.a(th, "MainTabPreferences AbstractMethodError");
        }
    }
}
