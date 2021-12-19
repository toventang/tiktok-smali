package com.ss.android.ugc.gamora.recorder.quickupload;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.property.az;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao;
import com.ss.android.ugc.gamora.recorder.quickupload.i;
import com.ss.android.ugc.tools.view.style.StyleImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class n extends com.bytedance.scene.j implements q, com.ss.android.ugc.tools.view.a.a {
    public static final a G = new a((byte) 0);
    public boolean A;
    public int B;
    public int C;
    public final com.bytedance.creativex.recorder.gesture.api.b D;
    final com.bytedance.o.f E;
    public final ShortVideoContext F;
    private g H;
    private final h.h I = h.i.a((h.f.a.a) z.f148274a);
    private final h.h J = h.i.a((h.f.a.a) new w(this));
    private final h.h K = h.i.a((h.f.a.a) new aa(this));
    private final h.h L = h.i.a((h.f.a.a) new y(this));
    private final h.h M = h.i.a((h.f.a.a) new v(this));
    private final a N;
    private com.ss.android.ugc.tools.view.a.c O;
    private boolean P;
    private int Q;
    private int R;
    private float S;
    private float T;
    private float U;
    private final com.ss.android.ugc.aweme.shortvideo.h.a V;

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.als.k<MediaModel> f148230a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.als.g<MediaModel> f148231b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.als.k<Boolean> f148232c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.als.g<Boolean> f148233d;

    /* renamed from: e  reason: collision with root package name */
    public ChooseMediaViewModel f148234e;

    /* renamed from: f  reason: collision with root package name */
    public int f148235f;

    /* renamed from: g  reason: collision with root package name */
    final int f148236g = en.a(40.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: h  reason: collision with root package name */
    public boolean f148237h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f148238i;

    /* renamed from: j  reason: collision with root package name */
    public float f148239j = 0.8f;

    /* renamed from: k  reason: collision with root package name */
    final h.h f148240k = h.i.a((h.f.a.a) new x(this));

    /* renamed from: l  reason: collision with root package name */
    public final RvLinearLayoutManager f148241l;
    public final List<MediaModel> t;
    public boolean u;
    public boolean v;
    public com.bytedance.scene.j w;
    public EnableClickCoordinatorLayout x;
    final com.bytedance.creativex.recorder.b.a.d y;
    final List<ValueAnimator> z;

    static {
        Covode.recordClassIndex(97693);
    }

    public final i C() {
        return (i) this.M.getValue();
    }

    public final ConstraintLayout a() {
        return (ConstraintLayout) this.J.getValue();
    }

    public final RecyclerView b() {
        return (RecyclerView) this.K.getValue();
    }

    public final LinearLayout d() {
        return (LinearLayout) this.L.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97694);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class z extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.mediachoose.helper.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f148274a = new z();

        static {
            Covode.recordClassIndex(97722);
        }

        z() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.mediachoose.helper.c invoke() {
            return com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.q
    public final boolean D() {
        return this.A;
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.q
    public final boolean a(boolean z2, MotionEvent motionEvent, float f2) {
        float floatValue;
        h.f.b.l.d(motionEvent, "");
        boolean z3 = false;
        if (z2) {
            EnableClickCoordinatorLayout enableClickCoordinatorLayout = this.x;
            if (enableClickCoordinatorLayout == null) {
                h.f.b.l.a("albumView");
            }
            enableClickCoordinatorLayout.setVisibility(0);
            this.f148241l.f148186a = false;
            EnableClickCoordinatorLayout enableClickCoordinatorLayout2 = this.x;
            if (enableClickCoordinatorLayout2 == null) {
                h.f.b.l.a("albumView");
            }
            enableClickCoordinatorLayout2.setTranslationY(f2 - this.U);
            return false;
        }
        float rawY = motionEvent.getRawY() - f2;
        float rawY2 = motionEvent.getRawY() - ((float) this.B);
        if (motionEvent.getRawY() <= this.U) {
            EnableClickCoordinatorLayout enableClickCoordinatorLayout3 = this.x;
            if (enableClickCoordinatorLayout3 == null) {
                h.f.b.l.a("albumView");
            }
            enableClickCoordinatorLayout3.setTranslationY(0.0f);
        } else {
            EnableClickCoordinatorLayout enableClickCoordinatorLayout4 = this.x;
            if (enableClickCoordinatorLayout4 == null) {
                h.f.b.l.a("albumView");
            }
            enableClickCoordinatorLayout4.setTranslationY((f2 + rawY) - this.U);
        }
        EnableClickCoordinatorLayout enableClickCoordinatorLayout5 = this.x;
        if (enableClickCoordinatorLayout5 == null) {
            h.f.b.l.a("albumView");
        }
        if (enableClickCoordinatorLayout5.getY() - this.U <= ((float) this.B)) {
            z3 = true;
        }
        this.P = z3;
        if (z3 && rawY2 < 0.0f) {
            float abs = Math.abs(rawY2);
            float f3 = this.S;
            if (abs <= f3) {
                double d2 = (double) rawY2;
                Double.isNaN(d2);
                double d3 = -d2;
                double d4 = (double) f3;
                if (d3 >= d4) {
                    floatValue = 1.0f;
                } else {
                    floatValue = new BigDecimal(d3).divide(new BigDecimal(d4), 2, 5).setScale(2, 4).floatValue();
                }
                ConstraintLayout a2 = a();
                if (a2 != null) {
                    a2.setTranslationY(rawY2);
                }
                RecyclerView b2 = b();
                if (b2 != null) {
                    b2.setAlpha(1.0f - floatValue);
                }
                LinearLayout d5 = d();
                if (d5 != null) {
                    d5.setAlpha(1.0f - floatValue);
                }
                EnableClickCoordinatorLayout enableClickCoordinatorLayout6 = this.x;
                if (enableClickCoordinatorLayout6 == null) {
                    h.f.b.l.a("albumView");
                }
                enableClickCoordinatorLayout6.setAlpha(floatValue);
                return z2;
            }
        }
        ConstraintLayout a3 = a();
        if (a3 != null) {
            a3.setTranslationY(0.0f);
        }
        if (rawY2 < 0.0f && Math.abs(rawY2) > this.S) {
            EnableClickCoordinatorLayout enableClickCoordinatorLayout7 = this.x;
            if (enableClickCoordinatorLayout7 == null) {
                h.f.b.l.a("albumView");
            }
            enableClickCoordinatorLayout7.setAlpha(1.0f);
            return z2;
        } else if (rawY2 <= 0.0f) {
            return z2;
        } else {
            EnableClickCoordinatorLayout enableClickCoordinatorLayout8 = this.x;
            if (enableClickCoordinatorLayout8 == null) {
                h.f.b.l.a("albumView");
            }
            enableClickCoordinatorLayout8.setAlpha(0.0f);
            return z2;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.q
    public final boolean a(boolean z2, float f2) {
        z.a aVar = new z.a();
        aVar.element = z2;
        EnableClickCoordinatorLayout enableClickCoordinatorLayout = this.x;
        if (enableClickCoordinatorLayout == null) {
            h.f.b.l.a("albumView");
        }
        float translationY = enableClickCoordinatorLayout.getTranslationY();
        ConstraintLayout a2 = a();
        Float f3 = null;
        Float valueOf = a2 != null ? Float.valueOf(a2.getTranslationY()) : null;
        EnableClickCoordinatorLayout enableClickCoordinatorLayout2 = this.x;
        if (enableClickCoordinatorLayout2 == null) {
            h.f.b.l.a("albumView");
        }
        float alpha = enableClickCoordinatorLayout2.getAlpha();
        if (Math.abs(f2) >= this.T) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            List<ValueAnimator> list = this.z;
            h.f.b.l.b(ofFloat, "");
            list.add(ofFloat);
            ofFloat.setDuration(250L);
            ofFloat.addUpdateListener(new b(this, translationY, alpha, aVar));
            ofFloat.addListener(new c(this, translationY, alpha, aVar));
            ofFloat.start();
        } else {
            RecyclerView b2 = b();
            Float valueOf2 = b2 != null ? Float.valueOf(b2.getAlpha()) : null;
            LinearLayout d2 = d();
            if (d2 != null) {
                f3 = Float.valueOf(d2.getAlpha());
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            List<ValueAnimator> list2 = this.z;
            h.f.b.l.b(ofFloat2, "");
            list2.add(ofFloat2);
            ofFloat2.setDuration(250L);
            ofFloat2.addUpdateListener(new d(this, translationY, alpha, valueOf, valueOf2, f3, aVar));
            ofFloat2.addListener(new e(this, translationY, alpha, valueOf, valueOf2, f3, aVar));
            ofFloat2.start();
        }
        return aVar.element;
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.q
    public final boolean a(boolean z2) {
        ConstraintLayout a2;
        if (this.f42913m == null) {
            return false;
        }
        if (com.ss.android.ugc.aweme.scene.a.a(com.bytedance.scene.ktx.b.b(this), ao.class)) {
            com.bytedance.scene.ktx.b.b(this).f42958f = null;
            com.bytedance.scene.navigation.d b2 = com.bytedance.scene.ktx.b.b(this);
            com.bytedance.scene.j jVar = this.w;
            if (jVar == null) {
                h.f.b.l.a("albumScene");
            }
            b2.b(jVar);
            this.f148241l.f148186a = true;
            z2 = false;
        }
        ConstraintLayout a3 = a();
        if ((a3 == null || a3.getTranslationY() != 0.0f) && (a2 = a()) != null) {
            a2.setTranslationY(0.0f);
        }
        return z2;
    }

    static final class aa extends h.f.b.m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.b(R.id.drl);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.quickupload.n$n  reason: collision with other inner class name */
    static final class C3997n extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3997n(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.y.b(false, com.bytedance.bpea.store.a.a.n());
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<i> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return new i(this.this$0.r());
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.b(R.id.a6t);
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<StyleImageView> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StyleImageView invoke() {
            return this.this$0.b(R.id.bee);
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.b(R.id.c07);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.F.f124759d = "";
            this.this$0.F.f124760e = "";
            this.this$0.y.a(false, com.bytedance.bpea.store.a.a.f());
            return h.z.f158842a;
        }
    }

    public final void F() {
        this.f148239j = 1.0f;
        RecyclerView b2 = b();
        if (b2 != null) {
            b2.setAlpha(1.0f);
        }
        LinearLayout d2 = d();
        if (d2 != null) {
            d2.setAlpha(1.0f);
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        g gVar;
        com.ss.android.ugc.aweme.shortvideo.h.a aVar;
        super.n_();
        if (!(!az.c() || (gVar = this.H) == null || (aVar = this.V) == null)) {
            aVar.b(gVar);
        }
        o.a(this.z);
        com.ss.android.ugc.tools.view.a.c cVar = this.O;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.q
    public final void E() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("from_quick_upload_bar", true);
        this.w = this.N.a(this.F, h.NAVIGATION_PUSH, bundle);
        com.bytedance.scene.ktx.b.b(this).f42958f = null;
        com.bytedance.scene.navigation.d b2 = com.bytedance.scene.ktx.b.b(this);
        com.bytedance.scene.j jVar = this.w;
        if (jVar == null) {
            h.f.b.l.a("albumScene");
        }
        b2.b(jVar, (com.bytedance.scene.c.f) null);
        com.bytedance.scene.j jVar2 = this.w;
        if (jVar2 == null) {
            h.f.b.l.a("albumScene");
        }
        View view = jVar2.n;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.quickupload.EnableClickCoordinatorLayout");
        EnableClickCoordinatorLayout enableClickCoordinatorLayout = (EnableClickCoordinatorLayout) view;
        this.x = enableClickCoordinatorLayout;
        if (enableClickCoordinatorLayout == null) {
            h.f.b.l.a("albumView");
        }
        enableClickCoordinatorLayout.setNoClick(true);
        EnableClickCoordinatorLayout enableClickCoordinatorLayout2 = this.x;
        if (enableClickCoordinatorLayout2 == null) {
            h.f.b.l.a("albumView");
        }
        enableClickCoordinatorLayout2.setAlpha(0.0f);
        EnableClickCoordinatorLayout enableClickCoordinatorLayout3 = this.x;
        if (enableClickCoordinatorLayout3 == null) {
            h.f.b.l.a("albumView");
        }
        enableClickCoordinatorLayout3.setVisibility(8);
        EnableClickCoordinatorLayout enableClickCoordinatorLayout4 = this.x;
        if (enableClickCoordinatorLayout4 == null) {
            h.f.b.l.a("albumView");
        }
        enableClickCoordinatorLayout4.setTranslationY((float) this.C);
        ConstraintLayout a2 = a();
        if (a2 != null) {
            a2.setTranslationY(0.0f);
        }
        F();
        this.P = false;
    }

    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148265a;

        static {
            Covode.recordClassIndex(97701);
        }

        g(n nVar) {
            this.f148265a = nVar;
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f148265a.f148237h = true;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f148265a.f148237h = false;
            RecyclerView b2 = this.f148265a.b();
            if (b2 != null) {
                b2.setVisibility(8);
            }
            LinearLayout d2 = this.f148265a.d();
            if (d2 != null) {
                d2.setVisibility(8);
            }
            this.f148265a.f148232c.a((Boolean) false);
        }
    }

    public static final class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148267a;

        static {
            Covode.recordClassIndex(97703);
        }

        i(n nVar) {
            this.f148267a = nVar;
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f148267a.f148238i = true;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f148267a.f148238i = false;
            this.f148267a.A = true;
            this.f148267a.F.f124759d = "slide_mini";
            int[] iArr = new int[2];
            StyleImageView styleImageView = (StyleImageView) this.f148267a.f148240k.getValue();
            if (styleImageView != null) {
                styleImageView.getLocationOnScreen(iArr);
            }
            this.f148267a.B = iArr[1];
        }
    }

    public static final class q extends com.bytedance.creativex.recorder.gesture.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148270a;

        static {
            Covode.recordClassIndex(97711);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(n nVar) {
            this.f148270a = nVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            this.f148270a.a("click");
            return super.a(scaleGestureDetector);
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent) {
            this.f148270a.a("click");
            return false;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (motionEvent == null || motionEvent2 == null) {
                return super.b(motionEvent, motionEvent2, f2, f3);
            }
            com.bytedance.creativex.recorder.gesture.api.d a2 = this.f148270a.D.a(6);
            if (a2 != null && a2.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            if (motionEvent2.getY() > motionEvent.getY() && Math.abs(motionEvent.getY() - motionEvent2.getY()) > Math.abs(motionEvent.getX() - motionEvent2.getX())) {
                this.f148270a.a("slide");
            }
            if (motionEvent2.getY() < motionEvent.getY() && Math.abs(motionEvent.getY() - motionEvent2.getY()) > Math.abs(motionEvent.getX() - motionEvent2.getX())) {
                n nVar = this.f148270a;
                nVar.f148235f = 0;
                nVar.a(nVar.f148235f, new l(nVar));
            }
            if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                this.f148270a.a("click");
            }
            return false;
        }
    }

    public static final class r extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148271a;

        static {
            Covode.recordClassIndex(97712);
        }

        r(n nVar) {
            this.f148271a = nVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            int itemCount = this.f148271a.C().getItemCount();
            int m2 = this.f148271a.f148241l.m();
            if (this.f148271a.C().f148209a.size() >= 20 && itemCount - m2 <= 20) {
                n nVar = this.f148271a;
                nVar.f148235f++;
                nVar.a(nVar.f148235f, new h.f.a.b<List<MediaModel>, h.z>(this) {
                    /* class com.ss.android.ugc.gamora.recorder.quickupload.n.r.AnonymousClass1 */
                    final /* synthetic */ r this$0;

                    static {
                        Covode.recordClassIndex(97713);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(List<MediaModel> list) {
                        List<MediaModel> list2 = list;
                        h.f.b.l.d(list2, "");
                        List<MediaModel> list3 = this.this$0.f148271a.t;
                        list3.addAll(list2);
                        h.a.n.c((List) list3);
                        i C = this.this$0.f148271a.C();
                        h.f.b.l.d(list3, "");
                        f.a.t a2 = f.a.t.a(new i.b(C, list3));
                        h.f.b.l.b(a2, "");
                        if (!com.ss.android.ugc.tools.utils.d.a(C.f148209a)) {
                            a2 = a2.b(f.a.h.a.a(f.a.k.a.f158005b)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                            h.f.b.l.b(a2, "");
                        }
                        a2.d(new i.a(C, list3));
                        return h.z.f158842a;
                    }
                });
            }
        }
    }

    public static final class t implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148272a;

        static {
            Covode.recordClassIndex(97716);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(n nVar) {
            this.f148272a = nVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.quickupload.f
        public final boolean a(MotionEvent motionEvent) {
            h.f.b.l.d(motionEvent, "");
            this.f148272a.F();
            if (motionEvent.getAction() == 0) {
                n nVar = this.f148272a;
                nVar.u = nVar.c(motionEvent);
            }
            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !this.f148272a.u) {
                this.f148272a.a("click");
            }
            return false;
        }
    }

    public static final class u implements com.ss.android.ugc.aweme.mediachoose.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f148273a;

        static {
            Covode.recordClassIndex(97717);
        }

        u(h.f.a.b bVar) {
            this.f148273a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.mediachoose.e
        public final void a(boolean z, int i2, List<MediaModel> list, com.ss.android.ugc.aweme.mediachoose.d dVar) {
            h.f.b.l.d(dVar, "");
            if (list != null) {
                this.f148273a.invoke(list);
            }
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mediachoose.f, h.z> {
        final /* synthetic */ MediaModel $mediaModel$inlined;
        final /* synthetic */ h.f.a.a $onSuccess$inlined;

        static {
            Covode.recordClassIndex(97704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(MediaModel mediaModel, h.f.a.a aVar) {
            super(1);
            this.$mediaModel$inlined = mediaModel;
            this.$onSuccess$inlined = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mediachoose.f fVar) {
            h.f.b.l.d(fVar, "");
            this.$onSuccess$inlined.invoke();
            return h.z.f158842a;
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148269a;

        static {
            Covode.recordClassIndex(97710);
        }

        p(n nVar) {
            this.f148269a = nVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f148269a.a((String) null);
            }
        }
    }

    public static final /* synthetic */ EnableClickCoordinatorLayout a(n nVar) {
        EnableClickCoordinatorLayout enableClickCoordinatorLayout = nVar.x;
        if (enableClickCoordinatorLayout == null) {
            h.f.b.l.a("albumView");
        }
        return enableClickCoordinatorLayout;
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mediachoose.f, h.z> {
        final /* synthetic */ Context $this_run;

        static {
            Covode.recordClassIndex(97705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(Context context) {
            super(1);
            this.$this_run = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mediachoose.f fVar) {
            com.ss.android.ugc.aweme.mediachoose.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aa.a(this.$this_run, fVar2.f109387e, 1000);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.q
    public final boolean b(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        return a(d()).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    public final boolean c(MotionEvent motionEvent) {
        return a(b()).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f148243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f148244c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.a f148245d;

        static {
            Covode.recordClassIndex(97696);
        }

        b(n nVar, float f2, float f3, z.a aVar) {
            this.f148242a = nVar;
            this.f148243b = f2;
            this.f148244c = f3;
            this.f148245d = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            EnableClickCoordinatorLayout a2 = n.a(this.f148242a);
            float f2 = this.f148243b;
            h.f.b.l.b(valueAnimator, "");
            a2.setTranslationY(f2 - (valueAnimator.getAnimatedFraction() * f2));
            EnableClickCoordinatorLayout a3 = n.a(this.f148242a);
            float f3 = this.f148244c;
            a3.setAlpha(f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction()));
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f148258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f148259c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Float f148260d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Float f148261e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Float f148262f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.a f148263g;

        static {
            Covode.recordClassIndex(97699);
        }

        public final void onAnimationEnd(Animator animator) {
            com.bytedance.scene.ktx.b.b(this.f148257a).f42958f = null;
            com.bytedance.scene.navigation.d b2 = com.bytedance.scene.ktx.b.b(this.f148257a);
            com.bytedance.scene.j jVar = this.f148257a.w;
            if (jVar == null) {
                h.f.b.l.a("albumScene");
            }
            b2.b(jVar);
            this.f148263g.element = false;
            this.f148257a.f148241l.f148186a = true;
        }

        e(n nVar, float f2, float f3, Float f4, Float f5, Float f6, z.a aVar) {
            this.f148257a = nVar;
            this.f148258b = f2;
            this.f148259c = f3;
            this.f148260d = f4;
            this.f148261e = f5;
            this.f148262f = f6;
            this.f148263g = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148264a;

        static {
            Covode.recordClassIndex(97700);
        }

        f(n nVar) {
            this.f148264a = nVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            RecyclerView b2 = this.f148264a.b();
            if (b2 != null) {
                b2.setTranslationY(floatValue);
            }
            LinearLayout d2 = this.f148264a.d();
            if (d2 != null) {
                d2.setTranslationY(floatValue);
            }
        }
    }

    private static RectF a(View view) {
        if (view == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight()));
    }

    static final class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148266a;

        static {
            Covode.recordClassIndex(97702);
        }

        h(n nVar) {
            this.f148266a = nVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            RecyclerView b2 = this.f148266a.b();
            if (b2 != null) {
                h.f.b.l.b(valueAnimator, "");
                b2.setTranslationY((-((float) en.a(50.0d, com.ss.android.ugc.aweme.port.in.i.f115645a))) * valueAnimator.getAnimatedFraction());
            }
            RecyclerView b3 = this.f148266a.b();
            if (b3 != null) {
                float f2 = this.f148266a.f148239j;
                h.f.b.l.b(valueAnimator, "");
                b3.setAlpha(f2 * valueAnimator.getAnimatedFraction());
            }
            LinearLayout d2 = this.f148266a.d();
            if (d2 != null) {
                h.f.b.l.b(valueAnimator, "");
                d2.setTranslationY((-((float) en.a(50.0d, com.ss.android.ugc.aweme.port.in.i.f115645a))) * valueAnimator.getAnimatedFraction());
            }
            LinearLayout d3 = this.f148266a.d();
            if (d3 != null) {
                h.f.b.l.b(valueAnimator, "");
                d3.setAlpha(valueAnimator.getAnimatedFraction());
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148268a;

        static {
            Covode.recordClassIndex(97707);
        }

        m(n nVar) {
            this.f148268a = nVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            ViewGroup.LayoutParams layoutParams;
            Boolean bool = (Boolean) obj;
            n nVar = this.f148268a;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + nVar.f148236g;
            } else {
                i2 = nVar.f148236g;
            }
            int a2 = ((i2 + en.a(100.0d, com.ss.android.ugc.aweme.port.in.i.f115645a)) + en.a(8.0d, com.ss.android.ugc.aweme.port.in.i.f115645a)) - en.a(50.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
            RecyclerView b2 = nVar.b();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (b2 != null) {
                layoutParams = b2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = a2;
            }
            RecyclerView b3 = nVar.b();
            if (b3 != null) {
                b3.setLayoutParams(marginLayoutParams2);
            }
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f148247b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f148248c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.a f148249d;

        static {
            Covode.recordClassIndex(97697);
        }

        public final void onAnimationEnd(Animator animator) {
            String str;
            String str2;
            this.f148249d.element = false;
            n.a(this.f148246a).setNoClick(false);
            ConstraintLayout a2 = this.f148246a.a();
            if (a2 != null) {
                a2.setTranslationY(0.0f);
            }
            String str3 = null;
            this.f148246a.a((String) null);
            ChooseMediaViewModel chooseMediaViewModel = this.f148246a.f148234e;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.c(new ChooseMediaViewModel.l());
            }
            ChooseMediaViewModel chooseMediaViewModel2 = this.f148246a.f148234e;
            if (chooseMediaViewModel2 != null) {
                chooseMediaViewModel2.a(OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE);
            }
            this.f148246a.F.f124759d = "slide_full";
            this.f148246a.F.f124760e = "slide_up";
            ShortVideoContext shortVideoContext = this.f148246a.F;
            h.f.b.l.d(shortVideoContext, "");
            CommentVideoModel commentVideoModel = shortVideoContext.f124767l;
            if ((commentVideoModel == null || (str = commentVideoModel.getEnterMethod()) == null) && (str = shortVideoContext.f124760e) == null) {
                str = "";
            }
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r);
            if (!CommentUtils.needMob(shortVideoContext)) {
                str2 = "";
            } else if (commentVideoModel != null) {
                str2 = commentVideoModel.getCommentId();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.tools.f.b a4 = a3.a("reply_comment_id", str2);
            if (!CommentUtils.needMob(shortVideoContext)) {
                str3 = "";
            } else if (commentVideoModel != null) {
                str3 = commentVideoModel.getUserId();
            }
            com.ss.android.ugc.tools.f.b a5 = a4.a("reply_user_id", str3).a("enter_from", "video_shoot_page").a("from_group_id", dv.a()).a("enter_method", str).a("is_westwindow_exist", shortVideoContext.aR);
            if (shortVideoContext.C != 0) {
                a5.a("draft_id", shortVideoContext.C);
            }
            String str4 = shortVideoContext.D;
            h.f.b.l.b(str4, "");
            if (str4.length() > 0) {
                a5.a("new_draft_id", shortVideoContext.D);
            }
            a5.a("shoot_page", "video_shoot_page");
            a5.a("shoot_tab_name", shortVideoContext.r());
            com.ss.android.ugc.aweme.common.r.a("click_upload_entrance", a5.f149193a);
        }

        c(n nVar, float f2, float f3, z.a aVar) {
            this.f148246a = nVar;
            this.f148247b = f2;
            this.f148248c = f3;
            this.f148249d = aVar;
        }
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f148250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f148251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f148252c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Float f148253d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Float f148254e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Float f148255f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.a f148256g;

        static {
            Covode.recordClassIndex(97698);
        }

        d(n nVar, float f2, float f3, Float f4, Float f5, Float f6, z.a aVar) {
            this.f148250a = nVar;
            this.f148251b = f2;
            this.f148252c = f3;
            this.f148253d = f4;
            this.f148254e = f5;
            this.f148255f = f6;
            this.f148256g = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            EnableClickCoordinatorLayout a2 = n.a(this.f148250a);
            float f2 = this.f148251b;
            h.f.b.l.b(valueAnimator, "");
            a2.setTranslationY(f2 + ((((float) this.f148250a.C) - this.f148251b) * valueAnimator.getAnimatedFraction()));
            EnableClickCoordinatorLayout a3 = n.a(this.f148250a);
            float f3 = this.f148252c;
            a3.setAlpha(f3 - (valueAnimator.getAnimatedFraction() * f3));
            ConstraintLayout a4 = this.f148250a.a();
            if (a4 != null) {
                Float f4 = this.f148253d;
                if (f4 == null) {
                    h.f.b.l.b();
                }
                a4.setTranslationY(f4.floatValue() + ((-this.f148253d.floatValue()) * valueAnimator.getAnimatedFraction()));
            }
            RecyclerView b2 = this.f148250a.b();
            if (b2 != null) {
                Float f5 = this.f148254e;
                if (f5 == null) {
                    h.f.b.l.b();
                }
                b2.setAlpha(f5.floatValue() + ((1.0f - this.f148254e.floatValue()) * valueAnimator.getAnimatedFraction()));
            }
            LinearLayout d2 = this.f148250a.d();
            if (d2 != null) {
                Float f6 = this.f148255f;
                if (f6 == null) {
                    h.f.b.l.b();
                }
                d2.setAlpha(f6.floatValue() + ((1.0f - this.f148255f.floatValue()) * valueAnimator.getAnimatedFraction()));
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<List<MediaModel>, h.z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<MediaModel> list) {
            RecyclerView b2;
            List<MediaModel> list2 = list;
            h.f.b.l.d(list2, "");
            this.this$0.t.clear();
            if (list2.size() < 5) {
                this.this$0.v = false;
            } else {
                this.this$0.v = true;
                this.this$0.t.addAll(list2);
                this.this$0.C().a(this.this$0.t);
                n nVar = this.this$0;
                if (nVar.r() != null) {
                    ShortVideoContext shortVideoContext = nVar.F;
                    com.bytedance.o.f fVar = nVar.E;
                    Context r = nVar.r();
                    if (r == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(r, "");
                    if (!l.a(shortVideoContext, fVar, r) && (((b2 = nVar.b()) == null || b2.getVisibility() != 0) && !nVar.f148238i)) {
                        RecyclerView b3 = nVar.b();
                        if (b3 != null) {
                            b3.setVisibility(0);
                        }
                        LinearLayout d2 = nVar.d();
                        if (d2 != null) {
                            d2.setVisibility(0);
                        }
                        RecyclerView b4 = nVar.b();
                        if (b4 != null) {
                            b4.setAlpha(0.0f);
                        }
                        LinearLayout d3 = nVar.d();
                        if (d3 != null) {
                            d3.setAlpha(0.0f);
                        }
                        nVar.f148232c.a((Boolean) true);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        List<ValueAnimator> list3 = nVar.z;
                        h.f.b.l.b(ofFloat, "");
                        list3.add(ofFloat);
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new h(nVar));
                        ofFloat.addListener(new i(nVar));
                        ofFloat.start();
                        ShortVideoContext shortVideoContext2 = nVar.F;
                        h.f.b.l.d(shortVideoContext2, "");
                        com.ss.android.ugc.aweme.common.r.a("fast_upload_photo_show", new com.ss.android.ugc.tools.f.b().a("shoot_way", shortVideoContext2.r).a("creation_id", shortVideoContext2.q).f149193a);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<MediaModel, h.z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(97714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(MediaModel mediaModel) {
            final MediaModel mediaModel2 = mediaModel;
            h.f.b.l.d(mediaModel2, "");
            this.this$0.F();
            if (this.this$0.a(mediaModel2)) {
                n nVar = this.this$0;
                AnonymousClass1 r5 = new h.f.a.a<h.z>(this) {
                    /* class com.ss.android.ugc.gamora.recorder.quickupload.n.s.AnonymousClass1 */
                    final /* synthetic */ s this$0;

                    static {
                        Covode.recordClassIndex(97715);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ h.z invoke() {
                        String str;
                        if (mediaModel2.b()) {
                            str = "video";
                        } else {
                            str = UGCMonitor.TYPE_PHOTO;
                        }
                        ShortVideoContext shortVideoContext = this.this$0.this$0.F;
                        h.f.b.l.d(shortVideoContext, "");
                        h.f.b.l.d(str, "");
                        com.ss.android.ugc.aweme.common.r.a("fast_upload_photo_click", new com.ss.android.ugc.tools.f.b().a("shoot_way", shortVideoContext.r).a("creation_id", shortVideoContext.q).a("content_type", str).f149193a);
                        this.this$0.this$0.f148230a.a(mediaModel2);
                        return h.z.f158842a;
                    }
                };
                if (mediaModel2.b()) {
                    Context r = nVar.r();
                    if (r != null) {
                        h.f.b.l.b(r, "");
                        com.ss.android.ugc.aweme.mediachoose.c cVar = new com.ss.android.ugc.aweme.mediachoose.c(r);
                        cVar.a("enter_from_single");
                        cVar.a(mediaModel2, 1000, -1, new j(mediaModel2, r5), new k(r));
                    }
                } else {
                    double d2 = (double) mediaModel2.f109400l;
                    double d3 = (double) mediaModel2.f109401m;
                    Double.isNaN(d3);
                    if (d2 <= d3 * 2.4d) {
                        double d4 = (double) mediaModel2.f109401m;
                        double d5 = (double) mediaModel2.f109400l;
                        Double.isNaN(d5);
                        if (d4 <= d5 * 2.4d) {
                            r5.invoke();
                        }
                    }
                    View view = nVar.n;
                    h.f.b.l.b(view, "");
                    new com.bytedance.tux.g.b(view).a(nVar.c_(R.string.ftk)).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).b();
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        int i2;
        int i3;
        com.ss.android.ugc.aweme.shortvideo.h.a aVar;
        com.bytedance.als.h<Boolean> a2;
        com.bytedance.als.h<Boolean> c2;
        super.a(bundle);
        this.f148241l.f148186a = true;
        int i4 = 0;
        this.f148241l.b(0);
        RecyclerView b2 = b();
        if (b2 != null) {
            b2.setAdapter(C());
            b2.setLayoutManager(this.f148241l);
            b2.a(new r(this));
        }
        C().f148210b = new s(this);
        com.ss.android.ugc.aweme.shortvideo.h.a aVar2 = this.V;
        if (!(aVar2 == null || (c2 = aVar2.c()) == null)) {
            c2.a(this, new m(this));
        }
        a aVar3 = this.N;
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        aVar3.a((androidx.fragment.app.e) activity, new C3997n(this));
        a aVar4 = this.N;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        aVar4.b((androidx.fragment.app.e) activity2, new o(this));
        com.ss.android.ugc.aweme.shortvideo.h.a aVar5 = this.V;
        if (!(aVar5 == null || (a2 = aVar5.a()) == null)) {
            a2.a(this, new p(this));
        }
        com.bytedance.creativex.recorder.gesture.api.b bVar = this.D;
        if (bVar != null) {
            bVar.a(new q(this), 0);
        }
        Context s2 = s();
        h.f.b.l.b(s2, "");
        Resources resources = s2.getResources();
        h.f.b.l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            i2 = displayMetrics.heightPixels;
        } else {
            i2 = 0;
        }
        this.C = i2;
        Context s3 = s();
        h.f.b.l.b(s3, "");
        Resources resources2 = s3.getResources();
        h.f.b.l.a((Object) resources2, "");
        DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
        if (displayMetrics2 != null) {
            i3 = displayMetrics2.widthPixels;
        } else {
            i3 = 0;
        }
        this.Q = i3;
        Context s4 = s();
        h.f.b.l.b(s4, "");
        int identifier = s4.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i4 = s4.getResources().getDimensionPixelSize(identifier);
        }
        this.R = i4;
        float b3 = com.bytedance.common.utility.n.b(r(), 150.0f);
        this.S = b3;
        this.T = b3 + com.bytedance.common.utility.n.b(r(), 100.0f);
        this.U = (float) dh.c(s());
        LinearLayout d2 = d();
        if (d2 != null) {
            d2.setMinimumWidth((int) (((float) this.Q) - com.bytedance.common.utility.n.b(r(), 40.0f)));
        }
        if (az.c()) {
            g gVar = new g(this.E, ao.class, this, com.bytedance.scene.ktx.b.b(this));
            this.H = gVar;
            com.ss.android.ugc.aweme.shortvideo.h.a aVar6 = this.V;
            if (aVar6 != null) {
                aVar6.a(gVar);
            }
        } else if (az.b() && (aVar = this.V) != null) {
            aVar.a(new t(this));
        }
    }

    public final void a(String str) {
        if (!this.f148237h) {
            RecyclerView b2 = b();
            if (b2 == null || b2.getVisibility() != 8) {
                this.A = false;
                this.F.f124759d = "";
                ValueAnimator ofFloat = ValueAnimator.ofFloat(-((float) en.a(50.0d, com.ss.android.ugc.aweme.port.in.i.f115645a)), 0.0f);
                List<ValueAnimator> list = this.z;
                h.f.b.l.b(ofFloat, "");
                list.add(ofFloat);
                ofFloat.setDuration(250L);
                ofFloat.addUpdateListener(new f(this));
                ofFloat.addListener(new g(this));
                ofFloat.start();
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b(), "alpha", this.f148239j, 0.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.start();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(d(), "alpha", 1.0f, 0.0f);
                ofFloat3.setDuration(250L);
                ofFloat3.start();
                if (str != null) {
                    m.a(str, this.F);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.q
    public final boolean a(MotionEvent motionEvent) {
        h.f.b.l.d(motionEvent, "");
        return c(motionEvent);
    }

    public final boolean a(MediaModel mediaModel) {
        if (com.ss.android.ugc.tools.utils.i.a(mediaModel.f109390b)) {
            return true;
        }
        Context r2 = r();
        if (r2 == null) {
            return false;
        }
        if (mediaModel.b()) {
            View view = this.n;
            h.f.b.l.b(view, "");
            new com.bytedance.tux.g.b(view).a(r2.getString(R.string.cd4)).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).b();
            return false;
        }
        View view2 = this.n;
        h.f.b.l.b(view2, "");
        new com.bytedance.tux.g.b(view2).a(r2.getString(R.string.dq6)).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).b();
        return false;
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        if (this.O == null) {
            Activity t2 = t();
            if (!(t2 instanceof com.ss.android.ugc.tools.view.a.c)) {
                t2 = null;
            }
            this.O = (com.ss.android.ugc.tools.view.a.c) t2;
        }
        com.ss.android.ugc.tools.view.a.c cVar = this.O;
        if (cVar != null) {
            cVar.b(this);
        }
        this.f148234e = (ChooseMediaViewModel) com.bytedance.jedi.arch.t.a(com.bytedance.scene.ktx.c.b(this)).a(ChooseMediaViewModel.class);
        View a2 = com.a.a(layoutInflater, R.layout.au7, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.tools.view.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !com.ss.android.ugc.aweme.scene.a.a(com.bytedance.scene.ktx.b.b(this), ao.class)) {
            return false;
        }
        com.bytedance.scene.ktx.b.b(this).f42958f = null;
        com.bytedance.scene.navigation.d b2 = com.bytedance.scene.ktx.b.b(this);
        com.bytedance.scene.j jVar = this.w;
        if (jVar == null) {
            h.f.b.l.a("albumScene");
        }
        b2.b(jVar);
        ConstraintLayout a2 = a();
        if (a2 != null) {
            a2.setTranslationY(0.0f);
        }
        this.A = false;
        this.f148232c.a((Boolean) false);
        this.F.f124759d = "";
        RecyclerView b3 = b();
        if (b3 != null) {
            b3.setVisibility(8);
        }
        LinearLayout d2 = d();
        if (d2 != null) {
            d2.setVisibility(8);
        }
        RecyclerView b4 = b();
        if (b4 != null) {
            b4.setTranslationY(0.0f);
        }
        LinearLayout d3 = d();
        if (d3 != null) {
            d3.setTranslationY(0.0f);
        }
        RecyclerView b5 = b();
        if (b5 != null) {
            b5.setAlpha(0.0f);
        }
        LinearLayout d4 = d();
        if (d4 == null) {
            return true;
        }
        d4.setAlpha(0.0f);
        return true;
    }

    public final void a(int i2, h.f.a.b<? super List<MediaModel>, h.z> bVar) {
        ((com.ss.android.ugc.aweme.mediachoose.helper.c) this.I.getValue()).a(0, 300, i2, new u(bVar));
    }

    public n(com.ss.android.ugc.aweme.shortvideo.h.a aVar, com.bytedance.creativex.recorder.gesture.api.b bVar, com.bytedance.o.f fVar, ShortVideoContext shortVideoContext) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(shortVideoContext, "");
        this.V = aVar;
        this.D = bVar;
        this.E = fVar;
        this.F = shortVideoContext;
        com.bytedance.als.k<MediaModel> kVar = new com.bytedance.als.k<>();
        this.f148230a = kVar;
        this.f148231b = kVar;
        com.bytedance.als.k<Boolean> kVar2 = new com.bytedance.als.k<>();
        this.f148232c = kVar2;
        this.f148233d = kVar2;
        r();
        this.f148241l = new RvLinearLayoutManager();
        this.t = new ArrayList();
        Object a2 = fVar.a(a.class);
        h.f.b.l.b(a2, "");
        this.N = (a) a2;
        Object a3 = fVar.a(com.bytedance.creativex.recorder.b.a.d.class);
        h.f.b.l.b(a3, "");
        this.y = (com.bytedance.creativex.recorder.b.a.d) a3;
        this.z = new ArrayList();
    }
}
