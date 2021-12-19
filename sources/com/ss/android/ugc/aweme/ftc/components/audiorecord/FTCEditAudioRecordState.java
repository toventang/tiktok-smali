package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class FTCEditAudioRecordState extends UiState {
    private final a ui;

    static {
        Covode.recordClassIndex(62066);
    }

    public FTCEditAudioRecordState() {
        this(null, 1, null);
    }

    public static /* synthetic */ FTCEditAudioRecordState copy$default(FTCEditAudioRecordState fTCEditAudioRecordState, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = fTCEditAudioRecordState.getUi();
        }
        return fTCEditAudioRecordState.copy(aVar);
    }

    public final a component1() {
        return getUi();
    }

    public final FTCEditAudioRecordState copy(a aVar) {
        l.d(aVar, "");
        return new FTCEditAudioRecordState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FTCEditAudioRecordState) && l.a(getUi(), ((UiState) obj).getUi());
        }
        return true;
    }

    public final int hashCode() {
        a ui2 = getUi();
        if (ui2 != null) {
            return ui2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FTCEditAudioRecordState(ui=" + getUi() + ")";
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditAudioRecordState(a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditAudioRecordState(a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar);
    }
}
