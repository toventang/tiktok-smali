package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class RectCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private i f33631a;

    static {
        Covode.recordClassIndex(20024);
    }

    public final i getMRectCornerHelper() {
        return this.f33631a;
    }

    public final float getBottomLeftRadius() {
        return this.f33631a.f33669a[4];
    }

    public final float getBottomRightRadius() {
        return this.f33631a.f33669a[6];
    }

    public final int getStrokeColor() {
        return this.f33631a.f33674f;
    }

    public final int getStrokeWidth() {
        return this.f33631a.f33676h;
    }

    public final float getTopLeftRadius() {
        return this.f33631a.f33669a[0];
    }

    public final float getTopRightRadius() {
        return this.f33631a.f33669a[2];
    }

    public final void invalidate() {
        i iVar = this.f33631a;
        if (iVar != null) {
            iVar.a(this);
        }
        super.invalidate();
    }

    public final void setClipBackground(boolean z) {
        this.f33631a.f33677i = z;
        invalidate();
    }

    public final void setMRectCornerHelper(i iVar) {
        l.d(iVar, "");
        this.f33631a = iVar;
    }

    public final void setRoundAsCircle(boolean z) {
        this.f33631a.f33672d = z;
        invalidate();
    }

    public final void setStrokeColor(int i2) {
        this.f33631a.f33674f = i2;
        invalidate();
    }

    public final void setStrokeWidth(int i2) {
        this.f33631a.f33676h = i2;
        invalidate();
    }

    public final void setBottomLeftRadius(int i2) {
        float f2 = ((float) i2) * 1.0f;
        this.f33631a.f33669a[6] = f2;
        this.f33631a.f33669a[7] = f2;
        invalidate();
    }

    public final void setBottomRightRadius(int i2) {
        float f2 = ((float) i2) * 1.0f;
        this.f33631a.f33669a[4] = f2;
        this.f33631a.f33669a[5] = f2;
        invalidate();
    }

    public final void setRadius(int i2) {
        int length = this.f33631a.f33669a.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f33631a.f33669a[i3] = ((float) i2) * 1.0f;
        }
        invalidate();
    }

    public final void setTopLeftRadius(int i2) {
        float f2 = ((float) i2) * 1.0f;
        this.f33631a.f33669a[0] = f2;
        this.f33631a.f33669a[1] = f2;
        invalidate();
    }

    public final void setTopRightRadius(int i2) {
        float f2 = ((float) i2) * 1.0f;
        this.f33631a.f33669a[2] = f2;
        this.f33631a.f33669a[3] = f2;
        invalidate();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            Region region = this.f33631a.f33678j;
            if (region == null) {
                l.a("mAreaRegion");
            }
            if (!region.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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

    public final void draw(Canvas canvas) {
        l.d(canvas, "");
        if (this.f33631a.f33677i) {
            canvas.save();
            Path path = this.f33631a.f33670b;
            if (path == null) {
                l.a("mClipPath");
            }
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        l.d(canvas, "");
        RectF rectF = this.f33631a.f33679k;
        if (rectF == null) {
            l.a("mLayer");
        }
        canvas.saveLayer(rectF, null, 31);
        super.dispatchDraw(canvas);
        i iVar = this.f33631a;
        l.d(canvas, "");
        if (iVar.f33676h > 0) {
            Paint paint = iVar.f33671c;
            if (paint == null) {
                l.a("mPaint");
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Paint paint2 = iVar.f33671c;
            if (paint2 == null) {
                l.a("mPaint");
            }
            paint2.setColor(-1);
            Paint paint3 = iVar.f33671c;
            if (paint3 == null) {
                l.a("mPaint");
            }
            paint3.setStrokeWidth((float) (iVar.f33676h * 2));
            Paint paint4 = iVar.f33671c;
            if (paint4 == null) {
                l.a("mPaint");
            }
            paint4.setStyle(Paint.Style.STROKE);
            Path path = iVar.f33670b;
            if (path == null) {
                l.a("mClipPath");
            }
            Paint paint5 = iVar.f33671c;
            if (paint5 == null) {
                l.a("mPaint");
            }
            canvas.drawPath(path, paint5);
            Paint paint6 = iVar.f33671c;
            if (paint6 == null) {
                l.a("mPaint");
            }
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            Paint paint7 = iVar.f33671c;
            if (paint7 == null) {
                l.a("mPaint");
            }
            paint7.setColor(iVar.f33674f);
            Paint paint8 = iVar.f33671c;
            if (paint8 == null) {
                l.a("mPaint");
            }
            paint8.setStyle(Paint.Style.STROKE);
            Path path2 = iVar.f33670b;
            if (path2 == null) {
                l.a("mClipPath");
            }
            Paint paint9 = iVar.f33671c;
            if (paint9 == null) {
                l.a("mPaint");
            }
            canvas.drawPath(path2, paint9);
        }
        Paint paint10 = iVar.f33671c;
        if (paint10 == null) {
            l.a("mPaint");
        }
        paint10.setColor(-1);
        Paint paint11 = iVar.f33671c;
        if (paint11 == null) {
            l.a("mPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            Paint paint12 = iVar.f33671c;
            if (paint12 == null) {
                l.a("mPaint");
            }
            paint12.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Path path3 = iVar.f33670b;
            if (path3 == null) {
                l.a("mClipPath");
            }
            Paint paint13 = iVar.f33671c;
            if (paint13 == null) {
                l.a("mPaint");
            }
            canvas.drawPath(path3, paint13);
        } else {
            Paint paint14 = iVar.f33671c;
            if (paint14 == null) {
                l.a("mPaint");
            }
            paint14.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path4 = new Path();
            RectF rectF2 = iVar.f33679k;
            if (rectF2 == null) {
                l.a("mLayer");
            }
            float width = rectF2.width();
            RectF rectF3 = iVar.f33679k;
            if (rectF3 == null) {
                l.a("mLayer");
            }
            path4.addRect(0.0f, 0.0f, width, rectF3.height(), Path.Direction.CW);
            Path path5 = iVar.f33670b;
            if (path5 == null) {
                l.a("mClipPath");
            }
            path4.op(path5, Path.Op.DIFFERENCE);
            Paint paint15 = iVar.f33671c;
            if (paint15 == null) {
                l.a("mPaint");
            }
            canvas.drawPath(path4, paint15);
        }
        canvas.restore();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RectCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
        l.d(attributeSet, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RectCornerRelativeLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(9529);
        this.f33631a = new i();
        i iVar = new i();
        this.f33631a = iVar;
        l.d(context, "");
        l.d(attributeSet, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nw, R.attr.aa1, R.attr.aa2, R.attr.aa3, R.attr.aa4, R.attr.aa5, R.attr.aa6, R.attr.afp, R.attr.afq, R.attr.ap0, R.attr.aqg, R.attr.aqh, R.attr.aqi, R.attr.aqj, R.attr.aqk, R.attr.aql, R.attr.ar5, R.attr.ar6});
        l.b(obtainStyledAttributes, "");
        iVar.f33672d = obtainStyledAttributes.getBoolean(1, false);
        iVar.f33675g = obtainStyledAttributes.getColorStateList(7);
        if (iVar.f33675g != null) {
            ColorStateList colorStateList = iVar.f33675g;
            if (colorStateList == null) {
                l.b();
            }
            iVar.f33674f = colorStateList.getDefaultColor();
            ColorStateList colorStateList2 = iVar.f33675g;
            if (colorStateList2 == null) {
                l.b();
            }
            iVar.f33673e = colorStateList2.getDefaultColor();
        } else {
            iVar.f33674f = -1;
            iVar.f33673e = -1;
        }
        iVar.f33676h = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        iVar.f33677i = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        float f2 = (float) dimensionPixelSize2;
        iVar.f33669a[0] = f2;
        iVar.f33669a[1] = f2;
        float f3 = (float) dimensionPixelSize3;
        iVar.f33669a[2] = f3;
        iVar.f33669a[3] = f3;
        float f4 = (float) dimensionPixelSize5;
        iVar.f33669a[4] = f4;
        iVar.f33669a[5] = f4;
        float f5 = (float) dimensionPixelSize4;
        iVar.f33669a[6] = f5;
        iVar.f33669a[7] = f5;
        iVar.f33679k = new RectF();
        iVar.f33670b = new Path();
        iVar.f33678j = new Region();
        iVar.f33671c = new Paint();
        Paint paint = iVar.f33671c;
        if (paint == null) {
            l.a("mPaint");
        }
        paint.setColor(-1);
        Paint paint2 = iVar.f33671c;
        if (paint2 == null) {
            l.a("mPaint");
        }
        paint2.setAntiAlias(true);
        MethodCollector.o(9529);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        i iVar = this.f33631a;
        l.d(this, "");
        RectF rectF = iVar.f33679k;
        if (rectF == null) {
            l.a("mLayer");
        }
        rectF.set(0.0f, 0.0f, (float) i2, (float) i3);
        iVar.a(this);
    }
}
