package com.ss.android.ugc.aweme.ug.guide;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PhoneView extends View {

    /* renamed from: a  reason: collision with root package name */
    Paint f141853a;

    /* renamed from: b  reason: collision with root package name */
    int f141854b;

    /* renamed from: c  reason: collision with root package name */
    int f141855c;

    /* renamed from: d  reason: collision with root package name */
    int f141856d;

    /* renamed from: e  reason: collision with root package name */
    Path f141857e;

    /* renamed from: f  reason: collision with root package name */
    float f141858f;

    /* renamed from: g  reason: collision with root package name */
    float f141859g;

    /* renamed from: h  reason: collision with root package name */
    float f141860h;

    /* renamed from: i  reason: collision with root package name */
    float f141861i;

    /* renamed from: j  reason: collision with root package name */
    RectF f141862j;

    static {
        Covode.recordClassIndex(92710);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(9300);
        super.onDraw(canvas);
        this.f141853a.setColor(this.f141856d);
        this.f141862j.set(0.0f, 0.0f, this.f141858f, this.f141859g);
        RectF rectF = this.f141862j;
        float f2 = this.f141861i;
        canvas.drawRoundRect(rectF, f2, f2, this.f141853a);
        this.f141853a.setColor(this.f141854b);
        RectF rectF2 = this.f141862j;
        float f3 = this.f141860h;
        rectF2.set(f3 * 4.0f, 14.0f * f3, this.f141858f - (4.0f * f3), this.f141859g - (f3 * 20.0f));
        RectF rectF3 = this.f141862j;
        float f4 = this.f141861i;
        canvas.drawRoundRect(rectF3, f4, f4, this.f141853a);
        this.f141853a.setColor(this.f141855c);
        float f5 = this.f141860h;
        float f6 = 27.0f * f5;
        float f7 = 9.0f * f5;
        RectF rectF4 = this.f141862j;
        float f8 = this.f141858f;
        float f9 = this.f141859g;
        rectF4.set((f8 - f6) / 2.0f, f9 - (((f5 * 20.0f) + f7) / 2.0f), (f8 + f6) / 2.0f, f9 - (((f5 * 20.0f) - f7) / 2.0f));
        float f10 = f7 / 2.0f;
        canvas.drawRoundRect(this.f141862j, f10, f10, this.f141853a);
        MethodCollector.o(9300);
    }

    public PhoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private PhoneView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8729);
        this.f141853a = new Paint();
        this.f141856d = Color.argb(191, 255, 255, 255);
        this.f141854b = Color.argb(51, 0, 0, 0);
        this.f141855c = Color.argb(38, 0, 0, 0);
        this.f141857e = new Path();
        float applyDimension = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.f141860h = applyDimension;
        this.f141861i = applyDimension * 3.0f;
        this.f141862j = new RectF();
        MethodCollector.o(8729);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f141858f = (float) i2;
        this.f141859g = (float) i3;
    }
}
