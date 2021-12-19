package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.n;
import h.f.b.l;
import h.f.b.m;

public final class EditAudioEffectViewModel extends LifecycleAwareViewModel<EditAudioEffectState> implements h {
    static {
        Covode.recordClassIndex(83161);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h
    public final void a() {
        d(b.f126754a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditAudioEffectState(null, null, 3, null);
    }

    static final class a extends m implements h.f.a.b<EditAudioEffectState, EditAudioEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f126753a = new a();

        static {
            Covode.recordClassIndex(83162);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAudioEffectState invoke(EditAudioEffectState editAudioEffectState) {
            EditAudioEffectState editAudioEffectState2 = editAudioEffectState;
            l.d(editAudioEffectState2, "");
            return EditAudioEffectState.copy$default(editAudioEffectState2, new p(), null, 2, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditAudioEffectState, EditAudioEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f126754a = new b();

        static {
            Covode.recordClassIndex(83163);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAudioEffectState invoke(EditAudioEffectState editAudioEffectState) {
            EditAudioEffectState editAudioEffectState2 = editAudioEffectState;
            l.d(editAudioEffectState2, "");
            return EditAudioEffectState.copy$default(editAudioEffectState2, null, new a.b(), 1, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h
    public final void a(com.ss.android.ugc.aweme.shortvideo.preview.a aVar, VideoPublishEditModel videoPublishEditModel) {
        l.d(aVar, "");
        aVar.a(n.a.a());
        b.a(videoPublishEditModel);
        d(a.f126753a);
    }
}
