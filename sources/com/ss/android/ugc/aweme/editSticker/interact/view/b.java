package com.ss.android.ugc.aweme.editSticker.interact.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Field;

public final class b extends FrameLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f88198a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f88199b;

    /* renamed from: c  reason: collision with root package name */
    private final int f88200c;

    /* renamed from: d  reason: collision with root package name */
    private RectF f88201d;

    /* renamed from: e  reason: collision with root package name */
    private final int f88202e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f88203f;

    /* renamed from: g  reason: collision with root package name */
    private final DashPathEffect f88204g;

    /* renamed from: h  reason: collision with root package name */
    private final float f88205h;

    /* renamed from: i  reason: collision with root package name */
    private int f88206i;

    /* renamed from: j  reason: collision with root package name */
    private RectF f88207j;

    /* renamed from: k  reason: collision with root package name */
    private final Vibrator f88208k;

    /* renamed from: l  reason: collision with root package name */
    private int f88209l;

    /* renamed from: m  reason: collision with root package name */
    private final h f88210m;
    private boolean n;

    static {
        Covode.recordClassIndex(55444);
    }

    private final f getMFakeFeedView() {
        return (f) this.f88210m.getValue();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final void a(float f2, float f3, float f4) {
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final void c() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55446);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final View getContentView() {
        return this;
    }

    public final int getDeltaX() {
        return this.f88206i;
    }

    public final boolean getEnableFakeFeedView() {
        return this.n;
    }

    private final boolean d() {
        if ((this.f88209l & 128) == 128) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        if ((this.f88209l & 256) == 256) {
            return true;
        }
        return false;
    }

    private final boolean f() {
        if ((this.f88209l & 64) == 64) {
            return true;
        }
        return false;
    }

    private final boolean g() {
        if ((this.f88209l & 8) == 8) {
            return true;
        }
        return false;
    }

    private final boolean h() {
        if ((this.f88209l & 4) == 4) {
            return true;
        }
        return false;
    }

    private final boolean i() {
        if ((this.f88209l & 2) == 2) {
            return true;
        }
        return false;
    }

    private final boolean j() {
        if ((this.f88209l & 1) == 1) {
            return true;
        }
        return false;
    }

    private final void k() {
        Vibrator vibrator = this.f88208k;
        if (vibrator != null) {
            try {
                vibrator.vibrate(30);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.b$b  reason: collision with other inner class name */
    static final class C2140b extends m implements h.f.a.a<f> {
        final /* synthetic */ Context $context;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(55447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2140b(b bVar, Context context) {
            super(0);
            this.this$0 = bVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            d dVar = d.c().f88098e;
            if (dVar == null) {
                return null;
            }
            f a2 = dVar.a(this.$context);
            this.this$0.addView(a2.getContentView());
            return a2;
        }
    }

    private final float getLeftViewXMargin() {
        Context context = getContext();
        l.b(context, "");
        if (r.c(context)) {
            return (float) this.f88202e;
        }
        Context context2 = getContext();
        l.b(context2, "");
        return r.a(context2, 8.0f);
    }

    private final float getRightViewXMargin() {
        Context context = getContext();
        l.b(context, "");
        if (!r.c(context)) {
            return (float) (getWidth() - this.f88202e);
        }
        Context context2 = getContext();
        l.b(context2, "");
        return ((float) getWidth()) - r.a(context2, 8.0f);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final void b() {
        c(false);
        a(false);
        b(false);
        d(false);
        e(false);
        f(false);
        g(false);
        h(false);
        i(false);
        f mFakeFeedView = getMFakeFeedView();
        if (mFakeFeedView != null) {
            mFakeFeedView.b(false);
        }
        f mFakeFeedView2 = getMFakeFeedView();
        if (mFakeFeedView2 != null) {
            mFakeFeedView2.a(false);
        }
        f mFakeFeedView3 = getMFakeFeedView();
        if (mFakeFeedView3 != null) {
            mFakeFeedView3.c(false);
        }
    }

    public final void a() {
        b();
        l.b(getContext(), "");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f88201d = new RectF(getLeftViewXMargin(), 0.0f, getRightViewXMargin(), ((float) getHeight()) - this.f88205h);
    }

    public final void setDeltaX(int i2) {
        this.f88206i = i2;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final void setEnableFakeFeedView(boolean z) {
        this.n = z;
    }

    private final void a(boolean z) {
        int i2;
        if (z) {
            if (!f()) {
                k();
            }
            i2 = this.f88209l | 64;
        } else {
            i2 = this.f88209l & -65;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    private final void b(boolean z) {
        int i2;
        if (z) {
            if (!d()) {
                k();
            }
            i2 = this.f88209l | 128;
        } else {
            i2 = this.f88209l & -129;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    private final void c(boolean z) {
        int i2;
        if (z) {
            if (!e()) {
                k();
            }
            i2 = this.f88209l | 256;
        } else {
            i2 = this.f88209l & -257;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    private final void d(boolean z) {
        int i2;
        if (z) {
            i2 = this.f88209l | 32;
        } else {
            i2 = this.f88209l & -33;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    private final void e(boolean z) {
        int i2;
        if (z) {
            i2 = this.f88209l | 16;
        } else {
            i2 = this.f88209l & -17;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    private final void f(boolean z) {
        int i2;
        if (z) {
            if (!g()) {
                k();
            }
            i2 = this.f88209l | 8;
        } else {
            i2 = this.f88209l & -9;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    private final void g(boolean z) {
        int i2;
        if (z) {
            if (!h()) {
                k();
            }
            i2 = this.f88209l | 4;
        } else {
            i2 = this.f88209l & -5;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    private final void h(boolean z) {
        int i2;
        if (z) {
            if (!i()) {
                k();
            }
            i2 = this.f88209l | 2;
        } else {
            i2 = this.f88209l & -3;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    private final void i(boolean z) {
        int i2;
        if (z) {
            if (!j()) {
                k();
            }
            i2 = this.f88209l | 1;
        } else {
            i2 = this.f88209l & -2;
        }
        this.f88209l = i2;
        postInvalidate();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final float a(float f2) {
        if (Math.abs(f2 - 0.0f) < 1.0f) {
            return 0.0f;
        }
        if (Math.abs(Math.abs(f2) - 90.0f) < 1.0f) {
            return 90.0f;
        }
        if (Math.abs(f2 - 45.0f) < 1.0f) {
            return 45.0f;
        }
        if (Math.abs(f2 - -45.0f) < 1.0f) {
            return -45.0f;
        }
        return f2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null);
        l.d(context, "");
        MethodCollector.i(4134);
        this.f88199b = 4;
        this.f88200c = -16717825;
        Paint paint = new Paint();
        this.f88203f = paint;
        this.f88207j = new RectF();
        this.f88210m = i.a((h.f.a.a) new C2140b(this, context));
        this.f88199b = (int) r.a(context, 1.5f);
        this.f88202e = (int) r.a(context, 56.0f);
        paint.setColor(-16717825);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) this.f88199b);
        setWillNotDraw(false);
        this.f88205h = r.a(context, 201.0f);
        this.f88204g = new DashPathEffect(new float[]{r.a(context, 2.0f), r.a(context, 1.0f)}, 0.0f);
        Object a2 = a(context, "vibrator");
        if (a2 != null) {
            this.f88208k = (Vibrator) a2;
            post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.editSticker.interact.view.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f88211a;

                static {
                    Covode.recordClassIndex(55445);
                }

                {
                    this.f88211a = r1;
                }

                public final void run() {
                    this.f88211a.a();
                }
            });
            this.n = true;
            MethodCollector.o(4134);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        MethodCollector.o(4134);
        throw nullPointerException;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final PointF a(PointF[] pointFArr) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(pointFArr);
        a2.offset(0.0f, 0.0f);
        PointF pointF = new PointF();
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        float f2 = a2.right;
        RectF rectF = this.f88201d;
        if (rectF == null) {
            l.b();
        }
        if (f2 - rectF.right > 0.0f) {
            RectF rectF2 = this.f88201d;
            if (rectF2 == null) {
                l.b();
            }
            pointF.x = rectF2.right - a2.right;
        }
        float f3 = a2.left;
        RectF rectF3 = this.f88201d;
        if (rectF3 == null) {
            l.b();
        }
        if (f3 - rectF3.left < 0.0f) {
            RectF rectF4 = this.f88201d;
            if (rectF4 == null) {
                l.b();
            }
            pointF.x = rectF4.left - a2.left;
        }
        float f4 = a2.bottom;
        RectF rectF5 = this.f88201d;
        if (rectF5 == null) {
            l.b();
        }
        if (f4 - rectF5.bottom > 0.0f) {
            RectF rectF6 = this.f88201d;
            if (rectF6 == null) {
                l.b();
            }
            pointF.y = rectF6.bottom - a2.bottom;
        }
        return pointF;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        boolean z;
        RectF rectF;
        RectF rectF2;
        MethodCollector.i(4128);
        l.d(canvas, "");
        super.onDraw(canvas);
        this.f88203f.setPathEffect(null);
        if (e()) {
            canvas.drawLine(getLeftViewXMargin(), 0.0f, getLeftViewXMargin(), (float) getHeight(), this.f88203f);
        }
        if (d()) {
            canvas.drawLine(getRightViewXMargin(), 0.0f, getRightViewXMargin(), (float) getHeight(), this.f88203f);
        }
        if (f()) {
            canvas.drawLine(0.0f, ((float) getHeight()) - this.f88205h, (float) getWidth(), ((float) getHeight()) - this.f88205h, this.f88203f);
        }
        if ((this.f88209l & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.drawLine(0.0f, ((float) getHeight()) / 2.0f, (float) getWidth(), ((float) getHeight()) / 2.0f, this.f88203f);
        }
        if ((this.f88209l & 16) == 16) {
            canvas.drawLine(((float) getWidth()) / 2.0f, 0.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.f88203f);
        }
        this.f88203f.setPathEffect(this.f88204g);
        if (g() && (rectF2 = this.f88207j) != null) {
            float centerY = rectF2.centerY();
            float width = (float) getWidth();
            RectF rectF3 = this.f88207j;
            if (rectF3 == null) {
                l.b();
            }
            canvas.drawLine(0.0f, centerY, width, rectF3.centerY(), this.f88203f);
        }
        if (h() && (rectF = this.f88207j) != null) {
            float centerX = rectF.centerX();
            RectF rectF4 = this.f88207j;
            if (rectF4 == null) {
                l.b();
            }
            canvas.drawLine(centerX, 0.0f, rectF4.centerX(), (float) getHeight(), this.f88203f);
        }
        if (i() && this.f88207j != null) {
            float height = (float) getHeight();
            float height2 = (float) getHeight();
            RectF rectF5 = this.f88207j;
            if (rectF5 == null) {
                l.b();
            }
            float centerY2 = height2 - rectF5.centerY();
            RectF rectF6 = this.f88207j;
            if (rectF6 == null) {
                l.b();
            }
            float centerX2 = height - (centerY2 + rectF6.centerX());
            RectF rectF7 = this.f88207j;
            if (rectF7 == null) {
                l.b();
            }
            float centerX3 = rectF7.centerX();
            float height3 = (float) getHeight();
            RectF rectF8 = this.f88207j;
            if (rectF8 == null) {
                l.b();
            }
            canvas.drawLine(0.0f, centerX2, centerX3 + (height3 - rectF8.centerY()), (float) getHeight(), this.f88203f);
        }
        if (j() && this.f88207j != null) {
            float width2 = (float) getWidth();
            float height4 = (float) getHeight();
            float width3 = (float) getWidth();
            RectF rectF9 = this.f88207j;
            if (rectF9 == null) {
                l.b();
            }
            float centerX4 = width3 - rectF9.centerX();
            float height5 = (float) getHeight();
            RectF rectF10 = this.f88207j;
            if (rectF10 == null) {
                l.b();
            }
            float centerY3 = height4 - (centerX4 + (height5 - rectF10.centerY()));
            float width4 = (float) getWidth();
            float width5 = (float) getWidth();
            RectF rectF11 = this.f88207j;
            if (rectF11 == null) {
                l.b();
            }
            float centerX5 = width5 - rectF11.centerX();
            float height6 = (float) getHeight();
            RectF rectF12 = this.f88207j;
            if (rectF12 == null) {
                l.b();
            }
            canvas.drawLine(width2, centerY3, width4 - (centerX5 + (height6 - rectF12.centerY())), (float) getHeight(), this.f88203f);
        }
        MethodCollector.o(4128);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final int a(PointF[] pointFArr, boolean z) {
        return a(pointFArr, z, false, false, false, false);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4137);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(4137);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final boolean b(PointF[] pointFArr, float f2) {
        if (pointFArr == null) {
            return true;
        }
        RectF a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(pointFArr);
        l.b(a2, "");
        if (a2.isEmpty()) {
            return true;
        }
        a2.offset((float) this.f88206i, 0.0f);
        if (this.f88201d == null || f2 < 1.0f) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f2, a2.centerX(), a2.centerY());
        matrix.mapRect(a2);
        RectF rectF = this.f88201d;
        if (rectF == null) {
            l.b();
        }
        return rectF.contains(a2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final boolean a(PointF[] pointFArr, float f2) {
        if (pointFArr == null) {
            return true;
        }
        RectF a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(pointFArr);
        l.b(a2, "");
        if (a2.isEmpty()) {
            return true;
        }
        a2.offset((float) this.f88206i, 0.0f);
        if (this.f88201d == null) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f2, a2.centerX(), a2.centerY());
        matrix.mapRect(a2);
        RectF rectF = this.f88201d;
        if (rectF == null) {
            l.b();
        }
        return rectF.contains(a2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final boolean b(PointF[] pointFArr, float f2, float f3) {
        if (pointFArr == null) {
            return true;
        }
        RectF a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(pointFArr);
        l.b(a2, "");
        if (a2.isEmpty()) {
            return true;
        }
        a2.offset(((float) this.f88206i) + f2, f3);
        RectF rectF = this.f88201d;
        if (rectF == null) {
            return true;
        }
        return rectF.contains(a2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final PointF a(PointF[] pointFArr, float f2, float f3) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(pointFArr);
        a2.offset(f2, 0.0f);
        PointF pointF = new PointF();
        pointF.x = f2;
        pointF.y = f3;
        if (Math.abs(((Math.abs(a2.bottom - a2.top) / 2.0f) + a2.top) - (((float) getHeight()) / 2.0f)) < 1.0f) {
            pointF.y = (((float) getHeight()) / 2.0f) - (((a2.bottom - a2.top) / 2.0f) + a2.top);
        }
        if (Math.abs(((Math.abs(a2.right - a2.left) / 2.0f) + a2.left) - (((float) getWidth()) / 2.0f)) < 1.0f) {
            pointF.x = (((float) getWidth()) / 2.0f) - (((a2.right - a2.left) / 2.0f) + a2.left);
        }
        return pointF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d2, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        if (java.lang.Math.abs(r1 - r0.left) < 2.0f) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ce, code lost:
        if (java.lang.Math.abs(r1 - r0.right) < 2.0f) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ad  */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.graphics.PointF[] r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.interact.view.b.a(android.graphics.PointF[], boolean, boolean, boolean, boolean, boolean):int");
    }
}
