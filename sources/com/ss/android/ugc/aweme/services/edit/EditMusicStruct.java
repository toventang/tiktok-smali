package com.ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class EditMusicStruct {
    @c(a = "music_id")
    private String musicID = "";
    @c(a = "music_time_range")
    private MusicTimeStruct musicTime = new MusicTimeStruct();
    @c(a = "music_volume")
    private String musicVolume = "";

    static {
        Covode.recordClassIndex(79603);
    }

    public final String getMusicID() {
        return this.musicID;
    }

    public final MusicTimeStruct getMusicTime() {
        return this.musicTime;
    }

    public final String getMusicVolume() {
        return this.musicVolume;
    }

    public final void setMusicID(String str) {
        l.d(str, "");
        this.musicID = str;
    }

    public final void setMusicTime(MusicTimeStruct musicTimeStruct) {
        l.d(musicTimeStruct, "");
        this.musicTime = musicTimeStruct;
    }

    public final void setMusicVolume(String str) {
        l.d(str, "");
        this.musicVolume = str;
    }
}
