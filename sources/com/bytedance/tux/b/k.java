package com.bytedance.tux.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class k<T extends View> {

    /* renamed from: a  reason: collision with root package name */
    public b f44699a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, a> f44700b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.tux.b.a.b<T> f44701c;

    public interface b {
        static {
            Covode.recordClassIndex(27327);
        }

        void a(Map<Integer, ? extends Object> map);
    }

    static {
        Covode.recordClassIndex(27325);
    }

    public k(com.bytedance.tux.b.a.b<T> bVar) {
        l.c(bVar, "");
        this.f44701c = bVar;
    }

    public final void a(T t) {
        Map<Integer, Object> a2;
        l.c(t, "");
        for (Map.Entry<Integer, a> entry : this.f44700b.entrySet()) {
            int intValue = entry.getKey().intValue();
            int i2 = entry.getValue().f44702a;
            b a3 = f.a(intValue, i2);
            if (!(a3 == null || (a2 = a3.a(t)) == null || !(!l.a(a2, entry.getValue().f44703b)))) {
                this.f44700b.put(Integer.valueOf(intValue), new a(i2, a2));
                a(t, a2);
            }
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f44702a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<Integer, Object> f44703b;

        static {
            Covode.recordClassIndex(27326);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f44702a == aVar.f44702a && l.a(this.f44703b, aVar.f44703b);
        }

        public final int hashCode() {
            int i2 = this.f44702a * 31;
            Map<Integer, Object> map = this.f44703b;
            return i2 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            return "ParseParams(variant=" + this.f44702a + ", attrs=" + this.f44703b + ")";
        }

        public a(int i2, Map<Integer, ? extends Object> map) {
            l.c(map, "");
            this.f44702a = i2;
            this.f44703b = map;
        }
    }

    public final void a(T t, int i2) {
        l.c(t, "");
        a(t, i2, -1);
    }

    private final void a(T t, Map<Integer, ? extends Object> map) {
        b bVar;
        Map<Integer, ? extends Object> a2 = this.f44701c.a(t, map);
        if ((!a2.isEmpty()) && (bVar = this.f44699a) != null) {
            bVar.a(a2);
        }
    }

    public final void a(T t, int i2, int i3) {
        l.c(t, "");
        b a2 = f.a(i2, i3);
        if (a2 != null) {
            Map<Integer, Object> a3 = a2.a(t);
            this.f44700b.put(Integer.valueOf(i2), new a(i3, a3));
            a(t, a3);
        }
    }
}
