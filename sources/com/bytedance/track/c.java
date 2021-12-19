package com.bytedance.track;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.b;
import com.bytedance.provider.d;
import com.bytedance.provider.f;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f44411a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantLock f44412b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    private static a f44413c;

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, a> f44414d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<a, CopyOnWriteArrayList<b<?>>> f44415e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<b<?>, b<?>> f44416f = new ConcurrentHashMap<>();

    private c() {
    }

    /* access modifiers changed from: package-private */
    public static final class a extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f44417e = new a();

        private a() {
            super(com.bytedance.provider.impl.c.f42017b);
        }

        static {
            Covode.recordClassIndex(27212);
        }
    }

    static {
        Covode.recordClassIndex(27211);
    }

    public static a a(m mVar) {
        l.c(mVar, "");
        ReentrantLock reentrantLock = f44412b;
        reentrantLock.lock();
        try {
            int hashCode = mVar.hashCode();
            ConcurrentHashMap<Integer, a> concurrentHashMap = f44414d;
            a aVar = concurrentHashMap.get(Integer.valueOf(hashCode));
            if (aVar == null) {
                aVar = new a();
                concurrentHashMap.put(Integer.valueOf(hashCode), aVar);
                a aVar2 = f44413c;
                if (aVar2 == null) {
                    aVar2 = a.f44417e;
                }
                d dVar = aVar.f44410c;
                d dVar2 = aVar2.f44410c;
                d.a aVar3 = new d.a();
                l.c(dVar, "");
                l.c(dVar2, "");
                l.c(aVar3, "");
                dVar.a().a(dVar2, aVar3);
                aVar2.f44409b = aVar;
                aVar.f44408a = aVar2;
                f44413c = aVar;
                mVar.getLifecycle().a(new TrackerChain$attachBTM$1$1(aVar, hashCode));
            }
            return aVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static z a(a aVar, int i2) {
        z zVar;
        ReentrantLock reentrantLock = f44412b;
        reentrantLock.lock();
        try {
            a aVar2 = aVar.f44408a;
            if (aVar2 == null) {
                aVar2 = a.f44417e;
            }
            a aVar3 = aVar.f44409b;
            aVar2.f44409b = aVar3;
            if (aVar3 != null) {
                aVar3.f44408a = aVar2;
            }
            f.a(aVar.f44410c);
            if (l.a(aVar, f44413c)) {
                f44413c = aVar2;
            }
            f44414d.remove(Integer.valueOf(i2));
            CopyOnWriteArrayList<b<?>> remove = f44415e.remove(aVar);
            if (remove != null) {
                Iterator<T> it = remove.iterator();
                while (it.hasNext()) {
                    f44416f.remove(it.next());
                }
                zVar = z.f158842a;
            } else {
                zVar = null;
            }
            return zVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static <T extends b<T>> T a(m mVar, String str, Class<T> cls) {
        a aVar;
        T t;
        l.c(cls, "");
        if (mVar == null) {
            aVar = f44413c;
        } else {
            aVar = f44414d.get(Integer.valueOf(mVar.hashCode()));
        }
        if (aVar == null) {
            aVar = a.f44417e;
        }
        d dVar = aVar.f44410c;
        l.c(dVar, "");
        l.c(cls, "");
        b<?> a2 = dVar.a().a(str, cls);
        if (a2 == null || (t = (T) ((b) a2.a())) == null) {
            return null;
        }
        ConcurrentHashMap<a, CopyOnWriteArrayList<b<?>>> concurrentHashMap = f44415e;
        CopyOnWriteArrayList<b<?>> copyOnWriteArrayList = concurrentHashMap.get(aVar);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            concurrentHashMap.put(aVar, copyOnWriteArrayList);
        }
        l.a((Object) copyOnWriteArrayList, "");
        copyOnWriteArrayList.add(t);
        f44416f.put(t, a2);
        return t;
    }
}
