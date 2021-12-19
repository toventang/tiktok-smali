package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b;
import com.zhiliaoapp.musically.R;

public final class q extends a {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f101455a;

    /* renamed from: b  reason: collision with root package name */
    private Animation f101456b;
    private Animation.AnimationListener x = new Animation.AnimationListener() {
        /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.q.AnonymousClass1 */

        static {
            Covode.recordClassIndex(64878);
        }

        public final void onAnimationEnd(Animation animation) {
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    };

    static {
        Covode.recordClassIndex(64877);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a() {
        super.a();
        this.f101455a = (ImageView) a(R.id.dk7);
    }

    public final void i() {
        if (this.f101456b == null) {
            this.f101456b = b.a(800, this.x);
        }
        this.f101455a.startAnimation(this.f101456b);
    }

    public final void j() {
        Animation animation = this.f101455a.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.f101455a.clearAnimation();
    }

    public q(View view) {
        super(view);
    }
}
