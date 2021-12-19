package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.Collection;

public final class ip {
    static {
        Covode.recordClassIndex(93677);
    }

    public static final boolean a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean a(Collection<? extends T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
