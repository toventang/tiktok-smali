package com.ss.android.ugc.gamora.editor.progressbar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;
import h.p;

public final class EditPreviewProgressViewModel extends LifecycleAwareViewModel<EditPreviewProgressState> implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f146296c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<p<Integer, Integer>> f146297b;

    /* renamed from: d  reason: collision with root package name */
    private final t<Boolean> f146298d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<Boolean> f146299e;

    /* renamed from: f  reason: collision with root package name */
    private final t<p<Integer, Integer>> f146300f;

    static {
        Covode.recordClassIndex(96164);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96165);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.progressbar.a
    public final LiveData<Boolean> a() {
        return this.f146299e;
    }

    @Override // com.ss.android.ugc.gamora.editor.progressbar.a
    public final void b() {
        c(f.f146303a);
    }

    @Override // com.ss.android.ugc.gamora.editor.progressbar.a
    public final void c() {
        c(d.f146302a);
    }

    @Override // com.ss.android.ugc.gamora.editor.progressbar.a
    public final void e() {
        c(c.f146301a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditPreviewProgressState(null, null, null, null, 15, null);
    }

    public EditPreviewProgressViewModel() {
        t<Boolean> tVar = new t<>();
        this.f146298d = tVar;
        this.f146299e = tVar;
        t<p<Integer, Integer>> tVar2 = new t<>();
        this.f146300f = tVar2;
        this.f146297b = tVar2;
    }

    @Override // com.ss.android.ugc.gamora.editor.progressbar.a
    public final void a(int i2) {
        c(new b(i2));
    }

    static final class b extends m implements h.f.a.b<EditPreviewProgressState, EditPreviewProgressState> {
        final /* synthetic */ int $action;

        static {
            Covode.recordClassIndex(96166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$action = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            l.d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, null, new com.bytedance.jedi.arch.m(this.$action), null, null, 13, null);
        }
    }

    static final class c extends m implements h.f.a.b<EditPreviewProgressState, EditPreviewProgressState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f146301a = new c();

        static {
            Covode.recordClassIndex(96167);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            l.d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, null, null, new com.bytedance.jedi.arch.p(), null, 11, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditPreviewProgressState, EditPreviewProgressState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f146302a = new d();

        static {
            Covode.recordClassIndex(96168);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            l.d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, new a.C1131a(), null, null, null, 14, null);
        }
    }

    static final class f extends m implements h.f.a.b<EditPreviewProgressState, EditPreviewProgressState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f146303a = new f();

        static {
            Covode.recordClassIndex(96170);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            l.d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, new a.b(), null, null, null, 14, null);
        }
    }

    static final class e extends m implements h.f.a.b<EditPreviewProgressState, EditPreviewProgressState> {
        final /* synthetic */ int $action;
        final /* synthetic */ int $toolbarItem;

        static {
            Covode.recordClassIndex(96169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int i2, int i3) {
            super(1);
            this.$action = i2;
            this.$toolbarItem = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            l.d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, null, null, null, new n(new p(Integer.valueOf(this.$action), Integer.valueOf(this.$toolbarItem))), 7, null);
        }
    }

    public final void a(boolean z) {
        this.f146298d.setValue(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.gamora.editor.progressbar.a
    public final void a(int i2, int i3) {
        c(new e(i2, i3));
    }

    @Override // com.ss.android.ugc.gamora.editor.progressbar.a
    public final void b(int i2, int i3) {
        this.f146300f.setValue(new p<>(Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
