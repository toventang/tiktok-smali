package com.bytedance.android.ecommerce.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class OcrScanView extends View {

    /* renamed from: a  reason: collision with root package name */
    public Matrix f7319a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private Paint f7320b;

    /* renamed from: c  reason: collision with root package name */
    private int f7321c;

    /* renamed from: d  reason: collision with root package name */
    private int f7322d;

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f7323e = BitmapFactory.decodeResource(getResources(), R.drawable.bbc);

    /* renamed from: f  reason: collision with root package name */
    private float f7324f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private ValueAnimator f7325g;

    /* renamed from: h  reason: collision with root package name */
    private long f7326h = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    static {
        Covode.recordClassIndex(3507);
    }

    private ValueAnimator.AnimatorUpdateListener getUpdateListener() {
        return new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.android.ecommerce.view.OcrScanView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3508);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OcrScanView.this.f7319a.setTranslate(0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                OcrScanView.this.invalidate();
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7325g.isRunning()) {
            this.f7325g.cancel();
        }
        a(true);
    }

    private void a(boolean z) {
        this.f7319a.reset();
        this.f7319a.setTranslate(0.0f, -this.f7324f);
        this.f7319a.preScale(1.0f, 1.0f);
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(7479);
        super.onDraw(canvas);
        Bitmap bitmap = this.f7323e;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f7319a, this.f7320b);
        }
        MethodCollector.o(7479);
    }

    public OcrScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(7478);
        Paint paint = new Paint(1);
        this.f7320b = paint;
        paint.setStyle(Paint.Style.FILL);
        MethodCollector.o(7478);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        MethodCollector.i(7495);
        super.onSizeChanged(i2, i3, i4, i5);
        this.f7321c = i2;
        this.f7322d = i3;
        Bitmap bitmap = this.f7323e;
        if (bitmap == null || i2 <= 0 || i3 <= 0) {
            MethodCollector.o(7495);
            return;
        }
        int width = bitmap.getWidth();
        int i6 = this.f7321c;
        if (width != i6) {
            Bitmap bitmap2 = this.f7323e;
            int height = bitmap2.getHeight();
            int width2 = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            float min = Math.min(((float) height) / ((float) height2), ((float) i6) / ((float) width2));
            Matrix matrix = new Matrix();
            matrix.postScale(min, min);
            this.f7323e = Bitmap.createBitmap(bitmap2, 0, 0, width2, height2, matrix, true);
        }
        this.f7324f = (float) this.f7323e.getHeight();
        a(false);
        ValueAnimator valueAnimator = this.f7325g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7325g.cancel();
        }
        float f2 = this.f7324f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-f2, ((float) this.f7322d) + f2);
        this.f7325g = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(this.f7326h);
            this.f7325g.setRepeatCount(-1);
            this.f7325g.setRepeatMode(1);
            this.f7325g.addUpdateListener(getUpdateListener());
            this.f7325g.start();
        }
        MethodCollector.o(7495);
    }
}
