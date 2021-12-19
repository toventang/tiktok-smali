package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;

public class MusicSearchCorrectInfo extends MusicModel implements Serializable {
    static final long serialVersionUID = 1;
    @c(a = "corrected_query")
    String correctedKeyword;
    @c(a = "correct_level")
    int correctedLevel;

    static {
        Covode.recordClassIndex(71679);
    }

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i2) {
        this.correctedLevel = i2;
    }
}
