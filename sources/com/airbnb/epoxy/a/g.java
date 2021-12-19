package com.airbnb.epoxy.a;

import android.content.Context;
import android.view.View;
import com.airbnb.epoxy.aa;
import com.airbnb.epoxy.d;
import com.airbnb.epoxy.s;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    final Map<a, List<h<?>>> f4981a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final d f4982b;

    /* renamed from: c  reason: collision with root package name */
    public final m<Context, RuntimeException, z> f4983c;

    static {
        Covode.recordClassIndex(2092);
    }

    /* access modifiers changed from: package-private */
    public final <T extends s<?>> a a(T t) {
        int i2;
        if (this.f4982b.d()) {
            this.f4982b.getItemCount();
            i2 = t.g();
        } else {
            i2 = 1;
        }
        Class<?> cls = t.getClass();
        int a2 = aa.a(t);
        l.c(t, "");
        return new a(cls, i2, a2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.airbnb.epoxy.a.g */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final <T extends View> List<View> a(T t) {
        if (!(t instanceof f)) {
            return n.a(t);
        }
        List<View> a2 = ((f) t).a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            n.a((Collection) arrayList, (Iterable) a((View) it.next()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super android.content.Context, ? super java.lang.RuntimeException, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(d dVar, m<? super Context, ? super RuntimeException, z> mVar) {
        l.c(dVar, "");
        l.c(mVar, "");
        this.f4982b = dVar;
        this.f4983c = mVar;
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends s<?>> f4984a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4985b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4986c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f4987d = null;

        static {
            Covode.recordClassIndex(2093);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f4984a, aVar.f4984a) && this.f4985b == aVar.f4985b && this.f4986c == aVar.f4986c && l.a(this.f4987d, aVar.f4987d);
        }

        public final int hashCode() {
            Class<? extends s<?>> cls = this.f4984a;
            int i2 = 0;
            int hashCode = (((((cls != null ? cls.hashCode() : 0) * 31) + this.f4985b) * 31) + this.f4986c) * 31;
            Object obj = this.f4987d;
            if (obj != null) {
                i2 = obj.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "CacheKey(epoxyModelClass=" + this.f4984a + ", spanSize=" + this.f4985b + ", viewType=" + this.f4986c + ", signature=" + this.f4987d + ")";
        }

        public a(Class<? extends s<?>> cls, int i2, int i3) {
            l.c(cls, "");
            this.f4984a = cls;
            this.f4985b = i2;
            this.f4986c = i3;
        }
    }
}
