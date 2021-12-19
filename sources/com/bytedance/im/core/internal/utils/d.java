package com.bytedance.im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import java.util.Collection;

public final class d {
    static {
        Covode.recordClassIndex(23121);
    }

    public static <T> boolean a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
