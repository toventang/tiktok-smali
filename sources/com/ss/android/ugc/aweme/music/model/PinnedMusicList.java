package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

public final class PinnedMusicList extends BaseResponse implements Serializable {
    @c(a = "avalible_capicity")
    private int avalibleCapicity = 3;
    @c(a = "music")
    private List<Music> musicList;

    static {
        Covode.recordClassIndex(71683);
    }

    public final int getAvalibleCapicity() {
        return this.avalibleCapicity;
    }

    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public final void setAvalibleCapicity(int i2) {
        this.avalibleCapicity = i2;
    }

    public final void setMusicList(List<Music> list) {
        this.musicList = list;
    }
}
