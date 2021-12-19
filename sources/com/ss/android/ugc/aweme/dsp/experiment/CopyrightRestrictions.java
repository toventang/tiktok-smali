package com.ss.android.ugc.aweme.dsp.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class CopyrightRestrictions {
    @c(a = "max_musics_per_day")
    private final int maxMusics = 10;
    @c(a = "min_duration_mark_played")
    private final int minDuration = 30;

    static {
        Covode.recordClassIndex(51937);
    }

    public final int getMaxMusics() {
        return this.maxMusics;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }
}
