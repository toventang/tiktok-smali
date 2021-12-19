package com.ss.android.ugc.gamora.editor.music;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;

public final class EditMusicViewModel extends LifecycleAwareViewModel<EditMusicState> implements m, a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f146198a;

    static {
        Covode.recordClassIndex(96080);
    }

    @Override // com.ss.android.ugc.gamora.editor.music.a
    public final void a() {
        c(b.f146199a);
    }

    public final void b() {
        c(f.f146200a);
        this.f146198a = false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditMusicState(null, null, null, null, null, null, null, null, false, null, null, null, null, 8191, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.music.a
    public final void a(float f2) {
        c(new a(f2));
    }

    public final void c(boolean z) {
        d(new d(z));
    }

    @Override // com.ss.android.ugc.gamora.editor.music.a
    public final void a(int i2) {
        c(new c(i2));
    }

    @Override // com.ss.android.ugc.gamora.editor.music.a
    public final void b(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        l.d(cVar, "");
        c(new i(cVar));
    }

    static final class a extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {
        final /* synthetic */ float $volume;

        static {
            Covode.recordClassIndex(96081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f2) {
            super(1);
            this.$volume = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, false, null, new com.bytedance.jedi.arch.l(this.$volume), null, null, 7167, null);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146199a = new b();

        static {
            Covode.recordClassIndex(96082);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, new p(), false, null, null, null, null, 8063, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {
        final /* synthetic */ int $startTime;

        static {
            Covode.recordClassIndex(96083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(1);
            this.$startTime = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, new com.bytedance.jedi.arch.m(this.$startTime), null, null, null, null, null, null, false, null, null, null, null, 8189, null);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {
        final /* synthetic */ boolean $enable;

        static {
            Covode.recordClassIndex(96084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$enable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, false, null, null, new k(this.$enable), null, 6143, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(96085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, Boolean.valueOf(this.$value), null, null, null, null, null, null, null, false, null, null, null, null, 8190, null);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f146200a = new f();

        static {
            Covode.recordClassIndex(96086);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, false, null, null, null, new a.C1131a(), 4095, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f146201a = new g();

        static {
            Covode.recordClassIndex(96087);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, false, new p(), null, null, null, 7679, null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c $music;

        static {
            Covode.recordClassIndex(96088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            super(1);
            this.$music = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, new ac(this.$music), null, null, false, null, null, null, null, 8159, null);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c $model;

        static {
            Covode.recordClassIndex(96089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            super(1);
            this.$model = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, this.$model, null, null, null, null, null, false, null, null, null, null, 8187, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<EditMusicState, EditMusicState> {
        final /* synthetic */ boolean $needMob;

        static {
            Covode.recordClassIndex(96090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(boolean z) {
            super(1);
            this.$needMob = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            l.d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, this.$needMob, null, null, null, new a.b(), 3839, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.music.a
    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        d(new h(cVar));
    }

    @Override // com.ss.android.ugc.gamora.editor.music.a
    public final void b(boolean z) {
        c(new j(z));
        this.f146198a = true;
    }

    @Override // com.ss.android.ugc.gamora.editor.music.a
    public final void a(boolean z) {
        c(new e(z));
    }
}
