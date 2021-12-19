package com.bytedance.creativex.recorder.b.a;

import android.view.animation.Animation;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ad {
    static {
        Covode.recordClassIndex(16505);
    }

    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f28175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28176b;

        static {
            Covode.recordClassIndex(16506);
        }

        public final void onAnimationRepeat(Animation animation) {
            l.d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            l.d(animation, "");
        }

        public final void onAnimationEnd(Animation animation) {
            l.d(animation, "");
            this.f28175a.a(new l(this.f28176b, false));
        }

        public a(k kVar, boolean z) {
            this.f28175a = kVar;
            this.f28176b = z;
        }
    }

    public static final class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f28177a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28178b;

        static {
            Covode.recordClassIndex(16507);
        }

        public final void onAnimationRepeat(Animation animation) {
            l.d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            l.d(animation, "");
        }

        public final void onAnimationEnd(Animation animation) {
            l.d(animation, "");
            this.f28177a.a(new l(this.f28178b, true));
        }

        public b(k kVar, boolean z) {
            this.f28177a = kVar;
            this.f28178b = z;
        }
    }
}
