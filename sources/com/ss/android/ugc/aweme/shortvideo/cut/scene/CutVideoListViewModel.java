package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.m;

public final class CutVideoListViewModel extends BaseJediViewModel<CutVideoListState> {

    /* renamed from: a  reason: collision with root package name */
    public int f125527a;

    /* renamed from: b  reason: collision with root package name */
    public int f125528b;

    /* renamed from: c  reason: collision with root package name */
    public bt f125529c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f125530d = h.i.a((h.f.a.a) e.f125532a);

    static {
        Covode.recordClassIndex(82393);
    }

    /* access modifiers changed from: package-private */
    public final t<Boolean> g() {
        return (t) this.f125530d.getValue();
    }

    static final class e extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f125532a = new e();

        static {
            Covode.recordClassIndex(82398);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    public static final class k implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CutVideoStickerPointMusicViewModel f125533a;

        static {
            Covode.recordClassIndex(82404);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
            this.f125533a.a(false);
        }

        k(CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel) {
            this.f125533a = cutVideoStickerPointMusicViewModel;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            this.f125533a.a(false);
        }
    }

    public final void a() {
        c(new i());
    }

    public final void b() {
        c(new c());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoListState(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final void c(boolean z) {
        c(new a(z));
    }

    static final class a extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $isShow;

        static {
            Covode.recordClassIndex(82394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$isShow = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$isShow), 511, null);
        }
    }

    static final class b extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f125531a = new b();

        static {
            Covode.recordClassIndex(82395);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, new p(), null, null, null, null, null, null, null, null, null, 1022, null);
        }
    }

    static final class c extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $isAnimate = true;

        static {
            Covode.recordClassIndex(82396);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$isAnimate), null, null, null, null, 991, null);
        }
    }

    static final class d extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $isStickPointMode;

        static {
            Covode.recordClassIndex(82397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$isStickPointMode = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$isStickPointMode), null, null, 895, null);
        }
    }

    static final class f extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, Boolean.valueOf(this.$value), null, null, null, null, null, null, 1015, null);
        }
    }

    static final class g extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, Boolean.valueOf(this.$value), null, null, null, null, null, null, null, 1019, null);
        }
    }

    static final class h extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(82401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z) {
            super(1);
            this.$visible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, null, null, null, Boolean.valueOf(this.$visible), null, 767, null);
        }
    }

    static final class i extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $isAnimate = true;

        static {
            Covode.recordClassIndex(82402);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, new com.bytedance.jedi.arch.k(this.$isAnimate), null, null, null, null, null, 1007, null);
        }
    }

    static final class j extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $isStickPointMode;

        static {
            Covode.recordClassIndex(82403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(boolean z) {
            super(1);
            this.$isStickPointMode = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, null, new com.bytedance.jedi.arch.k(this.$isStickPointMode), null, null, null, 959, null);
        }
    }

    static final class l extends m implements h.f.a.b<CutVideoListState, CutVideoListState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            h.f.b.l.d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, new com.bytedance.jedi.arch.k(this.$value), null, null, null, null, null, null, null, null, 1021, null);
        }
    }

    public final void a(boolean z) {
        c(new h(z));
    }

    public final void b(boolean z) {
        g().setValue(Boolean.valueOf(z));
    }
}
