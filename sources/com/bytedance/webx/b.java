package com.bytedance.webx;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.h;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Set<Class<? extends a>> f45921a;

    /* renamed from: b  reason: collision with root package name */
    public Set<h.c> f45922b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Class<? extends a>, h.c> f45923c;

    /* renamed from: d  reason: collision with root package name */
    public d f45924d;

    /* renamed from: e  reason: collision with root package name */
    public Class<? extends d> f45925e;

    static {
        Covode.recordClassIndex(28072);
    }

    private b() {
        this.f45921a = new LinkedHashSet();
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f45926a = new b((byte) 0);

        static {
            Covode.recordClassIndex(28073);
        }

        public final a a(d dVar) {
            this.f45926a.f45924d = dVar;
            return this;
        }

        public final a a(Class<? extends a> cls) {
            this.f45926a.f45921a.add(cls);
            return this;
        }

        public final a a(Class<? extends a> cls, h.c cVar) {
            this.f45926a.f45921a.add(cls);
            if (this.f45926a.f45923c == null) {
                this.f45926a.f45923c = new HashMap<>();
            }
            this.f45926a.f45923c.put(cls, cVar);
            return this;
        }
    }
}
