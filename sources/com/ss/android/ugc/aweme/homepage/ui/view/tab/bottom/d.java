package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.aq.a.a;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.lego.f;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

public class d extends a {

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f99587c;

    /* renamed from: d  reason: collision with root package name */
    protected ImageView f99588d;

    /* renamed from: e  reason: collision with root package name */
    protected ImageView f99589e;

    /* renamed from: f  reason: collision with root package name */
    public View f99590f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f99591g;

    /* renamed from: h  reason: collision with root package name */
    private PreDrawableInflate f99592h = ((PreDrawableInflate) f.b(PreDrawableInflate.class));

    /* renamed from: i  reason: collision with root package name */
    private boolean f99593i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f99594j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f99595k;

    static {
        Covode.recordClassIndex(63502);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void a(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public ImageView getRefreshIcon() {
        return this.f99591g;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void c() {
        if (a(false, this.f99594j, false)) {
            a(this.f99593i, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void f() {
        if (a(true, this.f99594j, false)) {
            a(this.f99593i, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void k() {
        a(this.f99589e, 0, new g(this));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void l() {
        a(this.f99589e, 0, new h(this));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void m() {
        a(this.f99589e, 8, new i(this));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void n() {
        a(this.f99589e, 8, new j(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void d() {
        if (a(false, this.f99594j, false)) {
            a(this.f99593i, false);
        }
        a(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void g() {
        if (a(true, this.f99594j, false)) {
            a(this.f99593i, false);
        }
        a(false);
    }

    public final void r() {
        ImageView imageView = this.f99587c;
        if (imageView != null) {
            imageView.setLayerType(0, null);
        }
        ImageView imageView2 = this.f99588d;
        if (imageView2 != null) {
            imageView2.setLayerType(0, null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ImageView imageView;
        if (TextUtils.equals(getTabType(), "PUBLISH") && (imageView = this.f99588d) != null && (imageView.getDrawable() instanceof com.ss.android.ugc.aweme.aq.b.f)) {
            com.ss.android.ugc.aweme.aq.b.f fVar = (com.ss.android.ugc.aweme.aq.b.f) this.f99588d.getDrawable();
            if (fVar.isRunning()) {
                fVar.stop();
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void p() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && a.a()) {
            Boolean bool = (Boolean) this.f99588d.getTag(a.f66965b);
            if (bool == null || !bool.booleanValue()) {
                o();
            }
        }
    }

    public final View s() {
        MethodCollector.i(3369);
        if (this.f99588d == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99588d = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f99588d.setLayoutParams(layoutParams);
            addView(this.f99588d);
        }
        ImageView imageView2 = this.f99588d;
        MethodCollector.o(3369);
        return imageView2;
    }

    private View v() {
        MethodCollector.i(3372);
        if (this.f99591g == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99591g = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f99591g.setImageDrawable(this.f99592h.a(2131232132, getContext()));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f99591g.setLayoutParams(layoutParams);
            addView(this.f99591g);
        }
        ImageView imageView2 = this.f99591g;
        MethodCollector.o(3372);
        return imageView2;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void j() {
        v();
        a();
        s();
        this.f99591g.setVisibility(8);
        this.f99591g.setAlpha(1.0f);
        ImageView imageView = this.f99587c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f99588d;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (isSelected()) {
            ImageView imageView3 = this.f99587c;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
            }
            ImageView imageView4 = this.f99588d;
            if (imageView4 != null) {
                imageView4.setAlpha(0.0f);
                return;
            }
            return;
        }
        ImageView imageView5 = this.f99587c;
        if (imageView5 != null) {
            imageView5.setAlpha(0.0f);
        }
        ImageView imageView6 = this.f99588d;
        if (imageView6 != null) {
            imageView6.setAlpha(1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ View t() {
        MethodCollector.i(3730);
        if (this.f99589e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99589e = imageView;
            imageView.setImageDrawable(this.f99592h.a(R.drawable.aam, getContext()));
            int a2 = n.a(8.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
            this.f99589e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layoutParams.setMargins(n.a(14.0d), n.a(6.0d), 0, 0);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(n.a(14.0d));
            layoutParams.gravity = 49;
            this.f99589e.setLayoutParams(layoutParams);
            addView(this.f99589e);
        }
        ImageView imageView2 = this.f99589e;
        MethodCollector.o(3730);
        return imageView2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ View u() {
        MethodCollector.i(3733);
        if (this.f99589e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99589e = imageView;
            imageView.setImageDrawable(this.f99592h.a(R.drawable.aam, getContext()));
            int a2 = n.a(8.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
            this.f99589e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layoutParams.setMargins(n.a(14.0d), n.a(6.0d), 0, 0);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(n.a(14.0d));
            layoutParams.gravity = 49;
            this.f99589e.setLayoutParams(layoutParams);
            addView(this.f99589e);
        }
        ImageView imageView2 = this.f99589e;
        MethodCollector.o(3733);
        return imageView2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void i() {
        v();
        a();
        s();
        this.f99591g.setVisibility(0);
        this.f99591g.setLayerType(2, null);
        a(this.f99587c, 8, new e(this));
        a(this.f99588d, 8, new f(this));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(63503);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.this.f99591g.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(63504);
            }

            public final void onAnimationRepeat(Animator animator) {
                if (!d.this.f99548a) {
                    ofFloat.setRepeatCount(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (!d.this.isSelected()) {
                    d dVar = d.this;
                    dVar.a(dVar.f99588d, 0, new k(d.this));
                    if (d.this.f99588d != null) {
                        return;
                    }
                } else {
                    d dVar2 = d.this;
                    dVar2.a(dVar2.f99587c, 0, new l(d.this));
                    if (d.this.f99587c != null) {
                        return;
                    }
                }
                if (d.this.f99587c != null) {
                    d.this.f99587c.setVisibility(0);
                } else if (d.this.f99588d != null) {
                    d.this.f99588d.setVisibility(0);
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(63505);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.this.f99591g.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                d.this.f99591g.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f99591g.setSelected(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat2, ofFloat);
        animatorSet.start();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public void o() {
        Drawable remove;
        if (!TextUtils.equals(getTabType(), "PUBLISH")) {
            return;
        }
        if (!a.a() || (remove = this.f99592h.f99512b.remove(-100)) == null) {
            int i2 = 2131232117;
            int i3 = 2131232122;
            if (b.a().a(true, "tabbar_plus_button_icon_style", 0) == 2) {
                i2 = 2131232118;
                i3 = 2131232123;
            } else if (b.a().a(true, "tabbar_plus_button_icon_style", 0) == 1) {
                i2 = 2131232119;
                i3 = 2131232124;
            }
            if (!this.f99595k) {
                this.f99595k = true;
                this.f99588d.setImageDrawable(this.f99592h.a(i2, getContext()));
                return;
            }
            if (this.f99594j) {
                i2 = i3;
            }
            this.f99588d.setImageDrawable(this.f99592h.a(i2, getContext()));
        } else if (!this.f99549b) {
            this.f99588d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f99588d.setImageDrawable(remove);
        }
    }

    /* access modifiers changed from: protected */
    public View a() {
        MethodCollector.i(3366);
        if (this.f99587c == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99587c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f99587c.setLayoutParams(layoutParams);
            addView(this.f99587c);
        }
        ImageView imageView2 = this.f99587c;
        MethodCollector.o(3366);
        return imageView2;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public void setActivated(boolean z) {
        super.setActivated(z);
        ImageView imageView = this.f99588d;
        if (imageView != null) {
            imageView.setSelected(z);
            this.f99588d.invalidate();
        }
        if (a(this.f99593i, z, true)) {
            a(this.f99593i, true);
        }
    }

    private void a(final boolean z) {
        r();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d.AnonymousClass4 */

            static {
                Covode.recordClassIndex(63506);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentPlayTime = valueAnimator.getCurrentPlayTime();
                if (d.this.f99590f != null && d.this.f99590f.getVisibility() == 0) {
                    if (!z) {
                        d.this.f99590f.setTranslationY(com.bytedance.common.utility.n.b(d.this.getContext(), 2.0f) - ((com.bytedance.common.utility.n.b(d.this.getContext(), 2.0f) * ((float) currentPlayTime)) / ((float) valueAnimator.getDuration())));
                    } else {
                        d.this.f99590f.setTranslationY((com.bytedance.common.utility.n.b(d.this.getContext(), 2.0f) * ((float) currentPlayTime)) / ((float) valueAnimator.getDuration()));
                    }
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d.AnonymousClass5 */

            static {
                Covode.recordClassIndex(63507);
            }

            public final void onAnimationEnd(Animator animator) {
                d.this.r();
                if (d.this.f99590f != null && d.this.f99590f.getVisibility() == 0) {
                    if (!z) {
                        d.this.f99590f.setTranslationY(0.0f);
                    } else {
                        d.this.f99590f.setTranslationY(com.bytedance.common.utility.n.b(d.this.getContext(), 2.0f));
                    }
                }
            }
        });
        ofFloat.start();
    }

    private void a(boolean z, boolean z2) {
        if (!z || getTabType().equals("PUBLISH")) {
            s();
            String tabType = getTabType();
            tabType.hashCode();
            if (tabType.equals("PUBLISH")) {
                o();
            }
            if (z2) {
                this.f99588d.setAlpha(1.0f);
                ImageView imageView = this.f99587c;
                if (imageView != null) {
                    imageView.setAlpha(0.0f);
                }
                View view = this.f99590f;
                if (view != null) {
                    view.setTranslationY((float) n.a(2.0d));
                    return;
                }
                return;
            }
            return;
        }
        a();
    }

    private boolean a(boolean z, boolean z2, boolean z3) {
        if (this.f99593i == z && this.f99594j == z2 && !z3) {
            return false;
        }
        if (getTabType().equals("PUBLISH")) {
            this.f99593i = z;
            if (z3) {
                s();
            }
        } else if (this.f99593i != z || z3) {
            this.f99593i = z;
            z3 = true;
        }
        if (this.f99594j != z2) {
            this.f99594j = z2;
            if (!this.f99593i || getTabType().equals("PUBLISH")) {
                return true;
            }
        }
        return z3;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i2, Callable<View> callable) {
        if (i2 == 4 || i2 == 0) {
            if (view == null) {
                try {
                    view = callable.call();
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            view.setVisibility(i2);
        } else if (i2 == 8 && view != null) {
            view.setVisibility(i2);
        }
    }

    public d(Context context, String str, boolean z, boolean z2, int i2) {
        super(context, str);
        int i3;
        MethodCollector.i(3347);
        if (a(z, z2, true)) {
            a(this.f99593i, true);
        }
        if (this.f99590f == null) {
            View view = new View(getContext());
            this.f99590f = view;
            view.setBackground(this.f99592h.a(2131232137, getContext()));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n.a(28.0d), n.a(2.0d));
            layoutParams.gravity = 81;
            this.f99590f.setLayoutParams(layoutParams);
            addView(this.f99590f);
        }
        View view2 = this.f99590f;
        if (c.f66194d) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        o.a(view2, i3);
        setId(i2);
        MethodCollector.o(3347);
    }
}
