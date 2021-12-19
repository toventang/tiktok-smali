package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;

public final class af {
    static {
        Covode.recordClassIndex(11307);
    }

    public static final boolean a(Hashtag hashtag) {
        String str;
        Long l2;
        if (hashtag == null || (str = hashtag.title) == null || str.length() == 0 || (((l2 = hashtag.id) != null && l2.longValue() == 0) || hashtag.id == null)) {
            return false;
        }
        return true;
    }
}
