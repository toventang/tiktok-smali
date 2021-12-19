package com.ss.android.ugc.aweme.unread;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.b;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class UnReadCircleView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f141989a;

    /* renamed from: b  reason: collision with root package name */
    private float f141990b;

    /* renamed from: c  reason: collision with root package name */
    private float f141991c;

    /* renamed from: d  reason: collision with root package name */
    private float f141992d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f141993e;

    /* renamed from: f  reason: collision with root package name */
    private final LottieAnimationView f141994f;

    static {
        Covode.recordClassIndex(92780);
    }

    public UnReadCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f141994f.f5109b.g()) {
            this.f141994f.d();
            this.f141994f.setVisibility(8);
        }
    }

    public final void setStrokeWidth(float f2) {
        this.f141993e.setStrokeWidth(f2);
        this.f141989a = f2;
    }

    public final void setLoadingAnim(String str) {
        l.d(str, "");
        this.f141994f.setAnimation(str);
    }

    public final void setStrokeColor(int i2) {
        this.f141993e.setColor(getResources().getColor(i2));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(3504);
        l.d(canvas, "");
        super.onDraw(canvas);
        if (this.f141994f.getVisibility() == 0) {
            MethodCollector.o(3504);
            return;
        }
        canvas.drawCircle(this.f141990b, this.f141991c, this.f141992d, this.f141993e);
        MethodCollector.o(3504);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(3503);
        super.onMeasure(i2, i3);
        this.f141990b = ((float) getMeasuredWidth()) / 2.0f;
        this.f141991c = ((float) getMeasuredHeight()) / 2.0f;
        this.f141992d = ((float) (getMeasuredHeight() / 2)) - (this.f141989a / 2.0f);
        MethodCollector.o(3503);
    }

    private /* synthetic */ UnReadCircleView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private UnReadCircleView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3764);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.afn, R.attr.afo});
        l.b(obtainStyledAttributes, "");
        this.f141989a = (float) obtainStyledAttributes.getDimensionPixelSize(1, (int) n.b(context, 2.0f));
        obtainStyledAttributes.recycle();
        setBackgroundColor(b.c(getContext(), R.color.c9));
        Paint paint = new Paint();
        paint.setColor(b.c(context, R.color.f159917a));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f141989a);
        this.f141993e = paint;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.f141994f = lottieAnimationView;
        lottieAnimationView.setAnimation("story_upload_loading_yellow_lottie.json");
        lottieAnimationView.setLayerType(2, null);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setVisibility(8);
        addView(lottieAnimationView, new FrameLayout.LayoutParams(-1, -1));
        MethodCollector.o(3764);
    }
}
