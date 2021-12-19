package com.bytedance.android.live.liveinteract.match.a;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f10665a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(5692);
    }

    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f10666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10667b;

        static {
            Covode.recordClassIndex(5693);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            this.f10666a.setVisibility(8);
            this.f10667b.invoke();
        }

        a(View view, h.f.a.a aVar) {
            this.f10666a = view;
            this.f10667b = aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.a.b$b  reason: collision with other inner class name */
    public static final class animation.Animation$AnimationListenerC0196b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f10668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10669b;

        static {
            Covode.recordClassIndex(5694);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            this.f10668a.setVisibility(8);
            this.f10669b.invoke();
        }

        animation.Animation$AnimationListenerC0196b(View view, h.f.a.a aVar) {
            this.f10668a = view;
            this.f10669b = aVar;
        }
    }

    public static void a(View view, View view2, h.f.a.a<z> aVar) {
        l.d(view, "");
        l.d(view2, "");
        l.d(aVar, "");
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0196b(view, aVar));
        translateAnimation.setInterpolator(new a());
        translateAnimation.setDuration(300);
        view.startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation2.setDuration(300);
        translateAnimation2.setInterpolator(new a());
        view2.startAnimation(translateAnimation2);
    }

    public static void b(View view, View view2, h.f.a.a<z> aVar) {
        l.d(view, "");
        l.d(view2, "");
        l.d(aVar, "");
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setAnimationListener(new a(view, aVar));
        translateAnimation.setInterpolator(new a());
        translateAnimation.setDuration(300);
        view.startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation2.setDuration(300);
        translateAnimation2.setInterpolator(new a());
        view2.startAnimation(translateAnimation2);
    }
}
