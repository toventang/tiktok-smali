package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import h.f.b.l;
import h.f.b.m;

public final class CutVideoStickerPointMusicViewModel extends BaseJediViewModel<CutVideoStickerPointMusicState> {
    static {
        Covode.recordClassIndex(82429);
    }

    public final void a() {
        c(new e(false));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoStickerPointMusicState(null, null, null, null, null, 31, null);
    }

    public final void b(boolean z) {
        c(new c(z));
    }

    static final class a extends m implements h.f.a.b<CutVideoStickerPointMusicState, CutVideoStickerPointMusicState> {
        final /* synthetic */ boolean $isAnimate = true;

        static {
            Covode.recordClassIndex(82430);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoStickerPointMusicState invoke(CutVideoStickerPointMusicState cutVideoStickerPointMusicState) {
            CutVideoStickerPointMusicState cutVideoStickerPointMusicState2 = cutVideoStickerPointMusicState;
            l.d(cutVideoStickerPointMusicState2, "");
            return CutVideoStickerPointMusicState.copy$default(cutVideoStickerPointMusicState2, null, null, new k(this.$isAnimate), null, null, 27, null);
        }
    }

    static final class b extends m implements h.f.a.b<CutVideoStickerPointMusicState, CutVideoStickerPointMusicState> {
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(82431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.$visible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoStickerPointMusicState invoke(CutVideoStickerPointMusicState cutVideoStickerPointMusicState) {
            CutVideoStickerPointMusicState cutVideoStickerPointMusicState2 = cutVideoStickerPointMusicState;
            l.d(cutVideoStickerPointMusicState2, "");
            return CutVideoStickerPointMusicState.copy$default(cutVideoStickerPointMusicState2, null, null, null, new k(this.$visible), null, 23, null);
        }
    }

    static final class c extends m implements h.f.a.b<CutVideoStickerPointMusicState, CutVideoStickerPointMusicState> {
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(82432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$visible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoStickerPointMusicState invoke(CutVideoStickerPointMusicState cutVideoStickerPointMusicState) {
            CutVideoStickerPointMusicState cutVideoStickerPointMusicState2 = cutVideoStickerPointMusicState;
            l.d(cutVideoStickerPointMusicState2, "");
            return CutVideoStickerPointMusicState.copy$default(cutVideoStickerPointMusicState2, null, null, null, null, Boolean.valueOf(this.$visible), 15, null);
        }
    }

    static final class d extends m implements h.f.a.b<CutVideoStickerPointMusicState, CutVideoStickerPointMusicState> {
        final /* synthetic */ boolean $isAnimate = true;

        static {
            Covode.recordClassIndex(82433);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoStickerPointMusicState invoke(CutVideoStickerPointMusicState cutVideoStickerPointMusicState) {
            CutVideoStickerPointMusicState cutVideoStickerPointMusicState2 = cutVideoStickerPointMusicState;
            l.d(cutVideoStickerPointMusicState2, "");
            return CutVideoStickerPointMusicState.copy$default(cutVideoStickerPointMusicState2, null, new k(this.$isAnimate), null, null, null, 29, null);
        }
    }

    static final class e extends m implements h.f.a.b<CutVideoStickerPointMusicState, CutVideoStickerPointMusicState> {
        final /* synthetic */ boolean $isAutoPlay = false;

        static {
            Covode.recordClassIndex(82434);
        }

        e(boolean z) {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoStickerPointMusicState invoke(CutVideoStickerPointMusicState cutVideoStickerPointMusicState) {
            CutVideoStickerPointMusicState cutVideoStickerPointMusicState2 = cutVideoStickerPointMusicState;
            l.d(cutVideoStickerPointMusicState2, "");
            return CutVideoStickerPointMusicState.copy$default(cutVideoStickerPointMusicState2, new k(this.$isAutoPlay), null, null, null, null, 30, null);
        }
    }

    public final void a(boolean z) {
        c(new b(z));
    }
}
