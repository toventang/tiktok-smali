package com.ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.g;
import h.f.b.l;

public final class ChangeDuetLayoutState implements af {
    private final d<Effect> effect;
    private final d<Integer> layoutDirection;

    static {
        Covode.recordClassIndex(82969);
    }

    public ChangeDuetLayoutState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeDuetLayoutState copy$default(ChangeDuetLayoutState changeDuetLayoutState, d dVar, d dVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dVar = changeDuetLayoutState.effect;
        }
        if ((i2 & 2) != 0) {
            dVar2 = changeDuetLayoutState.layoutDirection;
        }
        return changeDuetLayoutState.copy(dVar, dVar2);
    }

    public final d<Effect> component1() {
        return this.effect;
    }

    public final d<Integer> component2() {
        return this.layoutDirection;
    }

    public final ChangeDuetLayoutState copy(d<? extends Effect> dVar, d<Integer> dVar2) {
        return new ChangeDuetLayoutState(dVar, dVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDuetLayoutState)) {
            return false;
        }
        ChangeDuetLayoutState changeDuetLayoutState = (ChangeDuetLayoutState) obj;
        return l.a(this.effect, changeDuetLayoutState.effect) && l.a(this.layoutDirection, changeDuetLayoutState.layoutDirection);
    }

    public final int hashCode() {
        d<Effect> dVar = this.effect;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        d<Integer> dVar2 = this.layoutDirection;
        if (dVar2 != null) {
            i2 = dVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ChangeDuetLayoutState(effect=" + this.effect + ", layoutDirection=" + this.layoutDirection + ")";
    }

    public final d<Effect> getEffect() {
        return this.effect;
    }

    public final d<Integer> getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChangeDuetLayoutState(d<? extends Effect> dVar, d<Integer> dVar2) {
        this.effect = dVar;
        this.layoutDirection = dVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeDuetLayoutState(d dVar, d dVar2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : dVar, (i2 & 2) != 0 ? null : dVar2);
    }
}
