package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;

public class EdgeTransparentView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f144469a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f144470b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f144471c;

    /* renamed from: d  reason: collision with root package name */
    private int f144472d;

    /* renamed from: e  reason: collision with root package name */
    private float f144473e;

    /* renamed from: f  reason: collision with root package name */
    private int f144474f;

    /* renamed from: g  reason: collision with root package name */
    private int f144475g;

    static {
        Covode.recordClassIndex(94574);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public EdgeTransparentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private EdgeTransparentView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(7789);
        this.f144469a = new int[]{-1, 0};
        this.f144470b = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.f144471c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f144471c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a7n, R.attr.ajg, R.attr.ajh, R.attr.au2});
        this.f144472d = obtainStyledAttributes.getInt(0, 0);
        this.f144473e = obtainStyledAttributes.getDimension(3, r.a(getContext(), 20.0f));
        obtainStyledAttributes.recycle();
        MethodCollector.o(7789);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j2);
        int i2 = this.f144472d;
        if (i2 == 0 || (i2 & 1) != 0) {
            canvas.drawRect(0.0f, -3.0f, (float) this.f144474f, this.f144473e, this.f144471c);
        }
        int i3 = this.f144472d;
        if (i3 == 0 || (i3 & 2) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, ((float) this.f144474f) / 2.0f, ((float) this.f144475g) / 2.0f);
            canvas.drawRect(0.0f, -3.0f, (float) this.f144474f, this.f144473e, this.f144471c);
            canvas.restoreToCount(save);
        }
        int i4 = (this.f144475g - this.f144474f) / 2;
        int i5 = this.f144472d;
        if (i5 == 0 || (i5 & 4) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, ((float) this.f144474f) / 2.0f, ((float) this.f144475g) / 2.0f);
            float f2 = (float) i4;
            canvas.translate(0.0f, f2);
            canvas.drawRect((float) (-i4), -3.0f, ((float) this.f144474f) + f2, this.f144473e, this.f144471c);
            canvas.restoreToCount(save2);
        }
        int i6 = this.f144472d;
        if (i6 == 0 || (i6 & 8) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, ((float) this.f144474f) / 2.0f, ((float) this.f144475g) / 2.0f);
            float f3 = (float) i4;
            canvas.translate(0.0f, f3);
            canvas.drawRect((float) (-i4), -3.0f, ((float) this.f144474f) + f3, this.f144473e, this.f144471c);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f144471c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f144473e, this.f144469a, this.f144470b, Shader.TileMode.CLAMP));
        this.f144474f = getWidth();
        this.f144475g = getHeight();
    }
}
