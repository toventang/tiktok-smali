package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import f.a.d.f;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f34898a = new k();

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34900a = new b();

        static {
            Covode.recordClassIndex(20936);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34902a = new d();

        static {
            Covode.recordClassIndex(20938);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private k() {
    }

    static {
        Covode.recordClassIndex(20934);
    }

    public static void a() {
        com.bytedance.ies.ugc.appcontext.f.i().a(c.f34901a, d.f34902a);
    }

    public static void b() {
        com.bytedance.ies.ugc.appcontext.f.g().a(a.f34899a, b.f34900a);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34901a = new c();

        static {
            Covode.recordClassIndex(20937);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            i.f34791g = false;
            h.a();
            if (h.f34889a != null) {
                h.f34889a.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34899a = new a();

        static {
            Covode.recordClassIndex(20935);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                h.a();
                boolean a2 = com.bytedance.ies.abmock.b.a().a(true, "awesome_splash_preload_json_enabled", false);
                if (h.f34889a != null) {
                    e eVar = h.f34889a;
                    if (eVar.f34880b != null) {
                        eVar.f34880b.edit().putBoolean("awesome_splash_preload_json", a2).apply();
                    }
                }
            }
        }
    }
}
