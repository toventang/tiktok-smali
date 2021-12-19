package com.ss.android.ugc.aweme.shortvideo.util;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.c.g;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.o.b;
import com.ss.android.ugc.aweme.shortvideo.util.bo;
import com.ss.android.vesdk.ad;
import java.nio.ByteBuffer;

final /* synthetic */ class bq implements ad {

    /* renamed from: a  reason: collision with root package name */
    private final VideoCoverCacheImpl f132275a;

    static {
        Covode.recordClassIndex(86634);
    }

    bq(VideoCoverCacheImpl videoCoverCacheImpl) {
        this.f132275a = videoCoverCacheImpl;
    }

    @Override // com.ss.android.vesdk.ad
    public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        MethodCollector.i(9439);
        VideoCoverCacheImpl videoCoverCacheImpl = this.f132275a;
        if (byteBuffer != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
            a<c> a2 = a.a(new d(createBitmap, g.a(), com.facebook.imagepipeline.j.g.f48000a));
            a<c> b2 = a2.clone();
            bo.a aVar = videoCoverCacheImpl.f132180c.get(Integer.valueOf(i4));
            if (aVar != null) {
                videoCoverCacheImpl.f132180c.remove(Integer.valueOf(i4));
                com.ss.android.b.a.a.a.b(new br(aVar, b2));
            }
            k.a().c().a(j.a().a(b.fromUri("file://".concat(String.valueOf(videoCoverCacheImpl.f132178a + i4))), null), a2);
        }
        boolean z = videoCoverCacheImpl.f132179b;
        MethodCollector.o(9439);
        return z;
    }
}
