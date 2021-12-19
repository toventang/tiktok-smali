package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

public class VHeadView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f22545a;

    /* renamed from: b  reason: collision with root package name */
    private int f22546b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f22547c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f22548d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f22549e;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f22550f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22551g = false;

    /* renamed from: h  reason: collision with root package name */
    private Paint f22552h = new Paint();

    static {
        Covode.recordClassIndex(13299);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public void setAuthor(boolean z) {
        if (this.f22551g != z) {
            this.f22551g = z;
            invalidate();
        }
    }

    public void setVResId(int i2) {
        if (this.f22546b != i2) {
            this.f22546b = i2;
            this.f22547c = null;
            invalidate();
        }
    }

    public void setVAble(boolean z) {
        if (this.f22548d.booleanValue() != z) {
            this.f22548d = Boolean.valueOf(z);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Bitmap decodeResource;
        Bitmap decodeResource2;
        MethodCollector.i(10769);
        super.onDraw(canvas);
        if (this.f22548d.booleanValue() || this.f22551g) {
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(width, height);
            if (this.f22548d.booleanValue()) {
                if (this.f22547c == null && (decodeResource2 = BitmapFactory.decodeResource(getResources(), this.f22546b)) != null) {
                    this.f22547c = decodeResource2;
                }
                Bitmap bitmap = this.f22547c;
                if (bitmap != null) {
                    int width2 = (min - bitmap.getWidth()) - this.f22545a;
                    int height2 = min - this.f22547c.getHeight();
                    if (width > height) {
                        width2 += (width - height) / 2;
                    } else {
                        height2 += (height - width) / 2;
                    }
                    canvas.drawBitmap(this.f22547c, (float) width2, (float) height2, this.f22552h);
                }
            }
            if (this.f22551g) {
                if (this.f22550f == null && (decodeResource = BitmapFactory.decodeResource(getResources(), this.f22549e)) != null) {
                    this.f22550f = decodeResource;
                }
                Bitmap bitmap2 = this.f22550f;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (float) ((min - bitmap2.getWidth()) / 2), (float) (min - this.f22550f.getHeight()), this.f22552h);
                }
            }
            MethodCollector.o(10769);
            return;
        }
        MethodCollector.o(10769);
    }

    public VHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.iq, R.attr.asx, R.attr.asy});
        this.f22546b = obtainStyledAttributes.getResourceId(2, 2131234720);
        this.f22548d = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, false));
        this.f22549e = obtainStyledAttributes.getResourceId(0, 2131233987);
        obtainStyledAttributes.recycle();
    }
}
