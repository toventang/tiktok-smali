package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.adapter.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public final class AdPopUpWebNaviBar extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    boolean f74289a;

    /* renamed from: b  reason: collision with root package name */
    private Animator f74290b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f74291c;

    /* renamed from: d  reason: collision with root package name */
    private a f74292d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f74293e;

    public interface a {
        static {
            Covode.recordClassIndex(45841);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(45838);
    }

    public AdPopUpWebNaviBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f74293e == null) {
            this.f74293e = new HashMap();
        }
        View view = (View) this.f74293e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f74293e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final a getNaviBarListener() {
        return this.f74292d;
    }

    public final int getBottomMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f74290b;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void a() {
        if (!this.f74291c) {
            Animator animator = this.f74290b;
            if ((animator == null || !animator.isRunning()) && !this.f74289a) {
                this.f74291c = true;
                this.f74289a = true;
                b(n.a(-52.0d), 0);
            }
        }
    }

    public final void setNaviBarListener(a aVar) {
        this.f74292d = aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebNaviBar f74296a;

        static {
            Covode.recordClassIndex(45842);
        }

        b(AdPopUpWebNaviBar adPopUpWebNaviBar) {
            this.f74296a = adPopUpWebNaviBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AdPopUpWebNaviBar adPopUpWebNaviBar = this.f74296a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            adPopUpWebNaviBar.setBottomMargin(((Integer) animatedValue).intValue());
        }
    }

    public final void setBottomMargin(int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i2;
        setLayoutParams(marginLayoutParams);
    }

    public final void setGoBackEnable(boolean z) {
        float f2;
        TuxIconView tuxIconView = (TuxIconView) a(R.id.d76);
        l.b(tuxIconView, "");
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.34f;
        }
        tuxIconView.setAlpha(f2);
    }

    public final void setGoForwardEnable(boolean z) {
        float f2;
        TuxIconView tuxIconView = (TuxIconView) a(R.id.d77);
        l.b(tuxIconView, "");
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.34f;
        }
        tuxIconView.setAlpha(f2);
    }

    private final void b(int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
        ofInt.addUpdateListener(new b(this));
        l.b(ofInt, "");
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new g());
        ofInt.setTarget(this);
        ofInt.start();
        this.f74290b = ofInt;
    }

    public final void a(int i2, int i3) {
        if (getVisibility() != 8) {
            if (i2 - i3 <= 0) {
                a();
            } else if (this.f74291c) {
                Animator animator = this.f74290b;
                if ((animator == null || !animator.isRunning()) && !this.f74289a) {
                    this.f74291c = false;
                    this.f74289a = true;
                    b(0, n.a(-52.0d));
                }
            }
        }
    }

    private /* synthetic */ AdPopUpWebNaviBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPopUpWebNaviBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9565);
        com.a.a(LayoutInflater.from(context), R.layout.bjy, this, true);
        ((TuxIconView) a(R.id.d76)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AdPopUpWebNaviBar f74294a;

            static {
                Covode.recordClassIndex(45839);
            }

            {
                this.f74294a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                a naviBarListener = this.f74294a.getNaviBarListener();
                if (naviBarListener != null) {
                    naviBarListener.a();
                }
            }
        });
        ((TuxIconView) a(R.id.d77)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AdPopUpWebNaviBar f74295a;

            static {
                Covode.recordClassIndex(45840);
            }

            {
                this.f74295a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                a naviBarListener = this.f74295a.getNaviBarListener();
                if (naviBarListener != null) {
                    naviBarListener.b();
                }
            }
        });
        MethodCollector.o(9565);
    }
}
