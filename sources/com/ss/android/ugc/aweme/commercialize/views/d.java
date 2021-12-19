package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.h.v;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.facebook.fresco.animation.c.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.bd;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.utils.j;
import com.zhiliaoapp.musically.R;

public abstract class d extends FrameLayout {

    /* renamed from: l  reason: collision with root package name */
    private static final String f76133l = d.class.getSimpleName();
    private long A;

    /* renamed from: a  reason: collision with root package name */
    protected View f76134a;

    /* renamed from: b  reason: collision with root package name */
    public int f76135b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f76136c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f76137d;

    /* renamed from: e  reason: collision with root package name */
    protected RemoteImageView f76138e;

    /* renamed from: f  reason: collision with root package name */
    protected ImageView f76139f;

    /* renamed from: g  reason: collision with root package name */
    protected Aweme f76140g;

    /* renamed from: h  reason: collision with root package name */
    protected LottieAnimationView f76141h;

    /* renamed from: i  reason: collision with root package name */
    protected a f76142i;

    /* renamed from: j  reason: collision with root package name */
    protected ValueAnimator f76143j;

    /* renamed from: k  reason: collision with root package name */
    protected DataCenter f76144k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f76145m;
    private View n;
    private View o;
    private ObjectAnimator p;
    private ObjectAnimator q;
    private int r;
    private Context s;
    private String t;
    private Runnable u;
    private Runnable v;
    private View w;
    private boolean x;
    private Runnable y;
    private int z;

    /* access modifiers changed from: package-private */
    public abstract void a(int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public abstract boolean c();

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract int getLayoutId();

    /* access modifiers changed from: package-private */
    public abstract void setLabelVisibility(int i2);

    public int getDefaultColor() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void f() {
        a();
    }

    static {
        Covode.recordClassIndex(46960);
    }

    private boolean m() {
        if (this.r == 4) {
            return true;
        }
        return false;
    }

    private boolean n() {
        if (this.r == 3) {
            return true;
        }
        return false;
    }

    private boolean o() {
        if (this.r == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (!this.x) {
            k();
            this.x = true;
        }
    }

    private void p() {
        int height;
        DataCenter dataCenter = this.f76144k;
        if (dataCenter != null) {
            View view = this.f76134a;
            if (view == null) {
                height = 0;
            } else {
                height = view.getHeight();
            }
            dataCenter.a("ad_bottom_label_show", Integer.valueOf(height));
        }
    }

    private boolean q() {
        if (o() || m() || n()) {
            return true;
        }
        return false;
    }

    public int getBackGroundColor() {
        int i2 = this.z;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public int getShowSeconds() {
        if (q()) {
            return 0;
        }
        return this.f76140g.getAwemeRawAd().getShowButtonSeconds() * 1000;
    }

    public final void h() {
        this.f76145m = false;
        this.f76135b = 0;
        Runnable runnable = this.u;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.v;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!TextUtils.isEmpty(this.t)) {
            this.t = null;
        }
        l();
    }

    private void l() {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.n.clearAnimation();
        }
        ObjectAnimator objectAnimator2 = this.q;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
            this.o.clearAnimation();
        }
        View view = this.n;
        if (view != null) {
            view.setBackgroundDrawable(null);
        }
        View view2 = this.o;
        if (view2 != null) {
            view2.setBackgroundDrawable(null);
        }
    }

    /* access modifiers changed from: package-private */
    public int getColorChangeSeconds() {
        Aweme aweme = this.f76140g;
        if (aweme == null || !aweme.isAd() || this.f76140g.getAwemeRawAd().getAnimationType() != 3) {
            return getShowSeconds();
        }
        return Math.max(getShowSeconds(), this.f76140g.getAwemeRawAd().getShowButtonColorSeconds() * 1000);
    }

    public final void i() {
        if (this.f76142i != null && this.f76143j != null) {
            this.f76138e.removeCallbacks(this.y);
            this.f76143j.end();
            this.f76142i.a(0);
            this.f76142i.stop();
            this.f76142i = null;
        }
    }

    private void k() {
        View inflate = View.inflate(getContext(), getLayoutId(), this);
        this.f76134a = inflate;
        this.n = inflate.findViewById(R.id.ap2);
        this.o = this.f76134a.findViewById(R.id.ap3);
        this.f76136c = (TextView) this.f76134a.findViewById(R.id.ci3);
        this.f76137d = (TextView) this.f76134a.findViewById(R.id.ci0);
        this.f76139f = (ImageView) this.f76134a.findViewById(R.id.ap1);
        this.w = this.f76134a.findViewById(R.id.ap6);
        this.f76141h = (LottieAnimationView) this.f76134a.findViewById(R.id.epj);
        this.f76138e = (RemoteImageView) this.f76134a.findViewById(R.id.dns);
        j.a(this);
        this.f76135b = 0;
    }

    public final void g() {
        if (a() && !m() && !n()) {
            e();
            l();
            this.n.setVisibility(0);
            this.n.setBackgroundResource(2131231700);
            int a2 = n.a(this.s);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.n, "translationX", (float) (-a2), (float) a2);
            this.p = ofFloat;
            ofFloat.setDuration(1500L);
            this.p.setRepeatCount(0);
            this.p.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        AwemeRawAd awemeRawAd;
        Animatable i2;
        if (this.f76138e.getController() != null && (awemeRawAd = this.f76140g.getAwemeRawAd()) != null && awemeRawAd.getButtonIcon() != null && (i2 = this.f76138e.getController().i()) != null && awemeRawAd.getButtonIconAnimationRepeatTimes() != 0) {
            a aVar = (a) i2;
            this.f76142i = aVar;
            ValueAnimator a2 = com.facebook.fresco.animation.c.a.a.a(aVar);
            this.f76143j = a2;
            a2.setRepeatCount(awemeRawAd.getButtonIconAnimationRepeatTimes() - 1);
            this.f76143j.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void setDefaultColor(int i2) {
        this.z = i2;
    }

    public void setDownloadUrl(String str) {
        this.t = str;
    }

    public final void b(long j2) {
        Aweme aweme = this.f76140g;
        if (aweme != null && b.aJ(aweme)) {
            this.f76138e.postDelayed(this.y, j2);
        }
    }

    public final void a(long j2) {
        int i2;
        int colorDelay;
        int i3;
        int buttonShow;
        if (a()) {
            this.A = 0;
            e();
            if (!b()) {
                Runnable runnable = this.u;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                int showSeconds = getShowSeconds();
                CommerceSmartUITasks predictTaskIndex = SmartFeedAdUIService.instance().getPredictTaskIndex();
                if (predictTaskIndex == null || (buttonShow = predictTaskIndex.getButtonShow()) < 0) {
                    i3 = 0;
                } else {
                    showSeconds = buttonShow * 1000;
                    i3 = 1;
                }
                if (this.u == null) {
                    this.u = new f(this, i3, showSeconds);
                }
                long j3 = this.A;
                long j4 = (long) showSeconds;
                if (j3 >= j4) {
                    int showSeconds2 = getShowSeconds() / 1000;
                    if (b.s(this.f76140g) && !b()) {
                        g.a().j(this.s, this.f76140g);
                        Aweme aweme = this.f76140g;
                        if (aweme != null) {
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "button_show", aweme.getAwemeRawAd()).c();
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", this.f76140g.getAwemeRawAd()).b("refer", "button").c();
                            if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                                a(showSeconds2, 0, 1, i3);
                            }
                        }
                    }
                    View view = this.f76134a;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        marginLayoutParams.bottomMargin = 0;
                        this.f76134a.setLayoutParams(marginLayoutParams);
                        p();
                    }
                } else {
                    postDelayed(this.u, j4 - j3);
                }
            }
            if (c() && !q() && !this.f76145m) {
                int colorChangeSeconds = getColorChangeSeconds();
                CommerceSmartUITasks predictTaskIndex2 = SmartFeedAdUIService.instance().getPredictTaskIndex();
                if (predictTaskIndex2 == null || (colorDelay = predictTaskIndex2.getColorDelay()) < 0) {
                    i2 = 0;
                } else {
                    colorChangeSeconds = colorDelay * 1000;
                    i2 = 1;
                }
                Runnable runnable2 = this.v;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                }
                if (this.v == null) {
                    this.v = new g(this, i2, colorChangeSeconds);
                }
                long j5 = this.A;
                long j6 = (long) colorChangeSeconds;
                if (j5 >= j6) {
                    int colorChangeSeconds2 = getColorChangeSeconds() / 1000;
                    if (c() && !q()) {
                        a(Color.parseColor(b.ak(this.f76140g)), 0);
                        this.f76145m = true;
                        if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                            a(colorChangeSeconds2, 0, 2, i2);
                        }
                    }
                } else {
                    postDelayed(this.v, j6 - j5);
                }
            }
            this.A = 0;
        }
    }

    public final void a(String str) {
        e();
        this.r = 1;
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.f76137d.setVisibility(0);
        this.f76137d.setText(str);
        this.f76137d.setTextColor(androidx.core.content.b.c(this.s, R.color.a9));
        this.f76136c.setVisibility(8);
        a(true);
    }

    public final void a(boolean z2) {
        Aweme aweme = this.f76140g;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || awemeRawAd.getButtonIcon() == null) {
                n.a(this.f76138e, 8);
                return;
            }
            n.a(this.f76138e, 0);
            if (z2) {
                this.f76138e.setAlpha(1.0f);
            } else {
                this.f76138e.setAlpha(0.5f);
            }
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i2, int i3) {
        if (b.s(this.f76140g) && !b()) {
            b(this, new i(this, i2, i3));
        }
        g.d().a(this.f76134a, 0, 300, true);
        p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void b(View view, Runnable runnable) {
        if (runnable != null && view != null && v.y(view)) {
            if (!o.b(view) || f.f34637l || bd.a(view.getContext()) == 2) {
                view.postDelayed(new h(this, view, runnable), 100);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2, int i3) {
        int parseColor;
        if (c() && !q()) {
            if (b.x(this.f76140g)) {
                parseColor = androidx.core.content.b.c(getContext(), R.color.bh);
            } else if (b.aE(this.f76140g)) {
                parseColor = Color.parseColor(b.aS(this.f76140g));
            } else {
                parseColor = Color.parseColor(b.ak(this.f76140g));
            }
            a(parseColor, 300);
            this.f76145m = true;
            if (i2 == 1) {
                a(getColorChangeSeconds() / 1000, i3 / 1000, 2, 1);
            } else if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                a(getColorChangeSeconds() / 1000, getColorChangeSeconds() / 1000, 2, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i2, int i3) {
        if (this.f76140g != null) {
            g.a().j(this.s, this.f76140g);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "button_show", this.f76140g.getAwemeRawAd()).c();
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", this.f76140g.getAwemeRawAd()).b("refer", "button").c();
            if (!c()) {
                b(1300);
            }
            if (i2 == 1) {
                a(getShowSeconds() / 1000, i3 / 1000, 1, 1);
            } else if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                a(getShowSeconds() / 1000, getShowSeconds() / 1000, 1, 0);
            }
        }
    }

    public final void a(Aweme aweme, DataCenter dataCenter) {
        String a2;
        AwemeRawAd awemeRawAd;
        this.f76144k = dataCenter;
        this.f76140g = aweme;
        if (!a()) {
            setLabelVisibility(8);
            return;
        }
        Aweme aweme2 = this.f76140g;
        if (aweme2 == null || !aweme2.isAd()) {
            setLabelVisibility(8);
            return;
        }
        e();
        d();
        setLabelVisibility(0);
        if (b.x(aweme)) {
            a2 = b.ac(aweme);
        } else {
            a2 = g.d().a(getContext(), aweme);
        }
        if (aweme.isAppAd()) {
            e();
            l();
            this.r = 0;
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            this.f76137d.setTextColor(androidx.core.content.b.c(this.s, R.color.ac));
            this.f76137d.setText(a2);
            this.f76136c.setVisibility(8);
            this.f76139f.setImageResource(R.drawable.b0i);
            this.f76139f.setVisibility(0);
            a(false);
        } else {
            if (c()) {
                a2 = this.s.getString(R.string.a74, a2);
            }
            a(a2);
        }
        Aweme aweme3 = this.f76140g;
        if (aweme3 != null && (awemeRawAd = aweme3.getAwemeRawAd()) != null && awemeRawAd.getButtonIcon() != null) {
            if (b.aJ(this.f76140g)) {
                e.a(this.f76138e, awemeRawAd.getButtonIcon());
            } else {
                e.b(this.f76138e, awemeRawAd.getButtonIcon(), -1, -1);
            }
        }
    }

    public d(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.y = new e(this);
        this.A = 0;
        this.s = context;
    }

    private static void a(int i2, int i3, int i4, int i5) {
        r.a("ad_ui_adjust", new com.ss.android.ugc.aweme.app.f.d().a("original_time", i2).a("real_time", i3).a("tag", i4).a("is_adjusted", i5).f66730a);
    }
}
