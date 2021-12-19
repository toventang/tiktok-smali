package com.ss.android.ugc.gamora.editor.volume;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class EditVolumeViewModel extends LifecycleAwareViewModel<EditVolumeState> implements a {
    static {
        Covode.recordClassIndex(97074);
    }

    @Override // com.ss.android.ugc.gamora.editor.volume.a
    public final void a() {
        c(d.f147313a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditVolumeState(null, null, null, null, 15, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.volume.a
    public final void a(int i2) {
        c(new b(i2));
    }

    static final class a extends m implements h.f.a.b<EditVolumeState, EditVolumeState> {
        final /* synthetic */ String $value;

        static {
            Covode.recordClassIndex(97075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.$value = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditVolumeState invoke(EditVolumeState editVolumeState) {
            EditVolumeState editVolumeState2 = editVolumeState;
            l.d(editVolumeState2, "");
            return EditVolumeState.copy$default(editVolumeState2, this.$value, null, null, null, 14, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditVolumeState, EditVolumeState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(97076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditVolumeState invoke(EditVolumeState editVolumeState) {
            EditVolumeState editVolumeState2 = editVolumeState;
            l.d(editVolumeState2, "");
            return EditVolumeState.copy$default(editVolumeState2, null, null, Integer.valueOf(this.$value), null, 11, null);
        }
    }

    static final class c extends m implements h.f.a.b<EditVolumeState, EditVolumeState> {
        final /* synthetic */ String $value;

        static {
            Covode.recordClassIndex(97077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$value = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditVolumeState invoke(EditVolumeState editVolumeState) {
            EditVolumeState editVolumeState2 = editVolumeState;
            l.d(editVolumeState2, "");
            return EditVolumeState.copy$default(editVolumeState2, null, this.$value, null, null, 13, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditVolumeState, EditVolumeState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f147313a = new d();

        static {
            Covode.recordClassIndex(97078);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditVolumeState invoke(EditVolumeState editVolumeState) {
            EditVolumeState editVolumeState2 = editVolumeState;
            l.d(editVolumeState2, "");
            return EditVolumeState.copy$default(editVolumeState2, null, null, null, new a.b(), 7, null);
        }
    }
}
