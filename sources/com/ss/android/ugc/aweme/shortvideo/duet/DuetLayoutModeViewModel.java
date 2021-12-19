package com.ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.als.g;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.base.l;
import h.f.b.m;

public final class DuetLayoutModeViewModel extends LifecycleAwareViewModel<DuetLayoutModeState> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final k<Boolean> f126492a = new k<>();

    /* renamed from: b  reason: collision with root package name */
    public final k<l> f126493b = new k<>();

    static {
        Covode.recordClassIndex(82976);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.duet.d
    public final /* bridge */ /* synthetic */ g a() {
        return this.f126492a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.duet.d
    public final /* bridge */ /* synthetic */ g b() {
        return this.f126493b;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new DuetLayoutModeState(0, 0, 0, 0, null, null, 63, null);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.duet.d
    public final void a(String str) {
        h.f.b.l.d(str, "");
        d(new d(str));
    }

    public final void b(boolean z) {
        this.f126492a.a(Boolean.valueOf(z));
    }

    static final class a extends m implements h.f.a.b<DuetLayoutModeState, DuetLayoutModeState> {
        final /* synthetic */ int $changeDirectionMode;
        final /* synthetic */ int $chosenPosition;
        final /* synthetic */ int $touchGesture;

        static {
            Covode.recordClassIndex(82977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, int i3, int i4) {
            super(1);
            this.$changeDirectionMode = i2;
            this.$touchGesture = i3;
            this.$chosenPosition = i4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
            DuetLayoutModeState duetLayoutModeState2 = duetLayoutModeState;
            h.f.b.l.d(duetLayoutModeState2, "");
            return DuetLayoutModeState.copy$default(duetLayoutModeState2, this.$changeDirectionMode, 0, this.$touchGesture, this.$chosenPosition, null, null, 50, null);
        }
    }

    static final class b extends m implements h.f.a.b<DuetLayoutModeState, DuetLayoutModeState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(82978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
            DuetLayoutModeState duetLayoutModeState2 = duetLayoutModeState;
            h.f.b.l.d(duetLayoutModeState2, "");
            return DuetLayoutModeState.copy$default(duetLayoutModeState2, 0, this.$value, 0, 0, null, null, 61, null);
        }
    }

    static final class d extends m implements h.f.a.b<DuetLayoutModeState, DuetLayoutModeState> {
        final /* synthetic */ String $toast;

        static {
            Covode.recordClassIndex(82980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.$toast = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
            DuetLayoutModeState duetLayoutModeState2 = duetLayoutModeState;
            h.f.b.l.d(duetLayoutModeState2, "");
            return DuetLayoutModeState.copy$default(duetLayoutModeState2, 0, 0, 0, 0, this.$toast, null, 47, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.duet.d
    public final void a(boolean z) {
        d(new c(z));
    }

    static final class c extends m implements h.f.a.b<DuetLayoutModeState, DuetLayoutModeState> {
        final /* synthetic */ boolean $show;

        static {
            Covode.recordClassIndex(82979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$show = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
            com.bytedance.ui_component.a aVar;
            DuetLayoutModeState duetLayoutModeState2 = duetLayoutModeState;
            h.f.b.l.d(duetLayoutModeState2, "");
            if (this.$show) {
                aVar = new a.b();
            } else {
                aVar = new a.C1131a();
            }
            return DuetLayoutModeState.copy$default(duetLayoutModeState2, 0, 0, 0, 0, null, aVar, 31, null);
        }
    }
}
