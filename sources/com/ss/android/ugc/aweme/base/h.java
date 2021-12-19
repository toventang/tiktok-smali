package com.ss.android.ugc.aweme.base;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.k.a;
import com.facebook.imagepipeline.o.b;
import com.facebook.imagepipeline.o.c;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f68126a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<String>> f68127b = new androidx.c.a();

    /* renamed from: c  reason: collision with root package name */
    private int f68128c;

    /* renamed from: d  reason: collision with root package name */
    private long f68129d = -1;

    static {
        Covode.recordClassIndex(41974);
    }

    private static void a() {
        MethodCollector.i(2273);
        if (f68126a == null) {
            synchronized (h.class) {
                try {
                    if (f68126a == null) {
                        f68126a = a(k.f68143a);
                    }
                } finally {
                    MethodCollector.o(2273);
                }
            }
            return;
        }
        MethodCollector.o(2273);
    }

    public final void a(c cVar) {
        this.f68128c++;
        cVar.o = this;
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public void onRequestCancellation(String str) {
        super.onRequestCancellation(str);
        this.f68127b.remove(str);
    }

    private static ExecutorService a(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return g.a(a2.a());
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.n.an
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        List<String> list = this.f68127b.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public void onRequestSuccess(b bVar, String str, boolean z) {
        super.onRequestSuccess(bVar, str, z);
        List<String> remove = this.f68127b.remove(str);
        if (remove != null) {
            boolean contains = remove.contains("NetworkFetchProducer");
            Uri uri = bVar.mSourceUri;
            long j2 = -1;
            if (this.f68129d > 0) {
                this.f68129d = -1;
                j2 = System.currentTimeMillis() - this.f68129d;
            }
            a();
            f68126a.submit(new j(uri, j2, contains));
        }
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public void onRequestFailure(b bVar, String str, Throwable th, boolean z) {
        super.onRequestFailure(bVar, str, th, z);
        this.f68127b.remove(str);
        int i2 = this.f68128c - 1;
        this.f68128c = i2;
        if (i2 == 0) {
            a();
            f68126a.submit(new i(bVar, th));
        }
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public void onRequestStart(b bVar, Object obj, String str, boolean z) {
        super.onRequestStart(bVar, obj, str, z);
        this.f68127b.put(str, new LinkedList());
        if (this.f68129d == -1) {
            this.f68129d = System.currentTimeMillis();
        }
    }
}
