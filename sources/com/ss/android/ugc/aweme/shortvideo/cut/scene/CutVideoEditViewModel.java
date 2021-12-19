package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import h.f.b.l;
import h.f.b.m;

public final class CutVideoEditViewModel extends BaseJediViewModel<CutVideoEditState> {

    /* renamed from: a  reason: collision with root package name */
    public int f125524a;

    static {
        Covode.recordClassIndex(82386);
    }

    public final void a() {
        c(b.f125525a);
    }

    public final void b() {
        c(new c());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoEditState(null, null, null, null, null, 31, null);
    }

    public final void a(boolean z) {
        c(new d(z));
    }

    static final class a extends m implements h.f.a.b<CutVideoEditState, CutVideoEditState> {
        final /* synthetic */ boolean $isStickPointMode;

        static {
            Covode.recordClassIndex(82387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$isStickPointMode = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoEditState invoke(CutVideoEditState cutVideoEditState) {
            CutVideoEditState cutVideoEditState2 = cutVideoEditState;
            l.d(cutVideoEditState2, "");
            return CutVideoEditState.copy$default(cutVideoEditState2, null, null, new k(this.$isStickPointMode), null, null, 27, null);
        }
    }

    static final class b extends m implements h.f.a.b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f125525a = new b();

        static {
            Covode.recordClassIndex(82388);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoEditState invoke(CutVideoEditState cutVideoEditState) {
            CutVideoEditState cutVideoEditState2 = cutVideoEditState;
            l.d(cutVideoEditState2, "");
            return CutVideoEditState.copy$default(cutVideoEditState2, null, null, null, new p(), null, 23, null);
        }
    }

    static final class c extends m implements h.f.a.b<CutVideoEditState, CutVideoEditState> {
        final /* synthetic */ boolean $value = true;

        static {
            Covode.recordClassIndex(82389);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoEditState invoke(CutVideoEditState cutVideoEditState) {
            CutVideoEditState cutVideoEditState2 = cutVideoEditState;
            l.d(cutVideoEditState2, "");
            return CutVideoEditState.copy$default(cutVideoEditState2, null, null, null, null, Boolean.valueOf(this.$value), 15, null);
        }
    }

    static final class d extends m implements h.f.a.b<CutVideoEditState, CutVideoEditState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoEditState invoke(CutVideoEditState cutVideoEditState) {
            CutVideoEditState cutVideoEditState2 = cutVideoEditState;
            l.d(cutVideoEditState2, "");
            return CutVideoEditState.copy$default(cutVideoEditState2, null, Boolean.valueOf(this.$value), null, null, null, 29, null);
        }
    }

    static final class e extends m implements h.f.a.b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f125526a = new e();

        static {
            Covode.recordClassIndex(82391);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoEditState invoke(CutVideoEditState cutVideoEditState) {
            CutVideoEditState cutVideoEditState2 = cutVideoEditState;
            l.d(cutVideoEditState2, "");
            return CutVideoEditState.copy$default(cutVideoEditState2, new p(), null, null, null, null, 30, null);
        }
    }

    public final void b(boolean z) {
        c(new a(z));
    }
}
