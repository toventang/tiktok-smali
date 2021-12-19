package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.m;
import h.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34075a = new a(false, 10);

    /* renamed from: b  reason: collision with root package name */
    public static final i f34076b = new i();

    /* renamed from: c  reason: collision with root package name */
    private static final a f34077c = new a(true, 20);

    /* renamed from: d  reason: collision with root package name */
    private static final h f34078d = h.i.a((h.f.a.a) b.f34081a);

    static final a a() {
        return (a) f34078d.getValue();
    }

    private i() {
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34081a = new b();

        static {
            Covode.recordClassIndex(20294);
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
                Object a2 = com.bytedance.ies.abmock.b.a().a(true, "im_sdk_optimize_send", a.class);
                if (a2 != null) {
                    return (a) a2;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.im.core.opt.SdkOptionsOptimizeSendMsgExperiment.Params");
            } catch (Throwable unused) {
                return i.f34075a;
            }
        }
    }

    static {
        Covode.recordClassIndex(20292);
    }

    public static final class a {
        @c(a = "enable")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f34079a;
        @c(a = "cache_size")

        /* renamed from: b  reason: collision with root package name */
        public final int f34080b;

        static {
            Covode.recordClassIndex(20293);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f34079a == aVar.f34079a && this.f34080b == aVar.f34080b;
        }

        public final int hashCode() {
            boolean z = this.f34079a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return (i2 * 31) + this.f34080b;
        }

        public final String toString() {
            return "Params(useSendMsgCache=" + this.f34079a + ", cacheSize=" + this.f34080b + ")";
        }

        public a(boolean z, int i2) {
            this.f34079a = z;
            this.f34080b = i2;
        }
    }
}
