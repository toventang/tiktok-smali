package com.google.b.a.e;

import com.bytedance.covode.number.Covode;
import com.google.b.a.f.a.a.a.a.b;
import com.google.b.a.g.m;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public final b f53591a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f53592b;

    static {
        Covode.recordClassIndex(33159);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f53593a;

        /* renamed from: b  reason: collision with root package name */
        public Collection<String> f53594b = new HashSet();

        static {
            Covode.recordClassIndex(33160);
        }

        public final d a() {
            return new d(this);
        }

        public a(b bVar) {
            this.f53593a = (b) b.a(bVar);
        }
    }

    protected d(a aVar) {
        this.f53591a = aVar.f53593a;
        this.f53592b = new HashSet(aVar.f53594b);
    }
}
