package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class DmtPlusView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f126023a;

    /* renamed from: b  reason: collision with root package name */
    private int f126024b;

    /* renamed from: c  reason: collision with root package name */
    private int f126025c;

    /* renamed from: d  reason: collision with root package name */
    private int f126026d;

    /* renamed from: e  reason: collision with root package name */
    private int f126027e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f126028f;

    /* renamed from: g  reason: collision with root package name */
    private final RectF f126029g;

    static {
        Covode.recordClassIndex(82779);
    }

    public DmtPlusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setBgColor(int i2) {
        this.f126023a.setColor(i2);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        RectF rectF = this.f126028f;
        int i2 = this.f126024b;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.f126023a);
        RectF rectF2 = this.f126029g;
        int i3 = this.f126024b;
        canvas.drawRoundRect(rectF2, (float) i3, (float) i3, this.f126023a);
    }

    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(5918);
        super.onMeasure(i2, i3);
        this.f126026d = View.MeasureSpec.getSize(i2);
        int size = View.MeasureSpec.getSize(i3);
        this.f126027e = size;
        RectF rectF = this.f126028f;
        int i4 = this.f126025c;
        rectF.set(0.0f, (float) ((size - i4) / 2), (float) this.f126026d, (float) ((size + i4) / 2));
        RectF rectF2 = this.f126029g;
        int i5 = this.f126026d;
        int i6 = this.f126025c;
        rectF2.set((float) ((i5 - i6) / 2), 0.0f, (float) ((i5 + i6) / 2), (float) this.f126027e);
        MethodCollector.o(5918);
    }

    private /* synthetic */ DmtPlusView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DmtPlusView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5992);
        Paint paint = new Paint();
        this.f126023a = paint;
        this.f126028f = new RectF();
        this.f126029g = new RectF();
        paint.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            this.f126024b = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            this.f126025c = (int) obtainStyledAttributes.getDimension(23, 0.0f);
        }
        MethodCollector.o(5992);
    }
}
