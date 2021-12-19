package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<? super T>> f54305a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<n> f54306b;

    /* renamed from: c  reason: collision with root package name */
    public final g<T> f54307c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Class<?>> f54308d;

    /* renamed from: e  reason: collision with root package name */
    private final int f54309e;

    /* renamed from: f  reason: collision with root package name */
    private final int f54310f;

    static {
        Covode.recordClassIndex(33717);
    }

    public final boolean c() {
        if (this.f54310f == 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f54309e == 2) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (this.f54309e == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f54305a.toArray()) + ">{" + this.f54309e + ", type=" + this.f54310f + ", deps=" + Arrays.toString(this.f54306b.toArray()) + "}";
    }

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        int f54311a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Class<? super T>> f54312b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<n> f54313c;

        /* renamed from: d  reason: collision with root package name */
        private int f54314d;

        /* renamed from: e  reason: collision with root package name */
        private g<T> f54315e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f54316f;

        static {
            Covode.recordClassIndex(33718);
        }

        public final b<T> a() {
            boolean z;
            if (this.f54315e != null) {
                z = true;
            } else {
                z = false;
            }
            u.b(z, "Missing required property: factory.");
            return new b<>(new HashSet(this.f54312b), new HashSet(this.f54313c), this.f54314d, this.f54311a, this.f54315e, this.f54316f, (byte) 0);
        }

        private void a(Class<?> cls) {
            u.a(!this.f54312b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final a<T> a(int i2) {
            boolean z;
            if (this.f54314d == 0) {
                z = true;
            } else {
                z = false;
            }
            u.b(z, "Instantiation type has already been set.");
            this.f54314d = i2;
            return this;
        }

        public final a<T> a(g<T> gVar) {
            this.f54315e = (g) u.a(gVar, "Null factory");
            return this;
        }

        public final a<T> a(n nVar) {
            u.a(nVar, "Null dependency");
            a(nVar.f54336a);
            this.f54313c.add(nVar);
            return this;
        }

        private a(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f54312b = hashSet;
            this.f54313c = new HashSet();
            this.f54314d = 0;
            this.f54311a = 0;
            this.f54316f = new HashSet();
            u.a(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                u.a(cls2, "Null interface");
            }
            Collections.addAll(this.f54312b, clsArr);
        }

        /* synthetic */ a(Class cls, Class[] clsArr, byte b2) {
            this(cls, clsArr);
        }
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0], (byte) 0);
    }

    private static <T> a<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new a<>(cls, clsArr, (byte) 0);
    }

    public static <T> b<T> a(T t, Class<T> cls) {
        a a2 = a(cls);
        a2.f54311a = 1;
        return a2.a(new d(t)).a();
    }

    public static <T> b<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return a(cls, clsArr).a(c.a((Object) t)).a();
    }

    private b(Set<Class<? super T>> set, Set<n> set2, int i2, int i3, g<T> gVar, Set<Class<?>> set3) {
        this.f54305a = Collections.unmodifiableSet(set);
        this.f54306b = Collections.unmodifiableSet(set2);
        this.f54309e = i2;
        this.f54310f = i3;
        this.f54307c = gVar;
        this.f54308d = Collections.unmodifiableSet(set3);
    }

    /* synthetic */ b(Set set, Set set2, int i2, int i3, g gVar, Set set3, byte b2) {
        this(set, set2, i2, i3, gVar, set3);
    }
}
