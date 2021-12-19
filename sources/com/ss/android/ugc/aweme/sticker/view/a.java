package com.ss.android.ugc.aweme.sticker.view;

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
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.f.b;
import com.ss.android.ugc.aweme.editSticker.g;
import com.ss.android.ugc.aweme.editSticker.interact.view.e;
import com.ss.android.ugc.aweme.editSticker.interact.view.f;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.tools.c;
import java.lang.reflect.Field;

public class a extends FrameLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    protected RectF f136185a;

    /* renamed from: b  reason: collision with root package name */
    protected Paint f136186b;

    /* renamed from: c  reason: collision with root package name */
    protected int f136187c;

    /* renamed from: d  reason: collision with root package name */
    protected RectF f136188d;

    /* renamed from: e  reason: collision with root package name */
    PointF[] f136189e;

    /* renamed from: f  reason: collision with root package name */
    protected f f136190f;

    /* renamed from: g  reason: collision with root package name */
    private int f136191g;

    /* renamed from: h  reason: collision with root package name */
    private int f136192h;

    /* renamed from: i  reason: collision with root package name */
    private int f136193i;

    /* renamed from: j  reason: collision with root package name */
    private DashPathEffect f136194j;

    /* renamed from: k  reason: collision with root package name */
    private int f136195k;

    /* renamed from: l  reason: collision with root package name */
    private Vibrator f136196l;

    /* renamed from: m  reason: collision with root package name */
    private int f136197m;
    private int n;
    private boolean o;

    static {
        Covode.recordClassIndex(88947);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public View getContentView() {
        return this;
    }

    public int getDeltaX() {
        return this.f136187c;
    }

    public boolean getEnableFakeFeedView() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final boolean a(PointF[] pointFArr, float f2) {
        if (pointFArr == null) {
            return true;
        }
        RectF a2 = b.a(pointFArr);
        if (a2.isEmpty()) {
            return true;
        }
        a2.offset((float) this.f136187c, 0.0f);
        if (this.f136185a == null) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f2, a2.centerX(), a2.centerY());
        matrix.mapRect(a2);
        return this.f136185a.contains(a2);
    }

    public void a(Canvas canvas) {
        canvas.drawLine(0.0f, this.f136185a.top, (float) getWidth(), this.f136185a.top, this.f136186b);
    }

    public boolean a() {
        return Math.abs(this.f136188d.top - this.f136185a.top) < 2.0f;
    }

    private boolean d() {
        if ((this.f136197m & 128) == 128) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if ((this.f136197m & 256) == 256) {
            return true;
        }
        return false;
    }

    private boolean f() {
        if ((this.f136197m & 512) == 512) {
            return true;
        }
        return false;
    }

    private boolean g() {
        if ((this.f136197m & 64) == 64) {
            return true;
        }
        return false;
    }

    public static int getTbMargin() {
        return (int) n.b(com.ss.android.ugc.aweme.df.b.a(), 201.0f);
    }

    private boolean h() {
        if ((this.f136197m & 8) == 8) {
            return true;
        }
        return false;
    }

    private boolean i() {
        if ((this.f136197m & 4) == 4) {
            return true;
        }
        return false;
    }

    private boolean j() {
        if ((this.f136197m & 2) == 2) {
            return true;
        }
        return false;
    }

    private boolean k() {
        if ((this.f136197m & 1) == 1) {
            return true;
        }
        return false;
    }

    private void l() {
        Vibrator vibrator = this.f136196l;
        if (vibrator != null) {
            try {
                vibrator.vibrate(30);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final void c() {
        int i2 = this.n & -49;
        this.n = i2;
        this.f136197m = i2 & this.f136197m;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public float getLeftViewXMargin() {
        if (c.a(getContext())) {
            return (float) this.f136193i;
        }
        return n.b(getContext(), 8.0f);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final void b() {
        d(false);
        c(false);
        a(false);
        b(false);
        e(false);
        f(false);
        g(false);
        h(false);
        i(false);
        j(false);
        f fVar = this.f136190f;
        if (fVar != null && this.o) {
            fVar.b(false);
            this.f136190f.a(false);
            this.f136190f.c(false);
        }
    }

    /* access modifiers changed from: protected */
    public float getRightViewXMargin() {
        if (c.a(getContext())) {
            return ((float) dh.b(getContext())) - n.b(getContext(), 8.0f);
        }
        return (float) (dh.b(getContext()) - this.f136193i);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        if (!com.ss.android.ugc.asve.f.b.f62083b) {
            c(getContext());
        }
        Context context = getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dh.b(getContext()), a(getContext()));
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        if (!com.ss.android.ugc.asve.f.b.f62083b) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dh.b(getContext()), a(getContext()));
            layoutParams2.gravity = 1;
            f fVar = this.f136190f;
            if (fVar != null && this.o) {
                fVar.getContentView().setLayoutParams(layoutParams2);
            }
        }
        b(context);
    }

    public void setDeltaX(int i2) {
        this.f136187c = i2;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public void setEnableFakeFeedView(boolean z) {
        this.o = z;
    }

    public a(Context context) {
        this(context, null);
    }

    public static int a(Context context) {
        int i2;
        if (g.f88154a != null) {
            i2 = g.f88154a.d();
        } else {
            i2 = 0;
        }
        return dh.a(context) - i2;
    }

    private void b(boolean z) {
        if (z) {
            if (!d()) {
                l();
            }
            this.f136197m |= 128;
        } else {
            this.f136197m &= -129;
        }
        postInvalidate();
    }

    private void c(boolean z) {
        if (z) {
            if (!f()) {
                l();
            }
            this.f136197m |= 512;
        } else {
            this.f136197m &= -513;
        }
        postInvalidate();
    }

    private void d(boolean z) {
        if (z) {
            if (!e()) {
                l();
            }
            this.f136197m |= 256;
        } else {
            this.f136197m &= -257;
        }
        postInvalidate();
    }

    private void e(boolean z) {
        if (z) {
            this.f136197m |= 32;
        } else {
            this.f136197m &= -33;
        }
        postInvalidate();
    }

    private void f(boolean z) {
        if (z) {
            this.f136197m |= 16;
        } else {
            this.f136197m &= -17;
        }
        postInvalidate();
    }

    private void g(boolean z) {
        if (z) {
            if (!h()) {
                l();
            }
            this.f136197m |= 8;
        } else {
            this.f136197m &= -9;
        }
        postInvalidate();
    }

    private void h(boolean z) {
        if (z) {
            if (!i()) {
                l();
            }
            this.f136197m |= 4;
        } else {
            this.f136197m &= -5;
        }
        postInvalidate();
    }

    private void i(boolean z) {
        if (z) {
            if (!j()) {
                l();
            }
            this.f136197m |= 2;
        } else {
            this.f136197m &= -3;
        }
        postInvalidate();
    }

    private void j(boolean z) {
        if (z) {
            if (!k()) {
                l();
            }
            this.f136197m |= 1;
        } else {
            this.f136197m &= -2;
        }
        postInvalidate();
    }

    private void a(boolean z) {
        if (z) {
            if (!g()) {
                l();
            }
            this.f136197m |= 64;
        } else {
            this.f136197m &= -65;
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void c(Context context) {
        if (this.f136190f == null && this.o) {
            this.f136190f = new d(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dh.b(getContext()), a(context));
            layoutParams.gravity = 1;
            this.f136190f.getContentView().setLayoutParams(layoutParams);
            addView(this.f136190f.getContentView());
        }
    }

    public void b(Context context) {
        if (this.f136185a == null) {
            this.f136185a = new RectF(getLeftViewXMargin(), (float) (-dh.a(getContext())), getRightViewXMargin(), (float) (a(context) - this.f136195k));
        }
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

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final PointF a(PointF[] pointFArr) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a2 = b.a(pointFArr);
        a2.offset((float) this.f136187c, 0.0f);
        PointF pointF = new PointF();
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        if (a2.right - this.f136185a.right > 0.0f) {
            pointF.x = this.f136185a.right - a2.right;
        }
        if (a2.left - this.f136185a.left < 0.0f) {
            pointF.x = this.f136185a.left - a2.left;
        }
        if (a2.bottom - this.f136185a.bottom > 0.0f) {
            pointF.y = this.f136185a.bottom - a2.bottom;
        }
        return pointF;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        RectF rectF;
        RectF rectF2;
        MethodCollector.i(4591);
        super.onDraw(canvas);
        this.f136186b.setPathEffect(null);
        if (f()) {
            a(canvas);
        }
        if (e()) {
            canvas.drawLine(this.f136185a.left, 0.0f, this.f136185a.left, (float) getHeight(), this.f136186b);
        }
        if (d()) {
            canvas.drawLine(this.f136185a.right, 0.0f, this.f136185a.right, (float) getHeight(), this.f136186b);
        }
        if (g()) {
            canvas.drawLine(0.0f, this.f136185a.bottom, (float) getWidth(), this.f136185a.bottom, this.f136186b);
        }
        if ((this.f136197m & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.drawLine(0.0f, ((float) getHeight()) / 2.0f, (float) getWidth(), ((float) getHeight()) / 2.0f, this.f136186b);
        }
        if ((this.f136197m & 16) == 16) {
            canvas.drawLine(((float) getWidth()) / 2.0f, 0.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.f136186b);
        }
        this.f136186b.setPathEffect(this.f136194j);
        if (h() && (rectF2 = this.f136188d) != null) {
            canvas.drawLine(0.0f, rectF2.centerY(), (float) getWidth(), this.f136188d.centerY(), this.f136186b);
        }
        if (i() && (rectF = this.f136188d) != null) {
            canvas.drawLine(rectF.centerX(), 0.0f, this.f136188d.centerX(), (float) getHeight(), this.f136186b);
        }
        if (j() && this.f136188d != null) {
            canvas.drawLine(0.0f, ((float) getHeight()) - ((((float) getHeight()) - this.f136188d.centerY()) + this.f136188d.centerX()), this.f136188d.centerX() + (((float) getHeight()) - this.f136188d.centerY()), (float) getHeight(), this.f136186b);
        }
        if (k() && this.f136188d != null) {
            canvas.drawLine((float) getWidth(), ((float) getHeight()) - ((((float) getWidth()) - this.f136188d.centerX()) + (((float) getHeight()) - this.f136188d.centerY())), ((float) getWidth()) - ((((float) getWidth()) - this.f136188d.centerX()) + (((float) getHeight()) - this.f136188d.centerY())), (float) getHeight(), this.f136186b);
        }
        MethodCollector.o(4591);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final int a(PointF[] pointFArr, boolean z) {
        return a(pointFArr, z, false, false, false, false);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4136);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(4136);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, null);
        MethodCollector.i(4124);
        this.f136191g = 4;
        this.f136192h = -16717825;
        this.f136186b = new Paint();
        this.f136188d = new RectF();
        this.f136197m = 0;
        this.n = -1;
        this.o = true;
        this.f136191g = (int) n.b(context, 1.5f);
        this.f136193i = (int) n.b(context, 56.0f);
        this.f136186b.setColor(this.f136192h);
        this.f136186b.setAntiAlias(true);
        this.f136186b.setStyle(Paint.Style.STROKE);
        this.f136186b.setStrokeWidth((float) this.f136191g);
        setWillNotDraw(false);
        this.f136195k = (int) n.b(context, 201.0f);
        this.f136194j = new DashPathEffect(new float[]{n.b(context, 2.0f), n.b(context, 1.0f)}, 0.0f);
        this.f136196l = (Vibrator) a(context, "vibrator");
        MethodCollector.o(4124);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final boolean b(PointF[] pointFArr, float f2) {
        if (pointFArr == null) {
            return true;
        }
        RectF a2 = b.a(pointFArr);
        if (a2.isEmpty()) {
            return true;
        }
        a2.offset((float) this.f136187c, 0.0f);
        if (this.f136185a == null || f2 < 1.0f) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f2, a2.centerX(), a2.centerY());
        matrix.mapRect(a2);
        return this.f136185a.contains(a2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public boolean b(PointF[] pointFArr, float f2, float f3) {
        if (pointFArr == null) {
            return true;
        }
        RectF a2 = b.a(pointFArr);
        if (a2.isEmpty()) {
            return true;
        }
        a2.offset(((float) this.f136187c) + f2, f3);
        RectF rectF = this.f136185a;
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
        RectF a2 = b.a(pointFArr);
        a2.offset((float) this.f136187c, 0.0f);
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

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final void a(float f2, float f3, float f4) {
        if (f2 == Float.MIN_VALUE) {
            f2 = (float) (-getHeight());
        }
        if (f3 == Float.MIN_VALUE) {
            f3 = getRightViewXMargin();
        }
        if (f4 == Float.MIN_VALUE) {
            f4 = (float) (a(getContext()) - this.f136195k);
        }
        this.f136185a = new RectF(0.0f, f2, f3, f4);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e
    public final int a(PointF[] pointFArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        int i3 = -1;
        if (pointFArr == null) {
            return -1;
        }
        RectF a2 = b.a(pointFArr);
        this.f136188d = a2;
        if (a2.isEmpty()) {
            return -1;
        }
        this.f136188d.offset((float) this.f136187c, 0.0f);
        this.f136189e = pointFArr;
        if (this.f136185a == null) {
            return -1;
        }
        if (!z3 || !a()) {
            c(false);
        } else {
            c(true);
        }
        if (!z2 || Math.abs(this.f136188d.left - this.f136185a.left) >= 2.0f) {
            d(false);
        } else {
            d(true);
        }
        if (!z4 || Math.abs(this.f136188d.right - this.f136185a.right) >= 2.0f) {
            b(false);
        } else {
            b(true);
        }
        if (!z5 || Math.abs(this.f136188d.bottom - this.f136185a.bottom) >= 2.0f) {
            a(false);
        } else {
            a(true);
        }
        if (!c.a(getContext()) ? this.f136188d.right >= this.f136185a.right || Math.abs(this.f136188d.right - this.f136185a.right) < 2.0f : this.f136188d.left <= this.f136185a.left || Math.abs(this.f136188d.left - this.f136185a.left) < 2.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f136188d.bottom >= this.f136185a.bottom || Math.abs(this.f136188d.bottom - this.f136185a.bottom) < 2.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f136188d.top <= this.f136185a.top || Math.abs(this.f136188d.top - this.f136185a.top) < 2.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z6 || z7 || z8) {
            c(getContext());
        }
        f fVar = this.f136190f;
        if (fVar != null && this.o) {
            fVar.a(z6);
            this.f136190f.b(z7);
            this.f136190f.c(z8);
        }
        if (z) {
            int round = Math.round((float) ((Math.atan((double) ((pointFArr[1].y - pointFArr[0].y) / (pointFArr[1].x - pointFArr[0].x))) / 3.141592653589793d) * 180.0d));
            float f2 = (float) round;
            if (Math.abs(f2 - 0.0f) < 1.0f) {
                g(true);
                i3 = 4;
            } else {
                g(false);
            }
            if (Math.abs(((float) Math.abs(round)) - 90.0f) < 1.0f) {
                h(true);
                i3 = 4;
            } else {
                h(false);
            }
            if (Math.abs(f2 - 45.0f) < 1.0f) {
                i(true);
                i2 = 4;
            } else {
                i(false);
                i2 = i3;
            }
            if (Math.abs(f2 - -45.0f) < 1.0f) {
                j(true);
                return 4;
            }
            j(false);
            return i2;
        }
        if (Math.abs(((Math.abs(this.f136188d.bottom - this.f136188d.top) / 2.0f) + this.f136188d.top) - (((float) getHeight()) / 2.0f)) >= 2.0f || (this.n & 32) == 0) {
            e(false);
        } else {
            e(true);
            i3 = 3;
        }
        if (Math.abs(((Math.abs(this.f136188d.right - this.f136188d.left) / 2.0f) + this.f136188d.left) - (((float) getWidth()) / 2.0f)) >= 2.0f || (this.n & 16) == 0) {
            f(false);
            return i3;
        }
        f(true);
        return 3;
    }
}
