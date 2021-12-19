package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private final LottieAnimationView f126076a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f126077b;

    static {
        Covode.recordClassIndex(82799);
    }

    public final void dismiss() {
        this.f126076a.d();
        this.f126077b = false;
        super.dismiss();
    }

    public final void show() {
        if (!this.f126077b) {
            this.f126076a.a();
            this.f126077b = true;
        }
        super.show();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, R.style.gf);
        l.d(context, "");
        setContentView(R.layout.aim);
        View findViewById = findViewById(R.id.bxd);
        l.b(findViewById, "");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.f126076a = lottieAnimationView;
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        lottieAnimationView.setAnimation("stickpoint_switch_music_loading.json");
        lottieAnimationView.getAnimation();
        lottieAnimationView.setRepeatCount(-1);
    }
}
