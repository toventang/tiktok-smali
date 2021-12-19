package com.vk.api.sdk;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import h.w;
import java.util.LinkedHashMap;
import java.util.Map;

public final class i {

    /* renamed from: f  reason: collision with root package name */
    public static final b f156332f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f156333a;

    /* renamed from: b  reason: collision with root package name */
    public final String f156334b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f156335c;

    /* renamed from: d  reason: collision with root package name */
    public final int f156336d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f156337e;

    static {
        Covode.recordClassIndex(103823);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(103825);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f156338a = "";

        /* renamed from: b  reason: collision with root package name */
        public String f156339b = "";

        /* renamed from: c  reason: collision with root package name */
        public Map<String, String> f156340c = new LinkedHashMap();

        /* renamed from: d  reason: collision with root package name */
        public int f156341d = 4;

        /* renamed from: e  reason: collision with root package name */
        public boolean f156342e;

        static {
            Covode.recordClassIndex(103824);
        }

        public final i a() {
            return new i(this);
        }
    }

    public final int hashCode() {
        return (this.f156333a.hashCode() * 31) + this.f156335c.hashCode();
    }

    public final String toString() {
        return "VKMethodCall(method='" + this.f156333a + "', args=" + this.f156335c + ')';
    }

    protected i(a aVar) {
        l.c(aVar, "");
        if (p.a((CharSequence) aVar.f156338a)) {
            throw new IllegalArgumentException("method is null or empty");
        } else if (!p.a((CharSequence) aVar.f156339b)) {
            this.f156333a = aVar.f156338a;
            this.f156334b = aVar.f156339b;
            this.f156335c = aVar.f156340c;
            this.f156336d = aVar.f156341d;
            this.f156337e = aVar.f156342e;
        } else {
            throw new IllegalArgumentException("version is null or empty");
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            i iVar = (i) obj;
            if (!(!l.a((Object) this.f156333a, (Object) iVar.f156333a)) && !(!l.a(this.f156335c, iVar.f156335c))) {
                return true;
            }
            return false;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
