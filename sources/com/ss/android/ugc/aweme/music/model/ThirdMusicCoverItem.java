package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class ThirdMusicCoverItem {
    @c(a = "text")
    public String musicCoverDisplayText;
    @c(a = "info")
    public List<MusicCoverInfo> musicCoverInfoList;

    static {
        Covode.recordClassIndex(71688);
    }
}
