package com.ss.android.ugc.gamora.editor.music;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
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
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.ss.android.ugc.gamora.editor.ac;
import com.zhiliaoapp.musically.R;
import dmt.av.video.t;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.k;
import h.m;
import h.z;
import java.util.Objects;

public final class i extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146239a = {new y(i.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(i.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final e f146240k = new e((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f146241b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f146242c;

    /* renamed from: d  reason: collision with root package name */
    public EditMusicViewModel f146243d;

    /* renamed from: e  reason: collision with root package name */
    final h f146244e = h.i.a(m.NONE, new a(this));

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.port.in.a.a f146245f;

    /* renamed from: g  reason: collision with root package name */
    final h f146246g = h.i.a(m.NONE, new c(this));

    /* renamed from: h  reason: collision with root package name */
    final h f146247h = h.i.a(m.NONE, new d(this));

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.port.in.a.b f146248i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public final com.bytedance.scene.group.b f146249j;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f146250l = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h t = h.i.a(m.NONE, new b(this));
    private final h.h.d u = com.bytedance.o.b.a.a(getDiContainer(), ac.class);
    private RecyclerView v;
    private final com.bytedance.o.f w;

    static {
        Covode.recordClassIndex(96122);
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f146250l.a(this, f146239a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.t.getValue();
    }

    public final ac d() {
        return (ac) this.u.a(this, f146239a[1]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class e {
        static {
            Covode.recordClassIndex(96127);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.w;
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.cutmusic.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.ss.android.ugc.gamora.editor.cutmusic.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.i.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.i.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.core.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r1 = com.ss.android.ugc.gamora.editor.sticker.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.i.c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.volume.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.volume.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.volume.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.volume.a> r1 = com.ss.android.ugc.gamora.editor.volume.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.i.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.port.in.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f146251a;

        static {
            Covode.recordClassIndex(96128);
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final void c() {
            this.f146251a.f146242c = true;
            i.a(this.f146251a).b();
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final boolean d() {
            return bp.m(this.f146251a.a());
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final void a() {
            if (this.f146251a.f146241b) {
                this.f146251a.f146241b = false;
                ((com.ss.android.ugc.gamora.editor.cutmusic.a) this.f146251a.f146244e.getValue()).a();
            } else if (this.f146251a.f146242c) {
                this.f146251a.f146242c = false;
                ((com.ss.android.ugc.gamora.editor.volume.a) this.f146251a.f146247h.getValue()).a();
            } else {
                this.f146251a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final void b() {
            this.f146251a.f146241b = true;
            i.a(this.f146251a).b();
            ((com.ss.android.ugc.gamora.editor.sticker.core.a) this.f146251a.f146246g.getValue()).g().setValue(false);
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final void e() {
            ac aq;
            i.a(this.f146251a).b();
            this.f146251a.b().v().setValue(t.b());
            j jVar = this.f146251a.o;
            if (!(jVar instanceof com.ss.android.ugc.gamora.editor.v)) {
                jVar = null;
            }
            com.ss.android.ugc.gamora.editor.rootscene.d dVar = (com.ss.android.ugc.gamora.editor.rootscene.d) jVar;
            if (!(dVar == null || (aq = dVar.aq()) == null)) {
                aq.h();
            }
            bl.f(this.f146251a.a());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(i iVar) {
            this.f146251a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final void a(float f2) {
            float f3 = this.f146251a.a().musicVolume;
            if (this.f146251a.a().isStitchMode()) {
                if (this.f146251a.a().isMuted) {
                    com.ss.android.ugc.gamora.editor.f.a.a(0.0f, f3, this.f146251a.a(), this.f146251a.b());
                } else {
                    com.ss.android.ugc.gamora.editor.f.a.a(f2, f3, this.f146251a.a(), this.f146251a.b());
                }
            } else if ((this.f146251a.a().isFastImport || this.f146251a.a().hasOriginalSound()) && !this.f146251a.a().isMuted) {
                if (f2 != -1.0f) {
                    com.ss.android.ugc.aweme.shortvideo.preview.a b2 = this.f146251a.b();
                    VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2);
                    l.b(ofVoice, "");
                    b2.a(ofVoice);
                }
                if (this.f146251a.a().mMusicPath != null && f3 != -1.0f) {
                    com.ss.android.ugc.aweme.shortvideo.preview.a b3 = this.f146251a.b();
                    VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f3);
                    l.b(ofMusic, "");
                    b3.a(ofMusic);
                }
            } else if (f3 != -1.0f) {
                com.ss.android.ugc.aweme.shortvideo.preview.a b4 = this.f146251a.b();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f3);
                l.b(ofMusic2, "");
                b4.a(ofMusic2);
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final void a(boolean z) {
            FlowDataMusicInfo flowDataMusicInfo = this.f146251a.a().creativeFlowData.getFlowDataMusicInfo();
            if (flowDataMusicInfo != null) {
                flowDataMusicInfo.setSelectedByAuto(z);
            } else {
                this.f146251a.a().creativeFlowData.setFlowDataMusicInfo(new FlowDataMusicInfo(z));
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final void a(com.ss.android.ugc.aweme.port.in.a.e eVar, float f2) {
            l.d(eVar, "");
            if (this.f146251a.a().veAudioRecorderParam == null) {
                this.f146251a.a().veAudioRecorderParam = new AudioRecorderParam();
            }
            this.f146251a.a().veAudioRecorderParam.setNeedOriginalSound(eVar.f115579a);
            this.f146251a.a().veAudioRecorderParam.setVoiceVolume(eVar.f115580b);
            this.f146251a.a().voiceVolume = f2;
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.b
        public final void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            this.f146251a.d().a(str, cVar, z);
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.ss.android.ugc.aweme.port.in.a.a aVar = this.f146245f;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final com.ss.android.ugc.aweme.port.in.a.e C() {
        float voiceVolume;
        if (a().veAudioRecorderParam == null) {
            return new com.ss.android.ugc.aweme.port.in.a.e(true, a().voiceVolume);
        }
        boolean needOriginalSound = a().veAudioRecorderParam.getNeedOriginalSound();
        if (a().veAudioRecorderParam.getNeedOriginalSound()) {
            voiceVolume = a().voiceVolume;
        } else {
            voiceVolume = a().veAudioRecorderParam.getVoiceVolume();
        }
        return new com.ss.android.ugc.aweme.port.in.a.e(needOriginalSound, voiceVolume);
    }

    public static final /* synthetic */ EditMusicViewModel a(i iVar) {
        EditMusicViewModel editMusicViewModel = iVar.f146243d;
        if (editMusicViewModel == null) {
            l.a("musicViewModel");
        }
        return editMusicViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f146252a;

        static {
            Covode.recordClassIndex(96129);
        }

        g(i iVar) {
            this.f146252a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.port.in.a.a aVar;
            com.bytedance.jedi.arch.d dVar = (com.bytedance.jedi.arch.d) obj;
            if ((dVar == null || dVar.f39404b == null) && (aVar = this.f146252a.f146245f) != null) {
                aVar.d();
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditMusicViewModel.class);
        l.b(a2, "");
        this.f146243d = (EditMusicViewModel) a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.at6, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a2;
        this.v = (RecyclerView) frameLayout.findViewById(R.id.drt);
        return frameLayout;
    }

    public i(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.w = fVar;
        this.f146249j = bVar;
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
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
