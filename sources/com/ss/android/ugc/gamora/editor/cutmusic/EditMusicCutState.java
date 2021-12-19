package com.ss.android.ugc.gamora.editor.cutmusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;
import h.u;

public final class EditMusicCutState extends UiState {
    private final d<u<com.ss.android.ugc.aweme.shortvideo.d, Integer, Integer>> musicWaveData;
    private final a ui;
    private final Integer videoLength;

    static {
        Covode.recordClassIndex(95750);
    }

    public EditMusicCutState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.cutmusic.EditMusicCutState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditMusicCutState copy$default(EditMusicCutState editMusicCutState, d dVar, Integer num, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dVar = editMusicCutState.musicWaveData;
        }
        if ((i2 & 2) != 0) {
            num = editMusicCutState.videoLength;
        }
        if ((i2 & 4) != 0) {
            aVar = editMusicCutState.getUi();
        }
        return editMusicCutState.copy(dVar, num, aVar);
    }

    public final d<u<com.ss.android.ugc.aweme.shortvideo.d, Integer, Integer>> component1() {
        return this.musicWaveData;
    }

    public final Integer component2() {
        return this.videoLength;
    }

    public final a component3() {
        return getUi();
    }

    public final EditMusicCutState copy(d<u<com.ss.android.ugc.aweme.shortvideo.d, Integer, Integer>> dVar, Integer num, a aVar) {
        l.d(aVar, "");
        return new EditMusicCutState(dVar, num, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMusicCutState)) {
            return false;
        }
        EditMusicCutState editMusicCutState = (EditMusicCutState) obj;
        return l.a(this.musicWaveData, editMusicCutState.musicWaveData) && l.a(this.videoLength, editMusicCutState.videoLength) && l.a(getUi(), editMusicCutState.getUi());
    }

    public final int hashCode() {
        d<u<com.ss.android.ugc.aweme.shortvideo.d, Integer, Integer>> dVar = this.musicWaveData;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        Integer num = this.videoLength;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EditMusicCutState(musicWaveData=" + this.musicWaveData + ", videoLength=" + this.videoLength + ", ui=" + getUi() + ")";
    }

    public final d<u<com.ss.android.ugc.aweme.shortvideo.d, Integer, Integer>> getMusicWaveData() {
        return this.musicWaveData;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditMusicCutState(d<u<com.ss.android.ugc.aweme.shortvideo.d, Integer, Integer>> dVar, Integer num, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.musicWaveData = dVar;
        this.videoLength = num;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditMusicCutState(d dVar, Integer num, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : dVar, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? new a.C1131a() : aVar);
    }
}
