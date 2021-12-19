package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;

public class VideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    public int f131199a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f131200b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f131201c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f131202d;

    /* renamed from: e  reason: collision with root package name */
    private float f131203e;

    /* renamed from: f  reason: collision with root package name */
    private int f131204f;

    /* renamed from: g  reason: collision with root package name */
    private int f131205g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f131206h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f131207i;

    /* renamed from: j  reason: collision with root package name */
    private int f131208j;

    /* renamed from: k  reason: collision with root package name */
    private long f131209k;

    static {
        Covode.recordClassIndex(85963);
    }

    private long getProgressbarThreshold() {
        return this.f131209k;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f131201c);
    }

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
    }

    public void setProgressbarThreshold(long j2) {
        this.f131209k = j2;
    }

    public void setReachedBarColor(int i2) {
        this.f131205g = i2;
    }

    public void setReachedProgressBarHeight(float f2) {
        this.f131203e = f2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f131204f) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f131202d.setColor(this.f131205g);
            this.f131202d.setStrokeWidth(this.f131203e);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f131202d);
        }
        canvas.restore();
    }

    public VideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f131203e, Math.abs(this.f131202d.descent() - this.f131202d.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.f131204f = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    private VideoPlayerProgressbar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9616);
        this.f131202d = new Paint();
        this.f131203e = (float) ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        this.f131206h = true;
        this.f131207i = true;
        this.f131208j = 0;
        this.f131209k = AVExternalServiceImpl.a().configService().avsettingsConfig().progressBarThreshold();
        this.f131201c = new Runnable() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar.AnonymousClass1 */

            static {
                Covode.recordClassIndex(85964);
            }

            public final void run() {
                if (!VideoPlayerProgressbar.this.f131200b) {
                    VideoPlayerProgressbar.this.incrementProgressBy(50);
                    VideoPlayerProgressbar videoPlayerProgressbar = VideoPlayerProgressbar.this;
                    videoPlayerProgressbar.f131199a = videoPlayerProgressbar.getProgress();
                    if (VideoPlayerProgressbar.this.getMax() < VideoPlayerProgressbar.this.f131199a) {
                        VideoPlayerProgressbar videoPlayerProgressbar2 = VideoPlayerProgressbar.this;
                        videoPlayerProgressbar2.removeCallbacks(videoPlayerProgressbar2.f131201c);
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j2 = uptimeMillis + (50 - (uptimeMillis % 50));
                    VideoPlayerProgressbar videoPlayerProgressbar3 = VideoPlayerProgressbar.this;
                    if (videoPlayerProgressbar3.getHandler() != null) {
                        videoPlayerProgressbar3.getHandler().postAtTime(videoPlayerProgressbar3.f131201c, j2);
                    }
                }
            }
        };
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a9j, R.attr.a9k});
        this.f131205g = obtainStyledAttributes.getColor(0, -261935);
        this.f131203e = obtainStyledAttributes.getDimension(1, this.f131203e);
        obtainStyledAttributes.recycle();
        MethodCollector.o(9616);
    }
}
