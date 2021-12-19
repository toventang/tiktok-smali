package com.ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class VideoInfoData {
    private float rusumeVolumeMusic;
    private float rusumeVolumeOrigin;

    static {
        Covode.recordClassIndex(79609);
    }

    public VideoInfoData() {
        this(0.0f, 0.0f, 3, null);
    }

    public final float getRusumeVolumeMusic() {
        return this.rusumeVolumeMusic;
    }

    public final float getRusumeVolumeOrigin() {
        return this.rusumeVolumeOrigin;
    }

    public final void setRusumeVolumeMusic(float f2) {
        this.rusumeVolumeMusic = f2;
    }

    public final void setRusumeVolumeOrigin(float f2) {
        this.rusumeVolumeOrigin = f2;
    }

    public VideoInfoData(float f2, float f3) {
        this.rusumeVolumeOrigin = f2;
        this.rusumeVolumeMusic = f3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoInfoData(float f2, float f3, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3);
    }
}
