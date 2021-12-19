package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class dm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dg f94604a;

    static {
        Covode.recordClassIndex(60045);
    }

    dm(dg dgVar) {
        this.f94604a = dgVar;
    }

    public final void run() {
        dg dgVar = this.f94604a;
        if (!dgVar.f94580g) {
            int i2 = 1;
            dgVar.f94580g = true;
            dgVar.T.setVisibility(0);
            dgVar.T.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
            dgVar.f94575b = dgVar.T.getMeasuredHeight();
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) dgVar.f94575b, 0.0f);
            translateAnimation.setDuration(250);
            translateAnimation.setFillAfter(true);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.ss.android.ugc.aweme.feed.ui.dg.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(60038);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    dg.this.f94580g = false;
                    if (dg.this.f94583j != null) {
                        dg.this.f94583j.setShowed(true);
                    }
                }
            });
            dgVar.f94574a.startAnimation(translateAnimation);
            d a2 = new d().a("enter_from", dgVar.P == 0 ? "homepage_hot" : "server_push").a("group_id", dgVar.L.getAid()).a("author_id", dgVar.L.getAuthorUid()).a("from_user_id", dgVar.f94583j.getUid());
            if (dgVar.f94578e == null || dgVar.f94578e.getVisibility() != 0) {
                i2 = 0;
            }
            r.a("show_share_user_info", a2.a("with_follow_button", i2).f66730a);
        }
    }
}
