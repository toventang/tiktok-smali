package com.bytedance.android.livesdk.service.animation.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class RoundWaveAnimationView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21245a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f21246b;

    static {
        Covode.recordClassIndex(12532);
    }

    public RoundWaveAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12533);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final f.a.b.b getDisposable() {
        return this.f21246b;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RoundWaveAnimationView f21250a;

        static {
            Covode.recordClassIndex(12536);
        }

        c(RoundWaveAnimationView roundWaveAnimationView) {
            this.f21250a = roundWaveAnimationView;
        }

        public final void run() {
            this.f21250a.removeAllViews();
        }
    }

    public final void b() {
        f.a.b.b bVar = this.f21246b;
        if (bVar != null) {
            bVar.dispose();
        }
        post(new c(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RoundWaveAnimationView f21247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f21248b;

        static {
            Covode.recordClassIndex(12534);
        }

        b(RoundWaveAnimationView roundWaveAnimationView, LottieAnimationView lottieAnimationView) {
            this.f21247a = roundWaveAnimationView;
            this.f21248b = lottieAnimationView;
        }

        public final void run() {
            this.f21248b.setAnimation("ttlive_gift_combo_wave.json");
            this.f21248b.a(new com.bytedance.android.livesdk.service.animation.b.a(this) {
                /* class com.bytedance.android.livesdk.service.animation.view.RoundWaveAnimationView.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f21249a;

                static {
                    Covode.recordClassIndex(12535);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f21249a = r1;
                }

                @Override // com.bytedance.android.livesdk.service.animation.b.a
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (this.f21249a.f21247a.indexOfChild(this.f21249a.f21248b) >= 0) {
                        this.f21249a.f21247a.removeView(this.f21249a.f21248b);
                    }
                }

                public final void onAnimationEnd(Animator animator, boolean z) {
                    super.onAnimationEnd(animator, z);
                    if (this.f21249a.f21247a.indexOfChild(this.f21249a.f21248b) >= 0) {
                        this.f21249a.f21247a.removeView(this.f21249a.f21248b);
                    }
                }
            });
            this.f21248b.a();
        }
    }

    public final void a() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        addView(lottieAnimationView);
        post(new b(this, lottieAnimationView));
    }

    public final void setDisposable(f.a.b.b bVar) {
        this.f21246b = bVar;
    }

    private /* synthetic */ RoundWaveAnimationView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RoundWaveAnimationView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9725);
        MethodCollector.o(9725);
    }
}
