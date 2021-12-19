package com.bytedance.ies.uikit.progressview;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class CircleProgress extends View {
    private int[] COLORS;
    private final double DEGREE = 0.017453292519943295d;
    private a[] mArcPoint;
    private Point mCenter = new Point();
    private long mDuration = 3600;
    private TimeInterpolator mInterpolator = new b();
    private Paint mPaint;
    private long mPlayTime;
    private int mPointRadius;
    private boolean mStartAnim = false;
    private long mStartTime;
    private int mViewSize;

    static {
        Covode.recordClassIndex(21212);
    }

    public void stopAnim() {
        this.mStartAnim = false;
    }

    static class b implements TimeInterpolator {
        static {
            Covode.recordClassIndex(21214);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 * 2.0f;
            if (f3 < 1.0f) {
                return 0.5f * f3 * f3 * f3;
            }
            float f4 = f3 - 2.0f;
            return (0.5f * f4 * f4 * f4) + 1.0f;
        }

        b() {
        }
    }

    public void reset() {
        stopAnim();
        this.mPlayTime = 0;
        postInvalidate();
    }

    private float getFactor() {
        if (this.mStartAnim) {
            this.mPlayTime = AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
        }
        return (((float) this.mPlayTime) / ((float) this.mDuration)) % 5.0f;
    }

    public void startAnim() {
        this.mPlayTime %= this.mDuration;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartAnim = true;
        postInvalidate();
    }

    public void setDuration(long j2) {
        this.mDuration = j2;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
    }

    public void setRadius(float f2) {
        stopAnim();
        calPoints(f2);
        startAnim();
    }

    public CircleProgress(Context context) {
        super(context);
        MethodCollector.i(12779);
        init(null, 0);
        MethodCollector.o(12779);
    }

    private void calPoints(float f2) {
        int i2 = (int) (((float) (this.mViewSize / 3)) * f2);
        this.mPointRadius = i2 / 6;
        int i3 = 0;
        do {
            float f3 = (float) i2;
            double d2 = (double) i3;
            Double.isNaN(d2);
            double d3 = d2 * 0.7853981633974483d;
            this.mArcPoint[i3] = new a((-((float) Math.sin(d3))) * f3, f3 * (-((float) Math.cos(d3))), this.COLORS[i3 % 3]);
            i3++;
        } while (i3 < 8);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate((float) this.mCenter.x, (float) this.mCenter.y);
        float factor = getFactor();
        canvas.rotate(36.0f * factor);
        int i2 = 0;
        do {
            this.mPaint.setColor(this.mArcPoint[i2].f35482c);
            float itemFactor = getItemFactor(i2, factor);
            canvas.drawCircle(this.mArcPoint[i2].f35480a - ((this.mArcPoint[i2].f35480a * 2.0f) * itemFactor), this.mArcPoint[i2].f35481b - ((this.mArcPoint[i2].f35481b * 2.0f) * itemFactor), (float) this.mPointRadius, this.mPaint);
            i2++;
        } while (i2 < 8);
        canvas.restore();
        if (this.mStartAnim) {
            postInvalidate();
        }
    }

    private float getItemFactor(int i2, float f2) {
        float f3 = (f2 - (((float) i2) * 0.0825f)) * 3.0f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return this.mInterpolator.getInterpolation(f3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.gt);
        int min = Math.min(getDefaultSize(dimensionPixelSize, i2), getDefaultSize(dimensionPixelSize, i3));
        this.mViewSize = min;
        setMeasuredDimension(min, min);
        Point point = this.mCenter;
        int i4 = this.mViewSize;
        point.set(i4 / 2, i4 / 2);
        calPoints(1.0f);
    }

    public CircleProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(12780);
        init(attributeSet, 0);
        MethodCollector.o(12780);
    }

    private void init(AttributeSet attributeSet, int i2) {
        this.mArcPoint = new a[8];
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ob, R.attr.oc, R.attr.od}, i2, 0);
        int color = obtainStyledAttributes.getColor(0, -1759188);
        int color2 = obtainStyledAttributes.getColor(1, -14708582);
        int color3 = obtainStyledAttributes.getColor(2, -221678);
        obtainStyledAttributes.recycle();
        this.COLORS = new int[]{color, color2, color3};
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        float f35480a;

        /* renamed from: b  reason: collision with root package name */
        float f35481b;

        /* renamed from: c  reason: collision with root package name */
        int f35482c;

        static {
            Covode.recordClassIndex(21213);
        }

        a(float f2, float f3, int i2) {
            this.f35480a = f2;
            this.f35481b = f3;
            this.f35482c = i2;
        }
    }

    public CircleProgress(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(12782);
        init(attributeSet, i2);
        MethodCollector.o(12782);
    }
}
