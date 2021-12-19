package com.lynx.tasm.ui.image.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.imagepipeline.c.f;

public final class a extends com.facebook.imagepipeline.o.a {

    /* renamed from: a  reason: collision with root package name */
    private int f56904a;

    /* renamed from: b  reason: collision with root package name */
    private int f56905b;

    /* renamed from: c  reason: collision with root package name */
    private int f56906c;

    /* renamed from: d  reason: collision with root package name */
    private int f56907d;

    /* renamed from: e  reason: collision with root package name */
    private int f56908e;

    /* renamed from: f  reason: collision with root package name */
    private int f56909f;

    /* renamed from: g  reason: collision with root package name */
    private j f56910g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f56911h;

    /* renamed from: i  reason: collision with root package name */
    private Bitmap.Config f56912i;

    static {
        Covode.recordClassIndex(35423);
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public final e getPostprocessorCacheKey() {
        return this.f56910g;
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public final com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, f fVar) {
        com.facebook.common.h.a<Bitmap> a2;
        try {
            Bitmap.Config config = this.f56912i;
            if (config == null) {
                config = bitmap.getConfig();
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (config == null) {
                config = FALLBACK_BITMAP_CONFIGURATION;
            }
            com.facebook.common.h.a<Bitmap> a3 = fVar.a(width, height, config);
            process(a3.a(), bitmap);
            return com.facebook.common.h.a.b(a3);
        } catch (RuntimeException unused) {
            Bitmap.Config config2 = bitmap.getConfig();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            if (config2 == null) {
                config2 = FALLBACK_BITMAP_CONFIGURATION;
            }
            a2 = fVar.a(width2, height2, config2);
            new Canvas(a2.a()).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            com.facebook.common.h.a<Bitmap> b2 = com.facebook.common.h.a.b(a2);
            com.facebook.common.h.a.c(a2);
            return b2;
        } catch (Throwable th) {
            com.facebook.common.h.a.c(a2);
            throw th;
        }
    }

    public a(String str, int i2, int i3, int i4, int i5, int i6, int i7, Bitmap.Config config) {
        this.f56911h = true;
        this.f56911h = true;
        this.f56904a = i2;
        this.f56905b = i3;
        this.f56906c = i4;
        this.f56909f = i5;
        this.f56907d = i6;
        this.f56908e = i7;
        this.f56912i = config;
        this.f56910g = new j(str + this.f56911h + this.f56904a + this.f56905b + this.f56908e + this.f56909f + this.f56906c + this.f56907d + this.f56912i);
    }
}
