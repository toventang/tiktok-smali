package com.ss.android.ugc.aweme.ftc.components.toolbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public l f98267a;

    /* renamed from: b  reason: collision with root package name */
    public View f98268b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f98269c = true;

    /* renamed from: d  reason: collision with root package name */
    final List<View> f98270d;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f98271e;

    /* renamed from: f  reason: collision with root package name */
    private View f98272f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f98273g;

    /* renamed from: h  reason: collision with root package name */
    private final long f98274h = 250;

    /* renamed from: i  reason: collision with root package name */
    private int f98275i;

    /* renamed from: j  reason: collision with root package name */
    private final ViewGroup f98276j;

    static {
        Covode.recordClassIndex(62497);
    }

    private final void e() {
        if (this.f98269c) {
            View view = this.f98268b;
            if (view != null) {
                view.setRotation(180.0f);
                return;
            }
            return;
        }
        View view2 = this.f98268b;
        if (view2 != null) {
            view2.setRotation(0.0f);
        }
    }

    public final void c() {
        LinearLayout linearLayout;
        if (this.f98269c && (linearLayout = this.f98273g) != null) {
            e();
            linearLayout.measure(0, 0);
            int measuredHeight = linearLayout.getMeasuredHeight();
            this.f98275i = measuredHeight;
            ValueAnimator a2 = a((View) linearLayout, 0, measuredHeight);
            a2.addListener(new e(linearLayout, this));
            ObjectAnimator a3 = a((View) linearLayout, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.start();
        }
    }

    public final void d() {
        LinearLayout linearLayout;
        if (!this.f98269c && (linearLayout = this.f98273g) != null) {
            e();
            ValueAnimator a2 = a((View) linearLayout, this.f98275i, 0);
            a2.addListener(new b(linearLayout, this));
            ObjectAnimator a3 = a((View) linearLayout, 1.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        MethodCollector.i(5696);
        View view = this.f98272f;
        if (view == null) {
            l.a("toolbarRootView");
        }
        this.f98273g = (LinearLayout) view.findViewById(R.id.b74);
        int i2 = 0;
        List<View> list = this.f98270d;
        for (T t : list.subList(3, list.size())) {
            LinearLayout linearLayout = this.f98273g;
            if (linearLayout != null) {
                linearLayout.addView(t);
            }
            if (i2 != 0) {
                a(t);
            }
            i2++;
        }
        MethodCollector.o(5696);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        MethodCollector.i(5690);
        View a2 = com.a.a(LayoutInflater.from(this.f98271e), R.layout.yf, this.f98276j, false);
        l.b(a2, "");
        this.f98272f = a2;
        if (a2 == null) {
            l.a("toolbarRootView");
        }
        LinearLayout linearLayout = (LinearLayout) a2.findViewById(R.id.b43);
        int min = Math.min(2, this.f98270d.size() - 1);
        if (min >= 0) {
            int i2 = 0;
            while (true) {
                View view = this.f98270d.get(i2);
                linearLayout.addView(view);
                if (i2 > 0) {
                    a(view);
                }
                if (i2 == min) {
                    break;
                }
                i2++;
            }
        }
        if (this.f98270d.size() == 4) {
            linearLayout.addView(this.f98270d.get(3));
            a(this.f98270d.get(3));
        } else if (this.f98270d.size() > 4) {
            View view2 = this.f98272f;
            if (view2 == null) {
                l.a("toolbarRootView");
            }
            View findViewById = view2.findViewById(R.id.enp);
            this.f98268b = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View view3 = this.f98268b;
            if (view3 != null) {
                view3.setOnClickListener(new c(this));
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        ViewGroup viewGroup = this.f98276j;
        View view4 = this.f98272f;
        if (view4 == null) {
            l.a("toolbarRootView");
        }
        viewGroup.addView(view4, layoutParams);
        View view5 = this.f98268b;
        if (view5 != null) {
            view5.setOnClickListener(new d(this));
            MethodCollector.o(5690);
            return;
        }
        MethodCollector.o(5690);
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout f98278a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f98279b;

        static {
            Covode.recordClassIndex(62499);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f98279b.f98269c = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f98278a.setVisibility(8);
            this.f98279b.f98269c = true;
        }

        b(LinearLayout linearLayout, p pVar) {
            this.f98278a = linearLayout;
            this.f98279b = pVar;
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout f98282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f98283b;

        static {
            Covode.recordClassIndex(62502);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f98283b.f98269c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f98283b.f98269c = false;
        }

        public final void onAnimationStart(Animator animator) {
            ViewGroup.LayoutParams layoutParams = this.f98282a.getLayoutParams();
            layoutParams.height = 0;
            this.f98282a.setLayoutParams(layoutParams);
            this.f98282a.setVisibility(0);
        }

        e(LinearLayout linearLayout, p pVar) {
            this.f98282a = linearLayout;
            this.f98283b = pVar;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f98280a;

        static {
            Covode.recordClassIndex(62500);
        }

        c(p pVar) {
            this.f98280a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f98280a.c();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f98281a;

        static {
            Covode.recordClassIndex(62501);
        }

        d(p pVar) {
            this.f98281a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f98281a.f98269c) {
                this.f98281a.c();
            } else {
                this.f98281a.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f98277a;

        static {
            Covode.recordClassIndex(62498);
        }

        a(View view) {
            this.f98277a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = this.f98277a.getLayoutParams();
            layoutParams.height = intValue;
            this.f98277a.setLayoutParams(layoutParams);
        }
    }

    private final void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) n.b(this.f98271e, 12.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    public p(ViewGroup viewGroup, List<? extends View> list, Activity activity) {
        l.d(viewGroup, "");
        l.d(list, "");
        l.d(activity, "");
        this.f98276j = viewGroup;
        this.f98270d = list;
        this.f98271e = activity;
    }

    private final ObjectAnimator a(View view, float f2, float f3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f2, f3);
        l.b(ofFloat, "");
        ofFloat.setDuration(this.f98274h);
        return ofFloat;
    }

    private final ValueAnimator a(View view, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
        l.b(ofInt, "");
        ofInt.setDuration(this.f98274h);
        ofInt.addUpdateListener(new a(view));
        return ofInt;
    }
}
