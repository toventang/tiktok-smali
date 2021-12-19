package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.b.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class v extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<?>> f54347a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<?>> f54348b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Class<?>> f54349c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f54350d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f54351e;

    /* renamed from: f  reason: collision with root package name */
    private final e f54352f;

    static {
        Covode.recordClassIndex(33742);
    }

    @Override // com.google.firebase.components.e, com.google.firebase.components.a
    public final <T> T a(Class<T> cls) {
        if (this.f54347a.contains(cls)) {
            T t = (T) this.f54352f.a(cls);
            return !cls.equals(c.class) ? t : (T) new a(this.f54351e, t);
        }
        throw new IllegalArgumentException(com.a.a("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    @Override // com.google.firebase.components.e, com.google.firebase.components.a
    public final <T> Set<T> b(Class<T> cls) {
        if (this.f54349c.contains(cls)) {
            return this.f54352f.b(cls);
        }
        throw new IllegalArgumentException(com.a.a("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    @Override // com.google.firebase.components.e
    public final <T> com.google.firebase.d.a<T> c(Class<T> cls) {
        if (this.f54348b.contains(cls)) {
            return this.f54352f.c(cls);
        }
        throw new IllegalArgumentException(com.a.a("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    @Override // com.google.firebase.components.e
    public final <T> com.google.firebase.d.a<Set<T>> d(Class<T> cls) {
        if (this.f54350d.contains(cls)) {
            return this.f54352f.d(cls);
        }
        throw new IllegalArgumentException(com.a.a("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f54353a;

        /* renamed from: b  reason: collision with root package name */
        private final c f54354b;

        static {
            Covode.recordClassIndex(33743);
        }

        public a(Set<Class<?>> set, c cVar) {
            this.f54353a = set;
            this.f54354b = cVar;
        }
    }

    v(b<?> bVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n nVar : bVar.f54306b) {
            if (nVar.b()) {
                if (nVar.a()) {
                    hashSet3.add(nVar.f54336a);
                } else {
                    hashSet.add(nVar.f54336a);
                }
            } else if (nVar.a()) {
                hashSet4.add(nVar.f54336a);
            } else {
                hashSet2.add(nVar.f54336a);
            }
        }
        if (!bVar.f54308d.isEmpty()) {
            hashSet.add(c.class);
        }
        this.f54347a = Collections.unmodifiableSet(hashSet);
        this.f54348b = Collections.unmodifiableSet(hashSet2);
        this.f54349c = Collections.unmodifiableSet(hashSet3);
        this.f54350d = Collections.unmodifiableSet(hashSet4);
        this.f54351e = bVar.f54308d;
        this.f54352f = eVar;
    }
}
