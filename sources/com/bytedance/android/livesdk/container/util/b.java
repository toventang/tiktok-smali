package com.bytedance.android.livesdk.container.util;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16883a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(9375);
    }

    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f16884a;

        static {
            Covode.recordClassIndex(9376);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        a(h.f.a.a aVar) {
            this.f16884a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            h.f.a.a aVar = this.f16884a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.util.b$b  reason: collision with other inner class name */
    public static final class animation.Animation$AnimationListenerC0346b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f16885a;

        static {
            Covode.recordClassIndex(9377);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public animation.Animation$AnimationListenerC0346b(h.f.a.a aVar) {
            this.f16885a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            h.f.a.a aVar = this.f16885a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final void a(View view, String str, boolean z) {
        MethodCollector.i(8746);
        l.d(str, "");
        if (view == null) {
            MethodCollector.o(8746);
            return;
        }
        int hashCode = str.hashCode();
        int i2 = R.anim.el;
        if (hashCode != -1383228885) {
            if (hashCode == 3387192) {
                str.equals("none");
            } else if (hashCode == 108511772 && str.equals("right")) {
                if (!z && com.bytedance.android.live.uikit.c.a.a(view.getContext())) {
                    i2 = R.anim.em;
                }
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), i2));
                MethodCollector.o(8746);
                return;
            }
        } else if (str.equals("bottom")) {
            i2 = R.anim.ek;
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), i2));
            MethodCollector.o(8746);
            return;
        }
        MethodCollector.o(8746);
    }

    public static final void a(View view, String str, boolean z, h.f.a.a<z> aVar) {
        MethodCollector.i(8755);
        l.d(str, "");
        if (view == null) {
            MethodCollector.o(8755);
        } else if (view.getAnimation() != null) {
            MethodCollector.o(8755);
        } else {
            int hashCode = str.hashCode();
            int i2 = R.anim.ep;
            if (hashCode != -1383228885) {
                if (hashCode == 3387192) {
                    str.equals("none");
                } else if (hashCode == 108511772 && str.equals("right")) {
                    if (!z && com.bytedance.android.live.uikit.c.a.a(view.getContext())) {
                        i2 = R.anim.en;
                    }
                    Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), i2);
                    loadAnimation.setAnimationListener(new a(aVar));
                    view.startAnimation(loadAnimation);
                    MethodCollector.o(8755);
                    return;
                }
            } else if (str.equals("bottom")) {
                i2 = R.anim.eo;
                Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), i2);
                loadAnimation2.setAnimationListener(new a(aVar));
                view.startAnimation(loadAnimation2);
                MethodCollector.o(8755);
                return;
            }
            aVar.invoke();
            MethodCollector.o(8755);
        }
    }
}
