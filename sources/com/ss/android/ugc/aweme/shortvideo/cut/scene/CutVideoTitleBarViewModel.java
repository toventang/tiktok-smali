package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import h.f.b.l;
import h.f.b.m;

public final class CutVideoTitleBarViewModel extends BaseJediViewModel<CutVideoTitleBarState> {
    static {
        Covode.recordClassIndex(82436);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoTitleBarState(null, null, null, null, null, 31, null);
    }

    public final void a(boolean z) {
        c(new c(z));
    }

    public final void b(boolean z) {
        c(new e(z));
    }

    public final void c(boolean z) {
        c(new b(z));
    }

    public final void e(boolean z) {
        c(new a(z));
    }

    static final class a extends m implements h.f.a.b<CutVideoTitleBarState, CutVideoTitleBarState> {
        final /* synthetic */ boolean $isShow;

        static {
            Covode.recordClassIndex(82437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$isShow = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            CutVideoTitleBarState cutVideoTitleBarState2 = cutVideoTitleBarState;
            l.d(cutVideoTitleBarState2, "");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState2, null, null, null, null, new k(this.$isShow), 15, null);
        }
    }

    static final class b extends m implements h.f.a.b<CutVideoTitleBarState, CutVideoTitleBarState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            CutVideoTitleBarState cutVideoTitleBarState2 = cutVideoTitleBarState;
            l.d(cutVideoTitleBarState2, "");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState2, null, null, Boolean.valueOf(this.$value), null, null, 27, null);
        }
    }

    static final class c extends m implements h.f.a.b<CutVideoTitleBarState, CutVideoTitleBarState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            CutVideoTitleBarState cutVideoTitleBarState2 = cutVideoTitleBarState;
            l.d(cutVideoTitleBarState2, "");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState2, Boolean.valueOf(this.$value), null, null, null, null, 30, null);
        }
    }

    static final class d extends m implements h.f.a.b<CutVideoTitleBarState, CutVideoTitleBarState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            CutVideoTitleBarState cutVideoTitleBarState2 = cutVideoTitleBarState;
            l.d(cutVideoTitleBarState2, "");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState2, null, null, null, Boolean.valueOf(this.$value), null, 23, null);
        }
    }

    static final class e extends m implements h.f.a.b<CutVideoTitleBarState, CutVideoTitleBarState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoTitleBarState invoke(CutVideoTitleBarState cutVideoTitleBarState) {
            CutVideoTitleBarState cutVideoTitleBarState2 = cutVideoTitleBarState;
            l.d(cutVideoTitleBarState2, "");
            return CutVideoTitleBarState.copy$default(cutVideoTitleBarState2, null, Boolean.valueOf(this.$value), null, null, null, 29, null);
        }
    }

    public final void d(boolean z) {
        c(new d(z));
    }
}
