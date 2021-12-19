package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class h {
    static {
        Covode.recordClassIndex(15906);
    }

    public static <T> boolean a(List<T> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static <T> boolean b(List<T> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }
}
