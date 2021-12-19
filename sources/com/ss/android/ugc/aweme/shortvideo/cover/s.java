package com.ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.cover.a;
import com.ss.android.ugc.tools.c;
import com.ss.android.vesdk.x;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

final /* synthetic */ class s implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoCoverGeneratorImpl f125269a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f125270b;

    /* renamed from: c  reason: collision with root package name */
    private final int f125271c;

    /* renamed from: d  reason: collision with root package name */
    private final int f125272d;

    /* renamed from: e  reason: collision with root package name */
    private final a.AbstractC3267a f125273e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f125274f;

    /* renamed from: g  reason: collision with root package name */
    private final long f125275g;

    static {
        Covode.recordClassIndex(82263);
    }

    s(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, int[] iArr, int i2, int i3, a.AbstractC3267a aVar, AtomicInteger atomicInteger, long j2) {
        this.f125269a = vEVideoCoverGeneratorImpl;
        this.f125270b = iArr;
        this.f125271c = i2;
        this.f125272d = i3;
        this.f125273e = aVar;
        this.f125274f = atomicInteger;
        this.f125275g = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        x.a aVar;
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f125269a;
        int[] iArr = this.f125270b;
        int i2 = this.f125271c;
        int i3 = this.f125272d;
        a.AbstractC3267a aVar2 = this.f125273e;
        AtomicInteger atomicInteger = this.f125274f;
        long j2 = this.f125275g;
        for (int i4 : iArr) {
            c.f149151f.b("VEVideoCoverGeneratorImpl: generateBitmaps begin，timeStamps: ".concat(String.valueOf(i4)));
        }
        c.f149151f.b("VEVideoCoverGeneratorImpl: generateBitmaps begin，duration: " + vEVideoCoverGeneratorImpl.f125224d.j());
        g gVar = vEVideoCoverGeneratorImpl.f125224d;
        if (vEVideoCoverGeneratorImpl.f125226f == null) {
            aVar = x.a.GET_FRAMES_MODE_NOEFFECT;
        } else {
            aVar = vEVideoCoverGeneratorImpl.f125226f;
        }
        gVar.a(iArr, i2, i3, aVar, new t(vEVideoCoverGeneratorImpl, aVar2, atomicInteger, j2));
        return null;
    }
}
