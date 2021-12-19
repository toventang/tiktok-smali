package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.t;
import h.f.b.l;
import h.f.b.m;

public final class CutVideoMultiModeViewModel extends BaseJediViewModel<CutVideoMultiModeState> {

    /* renamed from: a  reason: collision with root package name */
    public int f125536a = 1;

    /* renamed from: b  reason: collision with root package name */
    public bt f125537b;

    static {
        Covode.recordClassIndex(82410);
    }

    public final boolean a() {
        if (this.f125536a == 1) {
            return true;
        }
        return false;
    }

    public final void b() {
        c(new b());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoMultiModeState(null, null, null, 7, null);
    }

    public final void g() {
        c(new a());
    }

    static final class a extends m implements h.f.a.b<CutVideoMultiModeState, CutVideoMultiModeState> {
        final /* synthetic */ boolean $isAnimate = true;

        static {
            Covode.recordClassIndex(82411);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoMultiModeState invoke(CutVideoMultiModeState cutVideoMultiModeState) {
            CutVideoMultiModeState cutVideoMultiModeState2 = cutVideoMultiModeState;
            l.d(cutVideoMultiModeState2, "");
            return CutVideoMultiModeState.copy$default(cutVideoMultiModeState2, null, null, new k(this.$isAnimate), 3, null);
        }
    }

    static final class b extends m implements h.f.a.b<CutVideoMultiModeState, CutVideoMultiModeState> {
        final /* synthetic */ boolean $isAnimate = true;

        static {
            Covode.recordClassIndex(82412);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoMultiModeState invoke(CutVideoMultiModeState cutVideoMultiModeState) {
            CutVideoMultiModeState cutVideoMultiModeState2 = cutVideoMultiModeState;
            l.d(cutVideoMultiModeState2, "");
            return CutVideoMultiModeState.copy$default(cutVideoMultiModeState2, null, new k(this.$isAnimate), null, 5, null);
        }
    }

    public final void a(e eVar, boolean z) {
        l.d(eVar, "");
        bt btVar = this.f125537b;
        if (btVar == null) {
            l.a("stickerPointController");
        }
        btVar.e();
        JediViewModel a2 = t.a(eVar).a(CutVideoEditViewModel.class);
        l.b(a2, "");
        CutVideoEditViewModel cutVideoEditViewModel = (CutVideoEditViewModel) a2;
        cutVideoEditViewModel.b(true);
        if (z) {
            cutVideoEditViewModel.a();
        }
        JediViewModel a3 = t.a(eVar).a(CutVideoListViewModel.class);
        l.b(a3, "");
        ((CutVideoListViewModel) a3).b(false);
        bt btVar2 = this.f125537b;
        if (btVar2 == null) {
            l.a("stickerPointController");
        }
        btVar2.k().a(true);
    }
}
