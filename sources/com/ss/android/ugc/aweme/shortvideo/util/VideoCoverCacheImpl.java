package com.ss.android.ugc.aweme.shortvideo.util;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.common.b;
import com.facebook.imagepipeline.common.e;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.util.bo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class VideoCoverCacheImpl implements au, bo {

    /* renamed from: a  reason: collision with root package name */
    String f132178a;

    /* renamed from: b  reason: collision with root package name */
    boolean f132179b = true;

    /* renamed from: c  reason: collision with root package name */
    Map<Integer, bo.a> f132180c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private int f132181d;

    /* renamed from: e  reason: collision with root package name */
    private int f132182e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f132183f;

    static {
        Covode.recordClassIndex(86564);
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f132179b = true;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.util.bo
    public final void a(int i2, bo.a aVar) {
        a<c> a2 = k.a().c().a(new com.facebook.imagepipeline.d.c("file://".concat(String.valueOf(this.f132178a + i2)), null, e.f47751b, b.f47734a, null, null, null));
        if (a2 != null) {
            aVar.a(a2.clone());
            a.c(a2);
            return;
        }
        this.f132180c.put(Integer.valueOf(i2), aVar);
    }

    public VideoCoverCacheImpl(m mVar, String str, int i2, int i3, int i4, float f2) {
        this.f132178a = str;
        this.f132181d = i2;
        this.f132182e = i3;
        mVar.getLifecycle().a(this);
        float f3 = 1000.0f * f2;
        if (f3 > 0.0f) {
            int i5 = (int) (((float) i4) / f3);
            int[] iArr = new int[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                iArr[i6] = (int) (((float) i6) * f3);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
            this.f132183f = threadPoolExecutor;
            threadPoolExecutor.execute(new bp(this, str, iArr, i2, i3));
        }
    }
}
