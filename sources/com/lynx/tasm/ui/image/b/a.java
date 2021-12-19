package com.lynx.tasm.ui.image.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.common.g.j;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.d;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class a {

    /* renamed from: f  reason: collision with root package name */
    private static int f56927f = Math.min(3379, 3379);

    /* renamed from: g  reason: collision with root package name */
    private static int f56928g = Math.min(3379, 3379);

    /* renamed from: a  reason: collision with root package name */
    public b f56929a;

    /* renamed from: b  reason: collision with root package name */
    public c f56930b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f56931c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f56932d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    private int f56933e;

    public interface b {
        static {
            Covode.recordClassIndex(35433);
        }

        void a();
    }

    public final void a(final c cVar) {
        this.f56932d.post(new Runnable() {
            /* class com.lynx.tasm.ui.image.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35429);
            }

            public final void run() {
                a.this.b(cVar);
            }
        });
    }

    public final void a(Context context, com.facebook.imagepipeline.o.b bVar, C1271a aVar) {
        b(context, bVar, aVar);
        a(bVar, aVar);
    }

    public final boolean a(Context context, Canvas canvas, com.facebook.imagepipeline.o.b bVar, C1271a aVar) {
        this.f56931c = true;
        c cVar = this.f56930b;
        if (cVar == null || cVar.f56955d == null || this.f56930b.f56957f.f56943a != aVar.f56943a) {
            a();
            a(context, bVar, aVar);
        }
        c cVar2 = this.f56930b;
        if (cVar2 == null || cVar2.f56955d == null) {
            return false;
        }
        com.lynx.tasm.ui.image.a.b.a((int) aVar.f56944b, (int) aVar.f56945c, this.f56930b.f56955d.getWidth(), this.f56930b.f56955d.getHeight(), aVar.f56947e, aVar.f56950h, aVar.f56951i, canvas, this.f56930b.f56955d);
        return true;
    }

    public final void a(Canvas canvas, c cVar) {
        if (cVar != null && cVar.f56955d != null && !cVar.f56955d.isRecycled()) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            if (cVar.f56957f.f56947e != q.b.f47438d || !cVar.f56957f.f56946d) {
                Matrix matrix = new Matrix();
                matrix.preTranslate((float) this.f56930b.f56954c.left, (float) this.f56930b.f56954c.top);
                if (this.f56930b.f56956e) {
                    matrix.postScale((((float) (this.f56930b.f56954c.right - this.f56930b.f56954c.left)) * 1.0f) / ((float) (this.f56930b.f56953b.right - this.f56930b.f56953b.left)), (((float) (this.f56930b.f56954c.bottom - this.f56930b.f56954c.top)) * 1.0f) / ((float) (this.f56930b.f56953b.bottom - this.f56930b.f56953b.top)));
                    canvas.drawBitmap(this.f56930b.f56955d, matrix, paint);
                    return;
                }
                matrix.postScale((((float) (this.f56930b.f56954c.right - this.f56930b.f56954c.left)) * 1.0f) / ((float) this.f56930b.f56955d.getWidth()), (((float) (this.f56930b.f56954c.bottom - this.f56930b.f56954c.top)) * 1.0f) / ((float) this.f56930b.f56955d.getHeight()));
                canvas.drawBitmap(this.f56930b.f56955d, matrix, paint);
                return;
            }
            Bitmap bitmap = this.f56930b.f56955d;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix2 = new Matrix();
            float min = Math.min((((float) canvas.getWidth()) * 1.0f) / ((float) this.f56930b.f56955d.getWidth()), (((float) canvas.getHeight()) * 1.0f) / ((float) this.f56930b.f56955d.getHeight()));
            matrix2.postScale(min, min);
            bitmapShader.setLocalMatrix(matrix2);
            paint.setShader(bitmapShader);
            canvas.drawRect(new Rect(0, 0, canvas.getWidth(), canvas.getHeight()), paint);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f56952a = 1;

        /* renamed from: b  reason: collision with root package name */
        public Rect f56953b;

        /* renamed from: c  reason: collision with root package name */
        public Rect f56954c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap f56955d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f56956e = true;

        /* renamed from: f  reason: collision with root package name */
        public C1271a f56957f;

        /* renamed from: g  reason: collision with root package name */
        public com.facebook.common.h.a<com.facebook.imagepipeline.j.c> f56958g;

        static {
            Covode.recordClassIndex(35434);
        }

        public final void a() {
            Bitmap bitmap = this.f56955d;
            if (bitmap != null && !bitmap.isRecycled() && !this.f56956e) {
                this.f56955d.recycle();
                this.f56955d = null;
            }
            com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar = this.f56958g;
            if (aVar != null) {
                aVar.close();
            }
        }

        public c(C1271a aVar) {
            this.f56957f = aVar;
        }
    }

    static {
        Covode.recordClassIndex(35428);
    }

    public final void a() {
        c cVar = this.f56930b;
        if (cVar != null) {
            cVar.a();
        }
        this.f56930b = null;
    }

    public final void a(int i2) {
        this.f56933e = i2;
        a();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static Point a(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), f56927f), Math.min(canvas.getMaximumBitmapHeight(), f56928g));
    }

    /* renamed from: com.lynx.tasm.ui.image.b.a$a  reason: collision with other inner class name */
    public static class C1271a {

        /* renamed from: a  reason: collision with root package name */
        public int f56943a;

        /* renamed from: b  reason: collision with root package name */
        public float f56944b;

        /* renamed from: c  reason: collision with root package name */
        public float f56945c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f56946d;

        /* renamed from: e  reason: collision with root package name */
        public q.b f56947e;

        /* renamed from: f  reason: collision with root package name */
        String f56948f;

        /* renamed from: g  reason: collision with root package name */
        Point f56949g;

        /* renamed from: h  reason: collision with root package name */
        public String f56950h;

        /* renamed from: i  reason: collision with root package name */
        public String f56951i;

        static {
            Covode.recordClassIndex(35432);
        }

        public static C1271a a(C1271a aVar) {
            String str = null;
            if (aVar == null) {
                return null;
            }
            if (!TextUtils.isEmpty(aVar.f56948f)) {
                str = String.copyValueOf(aVar.f56948f.toCharArray());
            }
            return new C1271a(aVar.f56943a, aVar.f56944b, aVar.f56945c, aVar.f56946d, aVar.f56947e, str, aVar.f56949g, aVar.f56950h, aVar.f56951i);
        }

        public C1271a(int i2, float f2, float f3, boolean z, q.b bVar, String str, Point point, String str2, String str3) {
            this.f56943a = i2;
            this.f56944b = f2;
            this.f56945c = f3;
            this.f56946d = z;
            this.f56947e = bVar;
            this.f56948f = str;
            this.f56949g = new Point(point.x, point.y);
            this.f56950h = str2;
            this.f56951i = str3;
        }
    }

    public final void b(c cVar) {
        if (cVar != null && cVar.f56955d != null && !cVar.f56955d.isRecycled()) {
            if (cVar.f56957f.f56943a != this.f56933e) {
                cVar.a();
                return;
            }
            c cVar2 = this.f56930b;
            if (cVar2 == null || cVar2.f56955d == null || (this.f56930b.f56955d.getWidth() < cVar.f56955d.getWidth() && this.f56930b.f56955d.getHeight() < cVar.f56955d.getHeight())) {
                a();
                this.f56930b = cVar;
                b bVar = this.f56929a;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r0 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.lynx.tasm.ui.image.b.a.c a(com.lynx.tasm.ui.image.b.a.C1271a r7) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.ui.image.b.a.a(com.lynx.tasm.ui.image.b.a$a):com.lynx.tasm.ui.image.b.a$c");
    }

    public a(b bVar, int i2) {
        this.f56929a = bVar;
        this.f56933e = i2;
    }

    private void a(com.facebook.imagepipeline.o.b bVar, C1271a aVar) {
        if (bVar != null) {
            try {
                e a2 = k.a().e().f47839d.a(bVar, null);
                if (k.a().e().f47836a.a(a2) != null) {
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> b2 = k.a().e().f47836a.a(a2).clone();
                    if (b2.a() != null && (b2.a() instanceof d)) {
                        Bitmap bitmap = ((d) b2.a()).f47984a;
                        c a3 = a(aVar, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                        if (a3 != null) {
                            a3.f56958g = b2;
                            a3.f56955d = bitmap;
                            b(a3);
                        }
                    }
                }
            } catch (Throwable th) {
                LLog.d("BigImageDrawingHelper", "loadBitmapFromMemory failed: " + th.toString());
            }
        }
    }

    public final c a(Context context, C1271a aVar) {
        MethodCollector.i(926);
        try {
            InputStream open = context.getAssets().open(aVar.f56948f.substring(9));
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(open, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            c a2 = a(aVar, (float) newInstance.getWidth(), (float) newInstance.getHeight());
            if (a2 != null) {
                options.inSampleSize = a2.f56952a;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                a2.f56955d = newInstance.decodeRegion(a2.f56953b, options);
                a2.f56956e = false;
            }
            newInstance.recycle();
            open.close();
            MethodCollector.o(926);
            return a2;
        } catch (Throwable th) {
            LLog.d("LynxImageHelper", "loadBitmapFromAssetSync error: " + th.getMessage());
            MethodCollector.o(926);
            return null;
        }
    }

    private void b(final Context context, final com.facebook.imagepipeline.o.b bVar, final C1271a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.f56948f)) {
            final C1271a a2 = C1271a.a(aVar);
            com.lynx.tasm.ui.image.e.a().a(new Runnable() {
                /* class com.lynx.tasm.ui.image.b.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(35430);
                }

                public final void run() {
                    try {
                        if (a2.f56948f == null || !a2.f56948f.startsWith("asset")) {
                            c a2 = a.this.a(a2);
                            if (a2 != null) {
                                a.this.a(a2);
                                return;
                            }
                            a aVar = a.this;
                            Context context = context;
                            C1271a aVar2 = aVar;
                            if (aVar2 == null) {
                                return;
                            }
                            if (!TextUtils.isEmpty(aVar2.f56948f)) {
                                LLog.a(3, "LynxImageHelper", "loadBitmapFromRemote");
                                Uri parse = Uri.parse(aVar2.f56948f);
                                h e2 = k.a().e();
                                com.facebook.imagepipeline.o.c a3 = com.facebook.imagepipeline.o.c.a(parse);
                                b.a(a3);
                                com.facebook.d.c<com.facebook.common.h.a<com.facebook.common.g.h>> b2 = e2.b(a3.a(), context);
                                AnonymousClass3 r2 = new com.facebook.d.b<com.facebook.common.h.a<com.facebook.common.g.h>>(aVar2) {
                                    /* class com.lynx.tasm.ui.image.b.a.AnonymousClass3 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ C1271a f56941a;

                                    static {
                                        Covode.recordClassIndex(35431);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.d.c] */
                                    @Override // com.facebook.d.b
                                    public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.common.g.h>> cVar) {
                                        Throwable e2 = cVar.e();
                                        if (e2 != null) {
                                            LLog.d("LynxImageHelper", "loadBitmapFromRemote failed: " + e2.toString());
                                        }
                                        if (a.this.f56929a != null && a.this.f56930b != null && a.this.f56930b.f56957f != null) {
                                            String str = a.this.f56930b.f56957f.f56948f;
                                        }
                                    }

                                    @Override // com.facebook.d.b
                                    public final void onNewResultImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.common.g.h>> cVar) {
                                        com.facebook.common.h.a<com.facebook.common.g.h> d2;
                                        if (cVar.b() && (d2 = cVar.d()) != null) {
                                            com.facebook.common.h.a<com.facebook.common.g.h> b2 = d2.clone();
                                            j jVar = null;
                                            try {
                                                j jVar2 = new j(b2.a());
                                                try {
                                                    BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance((InputStream) jVar2, false);
                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                    c a2 = a.this.a(this.f56941a, (float) newInstance.getWidth(), (float) newInstance.getHeight());
                                                    if (a2 != null) {
                                                        options.inSampleSize = a2.f56952a;
                                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                                        a2.f56955d = newInstance.decodeRegion(a2.f56953b, options);
                                                        a2.f56956e = false;
                                                        a.this.a(a2);
                                                    }
                                                    newInstance.recycle();
                                                    a.a(jVar2);
                                                } catch (Throwable unused) {
                                                    jVar = jVar2;
                                                    a.a(jVar);
                                                    d2.close();
                                                    b2.close();
                                                }
                                            } catch (Throwable unused2) {
                                                a.a(jVar);
                                                d2.close();
                                                b2.close();
                                            }
                                            d2.close();
                                            b2.close();
                                        }
                                    }

                                    {
                                        this.f56941a = r2;
                                    }
                                };
                                l.a a4 = l.a(o.FIXED);
                                a4.f79174c = 1;
                                b2.a(r2, g.a(a4.a()));
                                return;
                            }
                            return;
                        }
                        c a5 = a.this.a(context, a2);
                        if (a5 != null) {
                            a.this.a(a5);
                        }
                    } catch (Throwable th) {
                        LLog.d("BigImageDrawingHelper", "loadOriginBitmap failed: " + th.toString());
                    }
                }
            });
        }
    }

    public final c a(C1271a aVar, float f2, float f3) {
        if (f2 == 0.0f || f3 == 0.0f || aVar.f56944b == 0.0f || aVar.f56945c == 0.0f) {
            return null;
        }
        c cVar = new c(aVar);
        if (aVar.f56947e == q.b.f47440f) {
            cVar.f56953b = new Rect();
            cVar.f56954c = new Rect();
            if (f2 <= aVar.f56944b) {
                cVar.f56953b.left = 0;
                cVar.f56953b.right = (int) f2;
                cVar.f56954c.left = (int) ((aVar.f56944b - f2) / 2.0f);
                cVar.f56954c.right = (int) ((aVar.f56944b + f2) / 2.0f);
            } else {
                float f4 = (f2 - aVar.f56944b) / 2.0f;
                cVar.f56953b.left = (int) f4;
                cVar.f56953b.right = (int) (f2 - f4);
                cVar.f56954c.left = 0;
                cVar.f56954c.right = (int) aVar.f56944b;
            }
            if (f3 <= aVar.f56945c) {
                cVar.f56953b.top = 0;
                cVar.f56953b.bottom = (int) f3;
                cVar.f56954c.top = (int) ((aVar.f56945c - f3) / 2.0f);
                cVar.f56954c.bottom = (int) ((aVar.f56945c + f3) / 2.0f);
            } else {
                float f5 = (f3 - aVar.f56945c) / 2.0f;
                cVar.f56953b.top = (int) f5;
                cVar.f56953b.bottom = (int) (f3 - f5);
                cVar.f56954c.top = 0;
                cVar.f56954c.bottom = (int) aVar.f56945c;
            }
            float f6 = (float) (cVar.f56953b.right - cVar.f56953b.left);
            float f7 = (float) (cVar.f56953b.bottom - cVar.f56953b.top);
            cVar.f56952a = a(aVar.f56949g, f6, f7, f6, f7);
        } else if (aVar.f56947e == q.b.f47438d) {
            float f8 = aVar.f56944b / f2;
            float f9 = aVar.f56945c / f3;
            cVar.f56953b = new Rect();
            cVar.f56953b.top = 0;
            cVar.f56953b.bottom = (int) f3;
            cVar.f56953b.left = 0;
            cVar.f56953b.right = (int) f2;
            cVar.f56954c = new Rect();
            if (f8 <= f9) {
                float f10 = f8 * f3;
                cVar.f56954c.left = 0;
                cVar.f56954c.right = (int) aVar.f56944b;
                cVar.f56954c.top = (int) ((aVar.f56945c - f10) / 2.0f);
                cVar.f56954c.bottom = (int) ((aVar.f56945c + f10) / 2.0f);
            } else {
                float f11 = f9 * f2;
                cVar.f56954c.top = 0;
                cVar.f56954c.bottom = (int) aVar.f56945c;
                cVar.f56954c.left = (int) ((aVar.f56944b - f11) / 2.0f);
                cVar.f56954c.right = (int) ((aVar.f56944b + f11) / 2.0f);
            }
            cVar.f56952a = a(aVar.f56949g, (float) (cVar.f56954c.right - cVar.f56954c.left), (float) (cVar.f56954c.bottom - cVar.f56954c.top), f2, f3);
        } else if (aVar.f56947e == q.b.f47442h) {
            float f12 = aVar.f56944b / f2;
            float f13 = aVar.f56945c / f3;
            cVar.f56954c = new Rect();
            cVar.f56954c.top = 0;
            cVar.f56954c.bottom = (int) aVar.f56945c;
            cVar.f56954c.left = 0;
            cVar.f56954c.right = (int) aVar.f56944b;
            cVar.f56953b = new Rect();
            if (f12 >= f13) {
                float f14 = aVar.f56945c / f12;
                cVar.f56953b.left = 0;
                cVar.f56953b.right = (int) f2;
                cVar.f56953b.top = (int) ((f3 - f14) / 2.0f);
                cVar.f56953b.bottom = (int) ((f3 + f14) / 2.0f);
            } else {
                float f15 = aVar.f56944b / f13;
                cVar.f56953b.left = (int) ((f2 - f15) / 2.0f);
                cVar.f56953b.right = (int) ((f2 + f15) / 2.0f);
                cVar.f56953b.top = 0;
                cVar.f56953b.bottom = (int) f3;
            }
            cVar.f56952a = a(aVar.f56949g, aVar.f56944b, aVar.f56945c, (float) (cVar.f56953b.right - cVar.f56953b.left), (float) (cVar.f56953b.bottom - cVar.f56953b.top));
        } else {
            cVar.f56953b = new Rect(0, 0, (int) f2, (int) f3);
            cVar.f56954c = new Rect(0, 0, (int) aVar.f56944b, (int) aVar.f56945c);
            cVar.f56952a = a(aVar.f56949g, aVar.f56944b, aVar.f56945c, f2, f3);
        }
        if (this.f56931c) {
            cVar.f56952a = 1;
        }
        return cVar;
    }

    private static int a(Point point, float f2, float f3, float f4, float f5) {
        if (!(f5 == 0.0f || f4 == 0.0f)) {
            float min = Math.min(Math.min(f2 / f4, f3 / f5), Math.min(((float) point.x) / f4, ((float) point.y) / f5));
            int i2 = (int) (f4 * min);
            int i3 = (int) (min * f5);
            if (!(i2 == 0 || i3 == 0)) {
                float f6 = (float) i3;
                int i4 = 1;
                if (f5 > f6 || f4 > ((float) i2)) {
                    int round = Math.round(f5 / f6);
                    int round2 = Math.round(f4 / ((float) i2));
                    if (round >= round2) {
                        round = round2;
                    }
                    while (true) {
                        int i5 = i4 * 2;
                        if (i5 > round) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                return i4;
            }
        }
        return 32;
    }
}
