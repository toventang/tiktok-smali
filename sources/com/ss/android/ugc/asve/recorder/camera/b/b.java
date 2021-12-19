package com.ss.android.ugc.asve.recorder.camera.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.f.g;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f62221a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f62222b;

    /* renamed from: c  reason: collision with root package name */
    public final d f62223c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f62224d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f62225e;

    /* renamed from: f  reason: collision with root package name */
    public final ASCameraView f62226f;

    /* renamed from: g  reason: collision with root package name */
    private int f62227g;

    /* renamed from: h  reason: collision with root package name */
    private int f62228h;

    /* renamed from: i  reason: collision with root package name */
    private final h f62229i = i.a((h.f.a.a) new a(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f62230j = i.a((h.f.a.a) new C1360b(this));

    /* renamed from: k  reason: collision with root package name */
    private final h f62231k = i.a((h.f.a.a) new c(this));

    /* renamed from: l  reason: collision with root package name */
    private final Context f62232l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.asve.context.c f62233m;

    static {
        Covode.recordClassIndex(38239);
    }

    public final AnimatorSet a() {
        return (AnimatorSet) this.f62229i.getValue();
    }

    public final AnimatorSet b() {
        return (AnimatorSet) this.f62230j.getValue();
    }

    public final AnimatorSet c() {
        return (AnimatorSet) this.f62231k.getValue();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$b  reason: collision with other inner class name */
    static final class C1360b extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1360b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimatorSet invoke() {
            b bVar = this.this$0;
            return bVar.a(bVar.f62223c);
        }
    }

    static final class c extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimatorSet invoke() {
            b bVar = this.this$0;
            return bVar.a(bVar.f62224d);
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62236a;

        static {
            Covode.recordClassIndex(38245);
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(38246);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(0);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f62236a.f62226f.removeView(this.this$0.f62236a.f62224d);
                this.this$0.f62236a.f62221a = false;
                this.this$0.f62236a.f62225e = false;
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f62236a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f62236a.f62225e = true;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            g.a(new a(this));
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f62235b;

        static {
            Covode.recordClassIndex(38243);
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(38244);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f62234a.f62226f.removeView(this.this$0.f62235b);
                if (this.this$0.f62235b instanceof ImageView) {
                    this.this$0.f62234a.f62221a = false;
                } else {
                    this.this$0.f62234a.f62222b = false;
                }
                return z.f158842a;
            }
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            g.a(new a(this));
        }

        d(b bVar, View view) {
            this.f62234a = bVar;
            this.f62235b = view;
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62237a;

        static {
            Covode.recordClassIndex(38247);
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(38248);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.this$0 = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f62237a.f62226f.removeView(this.this$0.f62237a.f62224d);
                if (this.this$0.f62237a.f62222b) {
                    this.this$0.f62237a.f62226f.removeView(this.this$0.f62237a.f62223c);
                    this.this$0.f62237a.f62222b = false;
                }
                this.this$0.f62237a.f62221a = false;
                this.this$0.f62237a.f62225e = false;
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(b bVar) {
            this.f62237a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f62237a.f62225e = true;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            g.a(new a(this));
        }
    }

    static final class a extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimatorSet invoke() {
            b bVar = this.this$0;
            AnimatorSet animatorSet = new AnimatorSet();
            if (!bVar.f62226f.getExposureCompensationEnable()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f62224d, View.SCALE_X, 1.0f, 1.1f, 0.95f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar.f62224d, View.SCALE_Y, 1.0f, 1.1f, 0.95f);
                ofFloat.addListener(new e(bVar));
                l.b(ofFloat, "");
                ofFloat.setInterpolator(new com.ss.android.ttve.utils.a());
                l.b(ofFloat2, "");
                ofFloat2.setInterpolator(new com.ss.android.ttve.utils.a());
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(1500L);
            } else {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar.f62224d, View.SCALE_X, 1.2f, 1.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar.f62224d, View.SCALE_Y, 1.2f, 1.0f);
                ofFloat3.addListener(new f(bVar));
                l.b(ofFloat3, "");
                ofFloat3.setInterpolator(new c());
                l.b(ofFloat4, "");
                ofFloat4.setInterpolator(new c());
                animatorSet.playTogether(ofFloat3, ofFloat4);
                animatorSet.setDuration(1000L);
            }
            return animatorSet;
        }
    }

    public final AnimatorSet a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 1.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.5f);
        l.b(ofFloat2, "");
        ofFloat2.setDuration(1000L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.ALPHA, 0.5f, 0.5f);
        l.b(ofFloat3, "");
        ofFloat3.setDuration(500L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, 0.5f, 0.0f);
        l.b(ofFloat4, "");
        ofFloat4.setDuration(500L);
        ofFloat4.addListener(new d(this, view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        return animatorSet;
    }

    public final void a(int i2, int i3) {
        if (!this.f62221a || this.f62226f.getExposureCompensationEnable()) {
            ImageView imageView = this.f62224d;
            imageView.setImageResource(this.f62233m.i());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f62224d.setLayoutParams(b(i2, i3));
            if (this.f62221a) {
                if (this.f62225e) {
                    a().end();
                } else {
                    c().end();
                }
            }
            this.f62226f.removeView(this.f62224d);
            this.f62224d.setAlpha(1.0f);
            this.f62226f.addView(this.f62224d);
            a().start();
            this.f62221a = true;
        }
    }

    private final FrameLayout.LayoutParams b(int i2, int i3) {
        int a2 = (int) com.ss.android.ugc.asve.f.i.a(this.f62232l, 65.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.leftMargin = (int) (((float) i2) - (com.ss.android.ugc.asve.f.i.a(this.f62232l, 60.0f) / 2.0f));
        if (com.ss.android.ugc.asve.f.d.a(this.f62232l)) {
            layoutParams.rightMargin = (com.ss.android.ugc.asve.f.i.a(this.f62232l) - layoutParams.leftMargin) - a2;
        }
        layoutParams.topMargin = i3 - (((int) com.ss.android.ugc.asve.f.i.a(this.f62232l, 60.0f)) / 2);
        if (layoutParams.leftMargin > com.ss.android.ugc.asve.f.i.a(this.f62232l) - a2) {
            layoutParams.leftMargin = com.ss.android.ugc.asve.f.i.a(this.f62232l) - a2;
        }
        if (com.ss.android.ugc.asve.f.d.a(this.f62232l) && layoutParams.rightMargin > com.ss.android.ugc.asve.f.i.a(this.f62232l) - a2) {
            layoutParams.rightMargin = com.ss.android.ugc.asve.f.i.a(this.f62232l) - a2;
        }
        if (layoutParams.leftMargin < 0) {
            layoutParams.leftMargin = 0;
        }
        if (com.ss.android.ugc.asve.f.d.a(this.f62232l) && layoutParams.rightMargin < 0) {
            layoutParams.rightMargin = 0;
        }
        if (layoutParams.topMargin > com.ss.android.ugc.asve.f.i.b(this.f62232l) - a2) {
            layoutParams.topMargin = com.ss.android.ugc.asve.f.i.b(this.f62232l) - a2;
        }
        if (layoutParams.topMargin < 0) {
            layoutParams.topMargin = 0;
        }
        return layoutParams;
    }

    public final void a(float f2, float f3) {
        float a2;
        if (this.f62222b) {
            b().end();
        }
        this.f62226f.removeView(this.f62223c);
        if (f2 > ((float) com.ss.android.ugc.asve.f.i.a(this.f62232l)) - com.ss.android.ugc.asve.f.i.a(this.f62232l, 64.0f)) {
            a2 = f2 - com.ss.android.ugc.asve.f.i.a(this.f62232l, 51.5f);
        } else {
            a2 = f2 + com.ss.android.ugc.asve.f.i.a(this.f62232l, 51.5f);
        }
        double d2 = (double) this.f62227g;
        double seekBarTotalLength = (double) this.f62223c.getSeekBarTotalLength();
        Double.isNaN(seekBarTotalLength);
        Double.isNaN(d2);
        double d3 = d2 + (seekBarTotalLength * 0.5d);
        double d4 = (double) (this.f62227g + this.f62228h);
        double seekBarTotalLength2 = (double) this.f62223c.getSeekBarTotalLength();
        Double.isNaN(seekBarTotalLength2);
        Double.isNaN(d4);
        double d5 = d4 - (seekBarTotalLength2 * 0.5d);
        double d6 = (double) f3;
        if (d6 >= d3 && d6 <= d5) {
            float[] fArr = {a2, f3};
            this.f62222b = true;
            d dVar = this.f62223c;
            float f4 = fArr[0];
            float f5 = fArr[1];
            dVar.f62242a = f4;
            dVar.f62243b = f5;
            d dVar2 = this.f62223c;
            dVar2.f62245d = false;
            dVar2.f62244c = 0.5f;
            dVar2.invalidate();
            this.f62223c.setAlpha(1.0f);
            this.f62226f.setExposureCompensation(0);
            this.f62226f.addView(this.f62223c);
        }
    }

    public b(Context context, ASCameraView aSCameraView, com.ss.android.ugc.asve.context.c cVar) {
        l.d(context, "");
        l.d(aSCameraView, "");
        l.d(cVar, "");
        MethodCollector.i(9090);
        this.f62232l = context;
        this.f62226f = aSCameraView;
        this.f62233m = cVar;
        this.f62223c = new d(context, (byte) 0);
        this.f62224d = new ImageView(context);
        MethodCollector.o(9090);
    }
}
