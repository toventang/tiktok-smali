package com.ss.android.ugc.aweme.detail.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.f.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;

public class MarqueeView2 extends MarqueeView {
    static {
        Covode.recordClassIndex(49705);
    }

    public Paint getPaint() {
        return this.f95215a;
    }

    @Override // com.ss.android.ugc.aweme.feed.widget.MarqueeView
    public void setText(String str) {
        this.f95217c = str + "    ";
        this.f95221g = this.f95215a.measureText(this.f95217c);
        this.f95220f = 0.0f;
        this.f95223i = 0;
        this.f95224j = a.a().a(this.f95217c);
        requestLayout();
    }

    @Override // com.ss.android.ugc.aweme.feed.widget.MarqueeView
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        if (!TextUtils.isEmpty(this.f95217c)) {
            float f2 = 0.0f;
            if (this.f95221g != 0.0f) {
                if (this.f95224j) {
                    f2 = ((float) getWidth()) - this.f95221g;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f95223i > 0) {
                    float f3 = ((float) ((uptimeMillis - this.f95223i) * ((long) this.f95218d))) / 1000.0f;
                    float f4 = this.f95220f;
                    if (this.f95224j) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    this.f95220f = f4 + (f3 * ((float) i3));
                    this.f95220f %= this.f95221g;
                }
                if (this.f95222h == 0) {
                    this.f95223i = uptimeMillis;
                }
                this.f95215a.getFontMetrics(this.f95216b);
                if (this.f95222h == 0) {
                    while (true) {
                        float measuredWidth = (float) getMeasuredWidth();
                        float f5 = this.f95220f;
                        if (this.f95224j) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        if (f2 >= measuredWidth + (f5 * ((float) i2))) {
                            break;
                        }
                        canvas.drawText(this.f95217c, this.f95220f + f2, -this.f95216b.top, this.f95215a);
                        f2 += this.f95221g;
                    }
                } else {
                    canvas.drawText(this.f95217c, this.f95220f + f2, -this.f95216b.top, this.f95215a);
                }
                if (this.f95222h == 0) {
                    postInvalidateDelayed(this.f95219e);
                }
            }
        }
    }

    public MarqueeView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.ugc.aweme.feed.widget.MarqueeView
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i3) == 0) {
            this.f95215a.getFontMetrics(this.f95216b);
            setMeasuredDimension(View.MeasureSpec.getSize(i2), (int) (this.f95216b.bottom - this.f95216b.top));
            return;
        }
        super.onMeasure(i2, i3);
    }
}
