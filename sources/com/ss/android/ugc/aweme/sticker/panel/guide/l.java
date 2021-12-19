package com.ss.android.ugc.aweme.sticker.panel.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

public final class l implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f135191c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f135192a;

    /* renamed from: b  reason: collision with root package name */
    public View f135193b;

    /* renamed from: d  reason: collision with root package name */
    private Effect f135194d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f135195e;

    static {
        Covode.recordClassIndex(88372);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88373);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final boolean b() {
        return this.f135195e;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a() {
        if (this.f135194d != null) {
            View view = this.f135193b;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(150).setListener(new b(this)).start();
            }
            this.f135195e = false;
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f135196a;

        static {
            Covode.recordClassIndex(88374);
        }

        b(l lVar) {
            this.f135196a = lVar;
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.i(10023);
            h.f.b.l.d(animator, "");
            FrameLayout frameLayout = this.f135196a.f135192a;
            if (frameLayout != null) {
                frameLayout.removeView(this.f135196a.f135193b);
                MethodCollector.o(10023);
                return;
            }
            MethodCollector.o(10023);
        }
    }

    public l(Effect effect) {
        this.f135194d = effect;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a(FrameLayout frameLayout) {
        MethodCollector.i(10181);
        if (this.f135194d == null || frameLayout == null) {
            MethodCollector.o(10181);
            return;
        }
        this.f135192a = frameLayout;
        View a2 = com.a.a(LayoutInflater.from(frameLayout.getContext()), R.layout.ai9, frameLayout, false);
        this.f135193b = a2;
        FrameLayout frameLayout2 = this.f135192a;
        if (frameLayout2 != null) {
            frameLayout2.addView(a2);
            View view = this.f135193b;
            if (view != null) {
                view.setAlpha(0.0f);
                view.animate().alpha(1.0f).setDuration(150).start();
            }
            this.f135195e = true;
            MethodCollector.o(10181);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(10181);
        throw nullPointerException;
    }
}
