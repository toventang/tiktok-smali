package com.ss.android.ugc.aweme.main.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class b implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public View f109177a;

    /* renamed from: b  reason: collision with root package name */
    public ViewStub f109178b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f109179c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f109180d = new Runnable() {
        /* class com.ss.android.ugc.aweme.main.b.b.AnonymousClass5 */

        static {
            Covode.recordClassIndex(69922);
        }

        public final void run() {
            b.this.a();
        }
    };

    static {
        Covode.recordClassIndex(69917);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(262, new g(b.class, "onEventMainThread", a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private void b() {
        EventBus.a().b(this);
        Handler handler = this.f109179c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void a() {
        View view = this.f109177a;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f109177a, "scaleY", 1.0f, 0.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200L);
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.main.b.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(69921);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (b.this.f109178b != null) {
                        b.this.f109178b.setVisibility(8);
                    }
                    if (b.this.f109177a != null) {
                        b.this.f109177a.clearAnimation();
                        b.this.f109177a.setVisibility(8);
                    }
                }
            });
            animatorSet.start();
            b();
        }
    }

    @r(a = ThreadMode.MAIN)
    public void onEventMainThread(a aVar) {
        a();
    }

    public b(ViewStub viewStub) {
        this.f109178b = viewStub;
    }
}
