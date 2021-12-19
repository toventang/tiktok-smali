package com.ss.android.ugc.gamora.editor.multiedit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class MultiEditState extends UiState {
    private final p clearBackgroundMusic;
    private final h.p<Boolean, Boolean> showOrHide;
    private final a ui;

    static {
        Covode.recordClassIndex(96061);
    }

    public MultiEditState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.multiedit.MultiEditState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiEditState copy$default(MultiEditState multiEditState, h.p pVar, p pVar2, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = multiEditState.showOrHide;
        }
        if ((i2 & 2) != 0) {
            pVar2 = multiEditState.clearBackgroundMusic;
        }
        if ((i2 & 4) != 0) {
            aVar = multiEditState.getUi();
        }
        return multiEditState.copy(pVar, pVar2, aVar);
    }

    public final h.p<Boolean, Boolean> component1() {
        return this.showOrHide;
    }

    public final p component2() {
        return this.clearBackgroundMusic;
    }

    public final a component3() {
        return getUi();
    }

    public final MultiEditState copy(h.p<Boolean, Boolean> pVar, p pVar2, a aVar) {
        l.d(aVar, "");
        return new MultiEditState(pVar, pVar2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiEditState)) {
            return false;
        }
        MultiEditState multiEditState = (MultiEditState) obj;
        return l.a(this.showOrHide, multiEditState.showOrHide) && l.a(this.clearBackgroundMusic, multiEditState.clearBackgroundMusic) && l.a(getUi(), multiEditState.getUi());
    }

    public final int hashCode() {
        h.p<Boolean, Boolean> pVar = this.showOrHide;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p pVar2 = this.clearBackgroundMusic;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MultiEditState(showOrHide=" + this.showOrHide + ", clearBackgroundMusic=" + this.clearBackgroundMusic + ", ui=" + getUi() + ")";
    }

    public final p getClearBackgroundMusic() {
        return this.clearBackgroundMusic;
    }

    public final h.p<Boolean, Boolean> getShowOrHide() {
        return this.showOrHide;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiEditState(h.p<Boolean, Boolean> pVar, p pVar2, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.showOrHide = pVar;
        this.clearBackgroundMusic = pVar2;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiEditState(h.p pVar, p pVar2, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : pVar2, (i2 & 4) != 0 ? new a.C1131a() : aVar);
    }
}
