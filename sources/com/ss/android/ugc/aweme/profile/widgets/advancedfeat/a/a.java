package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a;

import com.bytedance.covode.number.Covode;

public enum a {
    LiveEvent(10),
    QA(20),
    Translations(30),
    Supporting(40),
    Shoutouts(50),
    Tipping(60);
    
    private final int id;

    public final int getId() {
        return this.id;
    }

    static {
        Covode.recordClassIndex(76021);
    }

    private a(int i2) {
        this.id = i2;
    }
}
