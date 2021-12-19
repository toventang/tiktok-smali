package com.ss.android.ugc.aweme.commercialize.egg.impl.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.commercialize.egg.d.c;
import h.f.b.l;

public final class d extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f74010f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private AnimationImageView f74011g;

    /* renamed from: h  reason: collision with root package name */
    private AnimationImageView f74012h;

    /* renamed from: i  reason: collision with root package name */
    private long f74013i;

    static {
        Covode.recordClassIndex(45578);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45579);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.impl.b.a
    public final void c() {
        MethodCollector.i(7663);
        AnimationImageView animationImageView = this.f74011g;
        if (animationImageView != null) {
            animationImageView.setVisibility(8);
        }
        AnimationImageView animationImageView2 = this.f74012h;
        if (animationImageView2 != null) {
            animationImageView2.setVisibility(8);
        }
        AnimationImageView animationImageView3 = this.f74011g;
        if (animationImageView3 != null) {
            this.f73988e.removeView(animationImageView3);
            animationImageView3.d();
        }
        AnimationImageView animationImageView4 = this.f74012h;
        if (animationImageView4 != null) {
            this.f73988e.removeView(animationImageView4);
            animationImageView4.d();
        }
        this.f73986c = null;
        this.f74011g = null;
        this.f74012h = null;
        MethodCollector.o(7663);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.impl.b.a
    public final void b() {
        e eVar;
        c cVar;
        MethodCollector.i(7584);
        com.ss.android.ugc.aweme.commercialize.egg.d.a aVar = this.f73985b;
        if (aVar == null || (cVar = aVar.f73943k) == null) {
            eVar = null;
        } else {
            eVar = cVar.f73960a;
        }
        if (eVar != null) {
            Context context = this.f73984a;
            if (this.f74011g == null) {
                this.f74011g = a(context);
                this.f73988e.addView(this.f74011g);
            }
            if (this.f74012h == null) {
                this.f74012h = a(context);
                this.f73988e.addView(this.f74012h);
            }
            if (this.f74013i == 0 || System.currentTimeMillis() - this.f74013i > 800) {
                AnimationImageView animationImageView = this.f74011g;
                if (animationImageView == null || this.f74012h == null) {
                    MethodCollector.o(7584);
                    return;
                } else if (!((LottieAnimationView) animationImageView).f5109b.g()) {
                    AnimationImageView animationImageView2 = this.f74011g;
                    if (animationImageView2 != null) {
                        animationImageView2.setVisibility(0);
                    }
                    AnimationImageView animationImageView3 = this.f74011g;
                    if (animationImageView3 != null) {
                        animationImageView3.setComposition(eVar);
                    }
                    AnimationImageView animationImageView4 = this.f74011g;
                    if (animationImageView4 != null) {
                        animationImageView4.a();
                    }
                    com.ss.android.ugc.aweme.commercialize.egg.a.a aVar2 = this.f73986c;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    this.f74013i = System.currentTimeMillis();
                    d();
                    MethodCollector.o(7584);
                    return;
                } else {
                    AnimationImageView animationImageView5 = this.f74012h;
                    if (animationImageView5 == null) {
                        l.b();
                    }
                    if (!((LottieAnimationView) animationImageView5).f5109b.g()) {
                        AnimationImageView animationImageView6 = this.f74012h;
                        if (animationImageView6 != null) {
                            animationImageView6.setVisibility(0);
                        }
                        AnimationImageView animationImageView7 = this.f74012h;
                        if (animationImageView7 != null) {
                            animationImageView7.setComposition(eVar);
                        }
                        AnimationImageView animationImageView8 = this.f74012h;
                        if (animationImageView8 != null) {
                            animationImageView8.a();
                        }
                        com.ss.android.ugc.aweme.commercialize.egg.a.a aVar3 = this.f73986c;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                        this.f74013i = System.currentTimeMillis();
                        d();
                    }
                    MethodCollector.o(7584);
                    return;
                }
            }
        } else {
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar4 = this.f73986c;
            if (aVar4 != null) {
                aVar4.b();
            }
            a(false, null);
        }
        MethodCollector.o(7584);
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AnimationImageView f74014a;

        static {
            Covode.recordClassIndex(45580);
        }

        b(AnimationImageView animationImageView) {
            this.f74014a = animationImageView;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f74014a.setLayerType(0, null);
            this.f74014a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f74014a.setLayerType(0, null);
            this.f74014a.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(FrameLayout frameLayout) {
        super(frameLayout);
        l.d(frameLayout, "");
    }

    private static AnimationImageView a(Context context) {
        AnimationImageView animationImageView = new AnimationImageView(context);
        animationImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        animationImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        animationImageView.a(new b(animationImageView));
        return animationImageView;
    }
}
