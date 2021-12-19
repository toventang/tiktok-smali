package com.ss.android.ugc.aweme.discover.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final a f80981a = new a(0);

    /* renamed from: b  reason: collision with root package name */
    public static final a f80982b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final e f80983c = new e();

    /* renamed from: d  reason: collision with root package name */
    private static final h f80984d = i.a((h.f.a.a) b.f80987a);

    private static a c() {
        return (a) f80984d.getValue();
    }

    private e() {
    }

    public static final class a {
        @c(a = "enable")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f80985a;
        @c(a = "pool_size")

        /* renamed from: b  reason: collision with root package name */
        public final int f80986b;

        static {
            Covode.recordClassIndex(50346);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f80985a == aVar.f80985a && this.f80986b == aVar.f80986b;
        }

        public final int hashCode() {
            boolean z = this.f80985a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return (i2 * 31) + this.f80986b;
        }

        public final String toString() {
            return "DiscoveryCommonPoolExperimentConfig(enable=" + this.f80985a + ", poolSize=" + this.f80986b + ")";
        }

        private /* synthetic */ a() {
            this(16);
        }

        public a(int i2) {
            this.f80985a = false;
            this.f80986b = i2;
        }
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f80987a = new b();

        static {
            Covode.recordClassIndex(50347);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return a();
        }

        private static a a() {
            try {
                a aVar = (a) com.bytedance.ies.abmock.b.a().a(true, "discovery_common_recyclerview_pool", a.class, e.f80982b);
                if (aVar == null) {
                    return e.f80981a;
                }
                return aVar;
            } catch (Throwable unused) {
                return e.f80981a;
            }
        }
    }

    public static boolean a() {
        c();
        return c().f80985a;
    }

    public static int b() {
        c();
        return c().f80986b;
    }

    static {
        Covode.recordClassIndex(50345);
    }
}
