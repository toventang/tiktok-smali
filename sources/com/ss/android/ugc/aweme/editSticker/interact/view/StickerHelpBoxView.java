package com.ss.android.ugc.aweme.editSticker.interact.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.o;
import com.ss.android.ugc.tools.utils.r;

public class StickerHelpBoxView extends View {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f88185a = false;

    /* renamed from: b  reason: collision with root package name */
    private Context f88186b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f88187c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    private RectF f88188d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private Paint f88189e = new Paint();

    /* renamed from: f  reason: collision with root package name */
    private RectF f88190f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private Paint f88191g = new Paint();

    /* renamed from: h  reason: collision with root package name */
    private int[] f88192h = new int[2];

    /* renamed from: i  reason: collision with root package name */
    private int f88193i = 10;

    /* renamed from: j  reason: collision with root package name */
    private int f88194j = 10;

    /* renamed from: k  reason: collision with root package name */
    private int f88195k = 10;

    /* renamed from: l  reason: collision with root package name */
    private int f88196l = 10;

    /* renamed from: m  reason: collision with root package name */
    private float f88197m;
    private float n;
    private boolean o = false;
    private Paint p;
    private PointF[] q = {new PointF(), new PointF(), new PointF(), new PointF()};
    private a r;

    public interface a {
        static {
            Covode.recordClassIndex(55442);
        }

        void a(boolean z, boolean z2);
    }

    static {
        Covode.recordClassIndex(55441);
    }

    public PointF[] getFourAnglePoint() {
        return this.q;
    }

    public RectF getHelpBoxRect() {
        return this.f88188d;
    }

    public float getRotateAngle() {
        return this.f88197m;
    }

    public RectF getViewBoxRect() {
        return this.f88190f;
    }

    public final void b() {
        if (!this.f88185a) {
            this.f88185a = true;
            invalidate();
            a aVar = this.r;
            if (aVar != null) {
                aVar.a(true, false);
            }
        }
    }

    public RectF getRectOnWindow() {
        return new RectF(this.f88188d.left + ((float) this.f88192h[0]), this.f88188d.top + ((float) this.f88192h[1]), this.f88188d.right + ((float) this.f88192h[0]), this.f88188d.bottom + ((float) this.f88192h[1]));
    }

    public final void a() {
        RectF rectF = new RectF(this.f88187c);
        o.a(rectF, this.n);
        if (this.o) {
            this.f88190f.set(rectF.left - ((float) this.f88194j), rectF.top - ((float) this.f88195k), rectF.right + ((float) this.f88194j), rectF.bottom + ((float) this.f88195k));
        } else {
            this.f88190f.set(rectF);
        }
        this.f88188d.set(this.f88190f.left - ((float) this.f88193i), this.f88190f.top - ((float) this.f88193i), this.f88190f.right + ((float) this.f88193i), this.f88190f.bottom + ((float) this.f88193i));
        this.q[0].x = this.f88190f.left;
        this.q[0].y = this.f88190f.top;
        this.q[1].x = this.f88190f.right;
        this.q[1].y = this.f88190f.top;
        this.q[2].x = this.f88190f.left;
        this.q[2].y = this.f88190f.bottom;
        this.q[3].x = this.f88190f.right;
        this.q[3].y = this.f88190f.bottom;
        for (PointF pointF : this.q) {
            o.a(pointF, this.f88188d.centerX(), this.f88188d.centerY(), (float) Math.toRadians((double) this.f88197m));
        }
    }

    public void setStickerShowHelpboxCallback(a aVar) {
        this.r = aVar;
    }

    public void setmWindowPadding(int[] iArr) {
        this.f88192h = iArr;
    }

    public void setHelpBoxColor(int i2) {
        this.f88189e.setColor(i2);
    }

    public void setHelpBoxPadding(int i2) {
        this.f88193i = i2;
        invalidate();
    }

    public void setShowBg(boolean z) {
        this.o = z;
        invalidate();
    }

    public final void a(Rect rect) {
        this.f88187c.set(rect);
    }

    public final void a(boolean z) {
        if (this.f88185a) {
            this.f88185a = false;
            invalidate();
            a aVar = this.r;
            if (aVar != null) {
                aVar.a(false, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(4741);
        super.onDraw(canvas);
        a();
        canvas.save();
        canvas.rotate(this.f88197m, this.f88187c.centerX(), this.f88187c.centerY());
        if (this.o) {
            RectF rectF = this.f88190f;
            int i2 = this.f88196l;
            canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.f88191g);
        }
        if (this.f88185a) {
            canvas.drawRect(this.f88188d, this.f88189e);
        }
        canvas.restore();
        MethodCollector.o(4741);
    }

    public final void a(float f2, float f3) {
        this.n = f2;
        this.f88197m = f3;
        invalidate();
    }

    public final void b(float f2, float f3) {
        this.f88187c.offset(f2, f3);
        invalidate();
    }

    public final boolean c(float f2, float f3) {
        return o.b(this.f88188d, f2, f3, this.f88197m);
    }

    public StickerHelpBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(4732);
        this.f88186b = context;
        this.f88189e.setColor(-1);
        this.f88189e.setStyle(Paint.Style.STROKE);
        this.f88189e.setAntiAlias(true);
        this.f88189e.setStrokeWidth(2.0f);
        Paint paint = new Paint(this.f88189e);
        this.f88191g = paint;
        paint.setColor(-1);
        this.f88191g.setStyle(Paint.Style.FILL);
        this.f88193i = (int) r.a(this.f88186b, 10.0f);
        this.f88194j = (int) r.a(this.f88186b, 16.0f);
        this.f88195k = (int) r.a(this.f88186b, 8.0f);
        this.f88196l = (int) r.a(this.f88186b, 5.0f);
        Paint paint2 = new Paint();
        this.p = paint2;
        paint2.setColor(-65536);
        MethodCollector.o(4732);
    }
}
