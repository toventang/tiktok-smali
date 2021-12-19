package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class MultiSelectView extends CardView implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f128826e;

    /* renamed from: f  reason: collision with root package name */
    public final TuxTextView f128827f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f128828g;

    /* renamed from: h  reason: collision with root package name */
    public int f128829h;

    /* renamed from: i  reason: collision with root package name */
    public int f128830i;

    /* renamed from: j  reason: collision with root package name */
    public int f128831j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f128832k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f128833l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f128834m;
    public int n;
    public int o;
    public final c p;
    private a q;
    private ValueAnimator r;

    public interface a {
        static {
            Covode.recordClassIndex(84554);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(84552);
    }

    public MultiSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final a getOnModeChangeListener() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f128828g = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f128828g = false;
    }

    private final void a() {
        if (this.r == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new b(this));
            this.r = ofFloat;
        }
    }

    public final void setOnModeChangeListener(a aVar) {
        this.q = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (!this.f128834m) {
            a();
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator == null) {
                l.b();
            }
            if (!valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.r;
                if (valueAnimator2 == null) {
                    l.b();
                }
                valueAnimator2.start();
                return;
            }
            return;
        }
        a();
        ValueAnimator valueAnimator3 = this.r;
        if (valueAnimator3 == null) {
            l.b();
        }
        if (!valueAnimator3.isRunning()) {
            ValueAnimator valueAnimator4 = this.r;
            if (valueAnimator4 == null) {
                l.b();
            }
            valueAnimator4.start();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiSelectView f128836a;

        static {
            Covode.recordClassIndex(84555);
        }

        b(MultiSelectView multiSelectView) {
            this.f128836a = multiSelectView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (!this.f128836a.f128834m) {
                float f2 = 1.0f - animatedFraction;
                this.f128836a.f128827f.setAlpha(f2);
                ViewGroup.LayoutParams layoutParams = this.f128836a.getLayoutParams();
                layoutParams.width = (int) (((float) this.f128836a.o) + (((float) (this.f128836a.n - this.f128836a.o)) * f2));
                MultiSelectView multiSelectView = this.f128836a;
                multiSelectView.setLayoutParams(layoutParams);
                Integer a2 = c.a(animatedFraction, Integer.valueOf(multiSelectView.f128830i), Integer.valueOf(multiSelectView.f128829h));
                l.b(a2, "");
                multiSelectView.setCardBackgroundColor(a2.intValue());
                if (animatedFraction == 1.0f) {
                    this.f128836a.f128834m = true;
                    this.f128836a.f128826e.setImageDrawable(this.f128836a.f128832k);
                    this.f128836a.postDelayed(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f128837a;

                        static {
                            Covode.recordClassIndex(84556);
                        }

                        {
                            this.f128837a = r1;
                        }

                        public final void run() {
                            a onModeChangeListener;
                            if (this.f128837a.f128836a.f128828g && (onModeChangeListener = this.f128837a.f128836a.getOnModeChangeListener()) != null) {
                                onModeChangeListener.a(this.f128837a.f128836a.f128834m);
                            }
                        }
                    }, 50);
                    return;
                }
                return;
            }
            this.f128836a.f128827f.setAlpha(animatedFraction);
            ViewGroup.LayoutParams layoutParams2 = this.f128836a.getLayoutParams();
            layoutParams2.width = (int) (((float) this.f128836a.o) + (((float) (this.f128836a.n - this.f128836a.o)) * animatedFraction));
            MultiSelectView multiSelectView2 = this.f128836a;
            multiSelectView2.setLayoutParams(layoutParams2);
            Integer a3 = c.a(animatedFraction, Integer.valueOf(multiSelectView2.f128829h), Integer.valueOf(multiSelectView2.f128830i));
            l.b(a3, "");
            multiSelectView2.setCardBackgroundColor(a3.intValue());
            if (animatedFraction == 1.0f) {
                this.f128836a.f128834m = false;
                this.f128836a.f128826e.setImageDrawable(this.f128836a.f128833l);
                this.f128836a.postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.b.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f128838a;

                    static {
                        Covode.recordClassIndex(84557);
                    }

                    {
                        this.f128838a = r1;
                    }

                    public final void run() {
                        a onModeChangeListener;
                        if (this.f128838a.f128836a.f128828g && (onModeChangeListener = this.f128838a.f128836a.getOnModeChangeListener()) != null) {
                            onModeChangeListener.a(this.f128838a.f128836a.f128834m);
                        }
                    }
                }, 50);
            }
        }
    }

    private /* synthetic */ MultiSelectView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MultiSelectView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10482);
        ImageView imageView = new ImageView(context);
        this.f128826e = imageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        this.f128827f = tuxTextView;
        this.p = new c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.py, R.attr.a62, R.attr.a63, R.attr.a64, R.attr.a65}, 0, 0);
        l.b(obtainStyledAttributes, "");
        this.f128831j = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f128829h = obtainStyledAttributes.getColor(1, 0);
        this.f128830i = obtainStyledAttributes.getColor(3, 0);
        this.f128832k = obtainStyledAttributes.getDrawable(2);
        this.f128833l = obtainStyledAttributes.getDrawable(4);
        obtainStyledAttributes.recycle();
        int i2 = this.f128831j;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        imageView.setImageDrawable(this.f128833l);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(53);
        tuxTextView.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int i3 = this.f128831j;
        l.d(context, "");
        int i4 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(i3);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setText(tuxTextView.getResources().getString(R.string.d6d));
        if (com.ss.android.ugc.aweme.tools.c.a(context)) {
            tuxTextView.setPadding(this.f128831j / 2, 0, 0, 0);
        } else {
            tuxTextView.setPadding(0, 0, this.f128831j / 2, 0);
        }
        tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.bx));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(imageView);
        addView(tuxTextView);
        setOnClickListener(this);
        setClipChildren(false);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MultiSelectView f128835a;

            static {
                Covode.recordClassIndex(84553);
            }

            public final void onGlobalLayout() {
                this.f128835a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MultiSelectView multiSelectView = this.f128835a;
                multiSelectView.n = multiSelectView.getMeasuredWidth();
                MultiSelectView multiSelectView2 = this.f128835a;
                multiSelectView2.o = multiSelectView2.f128826e.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = this.f128835a.f128827f.getLayoutParams();
                layoutParams.width = this.f128835a.n - this.f128835a.f128831j;
                this.f128835a.f128827f.setLayoutParams(layoutParams);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f128835a = r1;
            }
        });
        MethodCollector.o(10482);
    }
}
