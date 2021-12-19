package com.bytedance.common.utility.collection;

import com.bytedance.common.utility.reflect.a;
import com.bytedance.covode.number.Covode;
import java.util.Collection;

public final class b {
    static {
        Covode.recordClassIndex(15892);
    }

    public static void a(Object obj) {
        a.a(obj, "clear", new Object[0]);
    }

    public static <T> boolean a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
