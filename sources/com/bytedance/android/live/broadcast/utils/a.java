package com.bytedance.android.live.broadcast.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.d.c;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.o.b;
import com.zhiliaoapp.musically.R;

public final class a extends HandlerThread implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f8612a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f8613b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f8614c = {R.drawable.bnf, R.drawable.bng, R.drawable.bnh, R.drawable.bni, R.drawable.bnj, R.drawable.bnk, R.drawable.bnl, R.drawable.bnm, R.drawable.bnn, R.drawable.bno, R.drawable.bnp, R.drawable.bnq, R.drawable.bnr, R.drawable.bns, R.drawable.bnt};

    /* renamed from: d  reason: collision with root package name */
    private Surface f8615d;

    /* renamed from: e  reason: collision with root package name */
    private C0131a f8616e;

    /* renamed from: f  reason: collision with root package name */
    private int f8617f = -1;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f8618g;

    /* renamed from: h  reason: collision with root package name */
    private Bitmap f8619h;

    /* renamed from: i  reason: collision with root package name */
    private Bitmap[] f8620i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f8621j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f8622k;

    /* renamed from: l  reason: collision with root package name */
    private int f8623l;

    /* renamed from: m  reason: collision with root package name */
    private Rect f8624m;
    private Rect n;
    private Rect o;
    private boolean p;

    /* renamed from: com.bytedance.android.live.broadcast.utils.a$a  reason: collision with other inner class name */
    public static class C0131a {

        /* renamed from: a  reason: collision with root package name */
        public String f8626a;

        /* renamed from: b  reason: collision with root package name */
        public int f8627b;

        /* renamed from: c  reason: collision with root package name */
        public int f8628c;

        static {
            Covode.recordClassIndex(4408);
        }
    }

    static {
        Covode.recordClassIndex(4406);
    }

    public final boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        Handler handler = this.f8613b;
        if (handler != null) {
            handler.sendEmptyMessage(235);
        }
        return quitSafely;
    }

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f8613b = new Handler(getLooper(), this);
        a();
        k.a().e().a(b.fromUri(this.f8616e.f8626a), (Object) null).a(new com.facebook.imagepipeline.f.b() {
            /* class com.bytedance.android.live.broadcast.utils.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4407);
            }

            @Override // com.facebook.d.b
            public final void onFailureImpl(c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                com.bytedance.android.live.core.c.a.a(6, "interact", "Fetch avatar bitmap failed");
            }

            @Override // com.facebook.imagepipeline.f.b
            public final void a(Bitmap bitmap) {
                MethodCollector.i(5974);
                if (bitmap == null) {
                    com.bytedance.android.live.core.c.a.a(6, "interact", "Fetch avatar bitmap null");
                    MethodCollector.o(5974);
                    return;
                }
                if (a.this.f8612a != null) {
                    a.this.f8612a.recycle();
                }
                a.this.f8612a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                a.this.a();
                MethodCollector.o(5974);
            }
        }, com.facebook.common.b.a.f47054a);
    }

    public final void a() {
        MethodCollector.i(6314);
        try {
            Bitmap bitmap = this.f8618g;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f8618g.recycle();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f8612a, this.f8616e.f8627b, this.f8616e.f8628c, false);
            this.f8618g = createScaledBitmap;
            NativeBlurFilter.iterativeBoxBlur(createScaledBitmap, 3, 10);
            Bitmap bitmap2 = this.f8619h;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f8619h.recycle();
            }
            int i2 = (int) (((float) this.f8616e.f8627b) * 0.41935483f);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(this.f8612a, i2, i2, false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight());
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawCircle((float) (createScaledBitmap2.getWidth() / 2), (float) (createScaledBitmap2.getHeight() / 2), (float) (createScaledBitmap2.getWidth() / 2), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(createScaledBitmap2, rect, rect, paint);
            this.f8619h = createBitmap;
            createScaledBitmap2.recycle();
            int length = this.f8614c.length;
            this.f8623l = length;
            this.f8620i = new Bitmap[length];
            Resources resources = y.e().getResources();
            for (int i3 = 0; i3 < this.f8623l; i3++) {
                this.f8620i[i3] = BitmapFactory.decodeResource(resources, this.f8614c[i3]);
            }
            Handler handler = this.f8613b;
            if (handler != null) {
                handler.sendEmptyMessage(233);
            }
            MethodCollector.o(6314);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a(6, "interact", e2.toString());
            MethodCollector.o(6314);
        }
    }

    public final boolean handleMessage(Message message) {
        Canvas lockCanvas;
        Bitmap bitmap;
        MethodCollector.i(6240);
        switch (message.what) {
            case 233:
                if (!this.p) {
                    try {
                        if (this.f8615d.isValid() && (lockCanvas = this.f8615d.lockCanvas(this.f8624m)) != null) {
                            if (this.f8618g.isRecycled() && (bitmap = this.f8612a) != null && !bitmap.isRecycled()) {
                                this.f8618g = Bitmap.createScaledBitmap(this.f8612a, this.f8616e.f8627b, this.f8616e.f8628c, false);
                            }
                            lockCanvas.drawBitmap(this.f8618g, (Rect) null, this.f8624m, (Paint) null);
                            lockCanvas.drawRect(this.f8624m, this.f8622k);
                            int i2 = this.f8617f;
                            if (i2 >= 0) {
                                Bitmap[] bitmapArr = this.f8620i;
                                this.f8617f = i2 + 1;
                                Bitmap bitmap2 = bitmapArr[i2];
                                if (bitmap2 != null && !bitmap2.isRecycled()) {
                                    lockCanvas.drawBitmap(bitmap2, (Rect) null, this.o, this.f8621j);
                                }
                                if (this.f8617f >= this.f8623l) {
                                    this.f8617f = -1;
                                }
                            }
                            Bitmap bitmap3 = this.f8619h;
                            if (bitmap3 != null && !bitmap3.isRecycled()) {
                                lockCanvas.drawBitmap(this.f8619h, (Rect) null, this.n, this.f8621j);
                            }
                            this.f8615d.unlockCanvasAndPost(lockCanvas);
                            Handler handler = this.f8613b;
                            if (handler != null) {
                                handler.sendEmptyMessageDelayed(233, 130);
                                break;
                            }
                        }
                    } catch (Exception e2) {
                        i.b();
                        com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e2.getStackTrace());
                    }
                }
                break;
            case 234:
                if (this.f8617f < 0) {
                    this.f8617f = 0;
                    break;
                }
                break;
            case 235:
                this.p = true;
                Bitmap bitmap4 = this.f8612a;
                if (bitmap4 != null && !bitmap4.isRecycled()) {
                    this.f8612a.recycle();
                    this.f8612a = null;
                }
                Bitmap bitmap5 = this.f8618g;
                if (bitmap5 != null && !bitmap5.isRecycled()) {
                    this.f8618g.recycle();
                    this.f8618g = null;
                }
                Bitmap bitmap6 = this.f8619h;
                if (bitmap6 != null && !bitmap6.isRecycled()) {
                    this.f8619h.recycle();
                    this.f8619h = null;
                }
                Bitmap[] bitmapArr2 = this.f8620i;
                if (bitmapArr2 != null) {
                    for (Bitmap bitmap7 : bitmapArr2) {
                        if (bitmap7 != null && !bitmap7.isRecycled()) {
                            bitmap7.recycle();
                        }
                    }
                    this.f8620i = null;
                }
                this.f8615d.release();
                this.f8615d = null;
                break;
        }
        MethodCollector.o(6240);
        return true;
    }

    public a(Surface surface, C0131a aVar) {
        super("AudioEffectDrewThread");
        MethodCollector.i(6221);
        this.f8615d = surface;
        this.f8616e = aVar;
        this.f8624m = new Rect(0, 0, aVar.f8627b, aVar.f8628c);
        int i2 = (int) (((float) aVar.f8627b) * 0.41935483f);
        int i3 = (aVar.f8627b - i2) / 2;
        int i4 = (aVar.f8628c - i2) / 2;
        this.n = new Rect(i3, i4, i3 + i2, i2 + i4);
        int i5 = (int) (((float) aVar.f8627b) * 0.5645161f);
        int i6 = (aVar.f8627b - i5) / 2;
        int i7 = (aVar.f8628c - i5) / 2;
        this.o = new Rect(i6, i7, i6 + i5, i5 + i7);
        Paint paint = new Paint(1);
        this.f8621j = paint;
        paint.setAntiAlias(true);
        this.f8621j.setFilterBitmap(true);
        this.f8621j.setDither(true);
        Paint paint2 = new Paint(1);
        this.f8622k = paint2;
        paint2.setAntiAlias(true);
        this.f8622k.setFilterBitmap(true);
        this.f8622k.setDither(true);
        this.f8622k.setColor(Color.parseColor("#80000000"));
        this.f8612a = BitmapFactory.decodeResource(y.e().getResources(), R.drawable.bx4);
        MethodCollector.o(6221);
    }
}
