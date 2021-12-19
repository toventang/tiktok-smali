package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a;

public final class e {
    static {
        Covode.recordClassIndex(76031);
    }

    public static final String a(int i2) {
        if (i2 == a.LiveEvent.getId()) {
            return "live";
        }
        if (i2 == a.QA.getId()) {
            return "qa";
        }
        if (i2 == a.Translations.getId()) {
            return "translations";
        }
        if (i2 == a.Supporting.getId()) {
            return "supporting";
        }
        if (i2 == a.Shoutouts.getId()) {
            return "shoutouts";
        }
        if (i2 == a.Tipping.getId()) {
            return "tipping";
        }
        return "";
    }
}
