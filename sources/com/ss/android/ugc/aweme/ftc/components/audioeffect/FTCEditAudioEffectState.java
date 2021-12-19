package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class FTCEditAudioEffectState extends UiState {
    private final p clearAudioEffect;
    private final a ui;

    static {
        Covode.recordClassIndex(62020);
    }

    public FTCEditAudioEffectState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FTCEditAudioEffectState copy$default(FTCEditAudioEffectState fTCEditAudioEffectState, p pVar, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = fTCEditAudioEffectState.clearAudioEffect;
        }
        if ((i2 & 2) != 0) {
            aVar = fTCEditAudioEffectState.getUi();
        }
        return fTCEditAudioEffectState.copy(pVar, aVar);
    }

    public final p component1() {
        return this.clearAudioEffect;
    }

    public final a component2() {
        return getUi();
    }

    public final FTCEditAudioEffectState copy(p pVar, a aVar) {
        l.d(aVar, "");
        return new FTCEditAudioEffectState(pVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditAudioEffectState)) {
            return false;
        }
        FTCEditAudioEffectState fTCEditAudioEffectState = (FTCEditAudioEffectState) obj;
        return l.a(this.clearAudioEffect, fTCEditAudioEffectState.clearAudioEffect) && l.a(getUi(), fTCEditAudioEffectState.getUi());
    }

    public final int hashCode() {
        p pVar = this.clearAudioEffect;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FTCEditAudioEffectState(clearAudioEffect=" + this.clearAudioEffect + ", ui=" + getUi() + ")";
    }

    public final p getClearAudioEffect() {
        return this.clearAudioEffect;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditAudioEffectState(p pVar, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.clearAudioEffect = pVar;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditAudioEffectState(p pVar, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? new a.C1131a() : aVar);
    }
}
