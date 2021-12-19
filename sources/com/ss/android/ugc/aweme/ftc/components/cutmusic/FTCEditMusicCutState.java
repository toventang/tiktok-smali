package com.ss.android.ugc.aweme.ftc.components.cutmusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.shortvideo.d;
import h.f.b.g;
import h.f.b.l;
import h.u;

public final class FTCEditMusicCutState extends UiState {
    private final u<d, Integer, Integer> musicWaveData;
    private final a ui;
    private final Integer videoLength;

    static {
        Covode.recordClassIndex(62129);
    }

    public FTCEditMusicCutState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditMusicCutState copy$default(FTCEditMusicCutState fTCEditMusicCutState, u uVar, Integer num, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uVar = fTCEditMusicCutState.musicWaveData;
        }
        if ((i2 & 2) != 0) {
            num = fTCEditMusicCutState.videoLength;
        }
        if ((i2 & 4) != 0) {
            aVar = fTCEditMusicCutState.getUi();
        }
        return fTCEditMusicCutState.copy(uVar, num, aVar);
    }

    public final u<d, Integer, Integer> component1() {
        return this.musicWaveData;
    }

    public final Integer component2() {
        return this.videoLength;
    }

    public final a component3() {
        return getUi();
    }

    public final FTCEditMusicCutState copy(u<d, Integer, Integer> uVar, Integer num, a aVar) {
        l.d(aVar, "");
        return new FTCEditMusicCutState(uVar, num, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditMusicCutState)) {
            return false;
        }
        FTCEditMusicCutState fTCEditMusicCutState = (FTCEditMusicCutState) obj;
        return l.a(this.musicWaveData, fTCEditMusicCutState.musicWaveData) && l.a(this.videoLength, fTCEditMusicCutState.videoLength) && l.a(getUi(), fTCEditMusicCutState.getUi());
    }

    public final int hashCode() {
        u<d, Integer, Integer> uVar = this.musicWaveData;
        int i2 = 0;
        int hashCode = (uVar != null ? uVar.hashCode() : 0) * 31;
        Integer num = this.videoLength;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "FTCEditMusicCutState(musicWaveData=" + this.musicWaveData + ", videoLength=" + this.videoLength + ", ui=" + getUi() + ")";
    }

    public final u<d, Integer, Integer> getMusicWaveData() {
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
    public FTCEditMusicCutState(u<d, Integer, Integer> uVar, Integer num, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.musicWaveData = uVar;
        this.videoLength = num;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditMusicCutState(u uVar, Integer num, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : uVar, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? new a.C1131a() : aVar);
    }
}
