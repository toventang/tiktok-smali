package com.ss.android.ugc.aweme.discover.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final a f80988a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f80989b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final f f80990c = new f();

    /* renamed from: d  reason: collision with root package name */
    private static final h f80991d = i.a((h.f.a.a) b.f80994a);

    public static final class a {
        @c(a = "enable_opt_function")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f80992a = false;
        @c(a = "enable_opt_event_trace")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f80993b = false;

        static {
            Covode.recordClassIndex(50349);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f80992a == aVar.f80992a && this.f80993b == aVar.f80993b;
        }

        public final int hashCode() {
            boolean z = this.f80992a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            if (!this.f80993b) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "Config(enable1=" + this.f80992a + ", enable2=" + this.f80993b + ")";
        }
    }

    public static a a() {
        return (a) f80991d.getValue();
    }

    private f() {
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f80994a = new b();

        static {
            Covode.recordClassIndex(50350);
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
            a aVar;
            try {
                aVar = (a) com.bytedance.ies.abmock.b.a().a(true, "discovery_fps_opt_experiment", a.class, f.f80989b);
                if (aVar == null) {
                    aVar = f.f80988a;
                }
                l.b(aVar, "");
            } catch (Throwable unused) {
                aVar = f.f80988a;
            }
            com.ss.android.ugc.aweme.framework.a.a.b(4, "DiscoveryFpsOptExperiment", "enableOptFunction=" + aVar.f80992a + " ; enableOptEventTrace=" + aVar.f80993b);
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(50348);
    }
}
