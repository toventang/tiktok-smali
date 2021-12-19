package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AdRatingView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f73634a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f73635b;

    /* renamed from: c  reason: collision with root package name */
    private float f73636c;

    /* renamed from: d  reason: collision with root package name */
    private int f73637d;

    /* renamed from: e  reason: collision with root package name */
    private int f73638e;

    static {
        Covode.recordClassIndex(45318);
    }

    public AdRatingView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public AdRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getRatingDivide() {
        return this.f73638e;
    }

    public final Drawable getRatingImage() {
        return this.f73635b;
    }

    public final float getRatingProgress() {
        return this.f73636c;
    }

    public final int getRatingStarNumber() {
        return this.f73637d;
    }

    public final Drawable getRatingUnImage() {
        return this.f73634a;
    }

    public final void setRatingDivide(int i2) {
        this.f73638e = i2;
        invalidate();
    }

    public final void setRatingProgress(float f2) {
        this.f73636c = f2;
        invalidate();
    }

    public final void setRatingStarNumber(int i2) {
        this.f73637d = i2;
        invalidate();
    }

    public final void setRatingImage(Drawable drawable) {
        l.d(drawable, "");
        this.f73635b = drawable;
        invalidate();
    }

    public final void setRatingUnImage(Drawable drawable) {
        l.d(drawable, "");
        this.f73634a = drawable;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            float f2 = this.f73636c;
            float intrinsicHeight = ((float) ((((int) this.f73636c) * this.f73634a.getIntrinsicHeight()) + (((int) f2) * this.f73638e))) + ((f2 - ((float) ((int) f2))) * ((float) this.f73634a.getIntrinsicWidth()));
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, intrinsicHeight, (float) this.f73635b.getIntrinsicHeight());
            int i2 = this.f73637d;
            for (int i3 = 0; i3 < i2; i3++) {
                int intrinsicWidth = (this.f73635b.getIntrinsicWidth() * i3) + (this.f73638e * i3);
                Drawable drawable = this.f73635b;
                drawable.setBounds(intrinsicWidth, 0, drawable.getIntrinsicWidth() + intrinsicWidth, this.f73635b.getIntrinsicHeight());
                this.f73635b.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.clipRect(intrinsicHeight, 0.0f, (float) getWidth(), (float) this.f73634a.getIntrinsicHeight());
            int i4 = this.f73637d;
            for (int i5 = 0; i5 < i4; i5++) {
                int intrinsicWidth2 = (this.f73634a.getIntrinsicWidth() * i5) + (this.f73638e * i5);
                Drawable drawable2 = this.f73634a;
                drawable2.setBounds(intrinsicWidth2, 0, drawable2.getIntrinsicWidth() + intrinsicWidth2, this.f73634a.getIntrinsicHeight());
                this.f73634a.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        MethodCollector.i(1330);
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int i5 = 0;
        if (mode == Integer.MIN_VALUE) {
            int intrinsicWidth = this.f73634a.getIntrinsicWidth();
            int i6 = this.f73637d;
            i4 = (intrinsicWidth * i6) + ((i6 - 1) * this.f73638e);
        } else if (mode == 0) {
            i4 = View.MeasureSpec.getSize(i2);
        } else if (mode != 1073741824) {
            i4 = 0;
        } else {
            i4 = View.MeasureSpec.getSize(i2);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE) {
            i5 = this.f73634a.getIntrinsicHeight();
        } else if (mode2 == 0) {
            i5 = View.MeasureSpec.getSize(i3);
        } else if (mode2 == 1073741824) {
            i5 = View.MeasureSpec.getSize(i3);
        }
        setMeasuredDimension(i4, i5);
        MethodCollector.o(1330);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ AdRatingView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdRatingView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        Drawable drawable;
        Drawable drawable2;
        l.d(context, "");
        MethodCollector.i(1344);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = context.getResources().getDrawable(R.drawable.b1s, null);
            l.b(drawable, "");
        } else {
            drawable = context.getResources().getDrawable(R.drawable.b1s);
            l.b(drawable, "");
        }
        this.f73634a = drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable2 = context.getResources().getDrawable(2131233874, null);
            l.b(drawable2, "");
        } else {
            drawable2 = context.getResources().getDrawable(2131233874);
            l.b(drawable2, "");
        }
        this.f73635b = drawable2;
        this.f73637d = 5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a93, R.attr.a97, R.attr.a98, R.attr.a99, R.attr.a9_, R.attr.a9a});
            l.b(obtainStyledAttributes, "");
            Drawable drawable3 = obtainStyledAttributes.getDrawable(2);
            if (drawable3 != null) {
                l.b(drawable3, "");
                setRatingImage(drawable3);
            }
            Drawable drawable4 = obtainStyledAttributes.getDrawable(5);
            if (drawable4 != null) {
                l.b(drawable4, "");
                setRatingUnImage(drawable4);
            }
            setRatingProgress(obtainStyledAttributes.getFloat(3, this.f73636c));
            setRatingStarNumber(obtainStyledAttributes.getInt(4, this.f73637d));
            setRatingDivide(obtainStyledAttributes.getDimensionPixelSize(1, this.f73638e));
            obtainStyledAttributes.recycle();
        }
        MethodCollector.o(1344);
    }
}
