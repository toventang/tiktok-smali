package com.ss.android.ugc.aweme.choosemusic.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.k.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Objects;

public final class StarTcmItem extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f70759a;

    /* renamed from: b  reason: collision with root package name */
    private ValueAnimator f70760b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f70761c;

    static {
        Covode.recordClassIndex(43618);
    }

    public StarTcmItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f70761c == null) {
            this.f70761c = new HashMap();
        }
        View view = (View) this.f70761c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f70761c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.f70760b;
    }

    public final View getUnderView() {
        return this.f70759a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f70760b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.f70760b = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.f70759a = view;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StarTcmItem f70762a;

        static {
            Covode.recordClassIndex(43619);
        }

        a(StarTcmItem starTcmItem) {
            this.f70762a = starTcmItem;
        }

        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f70766a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup.MarginLayoutParams f70767b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f70768c;

            static {
                Covode.recordClassIndex(43621);
            }

            public final void onAnimationStart(Animator animator) {
                View underView = this.f70766a.f70762a.getUnderView();
                if (underView != null) {
                    ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
                    layoutParams.height = underView.getMeasuredHeight() + this.f70766a.f70762a.getHeight() + this.f70767b.topMargin + this.f70767b.bottomMargin;
                    underView.setLayoutParams(layoutParams);
                }
            }

            b(a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
                this.f70766a = aVar;
                this.f70767b = marginLayoutParams;
                this.f70768c = i2;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a$a  reason: collision with other inner class name */
        static final class C1600a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f70763a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup.MarginLayoutParams f70764b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f70765c;

            static {
                Covode.recordClassIndex(43620);
            }

            C1600a(a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
                this.f70763a = aVar;
                this.f70764b = marginLayoutParams;
                this.f70765c = i2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View underView;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                StarTcmItem starTcmItem = this.f70763a.f70762a;
                float f2 = 0.0f;
                if (floatValue >= 0.0f && floatValue <= 200.0f) {
                    f2 = 1.0f - (floatValue / 200.0f);
                }
                starTcmItem.setAlpha(f2);
                if (floatValue >= 100.0f && floatValue <= 300.0f && (underView = this.f70763a.f70762a.getUnderView()) != null) {
                    float height = ((floatValue - 100.0f) / 200.0f) * (((float) this.f70763a.f70762a.getHeight()) + ((float) this.f70764b.topMargin) + ((float) this.f70764b.bottomMargin));
                    ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = this.f70765c - ((int) height);
                    underView.setLayoutParams(marginLayoutParams);
                }
            }
        }

        public final void onClick(View view) {
            ViewGroup.LayoutParams layoutParams;
            ClickAgent.onClick(view);
            a.C2857a.a("show_tcm_info", (Object) false, "music_sp");
            ViewGroup.LayoutParams layoutParams2 = this.f70762a.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            View underView = this.f70762a.getUnderView();
            if (underView != null) {
                layoutParams = underView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            StarTcmItem starTcmItem = this.f70762a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 300.0f);
            ofFloat.addUpdateListener(new C1600a(this, marginLayoutParams, i2));
            ofFloat.addListener(new b(this, marginLayoutParams, i2));
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new LinearInterpolator());
            starTcmItem.setCurrentAnimator(ofFloat);
            ValueAnimator currentAnimator = this.f70762a.getCurrentAnimator();
            if (currentAnimator != null) {
                currentAnimator.start();
            }
        }
    }

    private /* synthetic */ StarTcmItem(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StarTcmItem(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3064);
        View.inflate(context, R.layout.bk6, this);
        setOrientation(1);
        ((ImageView) a(R.id.eik)).setOnClickListener(new a(this));
        String string = getContext().getString(R.string.g2c);
        l.b(string, "");
        String string2 = getContext().getString(R.string.g2b);
        l.b(string2, "");
        SpannableString spannableString = new SpannableString(getContext().getString(R.string.g2b, string));
        spannableString.setSpan(new StyleSpan(1), p.a((CharSequence) string2, "%s", 0, false, 6), p.a((CharSequence) string2, "%s", 0, false, 6) + string.length(), 33);
        ((ImageView) a(R.id.e9c)).setImageResource(2131232695);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.e9d);
        l.b(tuxTextView, "");
        tuxTextView.setText(spannableString);
        setLayerType(1, null);
        MethodCollector.o(3064);
    }
}
