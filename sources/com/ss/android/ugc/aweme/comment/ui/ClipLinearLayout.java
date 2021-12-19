package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class ClipLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f72460a;

    /* renamed from: b  reason: collision with root package name */
    private Path f72461b;

    static {
        Covode.recordClassIndex(44661);
    }

    public void setClipHeight(int i2) {
        this.f72460a = i2;
    }

    public ClipLinearLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(700);
        if (this.f72460a >= 0) {
            this.f72461b.reset();
            this.f72461b.addRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) (getMeasuredHeight() - this.f72460a), Path.Direction.CW);
            canvas.clipPath(this.f72461b);
        }
        super.onDraw(canvas);
        MethodCollector.o(700);
    }

    public ClipLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ClipLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(697);
        this.f72460a = -1;
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.b1t);
        }
        this.f72461b = new Path();
        MethodCollector.o(697);
    }
}
