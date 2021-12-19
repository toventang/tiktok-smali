package com.bytedance.ies.sdk.datachannel;

import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.w;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class BaseDataChannel extends ac {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f34568a = {new y(ab.a(BaseDataChannel.class), "mainThread", "getMainThread()Ljava/lang/Thread;")};

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, o<?>> f34569b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Object, Map<Class<?>, n<Object>>> f34570c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final h f34571d = h.i.a((h.f.a.a) a.f34572a);

    static final class a extends m implements h.f.a.a<Thread> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34572a = new a();

        static {
            Covode.recordClassIndex(20682);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Thread invoke() {
            Looper mainLooper = Looper.getMainLooper();
            l.a((Object) mainLooper, "");
            return mainLooper.getThread();
        }
    }

    public final boolean a() {
        if (Thread.currentThread() != this.f34571d.getValue()) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        super.onCleared();
        this.f34569b.clear();
    }

    static {
        Covode.recordClassIndex(20681);
    }

    public final synchronized <T extends o<O>, O> T a(Class<T> cls) {
        T t;
        l.c(cls, "");
        o<?> oVar = this.f34569b.get(cls);
        if (oVar == null || (t = cls.cast(oVar)) == null) {
            try {
                t = cls.newInstance();
                Map<Class<?>, o<?>> map = this.f34569b;
                l.a((Object) t, "");
                map.put(cls, t);
            } catch (InstantiationException e2) {
                throw new RuntimeException("class " + cls + " init fail", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("class " + cls + " init fail", e3);
            }
        }
        return t;
    }

    public final void a(Object obj) {
        l.c(obj, "");
        Map<Class<?>, n<Object>> remove = this.f34570c.remove(obj);
        if (remove != null) {
            for (Map.Entry<Class<?>, n<Object>> entry : remove.entrySet()) {
                o<?> oVar = this.f34569b.get(entry.getKey());
                if (oVar != null && (oVar instanceof m)) {
                    LiveData liveData = (LiveData) oVar;
                    liveData.removeObserver(entry.getValue());
                    if (!liveData.hasObservers() && (((oVar instanceof i) && !((i) oVar).f34577a) || (oVar instanceof h))) {
                        this.f34569b.remove(entry.getKey());
                    }
                }
            }
        }
    }

    public final <T extends m<O>, O> void a(Object obj, androidx.lifecycle.m mVar, Class<T> cls, boolean z, b<? super O, z> bVar) {
        Map<Class<?>, n<Object>> map;
        m mVar2;
        n<Object> a2;
        l.c(obj, "");
        l.c(cls, "");
        l.c(bVar, "");
        if (!this.f34570c.containsKey(obj)) {
            this.f34570c.put(obj, new HashMap());
        }
        Map<Class<?>, n<Object>> map2 = this.f34570c.get(obj);
        if ((map2 == null || !map2.containsKey(cls)) && (map = this.f34570c.get(obj)) != null && (mVar2 = (m) a((Class) cls)) != null) {
            if (mVar == null) {
                a2 = mVar2.a(bVar, z);
            } else {
                a2 = mVar2.a(mVar, bVar, z);
            }
            if (a2 != null) {
                map.put(cls, a2);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }
}
