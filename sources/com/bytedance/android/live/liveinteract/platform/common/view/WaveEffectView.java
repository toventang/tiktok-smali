package com.bytedance.android.live.liveinteract.platform.common.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WaveEffectView extends View {

    /* renamed from: a  reason: collision with root package name */
    public float f12049a;

    /* renamed from: b  reason: collision with root package name */
    public float f12050b;

    /* renamed from: c  reason: collision with root package name */
    public long f12051c;

    /* renamed from: d  reason: collision with root package name */
    public long f12052d;

    /* renamed from: e  reason: collision with root package name */
    public float f12053e;

    /* renamed from: f  reason: collision with root package name */
    public float f12054f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12055g;

    /* renamed from: h  reason: collision with root package name */
    long f12056h;

    /* renamed from: i  reason: collision with root package name */
    List<a> f12057i;

    /* renamed from: j  reason: collision with root package name */
    public Interpolator f12058j;

    /* renamed from: k  reason: collision with root package name */
    public Runnable f12059k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f12060l;

    /* renamed from: m  reason: collision with root package name */
    private int f12061m;
    private ValueAnimator n;

    static {
        Covode.recordClassIndex(6568);
    }

    private void d() {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private long f12065b = System.currentTimeMillis();

        static {
            Covode.recordClassIndex(6571);
        }

        /* access modifiers changed from: package-private */
        public final float a() {
            return (((float) (System.currentTimeMillis() - this.f12065b)) * 1.0f) / ((float) WaveEffectView.this.f12051c);
        }

        a() {
        }
    }

    public final void a() {
        if (!this.f12055g) {
            this.f12055g = true;
            c();
            post(this.f12059k);
        }
    }

    public final void b() {
        if (this.f12055g) {
            this.f12055g = false;
            d();
            this.f12057i.clear();
            removeCallbacks(this.f12059k);
        }
    }

    private void c() {
        if (this.n == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 10.0f);
            this.n = ofFloat;
            ofFloat.setDuration(this.f12051c);
            this.n.setInterpolator(new LinearInterpolator());
            this.n.setRepeatCount(-1);
            this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(6570);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    WaveEffectView.this.invalidate();
                }
            });
        }
        if (!this.n.isStarted()) {
            this.n.start();
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f12058j = interpolator;
    }

    public void setWaveColor(int i2) {
        this.f12061m = i2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(9136);
        super.onDraw(canvas);
        Iterator<a> it = this.f12057i.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.a() >= 1.0f) {
                it.remove();
            } else {
                this.f12060l.setAlpha((int) ((WaveEffectView.this.f12053e + (WaveEffectView.this.f12058j.getInterpolation(next.a()) * (WaveEffectView.this.f12054f - WaveEffectView.this.f12053e))) * 255.0f));
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, WaveEffectView.this.f12049a + (WaveEffectView.this.f12058j.getInterpolation(next.a()) * (WaveEffectView.this.f12050b - WaveEffectView.this.f12049a)), this.f12060l);
            }
        }
        MethodCollector.o(9136);
    }

    public WaveEffectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private WaveEffectView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, -1);
        MethodCollector.i(8936);
        this.f12051c = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        this.f12052d = 500;
        this.f12053e = 1.0f;
        this.f12057i = new ArrayList();
        this.f12058j = new LinearInterpolator();
        this.f12059k = new Runnable() {
            /* class com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(6569);
            }

            public final void run() {
                if (WaveEffectView.this.f12055g) {
                    WaveEffectView waveEffectView = WaveEffectView.this;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - waveEffectView.f12056h >= waveEffectView.f12052d) {
                        waveEffectView.f12057i.add(new a());
                        waveEffectView.invalidate();
                        waveEffectView.f12056h = currentTimeMillis;
                    }
                    WaveEffectView waveEffectView2 = WaveEffectView.this;
                    waveEffectView2.postDelayed(waveEffectView2.f12059k, WaveEffectView.this.f12052d);
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.at7, R.attr.at8, R.attr.at9, R.attr.at_, R.attr.ata, R.attr.atb, R.attr.atc}, -1, 0);
        this.f12061m = obtainStyledAttributes.getColor(0, -7829368);
        this.f12049a = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f12050b = obtainStyledAttributes.getDimension(5, -1.0f);
        this.f12051c = (long) obtainStyledAttributes.getInt(1, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        this.f12052d = (long) obtainStyledAttributes.getInt(4, 500);
        this.f12053e = obtainStyledAttributes.getFloat(6, 1.0f);
        this.f12054f = obtainStyledAttributes.getFloat(2, 0.0f);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f12060l = paint;
        paint.setColor(this.f12061m);
        MethodCollector.o(8936);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int min = Math.min(i2, i3) / 2;
        float f2 = this.f12050b;
        if (f2 == -1.0f || f2 > ((float) min)) {
            this.f12050b = (float) min;
        }
        if (this.f12049a > ((float) min)) {
            this.f12049a = this.f12050b / 2.0f;
        }
    }
}
