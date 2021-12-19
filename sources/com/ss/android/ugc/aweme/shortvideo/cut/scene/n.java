package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class n extends com.ss.android.ugc.gamora.b.b implements com.bytedance.jedi.arch.b {
    public static final a x = new a((byte) 0);
    private final boolean A;

    /* renamed from: a  reason: collision with root package name */
    public ba f125791a;

    /* renamed from: b  reason: collision with root package name */
    public VECutVideoPresenter f125792b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a f125793c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f125794d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f125795e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a f125796f;

    /* renamed from: g  reason: collision with root package name */
    public VideoEditViewModel f125797g;

    /* renamed from: h  reason: collision with root package name */
    public VEVideoCutterViewModel f125798h;

    /* renamed from: i  reason: collision with root package name */
    public CutVideoBottomBarViewModel f125799i;

    /* renamed from: j  reason: collision with root package name */
    public CutMultiVideoViewModel f125800j;

    /* renamed from: k  reason: collision with root package name */
    public CutVideoViewModel f125801k;

    /* renamed from: l  reason: collision with root package name */
    public CutVideoEditViewModel f125802l;
    public CutVideoListViewModel t;
    public CutVideoSpeedViewModel u;
    public String v;
    public String w;
    private final boolean y;
    private final boolean z;

    static {
        Covode.recordClassIndex(82627);
    }

    public n() {
        this(false, false, 3);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82628);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public final VECutVideoPresenter a() {
        VECutVideoPresenter vECutVideoPresenter = this.f125792b;
        if (vECutVideoPresenter == null) {
            h.f.b.l.a("presenter");
        }
        return vECutVideoPresenter;
    }

    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a b() {
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar = this.f125793c;
        if (aVar == null) {
            h.f.b.l.a("videoEditView");
        }
        return aVar;
    }

    public static final class v implements com.ss.android.ugc.aweme.shortvideo.cut.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125820a;

        static {
            Covode.recordClassIndex(82650);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.h
        public final void a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.addUpdateListener(new a(this));
            n.c(this.f125820a).e(true);
            n.h(this.f125820a).setVisibility(8);
            ofFloat.start();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        v(n nVar) {
            this.f125820a = nVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.h
        public final void b(float f2) {
            TextView f3 = n.f(this.f125820a);
            Activity t = this.f125820a.t();
            h.f.b.l.b(t, "");
            f3.setText(com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.d.a(t, f2, this.f125820a.b().d()));
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f125821a;

            static {
                Covode.recordClassIndex(82651);
            }

            a(v vVar) {
                this.f125821a = vVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView f2 = n.f(this.f125821a.f125820a);
                h.f.b.l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                f2.setAlpha(((Float) animatedValue).floatValue());
                CutVideoBottomBarViewModel c2 = n.c(this.f125821a.f125820a);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                c2.b(1.0f - ((Float) animatedValue2).floatValue());
                CutVideoSpeedViewModel g2 = n.g(this.f125821a.f125820a);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                g2.a(1.0f - ((Float) animatedValue3).floatValue());
            }
        }

        static final class b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f125822a;

            static {
                Covode.recordClassIndex(82652);
            }

            b(v vVar) {
                this.f125822a = vVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView f2 = n.f(this.f125822a.f125820a);
                h.f.b.l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                f2.setAlpha(((Float) animatedValue).floatValue());
                CutVideoBottomBarViewModel c2 = n.c(this.f125822a.f125820a);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                c2.b(1.0f - ((Float) animatedValue2).floatValue());
                CutVideoSpeedViewModel g2 = n.g(this.f125822a.f125820a);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                g2.a(1.0f - ((Float) animatedValue3).floatValue());
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.h
        public final void a(float f2) {
            b(f2);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(250L);
            ofFloat.addUpdateListener(new b(this));
            n.c(this.f125820a).e(false);
            n.h(this.f125820a).setVisibility(0);
            ofFloat.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$n  reason: collision with other inner class name */
    static final class C3271n<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125811a;

        static {
            Covode.recordClassIndex(82641);
        }

        C3271n(n nVar) {
            this.f125811a = nVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.n$n$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3271n f125812a;

            static {
                Covode.recordClassIndex(82642);
            }

            a(C3271n nVar) {
                this.f125812a = nVar;
            }

            public final void onAnimationEnd(Animator animator) {
                h.f.b.l.d(animator, "");
                super.onAnimationEnd(animator);
                this.f125812a.f125811a.b().setAlpha(1.0f);
            }
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f125811a.b(), "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(400L);
            ofFloat.addListener(new a(this));
            ofFloat.start();
        }
    }

    public final void a(VECutVideoPresenter vECutVideoPresenter) {
        h.f.b.l.d(vECutVideoPresenter, "");
        this.f125792b = vECutVideoPresenter;
    }

    public static final /* synthetic */ CutVideoEditViewModel a(n nVar) {
        CutVideoEditViewModel cutVideoEditViewModel = nVar.f125802l;
        if (cutVideoEditViewModel == null) {
            h.f.b.l.a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    public static final /* synthetic */ VEVideoCutterViewModel b(n nVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = nVar.f125798h;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    public static final /* synthetic */ CutVideoBottomBarViewModel c(n nVar) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = nVar.f125799i;
        if (cutVideoBottomBarViewModel == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    public static final /* synthetic */ VideoEditViewModel d(n nVar) {
        VideoEditViewModel videoEditViewModel = nVar.f125797g;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    public static final /* synthetic */ CutVideoListViewModel e(n nVar) {
        CutVideoListViewModel cutVideoListViewModel = nVar.t;
        if (cutVideoListViewModel == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    public static final /* synthetic */ TextView f(n nVar) {
        TextView textView = nVar.f125794d;
        if (textView == null) {
            h.f.b.l.a("selfAdaptionToast");
        }
        return textView;
    }

    public static final /* synthetic */ CutVideoSpeedViewModel g(n nVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = nVar.u;
        if (cutVideoSpeedViewModel == null) {
            h.f.b.l.a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    public static final /* synthetic */ FrameLayout h(n nVar) {
        FrameLayout frameLayout = nVar.f125795e;
        if (frameLayout == null) {
            h.f.b.l.a("selfAdaptionToastLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class b<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125803a;

        static {
            Covode.recordClassIndex(82629);
        }

        b(n nVar) {
            this.f125803a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Integer num = (Integer) obj;
            CutVideoEditViewModel a2 = n.a(this.f125803a);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 1;
            }
            a2.f125524a = i2;
        }
    }

    static final class f<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125807a;

        static {
            Covode.recordClassIndex(82633);
        }

        f(n nVar) {
            this.f125807a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            n.b(this.f125807a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f125807a.b().getLeftSeekingValue(), x.f.EDITOR_SEEK_FLAG_OnGoing));
        }
    }

    static final class g<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125808a;

        static {
            Covode.recordClassIndex(82634);
        }

        g(n nVar) {
            this.f125808a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            n.b(this.f125808a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f125808a.b().getLeftSeekingValue(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
        }
    }

    static final class o<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125813a;

        static {
            Covode.recordClassIndex(82643);
        }

        o(n nVar) {
            this.f125813a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            if (l2 != null) {
                l2.longValue();
                n.b(this.f125813a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(l2.longValue(), x.f.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    static final class p<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125814a;

        static {
            Covode.recordClassIndex(82644);
        }

        p(n nVar) {
            this.f125814a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            n.c(this.f125814a).a(this.f125814a.b().getSelectedTime());
        }
    }

    static final class c<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125804a;

        static {
            Covode.recordClassIndex(82630);
        }

        c(n nVar) {
            this.f125804a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f125804a.f125796f.f126288b = this.f125804a.b().getPlayingPosition();
            n.b(this.f125804a).a(this.f125804a.f125796f);
            n.c(this.f125804a).a(this.f125804a.b().getSelectedTime());
            n.a(this.f125804a).b();
        }
    }

    static final class j<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125809a;

        static {
            Covode.recordClassIndex(82637);
        }

        j(n nVar) {
            this.f125809a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && (!bool.booleanValue())) {
                bool.booleanValue();
                n.b(this.f125809a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f125809a.b().getPlayingPosition(), x.f.EDITOR_SEEK_FLAG_LastSeek));
            }
        }
    }

    static final class m<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125810a;

        static {
            Covode.recordClassIndex(82640);
        }

        m(n nVar) {
            this.f125810a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f125810a.b(), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(400L);
            ofFloat.start();
        }
    }

    static final class q<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125815a;

        static {
            Covode.recordClassIndex(82645);
        }

        q(n nVar) {
            this.f125815a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            n.b(this.f125815a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f125815a.b().getLeftSeekingValue(), x.f.EDITOR_SEEK_FLAG_OnGoing));
            n.c(this.f125815a).a(this.f125815a.b().getSelectedTime());
            n.a(this.f125815a).b();
        }
    }

    static final class r<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125816a;

        static {
            Covode.recordClassIndex(82646);
        }

        r(n nVar) {
            this.f125816a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            n.b(this.f125816a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f125816a.b().getRightSeekingValue(), x.f.EDITOR_SEEK_FLAG_OnGoing));
            n.c(this.f125816a).a(this.f125816a.b().getSelectedTime());
            n.a(this.f125816a).b();
        }
    }

    static final class t<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125818a;

        static {
            Covode.recordClassIndex(82648);
        }

        t(n nVar) {
            this.f125818a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            n.b(this.f125818a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f125818a.b().getRightSeekingValue(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateOut));
            n.c(this.f125818a).a(this.f125818a.b().getSelectedTime());
        }
    }

    static final class s<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125817a;

        static {
            Covode.recordClassIndex(82647);
        }

        s(n nVar) {
            this.f125817a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            n.b(this.f125817a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f125817a.b().getLeftSeekingValue(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateIn));
            n.c(this.f125817a).a(this.f125817a.b().getSelectedTime());
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f125817a.f125800j;
            if (cutMultiVideoViewModel == null) {
                h.f.b.l.a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.f125338m = this.f125817a.b().getLeftSeekingValue();
        }
    }

    static final class u<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125819a;

        static {
            Covode.recordClassIndex(82649);
        }

        u(n nVar) {
            this.f125819a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            CutVideoViewModel cutVideoViewModel = this.f125819a.f125801k;
            if (cutVideoViewModel == null) {
                h.f.b.l.a("cutVideoViewModel");
            }
            if (!cutVideoViewModel.b().f125554c) {
                com.ss.android.ugc.aweme.common.r.a("upload_duration_adjust", new com.ss.android.ugc.tools.f.b().a("creation_id", this.f125819a.w).a("shoot_way", this.f125819a.v).a("enter_from", "clip_edit_page").a("content_type", com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(this.f125819a.b().d())).a("content_duration_ms", (int) (this.f125819a.b().getSelectedTime() * 1000.0f)).f149193a);
            }
        }
    }

    public final void a(boolean z2) {
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar = this.f125793c;
        if (aVar == null) {
            h.f.b.l.a("videoEditView");
        }
        aVar.setEditViewHeight(z2);
    }

    static final class e<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125806a;

        static {
            Covode.recordClassIndex(82632);
        }

        e(n nVar) {
            this.f125806a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            long singleSeekTime;
            Float f2 = (Float) obj;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                VECutVideoPresenter a2 = this.f125806a.a();
                int i2 = n.e(this.f125806a).f125528b;
                com.ss.android.ugc.aweme.shortvideo.cut.i iVar = a2.f125356k.f126020a;
                if (iVar != null) {
                    iVar.b(i2, floatValue);
                }
                androidx.core.g.e<Long, Long> playBoundary = this.f125806a.b().getPlayBoundary();
                h.f.b.l.b(playBoundary, "");
                if (!(playBoundary.f2397a == null || playBoundary.f2398b == null)) {
                    if (n.a(this.f125806a).f125524a == 1) {
                        singleSeekTime = this.f125806a.b().getMultiSeekTime();
                    } else {
                        singleSeekTime = this.f125806a.b().getSingleSeekTime();
                    }
                    VECutVideoPresenter a3 = this.f125806a.a();
                    androidx.core.g.e<Long, Long> playBoundary2 = this.f125806a.b().getPlayBoundary();
                    h.f.b.l.b(playBoundary2, "");
                    a3.a(playBoundary2);
                    n.b(this.f125806a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(singleSeekTime, x.f.EDITOR_SEEK_FLAG_LastSeek));
                }
                n.c(this.f125806a).a(this.f125806a.b().getSelectedTime());
            }
        }
    }

    static final class d<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f125805a;

        static {
            Covode.recordClassIndex(82631);
        }

        d(n nVar) {
            this.f125805a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            long singlePlayingPosition;
            VEImageTransformFilterParam a2;
            if (this.f125805a.b() instanceof VEVideoEditViewV2) {
                n.b(this.f125805a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f125805a.b().getSingleSeekTime(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
            } else {
                if (n.a(this.f125805a).f125524a == 1) {
                    singlePlayingPosition = this.f125805a.b().getMultiPlayingPosition();
                } else {
                    singlePlayingPosition = this.f125805a.b().getSinglePlayingPosition();
                }
                VECutVideoPresenter a3 = this.f125805a.a();
                androidx.core.g.e<Long, Long> playBoundary = this.f125805a.b().getPlayBoundary();
                h.f.b.l.b(playBoundary, "");
                a3.a(playBoundary);
                n.b(this.f125805a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(singlePlayingPosition, x.f.EDITOR_SEEK_FLAG_LastSeek));
            }
            n.c(this.f125805a).a(this.f125805a.b().getSelectedTime());
            n.a(this.f125805a).b();
            if (n.a(this.f125805a).f125524a == 2) {
                VECutVideoPresenter a4 = this.f125805a.a();
                VideoSegment videoSegment = n.d(this.f125805a).k().get(n.e(this.f125805a).f125528b);
                F f2 = this.f125805a.b().getPlayBoundary().f2397a;
                if (f2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(f2, "");
                long longValue = f2.longValue();
                S s = this.f125805a.b().getPlayBoundary().f2398b;
                if (s == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(s, "");
                long longValue2 = s.longValue();
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g gVar = a4.f125357l;
                if (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d && gVar.f129508a != null && videoSegment != null) {
                    gVar.a();
                    if (gVar.f129509b && com.ss.android.ugc.tools.utils.h.a(videoSegment.a(false), true) && (a2 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g.a(videoSegment.q)) != null) {
                        com.ss.android.ugc.asve.editor.g gVar2 = gVar.f129508a;
                        if (gVar2 == null) {
                            h.f.b.l.b();
                        }
                        int a5 = gVar2.a(0, a2, (int) longValue, (int) longValue2);
                        com.ss.android.ugc.asve.editor.g gVar3 = gVar.f129508a;
                        if (gVar3 == null) {
                            h.f.b.l.b();
                        }
                        gVar3.a(a5, a2);
                        gVar.f129510c.add(Integer.valueOf(a5));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        VideoEditViewModel videoEditViewModel = this.f125797g;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel.f126129b.observe(this, new b(this));
        VideoEditViewModel videoEditViewModel2 = this.f125797g;
        if (videoEditViewModel2 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel2.f126130c.observe(this, new j(this));
        VideoEditViewModel videoEditViewModel3 = this.f125797g;
        if (videoEditViewModel3 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel3.f126132e.observe(this, new o(this));
        VideoEditViewModel videoEditViewModel4 = this.f125797g;
        if (videoEditViewModel4 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel4.f126131d.observe(this, new p(this));
        VideoEditViewModel videoEditViewModel5 = this.f125797g;
        if (videoEditViewModel5 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel5.f126134g.observe(this, new q(this));
        VideoEditViewModel videoEditViewModel6 = this.f125797g;
        if (videoEditViewModel6 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel6.f126133f.observe(this, new r(this));
        VideoEditViewModel videoEditViewModel7 = this.f125797g;
        if (videoEditViewModel7 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel7.f126135h.observe(this, new s(this));
        VideoEditViewModel videoEditViewModel8 = this.f125797g;
        if (videoEditViewModel8 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel8.f126138k.observe(this, new t(this));
        VideoEditViewModel videoEditViewModel9 = this.f125797g;
        if (videoEditViewModel9 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel9.t.observe(this, new u(this));
        VideoEditViewModel videoEditViewModel10 = this.f125797g;
        if (videoEditViewModel10 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel10.f126139l.observe(this, new c(this));
        VideoEditViewModel videoEditViewModel11 = this.f125797g;
        if (videoEditViewModel11 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel11.f126140m.observe(this, new d(this));
        VideoEditViewModel videoEditViewModel12 = this.f125797g;
        if (videoEditViewModel12 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel12.n.observe(this, new e(this));
        VideoEditViewModel videoEditViewModel13 = this.f125797g;
        if (videoEditViewModel13 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel13.f126136i.observe(this, new f(this));
        VideoEditViewModel videoEditViewModel14 = this.f125797g;
        if (videoEditViewModel14 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel14.f126137j.observe(this, new g(this));
        CutVideoEditViewModel cutVideoEditViewModel = this.f125802l;
        if (cutVideoEditViewModel == null) {
            h.f.b.l.a("cutVideoEditViewModel");
        }
        b.a.b(this, cutVideoEditViewModel, o.f125823a, new h(this));
        CutVideoEditViewModel cutVideoEditViewModel2 = this.f125802l;
        if (cutVideoEditViewModel2 == null) {
            h.f.b.l.a("cutVideoEditViewModel");
        }
        selectNonNullSubscribe(cutVideoEditViewModel2, p.f125824a, new ah(), new i(this));
        CutVideoEditViewModel cutVideoEditViewModel3 = this.f125802l;
        if (cutVideoEditViewModel3 == null) {
            h.f.b.l.a("cutVideoEditViewModel");
        }
        b.a.b(this, cutVideoEditViewModel3, q.f125825a, new k(this));
        CutVideoEditViewModel cutVideoEditViewModel4 = this.f125802l;
        if (cutVideoEditViewModel4 == null) {
            h.f.b.l.a("cutVideoEditViewModel");
        }
        b.a.b(this, cutVideoEditViewModel4, r.f125826a, new l(this));
        VideoEditViewModel videoEditViewModel15 = this.f125797g;
        if (videoEditViewModel15 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel15.u.observe(this, new m(this));
        VideoEditViewModel videoEditViewModel16 = this.f125797g;
        if (videoEditViewModel16 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel16.v.observe(this, new C3271n(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(82636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(n nVar) {
            super(2);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            this.this$0.b().setEnabled(booleanValue);
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(82638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(n nVar) {
            super(2);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            this.this$0.b().a(booleanValue);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(82639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(n nVar) {
            super(2);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.b().e();
            return z.f158842a;
        }
    }

    public n(boolean z2, boolean z3) {
        boolean z4;
        this.z = z2;
        this.A = z3;
        this.f125796f = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(0, x.f.EDITOR_SEEK_FLAG_OnGoing);
        if (!z2 || !com.ss.android.ugc.aweme.shortvideo.edit.c.b.a()) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.y = z4;
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        if (this.y) {
            View a2 = com.a.a(layoutInflater, R.layout.ash, viewGroup, false);
            h.f.b.l.b(a2, "");
            return a2;
        }
        View a3 = com.a.a(layoutInflater, R.layout.asg, viewGroup, false);
        h.f.b.l.b(a3, "");
        return a3;
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(82635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(n nVar) {
            super(2);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            androidx.core.g.e<Long, Long> playBoundary = this.this$0.b().getPlayBoundary();
            h.f.b.l.b(playBoundary, "");
            ba baVar = this.this$0.f125791a;
            long j2 = 0;
            Long l2 = 0L;
            if (baVar != null && baVar.g()) {
                List<VideoSegment> k2 = n.d(this.this$0).k();
                h.f.b.l.b(k2, "");
                for (T t : k2) {
                    if (!t.f125485i) {
                        h.f.b.l.b(t, "");
                        j2 += t.e() - t.d();
                    }
                }
                playBoundary = new androidx.core.g.e<>(l2, Long.valueOf(j2));
            }
            this.this$0.a().a(playBoundary);
            VEVideoCutterViewModel b2 = n.b(this.this$0);
            F f2 = playBoundary.f2397a;
            if (f2 != null) {
                l2 = f2;
            }
            h.f.b.l.b(l2, "");
            b2.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(l2.longValue(), x.f.EDITOR_SEEK_FLAG_LastSeek));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        boolean a2;
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(VideoEditViewModel.class);
        h.f.b.l.b(a3, "");
        this.f125797g = (VideoEditViewModel) a3;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a4 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity2, (ad.b) null).a(VEVideoCutterViewModel.class);
        h.f.b.l.b(a4, "");
        this.f125798h = (VEVideoCutterViewModel) a4;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity3).a(CutVideoBottomBarViewModel.class);
        h.f.b.l.b(a5, "");
        this.f125799i = (CutVideoBottomBarViewModel) a5;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity4).a(CutVideoViewModel.class);
        h.f.b.l.b(a6, "");
        this.f125801k = (CutVideoViewModel) a6;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a7 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity5, (ad.b) null).a(CutMultiVideoViewModel.class);
        h.f.b.l.b(a7, "");
        this.f125800j = (CutMultiVideoViewModel) a7;
        Activity activity6 = this.f42913m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a8 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity6).a(CutVideoEditViewModel.class);
        h.f.b.l.b(a8, "");
        this.f125802l = (CutVideoEditViewModel) a8;
        Activity activity7 = this.f42913m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a9 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity7).a(CutVideoListViewModel.class);
        h.f.b.l.b(a9, "");
        this.t = (CutVideoListViewModel) a9;
        Activity activity8 = this.f42913m;
        Objects.requireNonNull(activity8, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a10 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity8).a(CutVideoSpeedViewModel.class);
        h.f.b.l.b(a10, "");
        this.u = (CutVideoSpeedViewModel) a10;
        View c2 = c(R.id.ffa);
        h.f.b.l.b(c2, "");
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a) c2;
        this.f125793c = aVar;
        if (aVar == null) {
            h.f.b.l.a("videoEditView");
        }
        if ((aVar instanceof VEVideoEditViewV2) && this.A) {
            int i2 = Build.VERSION.SDK_INT;
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar2 = this.f125793c;
            if (aVar2 == null) {
                h.f.b.l.a("videoEditView");
            }
            aVar2.setLayoutDirection(0);
        }
        CutVideoViewModel cutVideoViewModel = this.f125801k;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        ad b2 = cutVideoViewModel.b();
        String str = b2.f125553b;
        ArrayList<MediaModel> arrayList = b2.f125552a;
        if (!TextUtils.isEmpty(str) || !arrayList.isEmpty()) {
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar3 = this.f125793c;
            if (aVar3 == null) {
                h.f.b.l.a("videoEditView");
            }
            com.ss.android.ugc.aweme.shortvideo.edit.c.b.a(aVar3);
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar4 = this.f125793c;
            if (aVar4 == null) {
                h.f.b.l.a("videoEditView");
            }
            boolean z2 = true;
            aVar4.f126141a = true;
            if (b2.f125564m) {
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar5 = this.f125793c;
                if (aVar5 == null) {
                    h.f.b.l.a("videoEditView");
                }
                aVar5.f126141a = false;
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar6 = this.f125793c;
                if (aVar6 == null) {
                    h.f.b.l.a("videoEditView");
                }
                aVar6.setMaxVideoLength(b2.n);
            }
            if (b2.f125554c) {
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar7 = this.f125793c;
                if (aVar7 == null) {
                    h.f.b.l.a("videoEditView");
                }
                aVar7.f126141a = false;
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar8 = this.f125793c;
                if (aVar8 == null) {
                    h.f.b.l.a("videoEditView");
                }
                aVar8.setMinVideoLength(1000);
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar9 = this.f125793c;
                if (aVar9 == null) {
                    h.f.b.l.a("videoEditView");
                }
                aVar9.setMaxVideoLength(5000);
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar10 = this.f125793c;
                if (aVar10 == null) {
                    h.f.b.l.a("videoEditView");
                }
                aVar10.setExtractFramesInRoughMode(false);
            } else {
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar11 = this.f125793c;
                if (aVar11 == null) {
                    h.f.b.l.a("videoEditView");
                }
                aVar11.setExtractFramesInRoughMode(true);
            }
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar12 = this.f125793c;
            if (aVar12 == null) {
                h.f.b.l.a("videoEditView");
            }
            aVar12.setExtractFramesInRoughMode(true);
            if (!TextUtils.isEmpty(str)) {
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar13 = this.f125793c;
                if (aVar13 == null) {
                    h.f.b.l.a("videoEditView");
                }
                Activity activity9 = this.f42913m;
                Objects.requireNonNull(activity9, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity9;
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f125800j;
                if (cutMultiVideoViewModel == null) {
                    h.f.b.l.a("cutMultiVideoViewModel");
                }
                a2 = aVar13.a(eVar, cutMultiVideoViewModel, str);
            } else {
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar14 = this.f125793c;
                if (aVar14 == null) {
                    h.f.b.l.a("videoEditView");
                }
                Activity activity10 = this.f42913m;
                Objects.requireNonNull(activity10, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                androidx.fragment.app.e eVar2 = (androidx.fragment.app.e) activity10;
                CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f125800j;
                if (cutMultiVideoViewModel2 == null) {
                    h.f.b.l.a("cutMultiVideoViewModel");
                }
                a2 = aVar14.a(eVar2, cutMultiVideoViewModel2, arrayList);
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar15 = this.f125793c;
                if (aVar15 == null) {
                    h.f.b.l.a("videoEditView");
                }
                if (arrayList.size() > 1) {
                    z2 = false;
                }
                aVar15.setEditViewHeight(z2);
            }
            if (!a2) {
                CutVideoViewModel cutVideoViewModel2 = this.f125801k;
                if (cutVideoViewModel2 == null) {
                    h.f.b.l.a("cutVideoViewModel");
                }
                cutVideoViewModel2.a();
            } else {
                CutVideoEditViewModel cutVideoEditViewModel = this.f125802l;
                if (cutVideoEditViewModel == null) {
                    h.f.b.l.a("cutVideoEditViewModel");
                }
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar16 = this.f125793c;
                if (aVar16 == null) {
                    h.f.b.l.a("videoEditView");
                }
                cutVideoEditViewModel.f125524a = aVar16.getEditState();
                CutVideoViewModel cutVideoViewModel3 = this.f125801k;
                if (cutVideoViewModel3 == null) {
                    h.f.b.l.a("cutVideoViewModel");
                }
                if (!cutVideoViewModel3.g()) {
                    VideoEditViewModel videoEditViewModel = this.f125797g;
                    if (videoEditViewModel == null) {
                        h.f.b.l.a("videoEditViewModel");
                    }
                    if (videoEditViewModel.n()) {
                        CutVideoViewModel cutVideoViewModel4 = this.f125801k;
                        if (cutVideoViewModel4 == null) {
                            h.f.b.l.a("cutVideoViewModel");
                        }
                        if (cutVideoViewModel4.b().f125564m) {
                            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.f125962b = "prop_customized_video";
                        }
                        CutVideoViewModel cutVideoViewModel5 = this.f125801k;
                        if (cutVideoViewModel5 == null) {
                            h.f.b.l.a("cutVideoViewModel");
                        }
                        if (!cutVideoViewModel5.b().f125554c) {
                            VideoEditViewModel videoEditViewModel2 = this.f125797g;
                            if (videoEditViewModel2 == null) {
                                h.f.b.l.a("videoEditViewModel");
                            }
                            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.b(videoEditViewModel2.k());
                        }
                    } else {
                        CutVideoViewModel cutVideoViewModel6 = this.f125801k;
                        if (cutVideoViewModel6 == null) {
                            h.f.b.l.a("cutVideoViewModel");
                        }
                        cutVideoViewModel6.a();
                    }
                }
                this.w = b2.o;
                this.v = b2.f125563l;
            }
        } else {
            CutVideoViewModel cutVideoViewModel7 = this.f125801k;
            if (cutVideoViewModel7 == null) {
                h.f.b.l.a("cutVideoViewModel");
            }
            cutVideoViewModel7.a();
        }
        if (this.y) {
            View c3 = c(R.id.dy5);
            h.f.b.l.b(c3, "");
            this.f125794d = (TextView) c3;
            View c4 = c(R.id.h3);
            h.f.b.l.b(c4, "");
            this.f125795e = (FrameLayout) c4;
            CutVideoViewModel cutVideoViewModel8 = this.f125801k;
            if (cutVideoViewModel8 == null) {
                h.f.b.l.a("cutVideoViewModel");
            }
            if (!cutVideoViewModel8.g()) {
                Drawable a11 = com.ss.android.ugc.tools.view.a.a(0, 1459617792, 0, en.a(2.0d, com.ss.android.ugc.aweme.port.in.i.f115645a));
                TextView textView = this.f125794d;
                if (textView == null) {
                    h.f.b.l.a("selfAdaptionToast");
                }
                textView.setBackground(a11);
            }
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar17 = this.f125793c;
            if (aVar17 == null) {
                h.f.b.l.a("videoEditView");
            }
            Objects.requireNonNull(aVar17, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2");
            ((com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.l) aVar17).setSelfAdaptiontoastAnimListener(new v(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(boolean z2, boolean z3, int i2) {
        this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? false : z3);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
