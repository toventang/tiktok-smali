package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.Objects;

public final class ShoutoutsReviewHeaderSteps extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public boolean f133453g;

    /* renamed from: h  reason: collision with root package name */
    public LinearLayout f133454h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f133455i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f133456j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f133457k;

    static {
        Covode.recordClassIndex(87277);
    }

    public ShoutoutsReviewHeaderSteps(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsReviewHeaderSteps f133460a;

        static {
            Covode.recordClassIndex(87280);
        }

        public final void onGlobalLayout() {
            if (ShoutoutsReviewHeaderSteps.a(this.f133460a).getWidth() > 0) {
                this.f133460a.f133456j = true;
                ShoutoutsReviewHeaderSteps.a(this.f133460a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (this.f133460a.f133457k) {
                    this.f133460a.b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
            this.f133460a = shoutoutsReviewHeaderSteps;
        }
    }

    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsReviewHeaderSteps f133461a;

        static {
            Covode.recordClassIndex(87281);
        }

        public final void onGlobalLayout() {
            if (ShoutoutsReviewHeaderSteps.b(this.f133461a).getWidth() > 0) {
                this.f133461a.f133457k = true;
                ShoutoutsReviewHeaderSteps.b(this.f133461a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (this.f133461a.f133456j) {
                    this.f133461a.b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
            this.f133461a = shoutoutsReviewHeaderSteps;
        }
    }

    public final void b() {
        int i2;
        MethodCollector.i(3099);
        int a2 = com.bytedance.ies.dmt.ui.f.b.a(getContext());
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a3 = a2 - h.g.a.a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
        int i3 = a3 / 2;
        LinearLayout linearLayout = this.f133454h;
        if (linearLayout == null) {
            l.a("llTerm");
        }
        int width = linearLayout.getWidth();
        LinearLayout linearLayout2 = this.f133455i;
        if (linearLayout2 == null) {
            l.a("llFAQ");
        }
        if (a3 < width + linearLayout2.getWidth()) {
            LinearLayout linearLayout3 = this.f133454h;
            if (linearLayout3 == null) {
                l.a("llTerm");
            }
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = this.f133455i;
            if (linearLayout4 == null) {
                l.a("llFAQ");
            }
            linearLayout4.setVisibility(8);
            View findViewById = findViewById(R.id.an6);
            l.b(findViewById, "");
            findViewById.setVisibility(8);
            LinearLayout linearLayout5 = this.f133454h;
            if (linearLayout5 == null) {
                l.a("llTerm");
            }
            if (linearLayout5.getWidth() > i3) {
                i2 = R.id.fjz;
            } else {
                i2 = R.id.fk0;
            }
            View inflate = ((ViewStub) findViewById(i2)).inflate();
            if (inflate != null) {
                ((ShoutoutsHeaderStepBottomStyle) inflate).setOnlyView(this.f133453g);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsHeaderStepBottomStyle");
                MethodCollector.o(3099);
                throw nullPointerException;
            }
        }
        MethodCollector.o(3099);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.cgp).setOnClickListener(new a(this));
        findViewById(R.id.cfe).setOnClickListener(new b(this));
        View findViewById = findViewById(R.id.f7w);
        l.b(findViewById, "");
        Context context = getContext();
        l.b(context, "");
        String string = context.getResources().getString(R.string.g65);
        l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{"3"}, 1));
        l.b(a2, "");
        ((TextView) findViewById).setText(a2);
        View findViewById2 = findViewById(R.id.cgp);
        l.b(findViewById2, "");
        this.f133454h = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.cfe);
        l.b(findViewById3, "");
        this.f133455i = (LinearLayout) findViewById3;
        LinearLayout linearLayout = this.f133454h;
        if (linearLayout == null) {
            l.a("llTerm");
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new c(this));
        LinearLayout linearLayout2 = this.f133455i;
        if (linearLayout2 == null) {
            l.a("llFAQ");
        }
        linearLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new d(this));
    }

    public final void setOnlyView(boolean z) {
        this.f133453g = z;
    }

    public static final /* synthetic */ LinearLayout a(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
        LinearLayout linearLayout = shoutoutsReviewHeaderSteps.f133454h;
        if (linearLayout == null) {
            l.a("llTerm");
        }
        return linearLayout;
    }

    public static final /* synthetic */ LinearLayout b(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
        LinearLayout linearLayout = shoutoutsReviewHeaderSteps.f133455i;
        if (linearLayout == null) {
            l.a("llFAQ");
        }
        return linearLayout;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsReviewHeaderSteps f133459a;

        static {
            Covode.recordClassIndex(87279);
        }

        b(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
            this.f133459a = shoutoutsReviewHeaderSteps;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f133459a.f133453g) {
                Context context = this.f133459a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new com.bytedance.tux.g.b((Activity) context).a(this.f133459a.getResources().getString(R.string.g0_)).b();
                return;
            }
            Context context2 = this.f133459a.getContext();
            l.b(context2, "");
            com.ss.android.ugc.aweme.shoutouts.b.a.a(context2);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsReviewHeaderSteps f133458a;

        static {
            Covode.recordClassIndex(87278);
        }

        a(ShoutoutsReviewHeaderSteps shoutoutsReviewHeaderSteps) {
            this.f133458a = shoutoutsReviewHeaderSteps;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f133458a.f133453g) {
                Context context = this.f133458a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new com.bytedance.tux.g.b((Activity) context).a(this.f133458a.getResources().getString(R.string.g0_)).b();
                return;
            }
            Context context2 = this.f133458a.getContext();
            l.b(context2, "");
            l.d(context2, "");
            com.ss.android.ugc.aweme.shoutouts.b.a.b(context2, "https://www.tiktok.com/legal/tiktok-shoutouts-user-terms-of-service?hide_nav_bar=1");
        }
    }

    private /* synthetic */ ShoutoutsReviewHeaderSteps(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsReviewHeaderSteps(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
