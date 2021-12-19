package com.ss.android.ugc.gamora.editor.volume;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditVolumeState extends UiState {
    private final String musicTitle;
    private final Integer musicVolume;
    private final a ui;
    private final String voiceTitle;

    static {
        Covode.recordClassIndex(97073);
    }

    public EditVolumeState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ EditVolumeState copy$default(EditVolumeState editVolumeState, String str, String str2, Integer num, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = editVolumeState.musicTitle;
        }
        if ((i2 & 2) != 0) {
            str2 = editVolumeState.voiceTitle;
        }
        if ((i2 & 4) != 0) {
            num = editVolumeState.musicVolume;
        }
        if ((i2 & 8) != 0) {
            aVar = editVolumeState.getUi();
        }
        return editVolumeState.copy(str, str2, num, aVar);
    }

    public final String component1() {
        return this.musicTitle;
    }

    public final String component2() {
        return this.voiceTitle;
    }

    public final Integer component3() {
        return this.musicVolume;
    }

    public final a component4() {
        return getUi();
    }

    public final EditVolumeState copy(String str, String str2, Integer num, a aVar) {
        l.d(aVar, "");
        return new EditVolumeState(str, str2, num, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVolumeState)) {
            return false;
        }
        EditVolumeState editVolumeState = (EditVolumeState) obj;
        return l.a(this.musicTitle, editVolumeState.musicTitle) && l.a(this.voiceTitle, editVolumeState.voiceTitle) && l.a(this.musicVolume, editVolumeState.musicVolume) && l.a(getUi(), editVolumeState.getUi());
    }

    public final int hashCode() {
        String str = this.musicTitle;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.voiceTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.musicVolume;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "EditVolumeState(musicTitle=" + this.musicTitle + ", voiceTitle=" + this.voiceTitle + ", musicVolume=" + this.musicVolume + ", ui=" + getUi() + ")";
    }

    public final String getMusicTitle() {
        return this.musicTitle;
    }

    public final Integer getMusicVolume() {
        return this.musicVolume;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final String getVoiceTitle() {
        return this.voiceTitle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditVolumeState(String str, String str2, Integer num, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.musicTitle = str;
        this.voiceTitle = str2;
        this.musicVolume = num;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditVolumeState(String str, String str2, Integer num, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? new a.C1131a() : aVar);
    }
}
