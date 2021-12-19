package com.ss.android.ugc.aweme.ftc.components.corner;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class FTCEditCornerViewModel extends LifecycleAwareViewModel<FTCEditCornerState> implements a {
    static {
        Covode.recordClassIndex(62112);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.corner.a
    public final void a() {
        c(d.f97758a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditCornerState(null, null, null, null, 15, null);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.corner.a
    public final void a(boolean z) {
        c(new b(z));
    }

    public static final class a extends m implements h.f.a.b<FTCEditCornerState, FTCEditCornerState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(62113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditCornerState invoke(FTCEditCornerState fTCEditCornerState) {
            FTCEditCornerState fTCEditCornerState2 = fTCEditCornerState;
            l.d(fTCEditCornerState2, "");
            return FTCEditCornerState.copy$default(fTCEditCornerState2, null, null, Integer.valueOf(this.$value), null, 11, null);
        }
    }

    static final class b extends m implements h.f.a.b<FTCEditCornerState, FTCEditCornerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(62114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditCornerState invoke(FTCEditCornerState fTCEditCornerState) {
            FTCEditCornerState fTCEditCornerState2 = fTCEditCornerState;
            l.d(fTCEditCornerState2, "");
            return FTCEditCornerState.copy$default(fTCEditCornerState2, Boolean.valueOf(this.$value), null, null, null, 14, null);
        }
    }

    public static final class c extends m implements h.f.a.b<FTCEditCornerState, FTCEditCornerState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(62115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditCornerState invoke(FTCEditCornerState fTCEditCornerState) {
            FTCEditCornerState fTCEditCornerState2 = fTCEditCornerState;
            l.d(fTCEditCornerState2, "");
            return FTCEditCornerState.copy$default(fTCEditCornerState2, null, Integer.valueOf(this.$value), null, null, 13, null);
        }
    }

    static final class d extends m implements h.f.a.b<FTCEditCornerState, FTCEditCornerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f97758a = new d();

        static {
            Covode.recordClassIndex(62116);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditCornerState invoke(FTCEditCornerState fTCEditCornerState) {
            FTCEditCornerState fTCEditCornerState2 = fTCEditCornerState;
            l.d(fTCEditCornerState2, "");
            return FTCEditCornerState.copy$default(fTCEditCornerState2, null, null, null, new a.b(), 7, null);
        }
    }
}
