package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.b;
import androidx.core.graphics.drawable.a;
import androidx.core.h.v;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableFrameLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SweepEffectFrameLayout extends ShapeControllableFrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f15819a;

    /* renamed from: b  reason: collision with root package name */
    private float f15820b;

    /* renamed from: c  reason: collision with root package name */
    private final Drawable f15821c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15822d;

    /* renamed from: e  reason: collision with root package name */
    private final GradientDrawable f15823e;

    static {
        Covode.recordClassIndex(8730);
    }

    public SweepEffectFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setSweepRatio(float f2) {
        this.f15820b = f2;
        invalidate();
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = true;
        if (v.e(this) != 1) {
            z = false;
        }
        this.f15822d = z;
        Drawable drawable = this.f15821c;
        if (drawable != null) {
            a.b(drawable, v.e(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        float width;
        super.dispatchDraw(canvas);
        float f2 = this.f15820b;
        if (f2 > 0.0f && f2 < 1.0f && canvas != null && (drawable = this.f15821c) != null) {
            if (this.f15822d) {
                width = ((float) getWidth()) - (((float) (drawable.getBounds().width() + getWidth())) * this.f15820b);
            } else {
                width = ((float) getWidth()) - (((float) (drawable.getBounds().width() + getWidth())) * (1.0f - this.f15820b));
            }
            canvas.save();
            canvas.translate(width, 0.0f);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private /* synthetic */ SweepEffectFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SweepEffectFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f15819a = new Paint(1);
        this.f15820b = -1.0f;
        Drawable a2 = b.a(context, 2131234321);
        if (a2 != null) {
            a.a(a2, true);
        } else {
            a2 = null;
        }
        this.f15821c = a2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{0, -1, 0});
        this.f15823e = gradientDrawable;
    }

    @Override // com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableFrameLayout
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.f15821c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            drawable.setBounds(0, 0, (intrinsicWidth * i3) / intrinsicHeight, intrinsicHeight);
        }
    }
}
