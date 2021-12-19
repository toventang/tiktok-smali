package com.ss.android.ugc.aweme.shortvideo.edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public l f127807a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f127808b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f127809c = true;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f127810d;

    /* renamed from: e  reason: collision with root package name */
    private View f127811e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f127812f;

    /* renamed from: g  reason: collision with root package name */
    private final long f127813g = 250;

    /* renamed from: h  reason: collision with root package name */
    private int f127814h;

    /* renamed from: i  reason: collision with root package name */
    private final int f127815i = 568;

    /* renamed from: j  reason: collision with root package name */
    private final int f127816j = 720;

    /* renamed from: k  reason: collision with root package name */
    private final int f127817k;

    /* renamed from: l  reason: collision with root package name */
    private final int f127818l;

    /* renamed from: m  reason: collision with root package name */
    private final int f127819m;
    private final ViewGroup n;
    private final List<View> o;

    static {
        Covode.recordClassIndex(83776);
    }

    private final void e() {
        if (this.f127809c) {
            ImageView imageView = this.f127808b;
            if (imageView != null) {
                imageView.setRotation(180.0f);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f127808b;
        if (imageView2 != null) {
            imageView2.setRotation(0.0f);
        }
    }

    public final void c() {
        LinearLayout linearLayout;
        if (!this.f127809c && (linearLayout = this.f127812f) != null) {
            e();
            ValueAnimator a2 = a((View) linearLayout, this.f127814h, 0);
            a2.addListener(new b(linearLayout, this));
            ObjectAnimator a3 = a((View) linearLayout, 1.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.start();
        }
    }

    private final void d() {
        MethodCollector.i(3500);
        View view = this.f127811e;
        if (view == null) {
            l.a("toolbarRootView");
        }
        this.f127812f = (LinearLayout) view.findViewById(R.id.b74);
        int i2 = 0;
        List<View> list = this.o;
        for (T t : list.subList(this.f127819m, list.size())) {
            LinearLayout linearLayout = this.f127812f;
            if (linearLayout != null) {
                linearLayout.addView(t);
            }
            if (i2 != 0) {
                a(t);
            }
            i2++;
        }
        MethodCollector.o(3500);
    }

    public final void b() {
        LinearLayout linearLayout;
        l lVar = this.f127807a;
        if (lVar != null) {
            lVar.a();
        }
        if (this.f127809c && (linearLayout = this.f127812f) != null) {
            e();
            linearLayout.measure(0, 0);
            int measuredHeight = linearLayout.getMeasuredHeight();
            this.f127814h = measuredHeight;
            ValueAnimator a2 = a((View) linearLayout, 0, measuredHeight);
            a2.addListener(new e(linearLayout, this));
            ObjectAnimator a3 = a((View) linearLayout, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.start();
        }
    }

    public final void a() {
        MethodCollector.i(3499);
        if (!this.o.isEmpty()) {
            View a2 = com.a.a(LayoutInflater.from(this.f127810d), R.layout.yf, this.n, false);
            l.b(a2, "");
            this.f127811e = a2;
            if (a2 == null) {
                l.a("toolbarRootView");
            }
            MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) a2.findViewById(R.id.dta);
            if (this.f127817k > this.f127815i) {
                if (!com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                    maxHeightScrollView.setMaxHeightDp(this.f127817k);
                }
                if (com.ss.android.ugc.gamora.editor.lightening.a.a()) {
                    if (this.f127817k > this.f127816j) {
                        maxHeightScrollView.setMaxHeightDp(560);
                    } else {
                        maxHeightScrollView.setMaxHeightDp(408);
                    }
                }
            }
            View view = this.f127811e;
            if (view == null) {
                l.a("toolbarRootView");
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.b43);
            int min = Math.min(this.f127819m - 1, this.o.size() - 1);
            if (min >= 0) {
                int i2 = 0;
                while (true) {
                    View view2 = this.o.get(i2);
                    linearLayout.addView(view2);
                    if (i2 > 0) {
                        a(view2);
                    }
                    if (i2 == min) {
                        break;
                    }
                    i2++;
                }
            }
            if (this.o.size() == this.f127818l) {
                linearLayout.addView(this.o.get(this.f127819m));
                a(this.o.get(this.f127819m));
            } else if (this.o.size() > this.f127818l) {
                View view3 = this.f127811e;
                if (view3 == null) {
                    l.a("toolbarRootView");
                }
                ImageView imageView = (ImageView) view3.findViewById(R.id.enp);
                this.f127808b = imageView;
                if (imageView != null) {
                    imageView.setImageResource(2131232282);
                }
                ImageView imageView2 = this.f127808b;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ImageView imageView3 = this.f127808b;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(new c(this));
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            ViewGroup viewGroup = this.n;
            View view4 = this.f127811e;
            if (view4 == null) {
                l.a("toolbarRootView");
            }
            viewGroup.addView(view4, layoutParams);
            ImageView imageView4 = this.f127808b;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new d(this));
            }
        }
        if (this.o.size() > this.f127818l) {
            d();
        }
        MethodCollector.o(3499);
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout f127821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f127822b;

        static {
            Covode.recordClassIndex(83778);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f127822b.f127809c = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f127821a.setVisibility(8);
            this.f127822b.f127809c = true;
        }

        b(LinearLayout linearLayout, m mVar) {
            this.f127821a = linearLayout;
            this.f127822b = mVar;
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout f127825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f127826b;

        static {
            Covode.recordClassIndex(83781);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f127826b.f127809c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f127826b.f127809c = false;
        }

        public final void onAnimationStart(Animator animator) {
            ViewGroup.LayoutParams layoutParams = this.f127825a.getLayoutParams();
            layoutParams.height = 0;
            this.f127825a.setLayoutParams(layoutParams);
            this.f127825a.setVisibility(0);
        }

        e(LinearLayout linearLayout, m mVar) {
            this.f127825a = linearLayout;
            this.f127826b = mVar;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f127823a;

        static {
            Covode.recordClassIndex(83779);
        }

        c(m mVar) {
            this.f127823a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m mVar = this.f127823a;
            l.b(view, "");
            mVar.b();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f127824a;

        static {
            Covode.recordClassIndex(83780);
        }

        d(m mVar) {
            this.f127824a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f127824a.f127809c) {
                m mVar = this.f127824a;
                l.b(view, "");
                mVar.b();
                return;
            }
            this.f127824a.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f127820a;

        static {
            Covode.recordClassIndex(83777);
        }

        a(View view) {
            this.f127820a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = this.f127820a.getLayoutParams();
            layoutParams.height = intValue;
            this.f127820a.setLayoutParams(layoutParams);
        }
    }

    private final void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) n.b(this.f127810d, 12.0f);
    }

    private final ObjectAnimator a(View view, float f2, float f3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f2, f3);
        l.b(ofFloat, "");
        ofFloat.setDuration(this.f127813g);
        return ofFloat;
    }

    private final ValueAnimator a(View view, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
        l.b(ofInt, "");
        ofInt.setDuration(this.f127813g);
        ofInt.addUpdateListener(new a(view));
        return ofInt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    public m(ViewGroup viewGroup, List<? extends View> list, Activity activity) {
        l.d(viewGroup, "");
        l.d(list, "");
        l.d(activity, "");
        this.n = viewGroup;
        this.o = list;
        this.f127810d = activity;
        double e2 = (double) dh.e(activity);
        double d2 = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(e2);
        Double.isNaN(d2);
        int i2 = (int) ((e2 / d2) + 0.5d);
        this.f127817k = i2;
        int i3 = 9;
        if (!com.ss.android.ugc.gamora.editor.lightening.a.a()) {
            if (i2 > 568) {
                i3 = Integer.MAX_VALUE;
            }
            i3 = 4;
        } else {
            if (i2 > 720) {
                if (list.size() > 9) {
                    i3 = 7;
                }
            }
            i3 = 4;
        }
        this.f127818l = i3;
        this.f127819m = i3 - 1;
    }
}
