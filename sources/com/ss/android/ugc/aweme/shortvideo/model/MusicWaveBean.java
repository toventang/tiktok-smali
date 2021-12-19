package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class MusicWaveBean implements Serializable {
    @c(a = "music_length")
    private long musicLength;
    @c(a = "music_wave_ary")
    private float[] musicWavePointArray = new float[0];
    @c(a = "video_length")
    private long videoLenght;

    static {
        Covode.recordClassIndex(84465);
    }

    public final long getMusicLength() {
        return this.musicLength;
    }

    public final float[] getMusicWavePointArray() {
        return this.musicWavePointArray;
    }

    public final long getVideoLenght() {
        return this.videoLenght;
    }

    public final void setMusicLength(long j2) {
        this.musicLength = j2;
    }

    public final void setVideoLenght(long j2) {
        this.videoLenght = j2;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        l.d(fArr, "");
        this.musicWavePointArray = fArr;
    }
}
