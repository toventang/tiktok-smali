package com.ss.android.ugc.aweme.shortvideo.countdown;

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
import com.ss.android.ugc.aweme.shortvideo.countdown.j;
import com.zhiliaoapp.musically.R;

public final class d implements Animator.AnimatorListener, j {

    /* renamed from: a  reason: collision with root package name */
    private j.a f125171a;

    /* renamed from: b  reason: collision with root package name */
    private i f125172b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f125173c;

    /* renamed from: d  reason: collision with root package name */
    private LottieAnimationView f125174d;

    /* renamed from: e  reason: collision with root package name */
    private int f125175e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f125176f;

    static {
        Covode.recordClassIndex(82204);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.countdown.j
    public final boolean b() {
        return this.f125176f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.countdown.j
    public final void a() {
        LottieAnimationView lottieAnimationView = this.f125174d;
        if (lottieAnimationView != null && this.f125173c != null && lottieAnimationView.f5109b.g()) {
            this.f125174d.d();
            this.f125174d.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f125172b.a(this.f125175e);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f125176f = false;
        e.a("record cound down onAnimationCancel() called");
        this.f125171a.c();
        this.f125172b.b();
    }

    public final void onAnimationEnd(Animator animator) {
        e.a("record cound down onAnimationEnd() called");
        this.f125176f = false;
        LottieAnimationView lottieAnimationView = this.f125174d;
        if (!(lottieAnimationView == null || this.f125173c == null || !lottieAnimationView.f5109b.g())) {
            this.f125174d.setVisibility(8);
        }
        this.f125171a.b();
        this.f125172b.b();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.countdown.j
    public final void a(int i2) {
        String str;
        MethodCollector.i(10706);
        this.f125175e = i2;
        this.f125176f = true;
        this.f125171a.a();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) a.a(LayoutInflater.from(this.f125173c.getContext()), R.layout.b4p, this.f125173c, false);
        this.f125174d = lottieAnimationView;
        this.f125173c.addView(lottieAnimationView);
        this.f125174d.c();
        this.f125174d.a(this);
        LottieAnimationView lottieAnimationView2 = this.f125174d;
        if (i2 == 3) {
            str = "countdown_3_lottie.json";
        } else {
            str = "countdown_10_lottie.json";
        }
        lottieAnimationView2.setAnimation(str);
        this.f125174d.a();
        this.f125174d.setVisibility(0);
        ContentResolver contentResolver = this.f125173c.getContext().getContentResolver();
        if (contentResolver != null) {
            int i3 = Build.VERSION.SDK_INT;
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            float f3 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
            float f4 = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
            e.a("anim_duration_scale =".concat(String.valueOf(f2)));
            e.a("transition_anim_scale =".concat(String.valueOf(f3)));
            e.a("window_anim_scale =".concat(String.valueOf(f4)));
        }
        MethodCollector.o(10706);
    }

    public d(FrameLayout frameLayout, j.a aVar, i iVar) {
        this.f125173c = frameLayout;
        this.f125171a = aVar;
        this.f125172b = iVar;
    }
}
