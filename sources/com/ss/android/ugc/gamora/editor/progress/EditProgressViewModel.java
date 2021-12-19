package com.ss.android.ugc.gamora.editor.progress;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class EditProgressViewModel extends LifecycleAwareViewModel<EditProgressState> implements a {

    /* renamed from: b  reason: collision with root package name */
    private boolean f146266b = true;

    static {
        Covode.recordClassIndex(96141);
    }

    @Override // com.ss.android.ugc.gamora.editor.progress.a
    public final boolean a() {
        return this.f146266b;
    }

    @Override // com.ss.android.ugc.gamora.editor.progress.a
    public final void b() {
        c(b.f146267a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditProgressState(null, null, 3, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.progress.a
    public final void a(boolean z) {
        this.f146266b = z;
    }

    @Override // com.ss.android.ugc.gamora.editor.progress.a
    public final void a(int i2) {
        c(new a(i2));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<EditProgressState, EditProgressState> {
        final /* synthetic */ int $autoPlay;

        static {
            Covode.recordClassIndex(96142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$autoPlay = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditProgressState invoke(EditProgressState editProgressState) {
            EditProgressState editProgressState2 = editProgressState;
            l.d(editProgressState2, "");
            return EditProgressState.copy$default(editProgressState2, null, new com.bytedance.jedi.arch.m(this.$autoPlay), 1, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditProgressState, EditProgressState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146267a = new b();

        static {
            Covode.recordClassIndex(96143);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditProgressState invoke(EditProgressState editProgressState) {
            EditProgressState editProgressState2 = editProgressState;
            l.d(editProgressState2, "");
            return EditProgressState.copy$default(editProgressState2, new a.b(), null, 2, null);
        }
    }
}
