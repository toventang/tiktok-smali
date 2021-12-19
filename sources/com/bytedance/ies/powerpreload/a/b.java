package com.bytedance.ies.powerpreload.a;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.j;
import com.bytedance.ies.powerpreload.task.c;
import com.bytedance.ies.powerpreload.task.d;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f34480a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f34481b;

    /* renamed from: c  reason: collision with root package name */
    public final c f34482c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<ExecutorService> f34483d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<Class<?>, d<?>> f34484e;

    static {
        Covode.recordClassIndex(20620);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f34485a;

        /* renamed from: b  reason: collision with root package name */
        public j f34486b = new j();

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.a<? extends ExecutorService> f34487c;

        /* renamed from: d  reason: collision with root package name */
        public final HashMap<Class<?>, d<?>> f34488d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        public final Application f34489e;

        static {
            Covode.recordClassIndex(20621);
        }

        /* renamed from: com.bytedance.ies.powerpreload.a.b$a$a  reason: collision with other inner class name */
        public static final class C0771a extends m implements h.f.a.a<ExecutorService> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0771a f34490a = new C0771a();

            static {
                Covode.recordClassIndex(20622);
            }

            C0771a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ExecutorService invoke() {
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                l.a((Object) newCachedThreadPool, "");
                return newCachedThreadPool;
            }
        }

        public a(Application application) {
            l.c(application, "");
            this.f34489e = application;
        }

        public final <T> a a(Class<T> cls, d<T> dVar) {
            l.c(cls, "");
            l.c(dVar, "");
            this.f34488d.put(cls, dVar);
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends java.util.concurrent.ExecutorService> */
    /* JADX WARN: Multi-variable type inference failed */
    private b(Application application, boolean z, c cVar, h.f.a.a<? extends ExecutorService> aVar, HashMap<Class<?>, d<?>> hashMap) {
        this.f34480a = application;
        this.f34481b = z;
        this.f34482c = cVar;
        this.f34483d = aVar;
        this.f34484e = hashMap;
    }

    public /* synthetic */ b(Application application, boolean z, c cVar, h.f.a.a aVar, HashMap hashMap, byte b2) {
        this(application, z, cVar, aVar, hashMap);
    }
}
