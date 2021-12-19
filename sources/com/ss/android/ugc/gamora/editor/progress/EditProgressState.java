package com.ss.android.ugc.gamora.editor.progress;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.m;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditProgressState extends UiState {
    private final m disablePause;
    private final a ui;

    static {
        Covode.recordClassIndex(96140);
    }

    public EditProgressState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditProgressState copy$default(EditProgressState editProgressState, a aVar, m mVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = editProgressState.getUi();
        }
        if ((i2 & 2) != 0) {
            mVar = editProgressState.disablePause;
        }
        return editProgressState.copy(aVar, mVar);
    }

    public final a component1() {
        return getUi();
    }

    public final m component2() {
        return this.disablePause;
    }

    public final EditProgressState copy(a aVar, m mVar) {
        l.d(aVar, "");
        return new EditProgressState(aVar, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProgressState)) {
            return false;
        }
        EditProgressState editProgressState = (EditProgressState) obj;
        return l.a(getUi(), editProgressState.getUi()) && l.a(this.disablePause, editProgressState.disablePause);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        m mVar = this.disablePause;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditProgressState(ui=" + getUi() + ", disablePause=" + this.disablePause + ")";
    }

    public final m getDisablePause() {
        return this.disablePause;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditProgressState(a aVar, m mVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.disablePause = mVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProgressState(a aVar, m mVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : mVar);
    }
}
