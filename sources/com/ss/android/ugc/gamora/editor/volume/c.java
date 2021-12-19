package com.ss.android.ugc.gamora.editor.volume;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
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
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.l.q;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.volume.EditVolumeViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.m;
import h.z;
import java.util.Objects;

public final class c extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f147320a = {new y(c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final b f147321f = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public EditStickerViewModel f147322b;

    /* renamed from: c  reason: collision with root package name */
    public q f147323c;

    /* renamed from: d  reason: collision with root package name */
    public View f147324d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f147325e = true;

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f147326g = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: h  reason: collision with root package name */
    private EditVolumeViewModel f147327h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f147328i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f147329j = h.i.a(m.NONE, new a(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f147330k = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.subtitle.e.class);

    /* renamed from: l  reason: collision with root package name */
    private EditMusicViewModel f147331l;
    private final com.bytedance.o.f t;

    static {
        Covode.recordClassIndex(97083);
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f147326g.a(this, f147320a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f147329j.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.subtitle.e d() {
        return (com.ss.android.ugc.gamora.editor.subtitle.e) this.f147330k.a(this, f147320a[1]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(97085);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.t;
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
            Covode.recordClassIndex(97084);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.volume.c.a.invoke():com.bytedance.als.b");
        }
    }

    static final class h implements q.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147333a;

        static {
            Covode.recordClassIndex(97091);
        }

        h(c cVar) {
            this.f147333a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.q.b
        public final void a() {
            com.ss.android.ugc.gamora.editor.subtitle.e d2;
            com.ss.android.ugc.gamora.editor.subtitle.e d3;
            View view = this.f147333a.f147324d;
            if (view != null) {
                view.setVisibility(4);
            }
            c.a(this.f147333a).e(false);
            if (com.ss.android.ugc.aweme.shortvideo.subtitle.f.a(this.f147333a.a()) && (d2 = this.f147333a.d()) != null && d2.h() && (d3 = this.f147333a.d()) != null) {
                d3.g();
                d3.f();
            }
            this.f147333a.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            EditStickerViewModel editStickerViewModel = this.f147333a.f147322b;
            if (editStickerViewModel == null) {
                l.a("stickerViewModel");
            }
            editStickerViewModel.g().setValue(true);
        }
    }

    public static final class g implements q.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147332a;

        static {
            Covode.recordClassIndex(97090);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(c cVar) {
            this.f147332a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.q.a
        public final void a(float f2) {
            if (this.f147332a.a().isStitchMode()) {
                com.ss.android.ugc.gamora.editor.f.a.a(f2, this.f147332a.a().musicVolume, this.f147332a.a(), this.f147332a.b());
            } else {
                com.ss.android.ugc.aweme.shortvideo.preview.a b2 = this.f147332a.b();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2);
                l.b(ofVoice, "");
                b2.a(ofVoice);
            }
            this.f147332a.a().voiceVolume = f2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.q.a
        public final void b(float f2) {
            if ((!this.f147332a.a().isFastImport && !this.f147332a.a().isCutSameVideoType() && !this.f147332a.a().hasOriginalSound()) || this.f147332a.a().isMuted) {
                com.ss.android.ugc.aweme.shortvideo.preview.a b2 = this.f147332a.b();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f2);
                l.b(ofMusic, "");
                b2.a(ofMusic);
            } else if (this.f147332a.a().isStitchMode()) {
                com.ss.android.ugc.gamora.editor.f.a.a(this.f147332a.a().voiceVolume, f2, this.f147332a.a(), this.f147332a.b());
            } else if (this.f147332a.a().mMusicPath != null) {
                com.ss.android.ugc.aweme.shortvideo.preview.a b3 = this.f147332a.b();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f2);
                l.b(ofMusic2, "");
                b3.a(ofMusic2);
            }
            this.f147332a.a().musicVolume = f2;
        }
    }

    public static final /* synthetic */ q a(c cVar) {
        q qVar = cVar.f147323c;
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
        this.t = fVar;
    }

    public final void a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        q qVar = this.f147323c;
        if (qVar == null) {
            l.a("volumeHelper");
        }
        qVar.a((int) (a().musicVolume * 100.0f));
        q qVar2 = this.f147323c;
        if (qVar2 == null) {
            l.a("volumeHelper");
        }
        qVar2.b((int) (a().voiceVolume * 100.0f));
        if ((!a().isFastImport && !a().isCutSameVideoType() && !a().hasOriginalSound()) || a().isMuted) {
            if (a().mUseMusicBeforeEdit) {
                q qVar3 = this.f147323c;
                if (qVar3 == null) {
                    l.a("volumeHelper");
                }
                if (a().mMusicPath != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                qVar3.d(z3).c(false);
            } else {
                q qVar4 = this.f147323c;
                if (qVar4 == null) {
                    l.a("volumeHelper");
                }
                qVar4.d(true).c(false);
            }
            if (bp.j(a())) {
                q qVar5 = this.f147323c;
                if (qVar5 == null) {
                    l.a("volumeHelper");
                }
                if (a().mMusicPath != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qVar5.d(z2).c(false);
            }
        } else if (a().isStitchMode()) {
            q qVar6 = this.f147323c;
            if (qVar6 == null) {
                l.a("volumeHelper");
            }
            q d2 = qVar6.d(true);
            StitchParams stitchParams = a().stitchParams;
            if (stitchParams != null) {
                z5 = stitchParams.getEnableMic();
            } else {
                z5 = true;
            }
            d2.c(z5);
        } else {
            q qVar7 = this.f147323c;
            if (qVar7 == null) {
                l.a("volumeHelper");
            }
            if (a().mMusicPath != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            qVar7.d(z4).c(this.f147325e);
        }
        View view = this.f147324d;
        if (view != null) {
            view.setVisibility(0);
        }
        if (z) {
            q qVar8 = this.f147323c;
            if (qVar8 == null) {
                l.a("volumeHelper");
            }
            qVar8.e(true);
        }
        b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        String c_;
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity2).a(EditMusicViewModel.class);
        l.b(a2, "");
        this.f147331l = (EditMusicViewModel) a2;
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity).a(EditVolumeViewModel.class);
        l.b(a3, "");
        this.f147327h = (EditVolumeViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = t.a((androidx.fragment.app.e) activity3).a(EditStickerViewModel.class);
        l.b(a4, "");
        this.f147322b = (EditStickerViewModel) a4;
        this.f147323c = new q(a());
        com.ss.android.ugc.tools.view.a.c cVar = null;
        if (this.f42913m instanceof com.ss.android.ugc.tools.view.a.c) {
            Activity activity4 = this.f42913m;
            Objects.requireNonNull(activity4, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            cVar = (com.ss.android.ugc.tools.view.a.c) activity4;
        }
        q qVar = this.f147323c;
        if (qVar == null) {
            l.a("volumeHelper");
        }
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        qVar.a((androidx.fragment.app.e) activity5, cVar);
        q qVar2 = this.f147323c;
        if (qVar2 == null) {
            l.a("volumeHelper");
        }
        qVar2.f128729i = this.f147324d;
        q qVar3 = this.f147323c;
        if (qVar3 == null) {
            l.a("volumeHelper");
        }
        ViewGroup viewGroup = this.f147328i;
        if (viewGroup == null) {
            l.a("volumeLayout");
        }
        qVar3.f128721a = viewGroup;
        q qVar4 = this.f147323c;
        if (qVar4 == null) {
            l.a("volumeHelper");
        }
        qVar4.a(a().isMuted);
        q qVar5 = this.f147323c;
        if (qVar5 == null) {
            l.a("volumeHelper");
        }
        qVar5.b(true);
        q qVar6 = this.f147323c;
        if (qVar6 == null) {
            l.a("volumeHelper");
        }
        qVar6.f128727g = new g(this);
        q qVar7 = this.f147323c;
        if (qVar7 == null) {
            l.a("volumeHelper");
        }
        qVar7.f128728h = new h(this);
        EditVolumeViewModel editVolumeViewModel = this.f147327h;
        if (editVolumeViewModel == null) {
            l.a("mVolumeViewModel");
        }
        selectNonNullSubscribe(editVolumeViewModel, d.f147334a, new ah(), new C3951c(this));
        EditVolumeViewModel editVolumeViewModel2 = this.f147327h;
        if (editVolumeViewModel2 == null) {
            l.a("mVolumeViewModel");
        }
        selectNonNullSubscribe(editVolumeViewModel2, e.f147335a, new ah(), new d(this));
        EditVolumeViewModel editVolumeViewModel3 = this.f147327h;
        if (editVolumeViewModel3 == null) {
            l.a("mVolumeViewModel");
        }
        selectNonNullSubscribe(editVolumeViewModel3, f.f147336a, new ah(), new e(this));
        EditMusicViewModel editMusicViewModel = this.f147331l;
        if (editMusicViewModel == null) {
            l.a("editMusicViewModel");
        }
        selectNonNullSubscribe(editMusicViewModel, g.f147337a, new ah(), new f(this));
        EditVolumeViewModel editVolumeViewModel4 = this.f147327h;
        if (editVolumeViewModel4 == null) {
            l.a("mVolumeViewModel");
        }
        String c_2 = c_(R.string.my);
        l.b(c_2, "");
        l.d(c_2, "");
        editVolumeViewModel4.c(new EditVolumeViewModel.a(c_2));
        EditVolumeViewModel editVolumeViewModel5 = this.f147327h;
        if (editVolumeViewModel5 == null) {
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
        editVolumeViewModel5.c(new EditVolumeViewModel.c(c_));
        a(false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.c$c  reason: collision with other inner class name */
    static final class C3951c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, String, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3951c(c cVar) {
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
            Covode.recordClassIndex(97087);
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
            Covode.recordClassIndex(97088);
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

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, k, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, k kVar) {
            k kVar2 = kVar;
            l.d(bVar, "");
            l.d(kVar2, "");
            this.this$0.f147325e = kVar2.f39404b.booleanValue();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atj, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) a2;
        this.f147324d = relativeLayout;
        if (relativeLayout == null) {
            l.b();
        }
        View findViewById = relativeLayout.findViewById(R.id.fko);
        l.b(findViewById, "");
        this.f147328i = (ViewGroup) findViewById;
        View view = this.f147324d;
        if (view == null) {
            l.b();
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
