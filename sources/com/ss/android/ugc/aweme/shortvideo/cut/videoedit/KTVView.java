package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class KTVView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f126097a;

    /* renamed from: b  reason: collision with root package name */
    private int f126098b;

    /* renamed from: c  reason: collision with root package name */
    private int f126099c;

    /* renamed from: d  reason: collision with root package name */
    private int f126100d;

    static {
        Covode.recordClassIndex(82808);
    }

    public void setColor(int i2) {
        this.f126097a.setColor(i2);
        invalidate();
    }

    public void setLength(int i2) {
        this.f126098b = i2;
        int i3 = this.f126099c;
        this.f126100d = a.a(i2 + i3, i3, getWidth() - getPaddingRight());
        invalidate();
    }

    public void setStart(int i2) {
        this.f126099c = i2;
        this.f126100d = a.a(this.f126098b + i2, i2, getWidth() - getPaddingRight());
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable background = getBackground();
        if (background != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
            background.draw(canvas);
            canvas.drawRect((float) this.f126099c, 0.0f, (float) this.f126100d, (float) getHeight(), this.f126097a);
            canvas.restoreToCount(saveLayer);
        }
    }

    public KTVView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private KTVView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6983);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843173}, 0, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f126097a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f126097a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f126097a.setColor(color);
        MethodCollector.o(6983);
    }
}
