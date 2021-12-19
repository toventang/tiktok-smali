package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditAudioRecordState extends UiState {
    private final p clearAudioData;
    private final a ui;

    static {
        Covode.recordClassIndex(83227);
    }

    public EditAudioRecordState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EditAudioRecordState copy$default(EditAudioRecordState editAudioRecordState, a aVar, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = editAudioRecordState.getUi();
        }
        if ((i2 & 2) != 0) {
            pVar = editAudioRecordState.clearAudioData;
        }
        return editAudioRecordState.copy(aVar, pVar);
    }

    public final a component1() {
        return getUi();
    }

    public final p component2() {
        return this.clearAudioData;
    }

    public final EditAudioRecordState copy(a aVar, p pVar) {
        l.d(aVar, "");
        return new EditAudioRecordState(aVar, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAudioRecordState)) {
            return false;
        }
        EditAudioRecordState editAudioRecordState = (EditAudioRecordState) obj;
        return l.a(getUi(), editAudioRecordState.getUi()) && l.a(this.clearAudioData, editAudioRecordState.clearAudioData);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        p pVar = this.clearAudioData;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditAudioRecordState(ui=" + getUi() + ", clearAudioData=" + this.clearAudioData + ")";
    }

    public final p getClearAudioData() {
        return this.clearAudioData;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditAudioRecordState(a aVar, p pVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.clearAudioData = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAudioRecordState(a aVar, p pVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : pVar);
    }
}
