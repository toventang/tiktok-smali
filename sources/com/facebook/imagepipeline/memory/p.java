package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.b;

public final class p implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final aa<Bitmap> f48100a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final int f48101b;

    /* renamed from: c  reason: collision with root package name */
    private int f48102c;

    /* renamed from: d  reason: collision with root package name */
    private final ae f48103d;

    /* renamed from: e  reason: collision with root package name */
    private int f48104e;

    static {
        Covode.recordClassIndex(29064);
    }

    @Override // com.facebook.common.g.c
    public final void a(b bVar) {
        double d2 = (double) this.f48101b;
        Double.isNaN(d2);
        b((int) (d2 * (1.0d - bVar.getSuggestedTrimRatio())));
    }

    /* access modifiers changed from: private */
    public synchronized void a(Bitmap bitmap) {
        MethodCollector.i(14551);
        int b2 = this.f48100a.b(bitmap);
        if (b2 <= this.f48102c) {
            this.f48100a.a(bitmap);
            this.f48104e += b2;
        }
        MethodCollector.o(14551);
    }

    private synchronized void b(int i2) {
        Bitmap a2;
        MethodCollector.i(14539);
        while (this.f48104e > i2 && (a2 = this.f48100a.a()) != null) {
            this.f48104e -= this.f48100a.b(a2);
        }
        MethodCollector.o(14539);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized Bitmap a(int i2) {
        MethodCollector.i(14540);
        int i3 = this.f48104e;
        int i4 = this.f48101b;
        if (i3 > i4) {
            b(i4);
        }
        Bitmap a2 = this.f48100a.a(i2);
        if (a2 != null) {
            this.f48104e -= this.f48100a.b(a2);
            MethodCollector.o(14540);
            return a2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, i2, Bitmap.Config.ALPHA_8);
        MethodCollector.o(14540);
        return createBitmap;
    }

    public p(int i2, int i3, ae aeVar) {
        this.f48101b = i2;
        this.f48102c = i3;
        this.f48103d = aeVar;
    }
}
