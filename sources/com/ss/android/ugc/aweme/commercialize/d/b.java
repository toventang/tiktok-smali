package com.ss.android.ugc.aweme.commercialize.d;

import com.bytedance.covode.number.Covode;

public enum b {
    TITLE("music_title"),
    ICON("music_icon");
    
    private final String AREA;

    public final String getAREA() {
        return this.AREA;
    }

    static {
        Covode.recordClassIndex(45382);
    }

    private b(String str) {
        this.AREA = str;
    }
}
