package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class m {
    static {
        Covode.recordClassIndex(33731);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f54331a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<a> f54332b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        final Set<a> f54333c = new HashSet();

        static {
            Covode.recordClassIndex(33732);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            return this.f54333c.isEmpty();
        }

        a(b<?> bVar) {
            this.f54331a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f54334a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f54335b;

        static {
            Covode.recordClassIndex(33733);
        }

        public final int hashCode() {
            return ((this.f54335b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f54334a).hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!bVar.f54335b.equals(this.f54335b) || bVar.f54334a != this.f54334a) {
                    return false;
                }
                return true;
            }
            return false;
        }

        private b(Class<?> cls, boolean z) {
            this.f54335b = cls;
            this.f54334a = z;
        }

        /* synthetic */ b(Class cls, boolean z, byte b2) {
            this(cls, z);
        }
    }

    private static Set<a> a(Set<a> set) {
        HashSet hashSet = new HashSet();
        for (a aVar : set) {
            if (aVar.a()) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }

    static void a(List<b<?>> list) {
        Set<a> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<b<?>> it = list.iterator();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                b<?> next = it.next();
                a aVar = new a(next);
                Iterator<Class<? super T>> it2 = next.f54305a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class<? super T> next2 = it2.next();
                        b bVar = new b(next2, !next.c(), (byte) 0);
                        if (!hashMap.containsKey(bVar)) {
                            hashMap.put(bVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(bVar);
                        if (set2.isEmpty() || bVar.f54334a) {
                            set2.add(aVar);
                        } else {
                            throw new IllegalArgumentException(com.a.a("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<a> set3 : hashMap.values()) {
                    for (a aVar2 : set3) {
                        for (n nVar : aVar2.f54331a.f54306b) {
                            if (nVar.b() && (set = (Set) hashMap.get(new b(nVar.f54336a, nVar.a(), (byte) 0))) != null) {
                                for (a aVar3 : set) {
                                    aVar2.f54332b.add(aVar3);
                                    aVar3.f54333c.add(aVar2);
                                }
                            }
                        }
                    }
                }
                HashSet<a> hashSet = new HashSet();
                for (Collection collection : hashMap.values()) {
                    hashSet.addAll(collection);
                }
                Set<a> a2 = a(hashSet);
                while (!a2.isEmpty()) {
                    a next3 = a2.iterator().next();
                    a2.remove(next3);
                    i2++;
                    for (a aVar4 : next3.f54332b) {
                        aVar4.f54333c.remove(next3);
                        if (aVar4.a()) {
                            a2.add(aVar4);
                        }
                    }
                }
                if (i2 != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (a aVar5 : hashSet) {
                        if (!aVar5.a() && !aVar5.f54332b.isEmpty()) {
                            arrayList.add(aVar5.f54331a);
                        }
                    }
                    throw new o(arrayList);
                }
                return;
            }
        }
    }
}
