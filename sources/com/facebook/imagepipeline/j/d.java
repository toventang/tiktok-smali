package com.facebook.imagepipeline.j;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.common.h.a;
import com.facebook.common.h.c;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public volatile Bitmap f47984a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47985b;

    /* renamed from: c  reason: collision with root package name */
    public final int f47986c;

    /* renamed from: d  reason: collision with root package name */
    private a<Bitmap> f47987d;

    /* renamed from: e  reason: collision with root package name */
    private final h f47988e;

    static {
        Covode.recordClassIndex(29018);
    }

    @Override // com.facebook.imagepipeline.j.b
    public final Bitmap d() {
        return this.f47984a;
    }

    @Override // com.facebook.imagepipeline.j.c
    public final h e() {
        return this.f47988e;
    }

    @Override // com.facebook.imagepipeline.j.c
    public final int b() {
        return com.facebook.imageutils.a.a(this.f47984a);
    }

    @Override // com.facebook.imagepipeline.j.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a<Bitmap> g2 = g();
        if (g2 != null) {
            g2.close();
        }
    }

    private synchronized a<Bitmap> g() {
        a<Bitmap> aVar;
        MethodCollector.i(2);
        aVar = this.f47987d;
        this.f47987d = null;
        this.f47984a = null;
        MethodCollector.o(2);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.j.c
    public final synchronized boolean a() {
        MethodCollector.i(5);
        if (this.f47987d == null) {
            MethodCollector.o(5);
            return true;
        }
        MethodCollector.o(5);
        return false;
    }

    public final synchronized a<Bitmap> f() {
        a<Bitmap> b2;
        MethodCollector.i(3);
        b2 = a.b(this.f47987d);
        MethodCollector.o(3);
        return b2;
    }

    @Override // com.facebook.imagepipeline.j.f
    public final int getHeight() {
        int i2;
        if (this.f47985b % LiveFeedRefreshTimeSetting.DEFAULT != 0 || (i2 = this.f47986c) == 5 || i2 == 7) {
            return a(this.f47984a);
        }
        return b(this.f47984a);
    }

    @Override // com.facebook.imagepipeline.j.f
    public final int getWidth() {
        int i2;
        if (this.f47985b % LiveFeedRefreshTimeSetting.DEFAULT != 0 || (i2 = this.f47986c) == 5 || i2 == 7) {
            return b(this.f47984a);
        }
        return a(this.f47984a);
    }

    private static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    private static int b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public d(a<Bitmap> aVar, h hVar) {
        this(aVar, hVar, 0, 0);
    }

    public d(Bitmap bitmap, c<Bitmap> cVar, h hVar) {
        this(bitmap, cVar, hVar, (byte) 0);
    }

    public d(a<Bitmap> aVar, h hVar, int i2, int i3) {
        a<Bitmap> aVar2 = (a) i.a(aVar.c());
        this.f47987d = aVar2;
        this.f47984a = aVar2.a();
        this.f47988e = hVar;
        this.f47985b = i2;
        this.f47986c = i3;
    }

    private d(Bitmap bitmap, c<Bitmap> cVar, h hVar, byte b2) {
        this.f47984a = (Bitmap) i.a(bitmap);
        this.f47987d = a.a(this.f47984a, (c) i.a(cVar));
        this.f47988e = hVar;
        this.f47985b = 0;
        this.f47986c = 0;
    }
}
