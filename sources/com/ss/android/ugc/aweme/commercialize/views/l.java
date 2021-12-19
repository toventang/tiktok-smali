package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class l extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Path f76188a;

    /* renamed from: b  reason: collision with root package name */
    private int f76189b;

    static {
        Covode.recordClassIndex(46984);
    }

    public void setRadius(int i2) {
        this.f76189b = i2;
        a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f76189b == 0 || Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f76188a == null && this.f76189b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                Path path = new Path();
                this.f76188a = path;
                RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                int i2 = this.f76189b;
                path.addRoundRect(rectF, new float[]{(float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2}, Path.Direction.CW);
            }
        }
        Path path2 = this.f76188a;
        if (path2 != null) {
            canvas.clipPath(path2);
        }
        super.dispatchDraw(canvas);
    }

    l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i2, int i3) {
        if (this.f76189b > 0 && Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new m((float) this.f76189b, i2, i3));
        }
    }

    l(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(13422);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.aa9}, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f76189b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.o(13422);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f76189b == 0 || Build.VERSION.SDK_INT >= 21) {
            a(i2, i3);
        }
    }
}
