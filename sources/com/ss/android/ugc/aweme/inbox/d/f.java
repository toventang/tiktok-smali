package com.ss.android.ugc.aweme.inbox.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104130a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final f f104131b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final h f104132c = i.a((h.f.a.a) c.f104138a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f104133d = i.a((h.f.a.a) d.f104139a);

    public static final class b {
        @com.google.gson.a.c(a = "key")

        /* renamed from: a  reason: collision with root package name */
        public final String f104136a;
        @com.google.gson.a.c(a = "value")

        /* renamed from: b  reason: collision with root package name */
        public final Float f104137b;

        static {
            Covode.recordClassIndex(66681);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f104136a, bVar.f104136a) && l.a(this.f104137b, bVar.f104137b);
        }

        public final int hashCode() {
            String str = this.f104136a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Float f2 = this.f104137b;
            if (f2 != null) {
                i2 = f2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "RateEntry(key=" + this.f104136a + ", value=" + this.f104137b + ")";
        }
    }

    public static a a() {
        return (a) f104132c.getValue();
    }

    private static Map<String, Float> b() {
        return (Map) f104133d.getValue();
    }

    private f() {
    }

    static final class c extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104138a = new c();

        static {
            Covode.recordClassIndex(66682);
        }

        c() {
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
                aVar = (a) SettingsManager.a().a("inbox_event_sample_rate", a.class);
            } catch (Throwable unused) {
                aVar = f.f104130a;
            }
            if (aVar == null) {
                return f.f104130a;
            }
            return aVar;
        }
    }

    public static final class a {
        @com.google.gson.a.c(a = "enable")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f104134a;
        @com.google.gson.a.c(a = "rate_map")

        /* renamed from: b  reason: collision with root package name */
        public final List<b> f104135b;

        static {
            Covode.recordClassIndex(66680);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f104134a == aVar.f104134a && l.a(this.f104135b, aVar.f104135b);
        }

        public final int hashCode() {
            boolean z = this.f104134a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            List<b> list = this.f104135b;
            return i5 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "Config(enable=" + this.f104134a + ", rateMap=" + this.f104135b + ")";
        }

        public /* synthetic */ a() {
            this(new ArrayList());
        }

        private a(List<b> list) {
            this.f104134a = true;
            this.f104135b = list;
        }
    }

    static final class d extends m implements h.f.a.a<Map<String, Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f104139a = new d();

        static {
            Covode.recordClassIndex(66683);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Float> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<b> list = f.a().f104135b;
            if (list != null) {
                for (T t : list) {
                    String str = t.f104136a;
                    if (!(str == null || str.length() == 0 || t.f104137b == null)) {
                        linkedHashMap.put(t.f104136a, t.f104137b);
                    }
                }
            }
            return linkedHashMap;
        }
    }

    static {
        Covode.recordClassIndex(66679);
    }

    public static boolean a(String str, float f2) {
        if (!a().f104134a || str.length() == 0) {
            return false;
        }
        Float f3 = b().get(str);
        if (f3 == null) {
            f3 = Float.valueOf(f2);
        }
        if (((double) f3.floatValue()) >= 1.0d || Math.random() < ((double) f3.floatValue())) {
            return true;
        }
        return false;
    }
}
