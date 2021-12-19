package com.ss.android.ugc.gamora.editor.progressbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.m;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditPreviewProgressState extends UiState {
    private final p changeVideoStatus;
    private final m speedChange;
    private final n<Integer, Integer> statusEvent;
    private final a ui;

    static {
        Covode.recordClassIndex(96163);
    }

    public EditPreviewProgressState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditPreviewProgressState copy$default(EditPreviewProgressState editPreviewProgressState, a aVar, m mVar, p pVar, n nVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = editPreviewProgressState.getUi();
        }
        if ((i2 & 2) != 0) {
            mVar = editPreviewProgressState.speedChange;
        }
        if ((i2 & 4) != 0) {
            pVar = editPreviewProgressState.changeVideoStatus;
        }
        if ((i2 & 8) != 0) {
            nVar = editPreviewProgressState.statusEvent;
        }
        return editPreviewProgressState.copy(aVar, mVar, pVar, nVar);
    }

    public final a component1() {
        return getUi();
    }

    public final m component2() {
        return this.speedChange;
    }

    public final p component3() {
        return this.changeVideoStatus;
    }

    public final n<Integer, Integer> component4() {
        return this.statusEvent;
    }

    public final EditPreviewProgressState copy(a aVar, m mVar, p pVar, n<Integer, Integer> nVar) {
        l.d(aVar, "");
        return new EditPreviewProgressState(aVar, mVar, pVar, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewProgressState)) {
            return false;
        }
        EditPreviewProgressState editPreviewProgressState = (EditPreviewProgressState) obj;
        return l.a(getUi(), editPreviewProgressState.getUi()) && l.a(this.speedChange, editPreviewProgressState.speedChange) && l.a(this.changeVideoStatus, editPreviewProgressState.changeVideoStatus) && l.a(this.statusEvent, editPreviewProgressState.statusEvent);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        m mVar = this.speedChange;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        p pVar = this.changeVideoStatus;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        n<Integer, Integer> nVar = this.statusEvent;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "EditPreviewProgressState(ui=" + getUi() + ", speedChange=" + this.speedChange + ", changeVideoStatus=" + this.changeVideoStatus + ", statusEvent=" + this.statusEvent + ")";
    }

    public final p getChangeVideoStatus() {
        return this.changeVideoStatus;
    }

    public final m getSpeedChange() {
        return this.speedChange;
    }

    public final n<Integer, Integer> getStatusEvent() {
        return this.statusEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPreviewProgressState(a aVar, m mVar, p pVar, n<Integer, Integer> nVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.speedChange = mVar;
        this.changeVideoStatus = pVar;
        this.statusEvent = nVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditPreviewProgressState(a aVar, m mVar, p pVar, n nVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : mVar, (i2 & 4) != 0 ? null : pVar, (i2 & 8) != 0 ? null : nVar);
    }
}
