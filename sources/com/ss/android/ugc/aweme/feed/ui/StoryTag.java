package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class StoryTag extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f94162a;

    /* renamed from: b  reason: collision with root package name */
    private final int f94163b;

    /* renamed from: c  reason: collision with root package name */
    private final int f94164c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f94165d;

    /* renamed from: e  reason: collision with root package name */
    private RectF f94166e;

    /* renamed from: f  reason: collision with root package name */
    private float f94167f;

    /* renamed from: g  reason: collision with root package name */
    private LinearGradient f94168g;

    static {
        Covode.recordClassIndex(59837);
    }

    public StoryTag(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public StoryTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final Paint getPaint() {
        return this.f94165d;
    }

    public final float getRadius() {
        return this.f94167f;
    }

    public final void setRadius(float f2) {
        this.f94167f = f2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(9769);
        super.onDraw(canvas);
        if (canvas == null) {
            MethodCollector.o(9769);
            return;
        }
        this.f94165d.setShader(this.f94168g);
        this.f94165d.setStyle(Paint.Style.FILL);
        this.f94165d.setColor(-16777216);
        RectF rectF = this.f94166e;
        float f2 = this.f94167f;
        canvas.drawRoundRect(rectF, f2, f2, this.f94165d);
        MethodCollector.o(9769);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ StoryTag(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryTag(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9941);
        this.f94162a = Color.parseColor("#10B7FF");
        this.f94163b = Color.parseColor("#20D5EC");
        this.f94164c = Color.parseColor("#17E9B6");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f94165d = paint;
        this.f94166e = new RectF();
        this.f94167f = 5.0f;
        MethodCollector.o(9941);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 > 0 && i3 > 0) {
            RectF rectF = this.f94166e;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float) i2;
            rectF.bottom = (float) i3;
            float width = (float) getWidth();
            float height = (float) getHeight();
            int[] iArr = new int[3];
            int i6 = 0;
            int i7 = 0;
            loop0:
            while (true) {
                int i8 = this.f94162a;
                while (true) {
                    iArr[i7] = i8;
                    i7++;
                    if (i7 >= 3) {
                        break loop0;
                    } else if (i7 != 0) {
                        if (i7 != 1) {
                            i8 = this.f94164c;
                        } else {
                            i8 = this.f94163b;
                        }
                    }
                }
            }
            float[] fArr = new float[3];
            while (true) {
                float f2 = 0.0f;
                while (true) {
                    fArr[i6] = f2;
                    i6++;
                    if (i6 >= 3) {
                        this.f94168g = new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
                        return;
                    } else if (i6 != 0) {
                        if (i6 != 1) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.5f;
                        }
                    }
                }
            }
        }
    }
}
