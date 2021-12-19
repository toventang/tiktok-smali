package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import com.bytedance.als.g;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.o.f;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import dmt.av.video.n;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class FTCEditAudioEffectViewModel extends LifecycleAwareViewModel<FTCEditAudioEffectState> implements com.bytedance.o.a, e {

    /* renamed from: a  reason: collision with root package name */
    private final h f97605a = i.a(m.NONE, new a(this));

    /* renamed from: b  reason: collision with root package name */
    private final g<CategoryPageModel> f97606b = new k();

    /* renamed from: c  reason: collision with root package name */
    private final f f97607c;

    static {
        Covode.recordClassIndex(62021);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f97607c;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.audioeffect.e
    public final void a() {
        d(c.f97609a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditAudioEffectState(null, null, 3, null);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(62022);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel.a.invoke():com.bytedance.als.b");
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<FTCEditAudioEffectState, FTCEditAudioEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f97608a = new b();

        static {
            Covode.recordClassIndex(62023);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditAudioEffectState invoke(FTCEditAudioEffectState fTCEditAudioEffectState) {
            FTCEditAudioEffectState fTCEditAudioEffectState2 = fTCEditAudioEffectState;
            l.d(fTCEditAudioEffectState2, "");
            return FTCEditAudioEffectState.copy$default(fTCEditAudioEffectState2, new p(), null, 2, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<FTCEditAudioEffectState, FTCEditAudioEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97609a = new c();

        static {
            Covode.recordClassIndex(62024);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditAudioEffectState invoke(FTCEditAudioEffectState fTCEditAudioEffectState) {
            FTCEditAudioEffectState fTCEditAudioEffectState2 = fTCEditAudioEffectState;
            l.d(fTCEditAudioEffectState2, "");
            return FTCEditAudioEffectState.copy$default(fTCEditAudioEffectState2, null, new a.b(), 1, null);
        }
    }

    public FTCEditAudioEffectViewModel(f fVar) {
        l.d(fVar, "");
        this.f97607c = fVar;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.audioeffect.e
    public final void a(VideoPublishEditModel videoPublishEditModel) {
        ((com.ss.android.ugc.aweme.shortvideo.preview.a) this.f97605a.getValue()).a(n.a.a());
        com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.a(videoPublishEditModel);
        d(b.f97608a);
    }
}
