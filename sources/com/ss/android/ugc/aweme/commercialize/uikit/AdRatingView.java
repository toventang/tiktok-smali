package com.ss.android.ugc.aweme.commercialize.uikit;

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
    private Drawable f75380a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f75381b;

    /* renamed from: c  reason: collision with root package name */
    private float f75382c;

    /* renamed from: d  reason: collision with root package name */
    private int f75383d;

    /* renamed from: e  reason: collision with root package name */
    private int f75384e;

    static {
        Covode.recordClassIndex(46523);
    }

    public AdRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getRatingDivide() {
        return this.f75384e;
    }

    public final Drawable getRatingImage() {
        return this.f75381b;
    }

    public final float getRatingProgress() {
        return this.f75382c;
    }

    public final int getRatingStarNumber() {
        return this.f75383d;
    }

    public final Drawable getRatingUnImage() {
        return this.f75380a;
    }

    public final void setRatingDivide(int i2) {
        this.f75384e = i2;
        invalidate();
    }

    public final void setRatingProgress(float f2) {
        this.f75382c = f2;
        invalidate();
    }

    public final void setRatingStarNumber(int i2) {
        this.f75383d = i2;
        invalidate();
    }

    public final void setRatingImage(Drawable drawable) {
        l.d(drawable, "");
        this.f75381b = drawable;
        invalidate();
    }

    public final void setRatingUnImage(Drawable drawable) {
        l.d(drawable, "");
        this.f75380a = drawable;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            float f2 = this.f75382c;
            float intrinsicHeight = ((float) ((((int) this.f75382c) * this.f75380a.getIntrinsicHeight()) + (((int) f2) * this.f75384e))) + ((f2 - ((float) ((int) f2))) * ((float) this.f75380a.getIntrinsicWidth()));
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, intrinsicHeight, (float) this.f75381b.getIntrinsicHeight());
            int i2 = this.f75383d;
            for (int i3 = 0; i3 < i2; i3++) {
                int intrinsicWidth = (this.f75381b.getIntrinsicWidth() * i3) + (this.f75384e * i3);
                Drawable drawable = this.f75381b;
                drawable.setBounds(intrinsicWidth, 0, drawable.getIntrinsicWidth() + intrinsicWidth, this.f75381b.getIntrinsicHeight());
                this.f75381b.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.clipRect(intrinsicHeight, 0.0f, (float) getWidth(), (float) this.f75380a.getIntrinsicHeight());
            int i4 = this.f75383d;
            for (int i5 = 0; i5 < i4; i5++) {
                int intrinsicWidth2 = (this.f75380a.getIntrinsicWidth() * i5) + (this.f75384e * i5);
                Drawable drawable2 = this.f75380a;
                drawable2.setBounds(intrinsicWidth2, 0, drawable2.getIntrinsicWidth() + intrinsicWidth2, this.f75380a.getIntrinsicHeight());
                this.f75380a.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        MethodCollector.i(7078);
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int i5 = 0;
        if (mode == Integer.MIN_VALUE) {
            int intrinsicWidth = this.f75380a.getIntrinsicWidth();
            int i6 = this.f75383d;
            i4 = (intrinsicWidth * i6) + ((i6 - 1) * this.f75384e);
        } else if (mode == 0) {
            i4 = View.MeasureSpec.getSize(i2);
        } else if (mode != 1073741824) {
            i4 = 0;
        } else {
            i4 = View.MeasureSpec.getSize(i2);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE) {
            i5 = this.f75380a.getIntrinsicHeight();
        } else if (mode2 == 0) {
            i5 = View.MeasureSpec.getSize(i3);
        } else if (mode2 == 1073741824) {
            i5 = View.MeasureSpec.getSize(i3);
        }
        setMeasuredDimension(i4, i5);
        MethodCollector.o(7078);
    }

    private /* synthetic */ AdRatingView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdRatingView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        Drawable drawable;
        Drawable drawable2;
        l.d(context, "");
        MethodCollector.i(7210);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = context.getResources().getDrawable(R.drawable.bkf, null);
            l.b(drawable, "");
        } else {
            drawable = context.getResources().getDrawable(R.drawable.bkf);
            l.b(drawable, "");
        }
        this.f75380a = drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable2 = context.getResources().getDrawable(2131233874, null);
            l.b(drawable2, "");
        } else {
            drawable2 = context.getResources().getDrawable(2131233874);
            l.b(drawable2, "");
        }
        this.f75381b = drawable2;
        this.f75383d = 5;
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
            setRatingProgress(obtainStyledAttributes.getFloat(3, this.f75382c));
            setRatingStarNumber(obtainStyledAttributes.getInt(4, this.f75383d));
            setRatingDivide(obtainStyledAttributes.getDimensionPixelSize(1, this.f75384e));
            obtainStyledAttributes.recycle();
        }
        MethodCollector.o(7210);
    }
}
