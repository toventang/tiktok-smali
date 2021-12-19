package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public class FitTextView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f9260a;

    /* renamed from: b  reason: collision with root package name */
    private float f9261b;

    /* renamed from: c  reason: collision with root package name */
    private float f9262c = 6.0f;

    static {
        Covode.recordClassIndex(4732);
    }

    private static float a(Context context, float f2) {
        return f2 / context.getResources().getDisplayMetrics().scaledDensity;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a(charSequence.toString(), getWidth());
    }

    public FitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint();
        this.f9260a = textPaint;
        textPaint.set((Paint) getPaint());
        this.f9261b = getTextSize();
    }

    private void a(String str, int i2) {
        if (i2 > 0) {
            int paddingLeft = (i2 - getPaddingLeft()) - getPaddingRight();
            float f2 = this.f9261b;
            this.f9260a.setTextSize(f2);
            while (true) {
                if (this.f9260a.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f2 -= 1.0f;
                float f3 = this.f9262c;
                if (f2 <= f3) {
                    f2 = f3;
                    break;
                }
                this.f9260a.setTextSize(f2);
            }
            setTextSize(a(getContext(), f2));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (i2 != i4) {
            a(getText().toString(), i2);
        }
    }
}
