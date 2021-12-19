package com.ss.android.ugc.aweme.shortvideo.edit.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class EditEffectViewModel extends LifecycleAwareViewModel<EditEffectState> implements a {
    static {
        Covode.recordClassIndex(83342);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.effect.a
    public final void a() {
        d(e.f127035a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.effect.a
    public final void b() {
        d(a.f127032a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.effect.a
    public final void c() {
        d(c.f127034a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.effect.a
    public final void e() {
        d(b.f127033a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditEffectState(null, null, null, null, null, 31, null);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.effect.a
    public final void a(int i2) {
        d(new d(i2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.effect.a
    public final void b(int i2) {
        d(new f(i2));
    }

    static final class a extends m implements h.f.a.b<EditEffectState, EditEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f127032a = new a();

        static {
            Covode.recordClassIndex(83343);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditEffectState invoke(EditEffectState editEffectState) {
            EditEffectState editEffectState2 = editEffectState;
            l.d(editEffectState2, "");
            return EditEffectState.copy$default(editEffectState2, new a.C1131a(), null, null, null, null, 30, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditEffectState, EditEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f127033a = new b();

        static {
            Covode.recordClassIndex(83344);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditEffectState invoke(EditEffectState editEffectState) {
            EditEffectState editEffectState2 = editEffectState;
            l.d(editEffectState2, "");
            return EditEffectState.copy$default(editEffectState2, null, null, null, new p(), null, 23, null);
        }
    }

    static final class c extends m implements h.f.a.b<EditEffectState, EditEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f127034a = new c();

        static {
            Covode.recordClassIndex(83345);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditEffectState invoke(EditEffectState editEffectState) {
            EditEffectState editEffectState2 = editEffectState;
            l.d(editEffectState2, "");
            return EditEffectState.copy$default(editEffectState2, null, null, new p(), null, null, 27, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditEffectState, EditEffectState> {
        final /* synthetic */ int $length;

        static {
            Covode.recordClassIndex(83346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(int i2) {
            super(1);
            this.$length = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditEffectState invoke(EditEffectState editEffectState) {
            EditEffectState editEffectState2 = editEffectState;
            l.d(editEffectState2, "");
            return EditEffectState.copy$default(editEffectState2, null, Integer.valueOf(this.$length), null, null, null, 29, null);
        }
    }

    static final class e extends m implements h.f.a.b<EditEffectState, EditEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f127035a = new e();

        static {
            Covode.recordClassIndex(83347);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditEffectState invoke(EditEffectState editEffectState) {
            EditEffectState editEffectState2 = editEffectState;
            l.d(editEffectState2, "");
            return EditEffectState.copy$default(editEffectState2, new a.b(), null, null, null, null, 30, null);
        }
    }

    static final class f extends m implements h.f.a.b<EditEffectState, EditEffectState> {
        final /* synthetic */ int $duration;

        static {
            Covode.recordClassIndex(83348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2) {
            super(1);
            this.$duration = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditEffectState invoke(EditEffectState editEffectState) {
            EditEffectState editEffectState2 = editEffectState;
            l.d(editEffectState2, "");
            return EditEffectState.copy$default(editEffectState2, null, null, null, null, new com.bytedance.jedi.arch.m(this.$duration), 15, null);
        }
    }
}
