package com.ss.android.ugc.aweme.ftc.components.sticker.core;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.o;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.u;

public final class FTCEditStickerViewModel extends LifecycleAwareViewModel<FTCEditStickerState> implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f97923a = h.i.a((h.f.a.a) h.f97933a);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f97924b = h.i.a((h.f.a.a) g.f97932a);

    /* renamed from: c  reason: collision with root package name */
    private final h.h f97925c = h.i.a((h.f.a.a) c.f97929a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f97926d = h.i.a((h.f.a.a) b.f97928a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f97927e = h.i.a((h.f.a.a) f.f97931a);

    static {
        Covode.recordClassIndex(62230);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.core.a
    public final t<Boolean> b() {
        return (t) this.f97927e.getValue();
    }

    public final t<Boolean> g() {
        return (t) this.f97923a.getValue();
    }

    public final t<Boolean> h() {
        return (t) this.f97924b.getValue();
    }

    public final t<Boolean> i() {
        return (t) this.f97925c.getValue();
    }

    public final t<Boolean> j() {
        return (t) this.f97926d.getValue();
    }

    static final class f extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f97931a = new f();

        static {
            Covode.recordClassIndex(62236);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    static final class g extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f97932a = new g();

        static {
            Covode.recordClassIndex(62237);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    static final class h extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f97933a = new h();

        static {
            Covode.recordClassIndex(62238);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.sticker.core.a
    public final void a() {
        d(e.f97930a);
    }

    static final class b extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f97928a = new b();

        static {
            Covode.recordClassIndex(62232);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            t tVar = new t();
            tVar.setValue(false);
            return tVar;
        }
    }

    static final class c extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97929a = new c();

        static {
            Covode.recordClassIndex(62233);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            t tVar = new t();
            tVar.setValue(false);
            return tVar;
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditStickerState(null, null, null, null, 15, null);
    }

    public static final class d extends m implements h.f.a.b<FTCEditStickerState, FTCEditStickerState> {
        final /* synthetic */ Integer $value;

        static {
            Covode.recordClassIndex(62234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Integer num) {
            super(1);
            this.$value = num;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditStickerState invoke(FTCEditStickerState fTCEditStickerState) {
            FTCEditStickerState fTCEditStickerState2 = fTCEditStickerState;
            l.d(fTCEditStickerState2, "");
            return FTCEditStickerState.copy$default(fTCEditStickerState2, null, this.$value, null, null, 13, null);
        }
    }

    static final class e extends m implements h.f.a.b<FTCEditStickerState, FTCEditStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f97930a = new e();

        static {
            Covode.recordClassIndex(62235);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditStickerState invoke(FTCEditStickerState fTCEditStickerState) {
            FTCEditStickerState fTCEditStickerState2 = fTCEditStickerState;
            l.d(fTCEditStickerState2, "");
            return FTCEditStickerState.copy$default(fTCEditStickerState2, new a.b(), null, null, null, 14, null);
        }
    }

    public static final class a extends m implements h.f.a.b<FTCEditStickerState, FTCEditStickerState> {
        final /* synthetic */ long $duration = 300;
        final /* synthetic */ float $toY;

        static {
            Covode.recordClassIndex(62231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f2) {
            super(1);
            this.$toY = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditStickerState invoke(FTCEditStickerState fTCEditStickerState) {
            FTCEditStickerState fTCEditStickerState2 = fTCEditStickerState;
            l.d(fTCEditStickerState2, "");
            return FTCEditStickerState.copy$default(fTCEditStickerState2, null, null, new n(new p(Float.valueOf(this.$toY), Long.valueOf(this.$duration))), null, 11, null);
        }
    }

    public static final class i extends m implements h.f.a.b<FTCEditStickerState, FTCEditStickerState> {
        final /* synthetic */ float $scale;
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        static {
            Covode.recordClassIndex(62239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(float f2, float f3, float f4) {
            super(1);
            this.$scale = f2;
            this.$x = f3;
            this.$y = f4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditStickerState invoke(FTCEditStickerState fTCEditStickerState) {
            FTCEditStickerState fTCEditStickerState2 = fTCEditStickerState;
            l.d(fTCEditStickerState2, "");
            return FTCEditStickerState.copy$default(fTCEditStickerState2, null, null, null, new o(new u(Float.valueOf(this.$scale), Float.valueOf(this.$x), Float.valueOf(this.$y))), 7, null);
        }
    }
}
