package com.ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class k {
    static {
        Covode.recordClassIndex(98753);
    }

    public static boolean a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean b(List<?> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
