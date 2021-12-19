package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VisualLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private final c f45645a;

    /* renamed from: b  reason: collision with root package name */
    private int f45646b;

    /* renamed from: c  reason: collision with root package name */
    private int f45647c;

    static {
        Covode.recordClassIndex(27785);
    }

    public VisualLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getMaxHeight() {
        return this.f45646b;
    }

    public final int getMaxWidth() {
        return this.f45647c;
    }

    public final c getRectCornerHelper() {
        return this.f45645a;
    }

    public final float getBottomLeftRadius() {
        return this.f45645a.f45659a[4];
    }

    public final float getBottomRightRadius() {
        return this.f45645a.f45659a[6];
    }

    public final int getStrokeColor() {
        return this.f45645a.f45665g;
    }

    public final int getStrokeWidth() {
        return this.f45645a.f45666h;
    }

    public final float getTopLeftRadius() {
        return this.f45645a.f45659a[0];
    }

    public final float getTopRightRadius() {
        return this.f45645a.f45659a[2];
    }

    public final void invalidate() {
        this.f45645a.a(this);
        super.invalidate();
    }

    public final Drawable getBackground() {
        Drawable background = super.getBackground();
        if (background == null) {
            return null;
        }
        if (background instanceof a) {
            return ((a) background).f45650c;
        }
        return background;
    }

    public final void setClipBackground(boolean z) {
        this.f45645a.f45667i = z;
        invalidate();
    }

    public final void setMaxHeight(int i2) {
        this.f45646b = i2;
        requestLayout();
    }

    public final void setMaxWidth(int i2) {
        this.f45647c = i2;
        requestLayout();
    }

    public final void setRoundAsCircle(boolean z) {
        this.f45645a.f45664f = z;
        invalidate();
    }

    public final void setStrokeColor(int i2) {
        this.f45645a.f45665g = i2;
        invalidate();
    }

    public final void setStrokeWidth(int i2) {
        this.f45645a.f45666h = i2;
        invalidate();
    }

    public final void setBackground(Drawable drawable) {
        if (this.f45645a == null || !(drawable instanceof ColorDrawable)) {
            super.setBackground(drawable);
        } else {
            super.setBackground(new a(this.f45645a, (ColorDrawable) drawable));
        }
    }

    public final void setBottomLeftRadius(int i2) {
        float f2 = ((float) i2) * 1.0f;
        this.f45645a.f45659a[6] = f2;
        this.f45645a.f45659a[7] = f2;
        invalidate();
    }

    public final void setBottomRightRadius(int i2) {
        float f2 = ((float) i2) * 1.0f;
        this.f45645a.f45659a[4] = f2;
        this.f45645a.f45659a[5] = f2;
        invalidate();
    }

    public final void setRadius(int i2) {
        int length = this.f45645a.f45659a.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f45645a.f45659a[i3] = ((float) i2) * 1.0f;
        }
        invalidate();
    }

    public final void setTopLeftRadius(int i2) {
        float f2 = ((float) i2) * 1.0f;
        this.f45645a.f45659a[0] = f2;
        this.f45645a.f45659a[1] = f2;
        invalidate();
    }

    public final void setTopRightRadius(int i2) {
        float f2 = ((float) i2) * 1.0f;
        this.f45645a.f45659a[2] = f2;
        this.f45645a.f45659a[3] = f2;
        invalidate();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.c(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!this.f45645a.f45662d.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        } else if (action != 1) {
            if (action == 3) {
                setPressed(false);
                refreshDrawableState();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        refreshDrawableState();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        l.c(canvas, "");
        canvas.saveLayer(this.f45645a.f45663e, null, 31);
        super.dispatchDraw(canvas);
        c cVar = this.f45645a;
        l.c(canvas, "");
        if (cVar.f45666h > 0) {
            cVar.f45661c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            cVar.f45661c.setColor(-1);
            cVar.f45661c.setStrokeWidth((float) (cVar.f45666h * 2));
            cVar.f45661c.setStyle(Paint.Style.STROKE);
            canvas.drawPath(cVar.f45660b, cVar.f45661c);
            cVar.f45661c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            cVar.f45661c.setColor(cVar.f45665g);
            cVar.f45661c.setStyle(Paint.Style.STROKE);
            canvas.drawPath(cVar.f45660b, cVar.f45661c);
        }
        cVar.f45661c.setColor(-1);
        cVar.f45661c.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            cVar.f45661c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(cVar.f45660b, cVar.f45661c);
        } else {
            cVar.f45661c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path = new Path();
            path.addRect(0.0f, 0.0f, cVar.f45663e.width(), cVar.f45663e.height(), Path.Direction.CW);
            path.op(cVar.f45660b, Path.Op.DIFFERENCE);
            canvas.drawPath(path, cVar.f45661c);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        MethodCollector.i(7930);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 0 && (i5 = this.f45647c) > 0 && size > i5) {
            size = i5;
        }
        if (mode2 != 0 && (i4 = this.f45646b) > 0 && size2 > i4) {
            size2 = i4;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        MethodCollector.o(7930);
    }

    private /* synthetic */ VisualLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private VisualLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        l.c(attributeSet, "");
        MethodCollector.i(7955);
        l.c(context, "");
        l.c(attributeSet, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nw, R.attr.aa1, R.attr.aa2, R.attr.aa3, R.attr.aa4, R.attr.aa5, R.attr.aa6, R.attr.afp, R.attr.afq, R.attr.ap0, R.attr.aqg, R.attr.aqh, R.attr.aqi, R.attr.aqj, R.attr.aqk, R.attr.aql, R.attr.ar5, R.attr.ar6});
        boolean z = obtainStyledAttributes.getBoolean(10, false);
        int color = obtainStyledAttributes.getColor(16, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(17, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(9, false);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize2);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(15, dimensionPixelSize2);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize2);
        int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(13, dimensionPixelSize2);
        obtainStyledAttributes.recycle();
        this.f45645a = new c(z, color, dimensionPixelSize, z2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6);
        this.f45646b = -1;
        this.f45647c = -1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aq8, R.attr.aq9});
        setMaxWidth(obtainStyledAttributes2.getDimensionPixelSize(1, -1));
        setMaxHeight(obtainStyledAttributes2.getDimensionPixelSize(0, -1));
        obtainStyledAttributes2.recycle();
        Drawable background = super.getBackground();
        if (background != null) {
            setBackground(background);
            MethodCollector.o(7955);
            return;
        }
        MethodCollector.o(7955);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        c cVar = this.f45645a;
        l.c(this, "");
        cVar.f45663e.set(0.0f, 0.0f, (float) i2, (float) i3);
        cVar.a(this);
    }
}
