package com.bytedance.ies.android.base.runtime.b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import h.f.b.ab;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f31914a = {new y(ab.a(a.class), "mainThreadHandler", "getMainThreadHandler()Landroid/os/Handler;"), new y(ab.a(a.class), "normalExecutorService", "getNormalExecutorService()Ljava/util/concurrent/ExecutorService;"), new y(ab.a(a.class), "ioExecutorService", "getIoExecutorService()Ljava/util/concurrent/ExecutorService;")};

    /* renamed from: b  reason: collision with root package name */
    public static final a f31915b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f31916c = h.i.a((h.f.a.a) b.f31920a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f31917d = h.i.a((h.f.a.a) c.f31921a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f31918e = h.i.a((h.f.a.a) C0662a.f31919a);

    public static final ExecutorService a() {
        return (ExecutorService) f31917d.getValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.ies.android.base.runtime.b.a$a  reason: collision with other inner class name */
    static final class C0662a extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0662a f31919a = new C0662a();

        static {
            Covode.recordClassIndex(18651);
        }

        C0662a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            ExecutorService iOThreadExecutor;
            IThreadPoolExecutorDepend iThreadPoolExecutorDepend = com.bytedance.ies.android.base.runtime.a.f31875d;
            if (iThreadPoolExecutorDepend == null || (iOThreadExecutor = iThreadPoolExecutorDepend.getIOThreadExecutor()) == null) {
                return com.bytedance.common.utility.b.c.b();
            }
            return iOThreadExecutor;
        }
    }

    static final class b extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31920a = new b();

        static {
            Covode.recordClassIndex(18652);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class c extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f31921a = new c();

        static {
            Covode.recordClassIndex(18653);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            ExecutorService normalThreadExecutor;
            IThreadPoolExecutorDepend iThreadPoolExecutorDepend = com.bytedance.ies.android.base.runtime.a.f31875d;
            if (iThreadPoolExecutorDepend == null || (normalThreadExecutor = iThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) {
                return com.bytedance.common.utility.b.c.a();
            }
            return normalThreadExecutor;
        }
    }

    static {
        Covode.recordClassIndex(18650);
    }
}
