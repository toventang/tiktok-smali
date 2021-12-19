package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

public class MusicList {
    @c(a = "music_list")
    public List<Music> musicList;

    static {
        Covode.recordClassIndex(84459);
    }
}
