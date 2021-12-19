package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class RoundedLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private Path f144519a;

    /* renamed from: b  reason: collision with root package name */
    private int f144520b;

    static {
        Covode.recordClassIndex(94591);
    }

    public void setRadius(int i2) {
        this.f144520b = i2;
        if (getHeight() != 0 && getWidth() != 0) {
            a(getWidth(), getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f144520b == 0 || Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f144519a == null && this.f144520b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                Path path = new Path();
                this.f144519a = path;
                RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                int i2 = this.f144520b;
                path.addRoundRect(rectF, new float[]{(float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2}, Path.Direction.CW);
            }
        }
        Path path2 = this.f144519a;
        if (path2 != null) {
            canvas.clipPath(path2);
        }
        super.dispatchDraw(canvas);
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private void a(int i2, int i3) {
        if (this.f144520b > 0 && Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new q((float) this.f144520b, i2, i3));
        }
    }

    private RoundedLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(2359);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.aa9}, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f144520b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.o(2359);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f144520b == 0 || Build.VERSION.SDK_INT >= 21) {
            a(i2, i3);
        }
    }
}
