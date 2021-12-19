package com.bytedance.android.live.publicscreen.impl.game;

import android.content.Context;
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

public class EdgeTransparentView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    int f12370a;

    /* renamed from: b  reason: collision with root package name */
    float f12371b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f12372c;

    /* renamed from: d  reason: collision with root package name */
    private int f12373d;

    /* renamed from: e  reason: collision with root package name */
    private int f12374e;

    /* renamed from: f  reason: collision with root package name */
    private int f12375f;

    /* renamed from: g  reason: collision with root package name */
    private int f12376g;

    /* renamed from: h  reason: collision with root package name */
    private int f12377h;

    /* renamed from: i  reason: collision with root package name */
    private int f12378i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f12379j;

    /* renamed from: k  reason: collision with root package name */
    private float[] f12380k;

    static {
        Covode.recordClassIndex(6799);
    }

    public EdgeTransparentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private EdgeTransparentView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(7075);
        this.f12373d = 1;
        this.f12374e = 1 << 1;
        this.f12375f = 1 << 2;
        this.f12376g = 8;
        this.f12379j = new int[]{-1, 0};
        this.f12380k = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.f12372c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f12372c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        MethodCollector.o(7075);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        Canvas canvas2 = canvas;
        int saveLayer = canvas2.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas2, view, j2);
        if ((this.f12370a & this.f12373d) != 0) {
            canvas2.drawRect(0.0f, 0.0f, (float) this.f12377h, this.f12371b, this.f12372c);
        }
        if ((this.f12370a & this.f12374e) != 0) {
            int save = canvas2.save();
            canvas2.rotate(180.0f, ((float) this.f12377h) / 2.0f, ((float) this.f12378i) / 2.0f);
            canvas2.drawRect(0.0f, 0.0f, (float) this.f12377h, this.f12371b, this.f12372c);
            canvas2.restoreToCount(save);
        }
        float f2 = ((float) (this.f12378i - this.f12377h)) / 2.0f;
        if ((this.f12370a & this.f12375f) != 0) {
            int save2 = canvas2.save();
            canvas2.rotate(270.0f, ((float) this.f12377h) / 2.0f, ((float) this.f12378i) / 2.0f);
            canvas2.translate(0.0f, f2);
            canvas2.drawRect(0.0f - f2, 0.0f, ((float) this.f12377h) + f2, this.f12371b, this.f12372c);
            canvas2.restoreToCount(save2);
        }
        if ((this.f12370a & this.f12376g) != 0) {
            int save3 = canvas2.save();
            canvas2.rotate(90.0f, ((float) this.f12377h) / 2.0f, ((float) this.f12378i) / 2.0f);
            canvas2.translate(0.0f, f2);
            canvas2 = canvas2;
            canvas2.drawRect(0.0f - f2, 0.0f, ((float) this.f12377h) + f2, this.f12371b, this.f12372c);
            canvas2.restoreToCount(save3);
        }
        canvas2.restoreToCount(saveLayer);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f12372c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f12371b, this.f12379j, this.f12380k, Shader.TileMode.CLAMP));
        this.f12377h = getWidth();
        this.f12378i = getHeight();
    }
}
