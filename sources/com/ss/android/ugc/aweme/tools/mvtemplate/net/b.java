package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class b extends com.ss.android.ugc.tools.view.e.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C3729b f140872c = new C3729b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f140873a = new Handler();

    /* renamed from: b  reason: collision with root package name */
    public final Activity f140874b;

    /* renamed from: e  reason: collision with root package name */
    private final ValueAnimator f140875e;

    static {
        Covode.recordClassIndex(91992);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b$b  reason: collision with other inner class name */
    public static final class C3729b {
        static {
            Covode.recordClassIndex(91994);
        }

        private C3729b() {
        }

        public /* synthetic */ C3729b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.tools.view.e.b
    public final void dismiss() {
        super.dismiss();
        this.f140873a.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f140878b;

        static {
            Covode.recordClassIndex(91995);
        }

        c(b bVar, h.f.a.a aVar) {
            this.f140877a = bVar;
            this.f140878b = aVar;
        }

        public final void run() {
            if (!this.f140877a.f140874b.isFinishing()) {
                this.f140877a.dismiss();
                this.f140878b.invoke();
            }
        }
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140876a;

        static {
            Covode.recordClassIndex(91993);
        }

        a(b bVar) {
            this.f140876a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b bVar = this.f140876a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            bVar.setProgress(((Integer) animatedValue).intValue());
        }
    }

    public final void a(String str) {
        l.d(str, "");
        if (!this.f140874b.isFinishing()) {
            show();
        }
        setMessage(str);
        a();
        this.f140875e.start();
    }

    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (this.f140875e.isRunning()) {
            this.f140875e.end();
        }
        setProgress(100);
        this.f140873a.postDelayed(new c(this, aVar), 70);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(activity);
        l.d(activity, "");
        this.f140874b = activity;
        setCancelable(false);
        setIndeterminate(false);
        setMax(100);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 83);
        ofInt.setDuration(5000L);
        ofInt.addUpdateListener(new a(this));
        l.b(ofInt, "");
        this.f140875e = ofInt;
    }
}
