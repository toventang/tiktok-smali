package com.ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cover.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

final /* synthetic */ class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoCoverGeneratorImpl f125280a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AbstractC3267a f125281b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f125282c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap f125283d;

    /* renamed from: e  reason: collision with root package name */
    private final long f125284e;

    static {
        Covode.recordClassIndex(82265);
    }

    u(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, a.AbstractC3267a aVar, AtomicInteger atomicInteger, Bitmap bitmap, long j2) {
        this.f125280a = vEVideoCoverGeneratorImpl;
        this.f125281b = aVar;
        this.f125282c = atomicInteger;
        this.f125283d = bitmap;
        this.f125284e = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f125280a;
        a.AbstractC3267a aVar = this.f125281b;
        AtomicInteger atomicInteger = this.f125282c;
        Bitmap bitmap = this.f125283d;
        long j2 = this.f125284e;
        aVar.a(atomicInteger.get(), bitmap);
        atomicInteger.incrementAndGet();
        vEVideoCoverGeneratorImpl.f125225e.add(Long.valueOf(System.currentTimeMillis() - j2));
        return null;
    }
}
