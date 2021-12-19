package com.ss.android.ugc.gamora.editor.corner;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class EditCornerViewModel extends LifecycleAwareViewModel<EditCornerState> implements a {
    static {
        Covode.recordClassIndex(95732);
    }

    @Override // com.ss.android.ugc.gamora.editor.corner.a
    public final void a() {
        c(d.f145739a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditCornerState(null, null, null, null, 15, null);
    }

    public final void a(int i2) {
        c(new c(i2));
    }

    public final void b(int i2) {
        c(new a(i2));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<EditCornerState, EditCornerState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(95733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditCornerState invoke(EditCornerState editCornerState) {
            EditCornerState editCornerState2 = editCornerState;
            l.d(editCornerState2, "");
            return EditCornerState.copy$default(editCornerState2, null, null, Integer.valueOf(this.$value), null, 11, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditCornerState, EditCornerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(95734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditCornerState invoke(EditCornerState editCornerState) {
            EditCornerState editCornerState2 = editCornerState;
            l.d(editCornerState2, "");
            return EditCornerState.copy$default(editCornerState2, Boolean.valueOf(this.$value), null, null, null, 14, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<EditCornerState, EditCornerState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(95735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditCornerState invoke(EditCornerState editCornerState) {
            EditCornerState editCornerState2 = editCornerState;
            l.d(editCornerState2, "");
            return EditCornerState.copy$default(editCornerState2, null, Integer.valueOf(this.$value), null, null, 13, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditCornerState, EditCornerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f145739a = new d();

        static {
            Covode.recordClassIndex(95736);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditCornerState invoke(EditCornerState editCornerState) {
            EditCornerState editCornerState2 = editCornerState;
            l.d(editCornerState2, "");
            return EditCornerState.copy$default(editCornerState2, null, null, null, new a.b(), 7, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.corner.a
    public final void a(boolean z) {
        c(new b(z));
    }
}
