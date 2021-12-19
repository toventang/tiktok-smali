package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.lego.f;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

public class m extends a {

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f99616c;

    /* renamed from: d  reason: collision with root package name */
    protected ImageView f99617d;

    /* renamed from: e  reason: collision with root package name */
    protected ImageView f99618e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f99619f;

    /* renamed from: g  reason: collision with root package name */
    protected ImageView f99620g;

    /* renamed from: h  reason: collision with root package name */
    protected TuxTextView f99621h;

    /* renamed from: i  reason: collision with root package name */
    protected PreDrawableInflate f99622i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f99623j = false;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f99624k = false;

    /* renamed from: l  reason: collision with root package name */
    private ar f99625l;

    static {
        Covode.recordClassIndex(63519);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void o() {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void p() {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public ImageView getRefreshIcon() {
        return this.f99620g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void q() {
        a();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void c() {
        if (a(false, this.f99624k, false)) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void d() {
        if (a(false, this.f99624k, false)) {
            a();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void f() {
        if (a(true, this.f99624k, false)) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void g() {
        if (a(true, this.f99624k, false)) {
            a();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void k() {
        a(this.f99618e, 0, new p(this));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void l() {
        a(this.f99618e, 0, new q(this));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void m() {
        a(this.f99618e, 8, new r(this));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void n() {
        a(this.f99618e, 8, new s(this));
    }

    /* access modifiers changed from: protected */
    public final View r() {
        MethodCollector.i(4032);
        if (this.f99616c == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99616c = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int b2 = (int) n.b(getContext(), 36.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2);
            layoutParams.gravity = 49;
            this.f99616c.setLayoutParams(layoutParams);
            addView(this.f99616c);
        }
        ImageView imageView2 = this.f99616c;
        MethodCollector.o(4032);
        return imageView2;
    }

    /* access modifiers changed from: protected */
    public final View t() {
        MethodCollector.i(4035);
        if (this.f99617d == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99617d = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int b2 = (int) n.b(getContext(), 36.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2);
            layoutParams.gravity = 49;
            this.f99617d.setLayoutParams(layoutParams);
            addView(this.f99617d);
        }
        ImageView imageView2 = this.f99617d;
        MethodCollector.o(4035);
        return imageView2;
    }

    private View x() {
        MethodCollector.i(4039);
        if (this.f99620g == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99620g = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f99620g.setImageDrawable(this.f99622i.a(2131232132, getContext()));
            int b2 = (int) n.b(getContext(), 36.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2);
            layoutParams.gravity = 49;
            this.f99620g.setLayoutParams(layoutParams);
            addView(this.f99620g);
        }
        ImageView imageView2 = this.f99620g;
        MethodCollector.o(4039);
        return imageView2;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void j() {
        x();
        r();
        t();
        s();
        this.f99620g.setVisibility(8);
        this.f99620g.setAlpha(1.0f);
        ImageView imageView = this.f99616c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f99617d;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (isSelected()) {
            ImageView imageView3 = this.f99616c;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
            }
            ImageView imageView4 = this.f99617d;
            if (imageView4 != null) {
                imageView4.setAlpha(0.0f);
                return;
            }
            return;
        }
        ImageView imageView5 = this.f99616c;
        if (imageView5 != null) {
            imageView5.setAlpha(0.0f);
        }
        ImageView imageView6 = this.f99617d;
        if (imageView6 != null) {
            imageView6.setAlpha(1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ View u() {
        MethodCollector.i(4043);
        if (this.f99618e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99618e = imageView;
            imageView.setImageDrawable(this.f99622i.a(R.drawable.aam, getContext()));
            int a2 = com.ss.android.ugc.aweme.base.utils.n.a(8.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
            this.f99618e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layoutParams.setMargins(com.ss.android.ugc.aweme.base.utils.n.a(12.0d), com.ss.android.ugc.aweme.base.utils.n.a(4.0d), 0, 0);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(com.ss.android.ugc.aweme.base.utils.n.a(12.0d));
            layoutParams.gravity = 49;
            this.f99618e.setLayoutParams(layoutParams);
            addView(this.f99618e);
        }
        ImageView imageView2 = this.f99618e;
        MethodCollector.o(4043);
        return imageView2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ View v() {
        MethodCollector.i(4044);
        if (this.f99618e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f99618e = imageView;
            imageView.setImageDrawable(this.f99622i.a(R.drawable.aam, getContext()));
            int a2 = com.ss.android.ugc.aweme.base.utils.n.a(8.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
            this.f99618e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layoutParams.setMargins(com.ss.android.ugc.aweme.base.utils.n.a(16.0d), com.ss.android.ugc.aweme.base.utils.n.a(4.0d), 0, 0);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(com.ss.android.ugc.aweme.base.utils.n.a(16.0d));
            layoutParams.gravity = 49;
            this.f99618e.setLayoutParams(layoutParams);
            addView(this.f99618e);
        }
        ImageView imageView2 = this.f99618e;
        MethodCollector.o(4044);
        return imageView2;
    }

    /* access modifiers changed from: protected */
    public void a() {
        boolean z = this.f99623j;
        boolean z2 = this.f99624k;
        if (z) {
            r();
            s();
            this.f99621h.setTuxFont(93);
            ar arVar = this.f99625l;
            if (arVar != null) {
                this.f99616c.setImageDrawable(this.f99622i.a(arVar.f66981b, getContext()));
            }
            this.f99621h.setTextColor(b.c(getContext(), R.color.bx));
            this.f99616c.setAlpha(1.0f);
            ImageView imageView = this.f99617d;
            if (imageView != null) {
                imageView.setAlpha(0.0f);
                return;
            }
            return;
        }
        t();
        s();
        this.f99621h.setTuxFont(92);
        if (z2) {
            this.f99621h.setTextColor(b.c(getContext(), R.color.c5));
        } else {
            this.f99621h.setTextColor(b.c(getContext(), R.color.aa));
        }
        ar arVar2 = this.f99625l;
        if (arVar2 != null) {
            if (z2) {
                this.f99617d.setImageDrawable(this.f99622i.a(arVar2.f66984e, getContext()));
            } else {
                this.f99617d.setImageDrawable(this.f99622i.a(arVar2.f66985f, getContext()));
            }
        }
        ImageView imageView2 = this.f99616c;
        if (imageView2 != null) {
            imageView2.setAlpha(0.0f);
        }
        this.f99617d.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void i() {
        x();
        r();
        t();
        s();
        this.f99620g.setVisibility(0);
        this.f99620g.setLayerType(2, null);
        a(this.f99616c, 8, new n(this));
        a(this.f99617d, 8, new o(this));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(63520);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m.this.f99620g.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m.AnonymousClass2 */

            static {
                Covode.recordClassIndex(63521);
            }

            public final void onAnimationRepeat(Animator animator) {
                if (!m.this.f99548a) {
                    ofFloat.setRepeatCount(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (!m.this.isSelected()) {
                    m.a(m.this.f99617d, 0, new v(m.this));
                } else {
                    m.a(m.this.f99616c, 0, new w(m.this));
                }
                if (m.this.f99616c != null) {
                    m.this.f99616c.setVisibility(0);
                }
                if (m.this.f99617d != null) {
                    m.this.f99617d.setVisibility(0);
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m.AnonymousClass3 */

            static {
                Covode.recordClassIndex(63522);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m.this.f99620g.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m.this.f99620g.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f99620g.setSelected(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat2, ofFloat);
        animatorSet.start();
    }

    /* access modifiers changed from: protected */
    public final View s() {
        if (this.f99621h == null) {
            TuxTextView tuxTextView = new TuxTextView(getContext());
            this.f99621h = tuxTextView;
            tuxTextView.setTuxFont(92);
            this.f99621h.setTextColor(b.c(getContext(), R.color.a_));
            if (Build.VERSION.SDK_INT >= 21) {
                this.f99621h.setLetterSpacing(0.01f);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            this.f99621h.setGravity(17);
            this.f99621h.setSingleLine(true);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) n.b(getContext(), 4.0f);
            this.f99621h.setLayoutParams(layoutParams);
            addView(this.f99621h);
            ar arVar = this.f99625l;
            if (arVar != null) {
                this.f99621h.setText(arVar.f82873i);
            } else {
                this.f99621h.setText("");
            }
            if (this.f99621h.getText().toString().length() > 16 && this.f99621h.getPaint().measureText(this.f99621h.getText().toString()) > 230.0f) {
                this.f99621h.setTextSize(1, 8.0f);
            }
        }
        return this.f99621h;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ View w() {
        if (this.f99619f == null) {
            TuxTextView tuxTextView = new TuxTextView(getContext());
            tuxTextView.setBackground(this.f99622i.a(R.drawable.a_r, getContext()));
            tuxTextView.setClickable(false);
            tuxTextView.setGravity(17);
            tuxTextView.setLines(1);
            tuxTextView.setTextSize(1, 12.0f);
            tuxTextView.setTextColor(b.c(getContext(), R.color.f159928l));
            tuxTextView.setPadding(com.ss.android.ugc.aweme.base.utils.n.a(5.0d), 0, com.ss.android.ugc.aweme.base.utils.n.a(5.0d), 0);
            tuxTextView.setTuxFont(72);
            tuxTextView.setMinWidth(com.ss.android.ugc.aweme.base.utils.n.a(16.0d));
            tuxTextView.setMinHeight(com.ss.android.ugc.aweme.base.utils.n.a(16.0d));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(com.ss.android.ugc.aweme.base.utils.n.a(13.0d), com.ss.android.ugc.aweme.base.utils.n.a(2.0d), 0, 0);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(com.ss.android.ugc.aweme.base.utils.n.a(13.0d));
            layoutParams.gravity = 49;
            tuxTextView.setLayoutParams(layoutParams);
            addView(tuxTextView);
            this.f99619f = tuxTextView;
        }
        return this.f99619f;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public void setActivated(boolean z) {
        super.setActivated(z);
        ImageView imageView = this.f99617d;
        if (imageView != null) {
            imageView.setSelected(z);
            this.f99617d.invalidate();
        }
        if (a(this.f99623j, z, true)) {
            a();
        }
    }

    public m(ar arVar) {
        super(arVar.f82871g, arVar.f82872h);
        this.f99625l = arVar;
        this.f99622i = (PreDrawableInflate) f.b(PreDrawableInflate.class);
        r();
        if (a(arVar.f66982c, arVar.f66983d, true)) {
            a();
        }
        setId(arVar.f66980a);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a
    public final void a(int i2) {
        String valueOf;
        if (TextUtils.equals(getTabType(), "NOTIFICATION")) {
            if (i2 <= 0) {
                a(this.f99619f, 8, new t(this));
                return;
            }
            a(this.f99619f, 0, new u(this));
            if (i2 > 99) {
                valueOf = "99+";
            } else {
                valueOf = String.valueOf(i2);
            }
            this.f99619f.setText(valueOf);
        }
    }

    public static void a(View view, int i2, Callable<View> callable) {
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

    private boolean a(boolean z, boolean z2, boolean z3) {
        boolean z4 = this.f99623j;
        if (z4 == z && this.f99624k == z2 && !z3) {
            return false;
        }
        if (z4 != z || z3) {
            this.f99623j = z;
            z3 = true;
        }
        if (getTabType().equals("HOME")) {
            this.f99624k = z2;
        } else if (this.f99624k != z2) {
            this.f99624k = z2;
            if (!this.f99623j) {
                return true;
            }
        }
        return z3;
    }
}
