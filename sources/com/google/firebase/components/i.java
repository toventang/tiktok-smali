package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.b.c;
import com.google.firebase.b.d;
import com.google.firebase.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class i extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final a<Set<Object>> f54322a = l.f54330a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<b<?>, s<?>> f54323b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, s<?>> f54324c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, s<Set<?>>> f54325d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final q f54326e;

    static {
        Covode.recordClassIndex(33727);
    }

    private void a() {
        for (Map.Entry<b<?>, s<?>> entry : this.f54323b.entrySet()) {
            b<?> key = entry.getKey();
            if (key.c()) {
                s<?> value = entry.getValue();
                for (Class<? super T> cls : key.f54305a) {
                    this.f54324c.put(cls, value);
                }
            }
        }
        for (b<?> bVar : this.f54323b.keySet()) {
            Iterator<n> it = bVar.f54306b.iterator();
            while (true) {
                if (it.hasNext()) {
                    n next = it.next();
                    if (next.f54337b == 1 && !this.f54324c.containsKey(next.f54336a)) {
                        throw new t(com.a.a("Unsatisfied dependency for component %s: %s", new Object[]{bVar, next.f54336a}));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.Class<?>, com.google.firebase.components.s<java.util.Set<?>>> */
    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<b<?>, s<?>> entry : this.f54323b.entrySet()) {
            b<?> key = entry.getKey();
            if (!key.c()) {
                s<?> value = entry.getValue();
                for (Class<? super T> cls : key.f54305a) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f54325d.put(entry2.getKey(), new s(new k((Set) entry2.getValue())));
        }
    }

    @Override // com.google.firebase.components.e, com.google.firebase.components.a
    public final /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // com.google.firebase.components.e, com.google.firebase.components.a
    public final /* bridge */ /* synthetic */ Set b(Class cls) {
        return super.b(cls);
    }

    @Override // com.google.firebase.components.e
    public final <T> a<T> c(Class<T> cls) {
        u.a(cls, "Null interface requested.");
        return this.f54324c.get(cls);
    }

    @Override // com.google.firebase.components.e
    public final <T> a<Set<T>> d(Class<T> cls) {
        s<Set<?>> sVar = this.f54325d.get(cls);
        return sVar != null ? sVar : (a<Set<T>>) f54322a;
    }

    public final void a(boolean z) {
        for (Map.Entry<b<?>, s<?>> entry : this.f54323b.entrySet()) {
            b<?> key = entry.getKey();
            s<?> value = entry.getValue();
            if (key.a() || (key.b() && z)) {
                value.a();
            }
        }
        this.f54326e.a();
    }

    public i(Executor executor, Iterable<h> iterable, b<?>... bVarArr) {
        q qVar = new q(executor);
        this.f54326e = qVar;
        ArrayList<b<?>> arrayList = new ArrayList();
        int i2 = 0;
        arrayList.add(b.a(qVar, q.class, d.class, c.class));
        for (h hVar : iterable) {
            arrayList.addAll(hVar.getComponents());
        }
        do {
            b<?> bVar = bVarArr[i2];
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i2++;
        } while (i2 < 8);
        m.a(arrayList);
        for (b<?> bVar2 : arrayList) {
            this.f54323b.put(bVar2, new s<>(new j(this, bVar2)));
        }
        a();
        b();
    }
}
