package com.ss.android.ugc.aweme.ftc.components.volume;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.l.q;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.k.k;
import h.m;
import h.z;
import java.util.Objects;

public final class c extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f98304a = {new y(c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final b f98305d = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public EditStickerViewModel f98306b;

    /* renamed from: c  reason: collision with root package name */
    public q f98307c;

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f98308e = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: f  reason: collision with root package name */
    private FTCEditVolumeViewModel f98309f;

    /* renamed from: g  reason: collision with root package name */
    private ViewGroup f98310g;

    /* renamed from: h  reason: collision with root package name */
    private final h f98311h = h.i.a(m.NONE, new a(this));

    /* renamed from: i  reason: collision with root package name */
    private FrameLayout f98312i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.o.f f98313j;

    static {
        Covode.recordClassIndex(62521);
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f98308e.a(this, f98304a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f98311h.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(62523);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f98313j;
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
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(62522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.volume.c.a.invoke():com.bytedance.als.b");
        }
    }

    static final class g implements q.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98315a;

        static {
            Covode.recordClassIndex(62528);
        }

        g(c cVar) {
            this.f98315a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.q.b
        public final void a() {
            c.a(this.f98315a).e(false);
            this.f98315a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            EditStickerViewModel editStickerViewModel = this.f98315a.f98306b;
            if (editStickerViewModel == null) {
                l.a("stickerViewModel");
            }
            editStickerViewModel.g().setValue(true);
        }
    }

    public static final class f implements q.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98314a;

        static {
            Covode.recordClassIndex(62527);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f98314a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.q.a
        public final void a(float f2) {
            if (this.f98314a.a().isStitchMode()) {
                com.ss.android.ugc.gamora.editor.f.a.a(f2, this.f98314a.a().musicVolume, this.f98314a.a(), this.f98314a.b());
            } else {
                com.ss.android.ugc.aweme.shortvideo.preview.a b2 = this.f98314a.b();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2);
                l.b(ofVoice, "");
                b2.a(ofVoice);
            }
            this.f98314a.a().voiceVolume = f2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.q.a
        public final void b(float f2) {
            if ((!this.f98314a.a().isFastImport && !this.f98314a.a().isCutSameVideoType() && !this.f98314a.a().hasOriginalSound()) || this.f98314a.a().isMuted) {
                com.ss.android.ugc.aweme.shortvideo.preview.a b2 = this.f98314a.b();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f2);
                l.b(ofMusic, "");
                b2.a(ofMusic);
            } else if (this.f98314a.a().isStitchMode()) {
                com.ss.android.ugc.gamora.editor.f.a.a(this.f98314a.a().voiceVolume, f2, this.f98314a.a(), this.f98314a.b());
            } else if (this.f98314a.a().mMusicPath != null) {
                com.ss.android.ugc.aweme.shortvideo.preview.a b3 = this.f98314a.b();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f2);
                l.b(ofMusic2, "");
                b3.a(ofMusic2);
            }
            this.f98314a.a().musicVolume = f2;
        }
    }

    public static final /* synthetic */ q a(c cVar) {
        q qVar = cVar.f98307c;
        if (qVar == null) {
            l.a("volumeHelper");
        }
        return qVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public c(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f98313j = fVar;
    }

    public final void a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        q qVar = this.f98307c;
        if (qVar == null) {
            l.a("volumeHelper");
        }
        qVar.a((int) (a().musicVolume * 100.0f));
        q qVar2 = this.f98307c;
        if (qVar2 == null) {
            l.a("volumeHelper");
        }
        qVar2.b((int) (a().voiceVolume * 100.0f));
        if ((a().isFastImport || a().isCutSameVideoType() || a().hasOriginalSound()) && !a().isMuted) {
            if (a().isStitchMode()) {
                q qVar3 = this.f98307c;
                if (qVar3 == null) {
                    l.a("volumeHelper");
                }
                q d2 = qVar3.d(true);
                StitchParams stitchParams = a().stitchParams;
                if (stitchParams != null) {
                    z4 = stitchParams.getEnableMic();
                } else {
                    z4 = true;
                }
                d2.c(z4);
            } else {
                q qVar4 = this.f98307c;
                if (qVar4 == null) {
                    l.a("volumeHelper");
                }
                if (a().mMusicPath != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                qVar4.d(z3).c(true);
            }
        } else if (a().mUseMusicBeforeEdit) {
            q qVar5 = this.f98307c;
            if (qVar5 == null) {
                l.a("volumeHelper");
            }
            if (a().mMusicPath != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            qVar5.d(z2).c(false);
        } else {
            q qVar6 = this.f98307c;
            if (qVar6 == null) {
                l.a("volumeHelper");
            }
            qVar6.d(true).c(false);
        }
        if (z) {
            q qVar7 = this.f98307c;
            if (qVar7 == null) {
                l.a("volumeHelper");
            }
            qVar7.e(true);
        }
        b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        String c_;
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(FTCEditVolumeViewModel.class);
        l.b(a2, "");
        this.f98309f = (FTCEditVolumeViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(EditStickerViewModel.class);
        l.b(a3, "");
        this.f98306b = (EditStickerViewModel) a3;
        this.f98307c = new q(a());
        com.ss.android.ugc.tools.view.a.c cVar = null;
        if (this.f42913m instanceof com.ss.android.ugc.tools.view.a.c) {
            Activity activity3 = this.f42913m;
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            cVar = (com.ss.android.ugc.tools.view.a.c) activity3;
        }
        q qVar = this.f98307c;
        if (qVar == null) {
            l.a("volumeHelper");
        }
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        qVar.a((androidx.fragment.app.e) activity4, cVar);
        q qVar2 = this.f98307c;
        if (qVar2 == null) {
            l.a("volumeHelper");
        }
        qVar2.f128729i = this.f98312i;
        q qVar3 = this.f98307c;
        if (qVar3 == null) {
            l.a("volumeHelper");
        }
        ViewGroup viewGroup = this.f98310g;
        if (viewGroup == null) {
            l.a("volumeLayout");
        }
        qVar3.f128721a = viewGroup;
        q qVar4 = this.f98307c;
        if (qVar4 == null) {
            l.a("volumeHelper");
        }
        qVar4.a(a().isMuted);
        q qVar5 = this.f98307c;
        if (qVar5 == null) {
            l.a("volumeHelper");
        }
        qVar5.b(false);
        q qVar6 = this.f98307c;
        if (qVar6 == null) {
            l.a("volumeHelper");
        }
        qVar6.f128727g = new f(this);
        q qVar7 = this.f98307c;
        if (qVar7 == null) {
            l.a("volumeHelper");
        }
        qVar7.f128728h = new g(this);
        FTCEditVolumeViewModel fTCEditVolumeViewModel = this.f98309f;
        if (fTCEditVolumeViewModel == null) {
            l.a("mVolumeViewModel");
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel, d.f98316a, new ah(), new C2377c(this));
        FTCEditVolumeViewModel fTCEditVolumeViewModel2 = this.f98309f;
        if (fTCEditVolumeViewModel2 == null) {
            l.a("mVolumeViewModel");
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel2, e.f98317a, new ah(), new d(this));
        FTCEditVolumeViewModel fTCEditVolumeViewModel3 = this.f98309f;
        if (fTCEditVolumeViewModel3 == null) {
            l.a("mVolumeViewModel");
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel3, f.f98318a, new ah(), new e(this));
        FTCEditVolumeViewModel fTCEditVolumeViewModel4 = this.f98309f;
        if (fTCEditVolumeViewModel4 == null) {
            l.a("mVolumeViewModel");
        }
        String c_2 = c_(R.string.my);
        l.b(c_2, "");
        l.d(c_2, "");
        fTCEditVolumeViewModel4.c(new FTCEditVolumeViewModel.a(c_2));
        FTCEditVolumeViewModel fTCEditVolumeViewModel5 = this.f98309f;
        if (fTCEditVolumeViewModel5 == null) {
            l.a("mVolumeViewModel");
        }
        if (a().isReaction()) {
            c_ = c_(R.string.f8a);
            l.b(c_, "");
        } else if (a().isStitchMode()) {
            c_ = c_(R.string.ble);
            l.b(c_, "");
        } else {
            c_ = c_(R.string.d1w);
            l.b(c_, "");
        }
        l.d(c_, "");
        fTCEditVolumeViewModel5.c(new FTCEditVolumeViewModel.b(c_));
        a(false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.c$c  reason: collision with other inner class name */
    static final class C2377c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2377c(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, String str) {
            String str2 = str;
            l.d(bVar, "");
            l.d(str2, "");
            TextView textView = c.a(this.this$0).f128723c;
            l.b(textView, "");
            textView.setText(str2);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, String str) {
            String str2 = str;
            l.d(bVar, "");
            l.d(str2, "");
            TextView textView = c.a(this.this$0).f128722b;
            l.b(textView, "");
            textView.setText(str2);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            l.d(bVar, "");
            c.a(this.this$0).a(intValue);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atw, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a2;
        this.f98312i = frameLayout;
        if (frameLayout == null) {
            l.b();
        }
        View findViewById = frameLayout.findViewById(R.id.cen);
        l.b(findViewById, "");
        this.f98310g = (ViewGroup) findViewById;
        FrameLayout frameLayout2 = this.f98312i;
        if (frameLayout2 == null) {
            l.b();
        }
        return frameLayout2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
