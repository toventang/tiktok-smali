package com.ss.android.ugc.aweme.ecommerce.gallery.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.gallery.a.c;

public final class a implements c {
    static {
        Covode.recordClassIndex(53822);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.a.c
    public final void a(c.b bVar) {
        e.a(new UrlModel(), 0, 0, new b(this, bVar));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.a.c
    public final boolean b(String str) {
        return e.a(Uri.parse(str));
    }

    public static Bitmap a(Bitmap bitmap) {
        MethodCollector.i(6805);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = (float) width;
        if (f2 > 2000.0f) {
            float f3 = (float) height;
            if (f3 > 2000.0f) {
                float max = Math.max(f2 / 2000.0f, f3 / 2000.0f);
                Matrix matrix = new Matrix();
                float f4 = 1.0f / max;
                matrix.setScale(f4, f4);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                MethodCollector.o(6805);
                return createBitmap;
            }
        }
        MethodCollector.o(6805);
        return bitmap;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.a.c
    public final Drawable a(String str) {
        MethodCollector.i(6802);
        String a2 = e.a(str);
        if (!m.a(a2)) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(a2, options);
                if (((float) options.outWidth) <= 2000.0f || ((float) options.outHeight) <= 2000.0f) {
                    Drawable createFromPath = BitmapDrawable.createFromPath(a2);
                    MethodCollector.o(6802);
                    return createFromPath;
                }
                options.inSampleSize = a(options.outWidth, options.outHeight);
                options.inJustDecodeBounds = false;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeFile(a2, options));
                MethodCollector.o(6802);
                return bitmapDrawable;
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        MethodCollector.o(6802);
        return null;
    }

    private static int a(int i2, int i3) {
        float min = Math.min(((float) i2) / 2000.0f, ((float) i3) / 2000.0f);
        float f2 = 1.0f;
        while (true) {
            float f3 = 2.0f * f2;
            if (f3 > min) {
                return (int) f2;
            }
            f2 = f3;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.a.c
    public final void a(String str, final ImageView imageView, final Drawable drawable, final c.a aVar) {
        h e2 = k.a().e();
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
        a2.f48453j = com.facebook.imagepipeline.common.c.HIGH;
        REQUEST request = (REQUEST) a2.a();
        final com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a3 = e2.a(request, (Object) null);
        com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
        b2.f47315c = request;
        com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c cVar = (com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c) imageView;
        b2.f47325m = cVar.getController();
        b2.f47319g = new com.facebook.drawee.c.c<f>() {
            /* class com.ss.android.ugc.aweme.ecommerce.gallery.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(53823);
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onSubmit(String str, Object obj) {
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onFailure(String str, Throwable th) {
                Drawable drawable = drawable;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                c.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(0);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                com.facebook.common.h.a aVar;
                Throwable th;
                Bitmap bitmap;
                try {
                    aVar = (com.facebook.common.h.a) a3.d();
                    if (aVar != null) {
                        try {
                            com.facebook.imagepipeline.j.c cVar = (com.facebook.imagepipeline.j.c) aVar.a();
                            if ((cVar instanceof d) && (bitmap = ((d) cVar).f47984a) != null) {
                                imageView.setImageBitmap(a.a(bitmap));
                                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a3.g();
                            com.facebook.common.h.a.c(aVar);
                            throw th;
                        }
                    }
                    a3.g();
                    com.facebook.common.h.a.c(aVar);
                    c.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(1);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aVar = null;
                    a3.g();
                    com.facebook.common.h.a.c(aVar);
                    throw th;
                }
            }
        };
        cVar.setController(b2.e());
    }
}
