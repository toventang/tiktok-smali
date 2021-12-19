package com.ss.android.ugc.gamora.editor.cutmusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.shortvideo.d;
import h.f.b.l;
import h.f.b.m;
import h.u;

public final class EditMusicCutViewModel extends LifecycleAwareViewModel<EditMusicCutState> implements a {
    static {
        Covode.recordClassIndex(95751);
    }

    @Override // com.ss.android.ugc.gamora.editor.cutmusic.a
    public final void a() {
        c(b.f145754a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditMusicCutState(null, null, null, 7, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.cutmusic.a
    public final void a(int i2) {
        c(new a(i2));
    }

    static final class a extends m implements h.f.a.b<EditMusicCutState, EditMusicCutState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(95752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicCutState invoke(EditMusicCutState editMusicCutState) {
            EditMusicCutState editMusicCutState2 = editMusicCutState;
            l.d(editMusicCutState2, "");
            return EditMusicCutState.copy$default(editMusicCutState2, null, Integer.valueOf(this.$value), null, 5, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditMusicCutState, EditMusicCutState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145754a = new b();

        static {
            Covode.recordClassIndex(95753);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicCutState invoke(EditMusicCutState editMusicCutState) {
            EditMusicCutState editMusicCutState2 = editMusicCutState;
            l.d(editMusicCutState2, "");
            return EditMusicCutState.copy$default(editMusicCutState2, null, null, new a.b(), 3, null);
        }
    }

    static final class c extends m implements h.f.a.b<EditMusicCutState, EditMusicCutState> {
        final /* synthetic */ d $bean;
        final /* synthetic */ int $length;
        final /* synthetic */ int $start;

        static {
            Covode.recordClassIndex(95754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, int i2, int i3) {
            super(1);
            this.$bean = dVar;
            this.$length = i2;
            this.$start = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicCutState invoke(EditMusicCutState editMusicCutState) {
            EditMusicCutState editMusicCutState2 = editMusicCutState;
            l.d(editMusicCutState2, "");
            return EditMusicCutState.copy$default(editMusicCutState2, new com.bytedance.jedi.arch.d(new u(this.$bean, Integer.valueOf(this.$length), Integer.valueOf(this.$start))), null, null, 6, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.cutmusic.a
    public final void a(d dVar, int i2, int i3) {
        c(new c(dVar, i2, i3));
    }
}
