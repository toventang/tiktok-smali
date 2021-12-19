package com.lynx.fresco;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.view.b;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.e.k;
import com.lynx.a.c;
import com.lynx.a.d;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.utils.m;

public class FrescoImageLoader extends d {
    public com.facebook.fresco.animation.c.a mAnimatedDrawable2;
    public a mCallback;
    public com.facebook.common.h.a<Bitmap> mCloseableReference;
    public Bitmap mCurrent;
    public volatile Uri mCurrentUri;
    public b mDraweeHolder;

    static {
        Covode.recordClassIndex(34722);
    }

    @Override // com.lynx.a.d
    public Bitmap getCurrent() {
        return this.mCurrent;
    }

    @Override // com.lynx.a.d
    public void onRelease() {
        releasePre();
    }

    @Override // com.lynx.a.d
    public void onPause() {
        com.facebook.fresco.animation.c.a aVar = this.mAnimatedDrawable2;
        if (aVar != null) {
            aVar.stop();
        }
    }

    @Override // com.lynx.a.d
    public void onResume() {
        com.facebook.fresco.animation.c.a aVar = this.mAnimatedDrawable2;
        if (aVar != null) {
            aVar.start();
        }
    }

    @Override // com.lynx.a.d
    public void onDestroy() {
        releasePre();
        b bVar = this.mDraweeHolder;
        if (bVar != null && bVar.f47494a) {
            this.mDraweeHolder.c();
            this.mDraweeHolder = null;
        }
    }

    public void releasePre() {
        this.mCurrent = null;
        com.facebook.fresco.animation.c.a aVar = this.mAnimatedDrawable2;
        if (aVar != null) {
            aVar.stop();
            this.mAnimatedDrawable2.setCallback(null);
            this.mAnimatedDrawable2 = null;
        }
        com.facebook.common.h.a<Bitmap> aVar2 = this.mCloseableReference;
        if (aVar2 != null) {
            aVar2.close();
            this.mCloseableReference = null;
        }
        this.mCallback = null;
    }

    /* access modifiers changed from: package-private */
    public class a implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f55459a;

        /* renamed from: b  reason: collision with root package name */
        public final c f55460b;

        /* renamed from: c  reason: collision with root package name */
        public final com.lynx.a.b f55461c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f55462d = true;

        /* renamed from: f  reason: collision with root package name */
        private final Handler f55464f = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(34727);
        }

        public void invalidateDrawable(Drawable drawable) {
            drawable.draw(new Canvas() {
                /* class com.lynx.fresco.FrescoImageLoader.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34728);
                }

                @Override // android.graphics.Canvas
                public final void drawBitmap(Bitmap bitmap, float f2, float f3, Paint paint) {
                    FrescoImageLoader.this.updateBitmap(a.this.f55462d, bitmap, a.this.f55459a, a.this.f55461c, a.this.f55460b);
                    a.this.f55462d = false;
                }

                @Override // android.graphics.Canvas
                public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
                    FrescoImageLoader.this.updateBitmap(a.this.f55462d, bitmap, a.this.f55459a, a.this.f55461c, a.this.f55460b);
                    a.this.f55462d = false;
                }
            });
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f55464f.removeCallbacks(runnable, drawable);
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            this.f55464f.postAtTime(runnable, drawable, j2);
        }

        public a(Uri uri, c cVar, com.lynx.a.b bVar) {
            this.f55459a = uri;
            this.f55460b = cVar;
            this.f55461c = bVar;
        }
    }

    public static boolean isSameUrl(Uri uri, Uri uri2) {
        if (uri == uri2) {
            return true;
        }
        if (uri == null || !uri.equals(uri2)) {
            return false;
        }
        return true;
    }

    public static com.facebook.common.h.a<Bitmap> getTargetReference(Bitmap bitmap, com.lynx.a.b bVar) {
        int intValue;
        int intValue2;
        if (bVar == null) {
            intValue = bitmap.getWidth();
            intValue2 = bitmap.getHeight();
        } else {
            Pair<Integer, Integer> targetSize = getTargetSize(bVar.f55045a, bVar.f55046b, bitmap.getWidth(), bitmap.getHeight());
            intValue = ((Integer) targetSize.first).intValue();
            intValue2 = ((Integer) targetSize.second).intValue();
            if (!bVar.f55047c && bitmap.getWidth() * bitmap.getHeight() < intValue * intValue2) {
                intValue = bitmap.getWidth();
                intValue2 = bitmap.getHeight();
            }
        }
        com.facebook.common.h.a<Bitmap> b2 = k.a().f().b(intValue, intValue2, bitmap.getConfig());
        Bitmap a2 = b2.a();
        new Canvas(a2).drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, a2.getWidth(), a2.getHeight()), (Paint) null);
        return b2;
    }

    public void load(final Uri uri, final com.lynx.a.b bVar, final c cVar) {
        int i2;
        com.facebook.imagepipeline.common.d dVar;
        Bitmap.Config config;
        int i3 = Integer.MAX_VALUE;
        if (bVar == null || (bVar.f55045a == -1 && bVar.f55046b == -1)) {
            i2 = Integer.MAX_VALUE;
        } else if (bVar.f55045a == -1) {
            i2 = bVar.f55046b;
            i3 = 1;
        } else {
            i3 = bVar.f55045a;
            i2 = 1;
        }
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(uri).a(true);
        if (i3 <= 0 || i2 <= 0) {
            dVar = null;
        } else {
            dVar = new com.facebook.imagepipeline.common.d(i3, i2);
        }
        a2.f48447d = dVar;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        if (bVar == null) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = bVar.f55049e;
        }
        a2.f48449f = imageDecodeOptionsBuilder.setBitmapConfig(config).a();
        a2.f48454k = new com.facebook.imagepipeline.o.a() {
            /* class com.lynx.fresco.FrescoImageLoader.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34724);
            }

            @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
            public final com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, f fVar) {
                if (FrescoImageLoader.isSameUrl(uri, FrescoImageLoader.this.mCurrentUri)) {
                    return FrescoImageLoader.getTargetReference(bitmap, bVar);
                }
                return null;
            }
        };
        e b2 = com.facebook.drawee.a.a.c.b();
        b2.f47315c = (REQUEST) a2.a();
        b2.f47319g = new com.facebook.drawee.c.c() {
            /* class com.lynx.fresco.FrescoImageLoader.AnonymousClass3 */

            static {
                Covode.recordClassIndex(34725);
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                if (FrescoImageLoader.isSameUrl(uri, FrescoImageLoader.this.mCurrentUri)) {
                    FrescoImageLoader.this.releasePre();
                    c cVar = cVar;
                    if (cVar != null) {
                        cVar.a(uri, th);
                    }
                }
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                super.onFinalImageSet(str, obj, animatable);
                if (FrescoImageLoader.isSameUrl(uri, FrescoImageLoader.this.mCurrentUri)) {
                    FrescoImageLoader.this.releasePre();
                    if (cVar != null) {
                        if (obj instanceof com.facebook.imagepipeline.j.d) {
                            FrescoImageLoader.this.mCloseableReference = ((com.facebook.imagepipeline.j.d) obj).f();
                            FrescoImageLoader frescoImageLoader = FrescoImageLoader.this;
                            frescoImageLoader.mCurrent = frescoImageLoader.mCloseableReference.a();
                            cVar.a(uri, FrescoImageLoader.this.mCurrent);
                        } else if (animatable instanceof com.facebook.fresco.animation.c.a) {
                            FrescoImageLoader.this.mCallback = new a(uri, cVar, bVar);
                            FrescoImageLoader.this.mAnimatedDrawable2 = (com.facebook.fresco.animation.c.a) animatable;
                            int i2 = 0;
                            FrescoImageLoader.this.mAnimatedDrawable2.setBounds(0, 0, FrescoImageLoader.this.mAnimatedDrawable2.getIntrinsicWidth(), FrescoImageLoader.this.mAnimatedDrawable2.getIntrinsicHeight());
                            com.facebook.fresco.animation.c.a aVar = FrescoImageLoader.this.mAnimatedDrawable2;
                            com.facebook.fresco.animation.a.a aVar2 = FrescoImageLoader.this.mAnimatedDrawable2.f47564d;
                            com.lynx.a.b bVar = bVar;
                            if (bVar != null) {
                                i2 = bVar.f55048d;
                            }
                            aVar.a(new b(aVar2, i2));
                            FrescoImageLoader.this.mAnimatedDrawable2.setCallback(FrescoImageLoader.this.mCallback);
                            com.lynx.tasm.ui.image.b.b.a(FrescoImageLoader.this.mAnimatedDrawable2);
                            FrescoImageLoader.this.mAnimatedDrawable2.start();
                        }
                    }
                }
            }
        };
        final b a3 = b.a(new com.facebook.drawee.f.b(LynxEnv.b().f55531a.getResources()).a());
        a3.a(b2.e());
        AnonymousClass4 r1 = new Runnable() {
            /* class com.lynx.fresco.FrescoImageLoader.AnonymousClass4 */

            static {
                Covode.recordClassIndex(34726);
            }

            public final void run() {
                FrescoImageLoader.this.mDraweeHolder = a3;
                a3.b();
            }
        };
        if (m.a()) {
            r1.run();
        } else {
            m.a(r1);
        }
    }

    @Override // com.lynx.a.d
    public void onLoad(j jVar, final Uri uri, final com.lynx.a.b bVar, final c cVar) {
        b bVar2 = this.mDraweeHolder;
        if (bVar2 != null && bVar2.f47494a) {
            this.mDraweeHolder.c();
            this.mDraweeHolder = null;
        }
        this.mCurrentUri = uri;
        a.a().execute(new Runnable() {
            /* class com.lynx.fresco.FrescoImageLoader.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34723);
            }

            public final void run() {
                FrescoImageLoader.this.load(uri, bVar, cVar);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getTargetSize(int r4, int r5, int r6, int r7) {
        /*
            r0 = -1
            if (r4 != r0) goto L_0x0015
            if (r5 != r0) goto L_0x0017
            r4 = r6
        L_0x0006:
            r5 = r7
        L_0x0007:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.<init>(r1, r0)
            return r2
        L_0x0015:
            if (r4 != r0) goto L_0x002f
        L_0x0017:
            if (r5 != r7) goto L_0x001b
            r4 = r6
            goto L_0x0007
        L_0x001b:
            double r2 = (double) r5
            double r0 = (double) r7
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            double r0 = (double) r6
            java.lang.Double.isNaN(r0)
            double r2 = r2 * r0
            double r0 = java.lang.Math.ceil(r2)
            int r4 = (int) r0
            goto L_0x0007
        L_0x002f:
            if (r4 != r6) goto L_0x0032
            goto L_0x0006
        L_0x0032:
            double r2 = (double) r4
            double r0 = (double) r6
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            double r0 = (double) r7
            java.lang.Double.isNaN(r0)
            double r2 = r2 * r0
            double r0 = java.lang.Math.ceil(r2)
            int r5 = (int) r0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.fresco.FrescoImageLoader.getTargetSize(int, int, int, int):android.util.Pair");
    }

    public void updateBitmap(boolean z, Bitmap bitmap, Uri uri, com.lynx.a.b bVar, c cVar) {
        com.facebook.common.h.a<Bitmap> aVar = this.mCloseableReference;
        if (aVar != null) {
            aVar.close();
            this.mCloseableReference = null;
        }
        try {
            com.facebook.common.h.a<Bitmap> targetReference = getTargetReference(bitmap, bVar);
            this.mCloseableReference = targetReference;
            Bitmap a2 = targetReference.a();
            this.mCurrent = a2;
            if (cVar == null) {
                return;
            }
            if (z) {
                cVar.a(uri, a2);
            } else {
                cVar.b(uri, a2);
            }
        } catch (Exception e2) {
            if (cVar == null) {
                return;
            }
            if (z) {
                cVar.a(uri, e2);
            } else {
                cVar.b(uri, e2);
            }
        }
    }
}
