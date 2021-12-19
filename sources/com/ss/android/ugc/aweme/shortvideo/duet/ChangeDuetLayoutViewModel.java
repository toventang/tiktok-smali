package com.ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;

public final class ChangeDuetLayoutViewModel extends BaseJediViewModel<ChangeDuetLayoutState> {
    static {
        Covode.recordClassIndex(82970);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ChangeDuetLayoutState(null, null, 3, null);
    }

    public final void a(int i2) {
        c(new a(i2));
    }

    static final class a extends m implements h.f.a.b<ChangeDuetLayoutState, ChangeDuetLayoutState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(82971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChangeDuetLayoutState invoke(ChangeDuetLayoutState changeDuetLayoutState) {
            ChangeDuetLayoutState changeDuetLayoutState2 = changeDuetLayoutState;
            l.d(changeDuetLayoutState2, "");
            return ChangeDuetLayoutState.copy$default(changeDuetLayoutState2, null, new d(Integer.valueOf(this.$value)), 1, null);
        }
    }

    static final class b extends m implements h.f.a.b<ChangeDuetLayoutState, ChangeDuetLayoutState> {
        final /* synthetic */ Effect $value;

        static {
            Covode.recordClassIndex(82972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Effect effect) {
            super(1);
            this.$value = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChangeDuetLayoutState invoke(ChangeDuetLayoutState changeDuetLayoutState) {
            ChangeDuetLayoutState changeDuetLayoutState2 = changeDuetLayoutState;
            l.d(changeDuetLayoutState2, "");
            return ChangeDuetLayoutState.copy$default(changeDuetLayoutState2, new d(this.$value), null, 2, null);
        }
    }

    public final void a(Effect effect) {
        l.d(effect, "");
        c(new b(effect));
    }
}
