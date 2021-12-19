package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.h;
import com.facebook.common.h.a;
import com.facebook.h.b;
import com.facebook.imagepipeline.l.g;

public class e extends f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f47714a = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final b f47715b;

    /* renamed from: c  reason: collision with root package name */
    private final g f47716c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47717d;

    static {
        Covode.recordClassIndex(28918);
    }

    public e(b bVar, g gVar) {
        this.f47715b = bVar;
        this.f47716c = gVar;
    }

    private static a<Bitmap> c(int i2, int i3, Bitmap.Config config) {
        MethodCollector.i(12139);
        a<Bitmap> a2 = a.a(Bitmap.createBitmap(i2, i3, config), g.a());
        MethodCollector.o(12139);
        return a2;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.c.f
    public final a<Bitmap> a(int i2, int i3, Bitmap.Config config) {
        if (this.f47717d) {
            return c(i2, i3, config);
        }
        a<h> a2 = this.f47715b.a((short) i2, (short) i3);
        try {
            com.facebook.imagepipeline.j.e eVar = new com.facebook.imagepipeline.j.e(a2);
            eVar.f47991c = b.f47621a;
            try {
                a<Bitmap> decodeJPEGFromEncodedImage = this.f47716c.decodeJPEGFromEncodedImage(eVar, config, null, a2.a().a());
                if (!decodeJPEGFromEncodedImage.a().isMutable()) {
                    a.c(decodeJPEGFromEncodedImage);
                    this.f47717d = true;
                    String str = f47714a;
                    if (com.facebook.common.e.a.f47081a.b(6)) {
                        com.facebook.common.e.a.f47081a.e(str, "Immutable bitmap returned by decoder");
                    }
                    a<Bitmap> c2 = c(i2, i3, config);
                    com.facebook.imagepipeline.j.e.d(eVar);
                    return c2;
                }
                decodeJPEGFromEncodedImage.a().setHasAlpha(true);
                decodeJPEGFromEncodedImage.a().eraseColor(0);
                com.facebook.imagepipeline.j.e.d(eVar);
                a2.close();
                return decodeJPEGFromEncodedImage;
            } catch (Throwable th) {
                com.facebook.imagepipeline.j.e.d(eVar);
                throw th;
            }
        } finally {
            a2.close();
        }
    }
}
