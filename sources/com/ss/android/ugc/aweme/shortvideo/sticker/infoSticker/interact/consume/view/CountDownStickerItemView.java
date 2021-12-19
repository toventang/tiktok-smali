package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class CountDownStickerItemView extends View implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final ObjectAnimator f130411a;

    /* renamed from: b  reason: collision with root package name */
    private int f130412b;

    /* renamed from: c  reason: collision with root package name */
    private int f130413c;

    /* renamed from: d  reason: collision with root package name */
    private int f130414d = 1;

    /* renamed from: e  reason: collision with root package name */
    private int f130415e = 1;

    /* renamed from: f  reason: collision with root package name */
    private float f130416f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    private float f130417g;

    /* renamed from: h  reason: collision with root package name */
    private float f130418h;

    /* renamed from: i  reason: collision with root package name */
    private float f130419i = 71.0f;

    /* renamed from: j  reason: collision with root package name */
    private Paint f130420j = new Paint();

    /* renamed from: k  reason: collision with root package name */
    private boolean f130421k = true;

    static {
        Covode.recordClassIndex(85529);
    }

    public final float getAnimProgress() {
        return this.f130416f;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownStickerItemView f130423a;

        static {
            Covode.recordClassIndex(85531);
        }

        a(CountDownStickerItemView countDownStickerItemView) {
            this.f130423a = countDownStickerItemView;
        }

        public final void run() {
            this.f130423a.f130411a.start();
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        invalidate();
    }

    public final void setAnimProgress(float f2) {
        this.f130416f = f2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00cb, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0151, code lost:
        if (r10 != null) goto L_0x0126;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r10) {
        /*
        // Method dump skipped, instructions count: 416
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerItemView.onDraw(android.graphics.Canvas):void");
    }

    public final void a(int i2, int i3) {
        if (i2 == this.f130414d && i3 == this.f130415e) {
            if (i2 != this.f130412b || i3 != this.f130413c) {
                this.f130412b = i2;
                this.f130413c = i3;
            } else {
                return;
            }
        } else if (this.f130421k) {
            this.f130414d = i2;
            this.f130412b = i2;
            this.f130415e = i3;
            this.f130413c = i3;
            this.f130421k = false;
        } else {
            this.f130414d = this.f130412b;
            this.f130412b = i2;
            this.f130415e = this.f130413c;
            this.f130413c = i3;
        }
        post(new a(this));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(2535);
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension((int) (this.f130420j.measureText("0") * 2.0f), (int) (this.f130420j.getFontMetrics().bottom - this.f130420j.getFontMetrics().top));
                MethodCollector.o(2535);
                return;
            }
        } else if (mode != Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(size, (int) (this.f130420j.measureText("0") * 2.0f));
            }
            MethodCollector.o(2535);
            return;
        }
        setMeasuredDimension((int) (this.f130420j.measureText("0") * 2.0f), size2);
        MethodCollector.o(2535);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountDownStickerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(2551);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animProgress", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        l.b(ofFloat, "");
        this.f130411a = ofFloat;
        float b2 = n.b(getContext(), 37.0f);
        this.f130419i = b2;
        this.f130420j.setTextSize(b2);
        this.f130420j.setColor(-1);
        this.f130420j.setTextAlign(Paint.Align.LEFT);
        this.f130420j.setTypeface(b.a().a("bold"));
        this.f130420j.setShadowLayer(2.0f, -0.5f, 0.5f, androidx.core.content.b.c(getContext(), R.color.bl));
        this.f130420j.setAntiAlias(true);
        this.f130420j.setTextAlign(Paint.Align.CENTER);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerItemView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CountDownStickerItemView f130422a;

            static {
                Covode.recordClassIndex(85530);
            }

            {
                this.f130422a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f130422a.invalidate();
            }
        });
        this.f130417g = this.f130420j.measureText("0") * 0.5f;
        this.f130418h = this.f130420j.measureText("0") * 1.5f;
        MethodCollector.o(2551);
    }
}
