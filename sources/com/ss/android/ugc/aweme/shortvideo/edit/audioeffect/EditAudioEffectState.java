package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditAudioEffectState extends UiState {
    private final p clearAudioEffect;
    private final a ui;

    static {
        Covode.recordClassIndex(83160);
    }

    public EditAudioEffectState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditAudioEffectState copy$default(EditAudioEffectState editAudioEffectState, p pVar, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editAudioEffectState.clearAudioEffect;
        }
        if ((i2 & 2) != 0) {
            aVar = editAudioEffectState.getUi();
        }
        return editAudioEffectState.copy(pVar, aVar);
    }

    public final p component1() {
        return this.clearAudioEffect;
    }

    public final a component2() {
        return getUi();
    }

    public final EditAudioEffectState copy(p pVar, a aVar) {
        l.d(aVar, "");
        return new EditAudioEffectState(pVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAudioEffectState)) {
            return false;
        }
        EditAudioEffectState editAudioEffectState = (EditAudioEffectState) obj;
        return l.a(this.clearAudioEffect, editAudioEffectState.clearAudioEffect) && l.a(getUi(), editAudioEffectState.getUi());
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
        return "EditAudioEffectState(clearAudioEffect=" + this.clearAudioEffect + ", ui=" + getUi() + ")";
    }

    public final p getClearAudioEffect() {
        return this.clearAudioEffect;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditAudioEffectState(p pVar, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.clearAudioEffect = pVar;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAudioEffectState(p pVar, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? new a.C1131a() : aVar);
    }
}
