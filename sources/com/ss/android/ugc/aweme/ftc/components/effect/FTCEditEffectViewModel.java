package com.ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class FTCEditEffectViewModel extends LifecycleAwareViewModel<FTCEditEffectState> implements a {
    static {
        Covode.recordClassIndex(62159);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.effect.a
    public final void a() {
        d(c.f97808a);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.effect.a
    public final void b() {
        d(a.f97807a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditEffectState(null, null, 3, null);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.effect.a
    public final void a(int i2) {
        d(new b(i2));
    }

    static final class a extends m implements h.f.a.b<FTCEditEffectState, FTCEditEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f97807a = new a();

        static {
            Covode.recordClassIndex(62160);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditEffectState invoke(FTCEditEffectState fTCEditEffectState) {
            FTCEditEffectState fTCEditEffectState2 = fTCEditEffectState;
            l.d(fTCEditEffectState2, "");
            return FTCEditEffectState.copy$default(fTCEditEffectState2, new a.C1131a(), null, 2, null);
        }
    }

    static final class b extends m implements h.f.a.b<FTCEditEffectState, FTCEditEffectState> {
        final /* synthetic */ int $length;

        static {
            Covode.recordClassIndex(62161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$length = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditEffectState invoke(FTCEditEffectState fTCEditEffectState) {
            FTCEditEffectState fTCEditEffectState2 = fTCEditEffectState;
            l.d(fTCEditEffectState2, "");
            return FTCEditEffectState.copy$default(fTCEditEffectState2, null, Integer.valueOf(this.$length), 1, null);
        }
    }

    static final class c extends m implements h.f.a.b<FTCEditEffectState, FTCEditEffectState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97808a = new c();

        static {
            Covode.recordClassIndex(62162);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditEffectState invoke(FTCEditEffectState fTCEditEffectState) {
            FTCEditEffectState fTCEditEffectState2 = fTCEditEffectState;
            l.d(fTCEditEffectState2, "");
            return FTCEditEffectState.copy$default(fTCEditEffectState2, new a.b(), null, 2, null);
        }
    }
}
