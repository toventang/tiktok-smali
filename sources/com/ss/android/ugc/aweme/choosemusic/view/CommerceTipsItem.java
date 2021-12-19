package com.ss.android.ugc.aweme.choosemusic.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
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
import java.util.HashMap;
import java.util.Objects;

public final class CommerceTipsItem extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f70748a;

    /* renamed from: b  reason: collision with root package name */
    private ValueAnimator f70749b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f70750c;

    static {
        Covode.recordClassIndex(43612);
    }

    public CommerceTipsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f70750c == null) {
            this.f70750c = new HashMap();
        }
        View view = (View) this.f70750c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f70750c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.f70749b;
    }

    public final View getUnderView() {
        return this.f70748a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f70749b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.f70749b = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.f70748a = view;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceTipsItem f70751a;

        static {
            Covode.recordClassIndex(43613);
        }

        a(CommerceTipsItem commerceTipsItem) {
            this.f70751a = commerceTipsItem;
        }

        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f70755a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup.MarginLayoutParams f70756b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f70757c;

            static {
                Covode.recordClassIndex(43615);
            }

            public final void onAnimationStart(Animator animator) {
                View underView = this.f70755a.f70751a.getUnderView();
                if (underView != null) {
                    ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
                    layoutParams.height = underView.getMeasuredHeight() + this.f70755a.f70751a.getHeight() + this.f70756b.topMargin + this.f70756b.bottomMargin;
                    underView.setLayoutParams(layoutParams);
                }
            }

            b(a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
                this.f70755a = aVar;
                this.f70756b = marginLayoutParams;
                this.f70757c = i2;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem$a$a  reason: collision with other inner class name */
        static final class C1599a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f70752a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup.MarginLayoutParams f70753b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f70754c;

            static {
                Covode.recordClassIndex(43614);
            }

            C1599a(a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
                this.f70752a = aVar;
                this.f70753b = marginLayoutParams;
                this.f70754c = i2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View underView;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                CommerceTipsItem commerceTipsItem = this.f70752a.f70751a;
                float f2 = 0.0f;
                if (floatValue >= 0.0f && floatValue <= 200.0f) {
                    f2 = 1.0f - (floatValue / 200.0f);
                }
                commerceTipsItem.setAlpha(f2);
                if (floatValue >= 100.0f && floatValue <= 300.0f && (underView = this.f70752a.f70751a.getUnderView()) != null) {
                    float height = ((floatValue - 100.0f) / 200.0f) * (((float) this.f70752a.f70751a.getHeight()) + ((float) this.f70753b.topMargin) + ((float) this.f70753b.bottomMargin));
                    ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = this.f70754c - ((int) height);
                    underView.setLayoutParams(marginLayoutParams);
                }
            }
        }

        public final void onClick(View view) {
            ViewGroup.LayoutParams layoutParams;
            ClickAgent.onClick(view);
            a.C2857a.a("show_commerce_tips", (Object) false, "music_sp");
            ViewGroup.LayoutParams layoutParams2 = this.f70751a.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            View underView = this.f70751a.getUnderView();
            if (underView != null) {
                layoutParams = underView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            CommerceTipsItem commerceTipsItem = this.f70751a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 300.0f);
            ofFloat.addUpdateListener(new C1599a(this, marginLayoutParams, i2));
            ofFloat.addListener(new b(this, marginLayoutParams, i2));
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new LinearInterpolator());
            commerceTipsItem.setCurrentAnimator(ofFloat);
            ValueAnimator currentAnimator = this.f70751a.getCurrentAnimator();
            if (currentAnimator != null) {
                currentAnimator.start();
            }
        }
    }

    private /* synthetic */ CommerceTipsItem(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceTipsItem(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5001);
        View.inflate(context, R.layout.bj_, this);
        setOrientation(1);
        ((ImageView) a(R.id.aas)).setOnClickListener(new a(this));
        TuxTextView tuxTextView = (TuxTextView) a(R.id.aar);
        l.b(tuxTextView, "");
        tuxTextView.setText(getContext().getString(R.string.ans));
        setLayerType(1, null);
        MethodCollector.o(5001);
    }
}
