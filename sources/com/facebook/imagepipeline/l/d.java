package com.facebook.imagepipeline.l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.common.g.h;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.memory.n;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

public final class d extends DalvikPurgeableDecoder {

    /* renamed from: a  reason: collision with root package name */
    private final n f48011a;

    static {
        Covode.recordClassIndex(29029);
    }

    public d(n nVar) {
        this.f48011a = nVar;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeByteArrayAsPurgeable(a<h> aVar, BitmapFactory.Options options) {
        MethodCollector.i(14411);
        h a2 = aVar.a();
        int a3 = a2.a();
        a<byte[]> a4 = this.f48011a.a(a3);
        try {
            byte[] a5 = a4.a();
            a2.a(0, a5, 0, a3);
            return (Bitmap) i.a(BitmapFactory.decodeByteArray(a5, 0, a3, options), "BitmapFactory returned null");
        } finally {
            a.c(a4);
            MethodCollector.o(14411);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeJPEGByteArrayAsPurgeable(a<h> aVar, int i2, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z;
        MethodCollector.i(14429);
        if (endsWithEOI(aVar, i2)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        h a2 = aVar.a();
        if (i2 <= a2.a()) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        int i3 = i2 + 2;
        a<byte[]> a3 = this.f48011a.a(i3);
        try {
            byte[] a4 = a3.a();
            a2.a(0, a4, 0, i2);
            if (bArr != null) {
                a4[i2] = -1;
                a4[i2 + 1] = -39;
                i2 = i3;
            }
            return (Bitmap) i.a(BitmapFactory.decodeByteArray(a4, 0, i2, options), "BitmapFactory returned null");
        } finally {
            a.c(a3);
            MethodCollector.o(14429);
        }
    }
}
