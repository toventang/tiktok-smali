package com.ss.android.ugc.aweme.ftc.countdown;

import android.animation.Animator;
import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.ftc.countdown.l;
import com.zhiliaoapp.musically.R;

public final class d implements Animator.AnimatorListener, l {

    /* renamed from: a  reason: collision with root package name */
    private l.a f98342a;

    /* renamed from: b  reason: collision with root package name */
    private k f98343b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f98344c;

    /* renamed from: d  reason: collision with root package name */
    private LottieAnimationView f98345d;

    /* renamed from: e  reason: collision with root package name */
    private int f98346e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f98347f;

    static {
        Covode.recordClassIndex(62541);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // com.ss.android.ugc.aweme.ftc.countdown.l
    public final boolean b() {
        return this.f98347f;
    }

    @Override // com.ss.android.ugc.aweme.ftc.countdown.l
    public final void a() {
        LottieAnimationView lottieAnimationView = this.f98345d;
        if (lottieAnimationView != null && this.f98344c != null && lottieAnimationView.f5109b.g()) {
            this.f98345d.d();
            this.f98345d.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f98343b.a(this.f98346e);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f98347f = false;
        e.a("record cound down onAnimationCancel() called");
        this.f98342a.b();
        this.f98343b.b();
    }

    public final void onAnimationEnd(Animator animator) {
        e.a("record cound down onAnimationEnd() called");
        this.f98347f = false;
        LottieAnimationView lottieAnimationView = this.f98345d;
        if (!(lottieAnimationView == null || this.f98344c == null || !lottieAnimationView.f5109b.g())) {
            this.f98345d.setVisibility(8);
        }
        this.f98342a.c();
        this.f98343b.b();
    }

    @Override // com.ss.android.ugc.aweme.ftc.countdown.l
    public final void a(int i2) {
        String str;
        MethodCollector.i(9820);
        this.f98346e = i2;
        this.f98347f = true;
        this.f98342a.a();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) a.a(LayoutInflater.from(this.f98344c.getContext()), R.layout.b4p, this.f98344c, false);
        this.f98345d = lottieAnimationView;
        this.f98344c.addView(lottieAnimationView);
        this.f98345d.c();
        this.f98345d.a(this);
        LottieAnimationView lottieAnimationView2 = this.f98345d;
        if (i2 == 3) {
            str = "countdown_3_lottie.json";
        } else {
            str = "countdown_10_lottie.json";
        }
        lottieAnimationView2.setAnimation(str);
        this.f98345d.a();
        this.f98345d.setVisibility(0);
        ContentResolver contentResolver = this.f98344c.getContext().getContentResolver();
        if (contentResolver != null) {
            int i3 = Build.VERSION.SDK_INT;
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            float f3 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
            float f4 = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
            e.a("anim_duration_scale =".concat(String.valueOf(f2)));
            e.a("transition_anim_scale =".concat(String.valueOf(f3)));
            e.a("window_anim_scale =".concat(String.valueOf(f4)));
        }
        MethodCollector.o(9820);
    }

    public d(FrameLayout frameLayout, l.a aVar, k kVar) {
        this.f98344c = frameLayout;
        this.f98342a = aVar;
        this.f98343b = kVar;
    }
}
