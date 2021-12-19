package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

public class q extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f132965a;

    /* renamed from: b  reason: collision with root package name */
    private int f132966b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f132967c;

    /* renamed from: d  reason: collision with root package name */
    private float f132968d;

    /* renamed from: e  reason: collision with root package name */
    private RectF f132969e;

    static {
        Covode.recordClassIndex(86960);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public q(Context context) {
        this(context, (byte) 0);
    }

    public void setColor(int i2) {
        this.f132967c.setColor(i2);
    }

    public void setStrokeWidth(int i2) {
        this.f132967c.setStrokeWidth((float) i2);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f132969e;
        float f2 = this.f132968d;
        canvas.drawRoundRect(rectF, f2, f2, this.f132967c);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(this.f132965a, this.f132966b);
    }

    public final void a(int i2, int i3) {
        this.f132965a = i2;
        this.f132966b = i3;
        float f2 = this.f132968d;
        this.f132969e = new RectF(f2 / 2.0f, f2 / 2.0f, ((float) i2) - (f2 / 2.0f), ((float) i3) - (f2 / 2.0f));
        invalidate();
    }

    private q(Context context, byte b2) {
        super(context);
        this.f132965a = 0;
        this.f132966b = 0;
        Paint paint = new Paint();
        this.f132967c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f132967c.setColor(-1);
        float b3 = n.b(getContext(), 2.0f);
        this.f132968d = b3;
        this.f132967c.setStrokeWidth(b3);
    }
}
