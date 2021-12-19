package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.p;
import h.f.b.l;
import h.f.b.m;

public final class CutVideoPreviewViewModel extends BaseJediViewModel<CutVideoPreviewState> {
    static {
        Covode.recordClassIndex(82414);
    }

    public final void a() {
        c(e.f125539a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoPreviewState(null, null, null, null, null, 31, null);
    }

    static final class b extends m implements h.f.a.b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f125538a = new b();

        static {
            Covode.recordClassIndex(82416);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoPreviewState invoke(CutVideoPreviewState cutVideoPreviewState) {
            CutVideoPreviewState cutVideoPreviewState2 = cutVideoPreviewState;
            l.d(cutVideoPreviewState2, "");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState2, new p(), null, null, null, null, 30, null);
        }
    }

    static final class c extends m implements h.f.a.b<CutVideoPreviewState, CutVideoPreviewState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoPreviewState invoke(CutVideoPreviewState cutVideoPreviewState) {
            CutVideoPreviewState cutVideoPreviewState2 = cutVideoPreviewState;
            l.d(cutVideoPreviewState2, "");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState2, null, Boolean.valueOf(this.$value), null, null, null, 29, null);
        }
    }

    static final class d extends m implements h.f.a.b<CutVideoPreviewState, CutVideoPreviewState> {
        final /* synthetic */ int $margin;

        static {
            Covode.recordClassIndex(82418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(int i2) {
            super(1);
            this.$margin = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoPreviewState invoke(CutVideoPreviewState cutVideoPreviewState) {
            CutVideoPreviewState cutVideoPreviewState2 = cutVideoPreviewState;
            l.d(cutVideoPreviewState2, "");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState2, null, null, null, new com.bytedance.jedi.arch.m(this.$margin), null, 23, null);
        }
    }

    static final class e extends m implements h.f.a.b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f125539a = new e();

        static {
            Covode.recordClassIndex(82419);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoPreviewState invoke(CutVideoPreviewState cutVideoPreviewState) {
            CutVideoPreviewState cutVideoPreviewState2 = cutVideoPreviewState;
            l.d(cutVideoPreviewState2, "");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState2, null, null, null, null, new p(), 15, null);
        }
    }

    public final void a(boolean z) {
        c(new c(z));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<CutVideoPreviewState, CutVideoPreviewState> {
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;

        static {
            Covode.recordClassIndex(82415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, int i3) {
            super(1);
            this.$width = i2;
            this.$height = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoPreviewState invoke(CutVideoPreviewState cutVideoPreviewState) {
            CutVideoPreviewState cutVideoPreviewState2 = cutVideoPreviewState;
            l.d(cutVideoPreviewState2, "");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState2, null, null, new n(new h.p(Integer.valueOf(this.$width), Integer.valueOf(this.$height))), null, null, 27, null);
        }
    }

    public final void a(int i2, int i3) {
        c(new a(i2, i3));
    }
}
