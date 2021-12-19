package com.ss.android.ugc.aweme.ftc.components.volume;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class FTCEditVolumeViewModel extends LifecycleAwareViewModel<FTCEditVolumeState> implements a {
    static {
        Covode.recordClassIndex(62513);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.volume.a
    public final void a() {
        c(c.f98297a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditVolumeState(null, null, null, null, 15, null);
    }

    static final class a extends m implements h.f.a.b<FTCEditVolumeState, FTCEditVolumeState> {
        final /* synthetic */ String $value;

        static {
            Covode.recordClassIndex(62514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.$value = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditVolumeState invoke(FTCEditVolumeState fTCEditVolumeState) {
            FTCEditVolumeState fTCEditVolumeState2 = fTCEditVolumeState;
            l.d(fTCEditVolumeState2, "");
            return FTCEditVolumeState.copy$default(fTCEditVolumeState2, this.$value, null, null, null, 14, null);
        }
    }

    static final class b extends m implements h.f.a.b<FTCEditVolumeState, FTCEditVolumeState> {
        final /* synthetic */ String $value;

        static {
            Covode.recordClassIndex(62515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.$value = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditVolumeState invoke(FTCEditVolumeState fTCEditVolumeState) {
            FTCEditVolumeState fTCEditVolumeState2 = fTCEditVolumeState;
            l.d(fTCEditVolumeState2, "");
            return FTCEditVolumeState.copy$default(fTCEditVolumeState2, null, this.$value, null, null, 13, null);
        }
    }

    static final class c extends m implements h.f.a.b<FTCEditVolumeState, FTCEditVolumeState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f98297a = new c();

        static {
            Covode.recordClassIndex(62516);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditVolumeState invoke(FTCEditVolumeState fTCEditVolumeState) {
            FTCEditVolumeState fTCEditVolumeState2 = fTCEditVolumeState;
            l.d(fTCEditVolumeState2, "");
            return FTCEditVolumeState.copy$default(fTCEditVolumeState2, null, null, null, new a.b(), 7, null);
        }
    }
}
