package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.utils.j;
import com.zhiliaoapp.musically.R;

public class ButtonAdBottomLabelView extends d {
    static {
        Covode.recordClassIndex(46786);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.d
    public int getLayoutId() {
        return R.layout.ta;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.d
    public final boolean b() {
        return b.al(this.f76140g);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.d
    public final boolean a() {
        if (b.x(this.f76140g) || b.aE(this.f76140g)) {
            return true;
        }
        if (!b.S(this.f76140g) && this.f76140g != null && this.f76140g.isAd() && !TextUtils.isEmpty(this.f76140g.getAwemeRawAd().getWebUrl())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.d
    public final boolean c() {
        if (this.f76140g == null || this.f76140g.getAwemeRawAd() == null) {
            return false;
        }
        if (this.f76140g.getAwemeRawAd().getAnimationType() == 1 || this.f76140g.getAwemeRawAd().getAnimationType() == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.d
    public final void d() {
        int b2 = i.b(getContext());
        View findViewById = this.f76134a.findViewById(R.id.b4l);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = b2 - ((int) n.b(getContext(), 110.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    public final void k() {
        int height;
        if (a()) {
            e();
            if (b.al(this.f76140g)) {
                if (this.f76144k != null) {
                    DataCenter dataCenter = this.f76144k;
                    if (this.f76134a == null) {
                        height = 0;
                    } else {
                        height = this.f76134a.getHeight();
                    }
                    dataCenter.a("ad_bottom_label_show", Integer.valueOf(height));
                }
                g.d().a(this, 0, 0, true);
                b(this, new j(this));
            } else {
                g.d().a(this, getResources().getDimensionPixelOffset(R.dimen.g3), 0, false);
            }
            int defaultColor = getDefaultColor();
            if (!c()) {
                defaultColor = Color.parseColor(b.ak(this.f76140g));
            }
            a(defaultColor, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        g.a().j(getContext(), this.f76140g);
        a.a("draw_ad", "button_show", this.f76140g.getAwemeRawAd()).c();
        a.a("draw_ad", "othershow", this.f76140g.getAwemeRawAd()).b("refer", "button").c();
        if (!c()) {
            b(1000);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.d
    public void setLabelVisibility(int i2) {
        setVisibility(i2);
    }

    public ButtonAdBottomLabelView(Context context) {
        this(context, null);
    }

    public final void b(boolean z) {
        if (this.f76141h != null) {
            if (b.x(this.f76140g)) {
                setLabelVisibility(0);
                this.f76141h.setVisibility(0);
                if (!z) {
                    a(androidx.core.content.b.c(getContext(), R.color.bh), 0);
                }
                String ac = b.ac(this.f76140g);
                c();
                a(ac);
                this.f76139f.setImageResource(R.drawable.a23);
            } else if (!b.w(this.f76140g)) {
            } else {
                if (!TextUtils.isEmpty(this.f76140g.getAwemeRawAd().getWebUrl())) {
                    this.f76141h.setVisibility(8);
                    if (!z) {
                        a(Color.parseColor(b.ak(this.f76140g)), 0);
                    }
                    String a2 = g.d().a(getContext(), this.f76140g);
                    c();
                    a(a2);
                    this.f76139f.setImageResource(R.drawable.b0i);
                    return;
                }
                setLabelVisibility(8);
            }
        }
    }

    public final void a(Boolean bool) {
        if (this.f76141h == null || b.w(this.f76140g)) {
            return;
        }
        if (b.aE(this.f76140g)) {
            setLabelVisibility(0);
            this.f76141h.setVisibility(0);
            if (!bool.booleanValue()) {
                a(Color.parseColor(b.aS(this.f76140g)), 0);
                a(b.aR(this.f76140g));
            } else {
                String aR = b.aR(this.f76140g);
                c();
                a(aR);
            }
            this.f76139f.setImageResource(R.drawable.a23);
        } else if (this.f76140g.getAwemeRawAd() == null || TextUtils.isEmpty(this.f76140g.getAwemeRawAd().getWebUrl())) {
            setLabelVisibility(8);
        } else {
            if (!bool.booleanValue() && b.aF(this.f76140g)) {
                a(Color.parseColor(b.ak(this.f76140g)), 0);
                a(g.d().a(getContext(), this.f76140g));
            }
            this.f76141h.setVisibility(8);
        }
    }

    public ButtonAdBottomLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.d
    public final void a(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(n.b(getContext(), 2.0f));
        if (this.f76135b == 0 || this.f76135b != i2) {
            this.f76135b = i2;
            if (i3 == 0) {
                gradientDrawable.setColor(i2);
                setBackground(gradientDrawable);
                if (b.w(this.f76140g) || !c()) {
                    this.f76137d.setTextColor(androidx.core.content.b.c(getContext(), R.color.a9));
                    this.f76139f.setImageResource(R.drawable.a23);
                    a(true);
                    return;
                }
                this.f76137d.setTextColor(androidx.core.content.b.c(getContext(), R.color.ac));
                this.f76139f.setImageResource(R.drawable.b0i);
                a(false);
                return;
            }
            gradientDrawable.setColor(getBackGroundColor());
            j.a(this, gradientDrawable, getBackGroundColor(), i2, (long) i3, new Animator.AnimatorListener() {
                /* class com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(46787);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    ButtonAdBottomLabelView.this.b(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    ButtonAdBottomLabelView.this.f76137d.setTextColor(androidx.core.content.b.c(ButtonAdBottomLabelView.this.getContext(), R.color.a9));
                    ButtonAdBottomLabelView.this.f76139f.setImageResource(R.drawable.a23);
                    ButtonAdBottomLabelView.this.a(true);
                }
            });
            if (b.w(this.f76140g) || !c()) {
                this.f76137d.setTextColor(androidx.core.content.b.c(getContext(), R.color.a9));
                this.f76139f.setImageResource(R.drawable.a23);
                a(true);
                return;
            }
            this.f76137d.setTextColor(androidx.core.content.b.c(getContext(), R.color.ac));
            this.f76139f.setImageResource(R.drawable.b0i);
            a(false);
        }
    }

    private ButtonAdBottomLabelView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        setDefaultColor(androidx.core.content.b.c(context, R.color.ao));
    }
}
