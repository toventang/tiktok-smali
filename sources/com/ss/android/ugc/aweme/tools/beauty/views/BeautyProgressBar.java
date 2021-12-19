package com.ss.android.ugc.aweme.tools.beauty.views;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class BeautyProgressBar extends FilterBeautySeekBar {

    /* renamed from: h  reason: collision with root package name */
    public boolean f139160h;

    /* renamed from: i  reason: collision with root package name */
    private int f139161i;

    /* renamed from: j  reason: collision with root package name */
    private int f139162j;

    static {
        Covode.recordClassIndex(91011);
    }

    public final int getMaxValue() {
        return this.f139162j;
    }

    public final int getMinValue() {
        return this.f139161i;
    }

    @Override // com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar
    public final int getProgress() {
        String valueOf;
        int progress = super.getProgress();
        if (this.f139160h) {
            float f2 = (float) progress;
            if (f2 >= ((float) getMax()) / 2.0f) {
                valueOf = String.valueOf((int) (((((float) this.f139162j) / (((float) getMax()) / 2.0f)) * f2) - ((float) this.f139162j)));
            } else {
                valueOf = String.valueOf((int) ((((-((float) this.f139161i)) / (((float) getMax()) / 2.0f)) * f2) + ((float) this.f139161i)));
            }
        } else {
            valueOf = String.valueOf((int) (((((float) (this.f139162j - this.f139161i)) / ((float) getMax())) * ((float) progress)) + ((float) this.f139161i)));
        }
        this.f95999a = valueOf;
        return progress;
    }

    public final void setDoubleDirection(boolean z) {
        this.f139160h = z;
    }

    public final void setMaxValue(int i2) {
        this.f139162j = i2;
    }

    public final void setMinValue(int i2) {
        this.f139161i = i2;
    }

    public final synchronized void setProgress(int i2) {
        MethodCollector.i(11931);
        int progress = super.getProgress();
        super.setProgress(i2);
        if (progress == super.getProgress()) {
            invalidate();
        }
        MethodCollector.o(11931);
    }

    public BeautyProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context != null) {
            Paint paint = this.f96001c;
            l.b(paint, "");
            paint.setColor(context.getResources().getColor(R.color.e0));
            Paint paint2 = this.f96001c;
            l.b(paint2, "");
            paint2.setFakeBoldText(true);
        }
    }
}
