package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;

public class RelatedChallengeMusic {
    @c(a = "category_type")
    public int categoryType;
    @c(a = "ch_info")
    public Challenge challenge;
    @c(a = "music_info")
    public Music music;

    static {
        Covode.recordClassIndex(43166);
    }
}
