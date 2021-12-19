package com.ss.android.ugc.aweme.base.utils;

import com.bytedance.covode.number.Covode;
import java.util.Collection;

public final class d {
    static {
        Covode.recordClassIndex(42129);
    }

    public static <T> boolean a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static <T> boolean b(Collection<T> collection) {
        if (collection == null || collection.size() <= 0) {
            return false;
        }
        return true;
    }

    public static <T> boolean a(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return true;
        }
        return false;
    }
}
