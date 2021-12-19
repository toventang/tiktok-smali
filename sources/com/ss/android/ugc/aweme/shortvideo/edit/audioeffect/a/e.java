package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.sticker.panel.guide.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f126760b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f126761a;

    /* renamed from: c  reason: collision with root package name */
    private TextView f126762c;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f126763d;

    /* renamed from: e  reason: collision with root package name */
    private View f126764e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f126765f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f126766g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f126767h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final Effect f126768i;

    static {
        Covode.recordClassIndex(83173);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83174);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Animation a(float f2, float f3) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
            alphaAnimation.setDuration(300);
            return alphaAnimation;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final boolean b() {
        return this.f126766g;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f126769a;

        static {
            Covode.recordClassIndex(83175);
        }

        b(e eVar) {
            this.f126769a = eVar;
        }

        public final void run() {
            Animation a2 = a.a(1.0f, 0.0f);
            a2.setAnimationListener(new Animation.AnimationListener(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f126770a;

                static {
                    Covode.recordClassIndex(83176);
                }

                public final void onAnimationRepeat(Animation animation) {
                    l.d(animation, "");
                }

                public final void onAnimationStart(Animation animation) {
                    l.d(animation, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f126770a = r1;
                }

                public final void onAnimationEnd(Animation animation) {
                    l.d(animation, "");
                    this.f126770a.f126769a.a();
                }
            });
            View view = this.f126769a.f126761a;
            if (view != null) {
                view.startAnimation(a2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a() {
        MethodCollector.i(3474);
        View view = this.f126761a;
        if (view != null) {
            view.removeCallbacks(this.f126767h);
        }
        FrameLayout frameLayout = this.f126765f;
        if (frameLayout != null) {
            frameLayout.removeView(this.f126764e);
        }
        this.f126766g = false;
        MethodCollector.o(3474);
    }

    public e(Effect effect) {
        l.d(effect, "");
        this.f126768i = effect;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a(FrameLayout frameLayout) {
        View view;
        TextView textView;
        MethodCollector.i(3473);
        if (frameLayout == null) {
            MethodCollector.o(3473);
            return;
        }
        this.f126765f = frameLayout;
        View a2 = com.a.a(LayoutInflater.from(frameLayout.getContext()), R.layout.ai5, frameLayout, false);
        this.f126764e = a2;
        FrameLayout frameLayout2 = this.f126765f;
        if (frameLayout2 != null) {
            frameLayout2.addView(a2);
        }
        View view2 = this.f126764e;
        SimpleDraweeView simpleDraweeView = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.b4b);
        } else {
            view = null;
        }
        this.f126761a = view;
        View view3 = this.f126764e;
        if (view3 != null) {
            textView = (TextView) view3.findViewById(R.id.ebc);
        } else {
            textView = null;
        }
        this.f126762c = textView;
        if (textView != null) {
            String hint = this.f126768i.getHint();
            if (hint == null) {
                hint = "";
            }
            textView.setText(hint);
        }
        View view4 = this.f126764e;
        if (view4 != null) {
            simpleDraweeView = (SimpleDraweeView) view4.findViewById(R.id.ebd);
        }
        this.f126763d = simpleDraweeView;
        eu.a(simpleDraweeView, 8);
        View view5 = this.f126761a;
        if (view5 != null) {
            view5.startAnimation(a.a(0.0f, 1.0f));
        }
        View view6 = this.f126761a;
        if (view6 != null) {
            view6.postDelayed(this.f126767h, 5000);
        }
        this.f126766g = true;
        MethodCollector.o(3473);
    }
}
