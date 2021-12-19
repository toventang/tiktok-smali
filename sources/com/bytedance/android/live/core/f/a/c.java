package com.bytedance.android.live.core.f.a;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.k.a;
import com.facebook.imagepipeline.o.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f9035a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<String>> f9036b = new androidx.c.a();

    /* renamed from: c  reason: collision with root package name */
    private int f9037c;

    /* renamed from: d  reason: collision with root package name */
    private long f9038d = -1;

    static {
        Covode.recordClassIndex(4600);
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static void b() {
        MethodCollector.i(9943);
        if (f9035a == null) {
            synchronized (c.class) {
                try {
                    if (f9035a == null) {
                        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
                            f9035a = g.a();
                        } else {
                            f9035a = a(f.f9043a);
                        }
                    }
                } finally {
                    MethodCollector.o(9943);
                }
            }
            return;
        }
        MethodCollector.o(9943);
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public void onRequestCancellation(String str) {
        super.onRequestCancellation(str);
        this.f9036b.remove(str);
    }

    private static ExecutorService a(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return g.a(a2.a());
    }

    public final void a(com.facebook.imagepipeline.o.c cVar) {
        this.f9037c++;
        cVar.o = this;
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.n.an
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        List<String> list = this.f9036b.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public void onRequestSuccess(b bVar, String str, boolean z) {
        super.onRequestSuccess(bVar, str, z);
        List<String> remove = this.f9036b.remove(str);
        if (remove != null && remove.contains("NetworkFetchProducer")) {
            Uri uri = bVar.mSourceUri;
            long j2 = -1;
            if (this.f9038d > 0) {
                this.f9038d = -1;
                j2 = SystemClock.elapsedRealtime() - this.f9038d;
            }
            b();
            f9035a.submit(new e(uri, j2));
        }
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public void onRequestFailure(b bVar, String str, Throwable th, boolean z) {
        super.onRequestFailure(bVar, str, th, z);
        this.f9036b.remove(str);
        int i2 = this.f9037c - 1;
        this.f9037c = i2;
        if (i2 == 0) {
            b();
            f9035a.submit(new d(th, bVar));
        }
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public void onRequestStart(b bVar, Object obj, String str, boolean z) {
        super.onRequestStart(bVar, obj, str, z);
        this.f9036b.put(str, new LinkedList());
        if (this.f9038d == -1) {
            this.f9038d = SystemClock.elapsedRealtime();
        }
    }
}
