package com.ss.android.ugc.aweme.dsp.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class MusicDspExpConfig {
    @c(a = "dsp_enable_background_play")
    private final boolean dspEnableBgPlay;
    @c(a = "dsp_enable_feed_card")
    private final boolean dspEnableFeedCard;
    @c(a = "dsp_entrance")
    private final int dspEntrance;
    @c(a = "dsp_ui_style")
    private final int dspUiStyle;

    static {
        Covode.recordClassIndex(51939);
    }

    public MusicDspExpConfig() {
        this(0, 0, false, false, 15, null);
    }

    public static int com_ss_android_ugc_aweme_dsp_experiment_MusicDspExpConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ MusicDspExpConfig copy$default(MusicDspExpConfig musicDspExpConfig, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = musicDspExpConfig.dspEntrance;
        }
        if ((i4 & 2) != 0) {
            i3 = musicDspExpConfig.dspUiStyle;
        }
        if ((i4 & 4) != 0) {
            z = musicDspExpConfig.dspEnableBgPlay;
        }
        if ((i4 & 8) != 0) {
            z2 = musicDspExpConfig.dspEnableFeedCard;
        }
        return musicDspExpConfig.copy(i2, i3, z, z2);
    }

    public final int component1() {
        return this.dspEntrance;
    }

    public final int component2() {
        return this.dspUiStyle;
    }

    public final boolean component3() {
        return this.dspEnableBgPlay;
    }

    public final boolean component4() {
        return this.dspEnableFeedCard;
    }

    public final MusicDspExpConfig copy(int i2, int i3, boolean z, boolean z2) {
        return new MusicDspExpConfig(i2, i3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDspExpConfig)) {
            return false;
        }
        MusicDspExpConfig musicDspExpConfig = (MusicDspExpConfig) obj;
        return this.dspEntrance == musicDspExpConfig.dspEntrance && this.dspUiStyle == musicDspExpConfig.dspUiStyle && this.dspEnableBgPlay == musicDspExpConfig.dspEnableBgPlay && this.dspEnableFeedCard == musicDspExpConfig.dspEnableFeedCard;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_dsp_experiment_MusicDspExpConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_dsp_experiment_MusicDspExpConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.dspEntrance) * 31) + com_ss_android_ugc_aweme_dsp_experiment_MusicDspExpConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.dspUiStyle)) * 31;
        boolean z = this.dspEnableBgPlay;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (com_ss_android_ugc_aweme_dsp_experiment_MusicDspExpConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i3) * 31;
        if (!this.dspEnableFeedCard) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "MusicDspExpConfig(dspEntrance=" + this.dspEntrance + ", dspUiStyle=" + this.dspUiStyle + ", dspEnableBgPlay=" + this.dspEnableBgPlay + ", dspEnableFeedCard=" + this.dspEnableFeedCard + ")";
    }

    public final boolean getDspEnableBgPlay() {
        return this.dspEnableBgPlay;
    }

    public final boolean getDspEnableFeedCard() {
        return this.dspEnableFeedCard;
    }

    public final int getDspEntrance() {
        return this.dspEntrance;
    }

    public final int getDspUiStyle() {
        return this.dspUiStyle;
    }

    public MusicDspExpConfig(int i2, int i3, boolean z, boolean z2) {
        this.dspEntrance = i2;
        this.dspUiStyle = i3;
        this.dspEnableBgPlay = z;
        this.dspEnableFeedCard = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicDspExpConfig(int i2, int i3, boolean z, boolean z2, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? false : z2);
    }
}
