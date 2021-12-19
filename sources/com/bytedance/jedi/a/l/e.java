package com.bytedance.jedi.a.l;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class e<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39305a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private T f39306b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<p<a<?>, Long>> f39307c;

    static {
        Covode.recordClassIndex(24111);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(24112);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static /* synthetic */ b a(Object obj) {
            return a(obj, new e(obj, new LinkedHashSet(), (byte) 0));
        }

        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.bytedance.jedi.a.l.b<V>, com.bytedance.jedi.a.l.b<T> */
        public static <T> b<T> a(T t, b<?> bVar) {
            l.c(bVar, "");
            return (b<V>) bVar.a((Object) t);
        }
    }

    @Override // com.bytedance.jedi.a.l.b
    public final T a() {
        return this.f39306b;
    }

    @Override // com.bytedance.jedi.a.l.b
    public final p<a<?>, Long> b() {
        LinkedHashSet<p<a<?>, Long>> linkedHashSet = this.f39307c;
        if (!linkedHashSet.isEmpty()) {
            return (p) n.e((Iterable) linkedHashSet);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.p[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.a.l.b
    public final <V> b<V> a(V v) {
        if (l.a((Object) this.f39306b, (Object) v)) {
            return this;
        }
        int size = this.f39307c.size();
        p[] pVarArr = new p[size];
        for (int i2 = 0; i2 < size; i2++) {
            pVarArr[i2] = n.b(this.f39307c, i2);
        }
        l.d(pVarArr, "");
        return new e(v, (LinkedHashSet) i.b((Object[]) pVarArr, (Collection) new LinkedHashSet(ag.a(size))));
    }

    @Override // com.bytedance.jedi.a.l.b
    public final boolean b(a<T> aVar) {
        l.c(aVar, "");
        return this.f39307c.add(v.a(aVar, Long.valueOf(System.currentTimeMillis())));
    }

    @Override // com.bytedance.jedi.a.l.b
    public final boolean a(a<?> aVar) {
        l.c(aVar, "");
        LinkedHashSet<p<a<?>, Long>> linkedHashSet = this.f39307c;
        ArrayList arrayList = new ArrayList(n.a(linkedHashSet, 10));
        Iterator<T> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        return arrayList.contains(aVar);
    }

    private e(T t, LinkedHashSet<p<a<?>, Long>> linkedHashSet) {
        this.f39306b = t;
        this.f39307c = linkedHashSet;
    }

    public /* synthetic */ e(Object obj, LinkedHashSet linkedHashSet, byte b2) {
        this(obj, linkedHashSet);
    }
}
