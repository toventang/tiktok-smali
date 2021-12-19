package com.ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.cover.a;
import com.ss.android.ugc.tools.c;
import com.ss.android.vesdk.VEListener;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

final /* synthetic */ class t implements VEListener.w {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoCoverGeneratorImpl f125276a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AbstractC3267a f125277b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f125278c;

    /* renamed from: d  reason: collision with root package name */
    private final long f125279d;

    static {
        Covode.recordClassIndex(82264);
    }

    t(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, a.AbstractC3267a aVar, AtomicInteger atomicInteger, long j2) {
        this.f125276a = vEVideoCoverGeneratorImpl;
        this.f125277b = aVar;
        this.f125278c = atomicInteger;
        this.f125279d = j2;
    }

    @Override // com.ss.android.vesdk.VEListener.w
    public final int a(byte[] bArr, int i2, int i3) {
        MethodCollector.i(8599);
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f125276a;
        a.AbstractC3267a aVar = this.f125277b;
        AtomicInteger atomicInteger = this.f125278c;
        long j2 = this.f125279d;
        if (bArr != null) {
            c.f149151f.b("VEVideoCoverGeneratorImpl: generateBitmaps onGetImageData，bytes: " + bArr.length);
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            i.b(new u(vEVideoCoverGeneratorImpl, aVar, atomicInteger, createBitmap, j2), i.f4826c);
        } else {
            c.f149151f.b("VEVideoCoverGeneratorImpl: generateBitmaps onGetImageData end，bytes: null");
            vEVideoCoverGeneratorImpl.f125224d.z();
            if (atomicInteger.get() != vEVideoCoverGeneratorImpl.f125222b) {
                c.f149151f.b("VEVideoCoverGeneratorImpl:cover size not correct，want" + vEVideoCoverGeneratorImpl.f125222b + "，actually" + atomicInteger.get());
            }
        }
        MethodCollector.o(8599);
        return 0;
    }
}
