package com.ss.android.ugc.tools.b.a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(98216);
    }

    public static final int a(List<Integer> list) {
        T t;
        T t2;
        T next;
        if (list.isEmpty()) {
            return 1;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2.intValue() == 8) {
                break;
            }
        }
        T t3 = t2;
        if (t3 != null) {
            t3.intValue();
            return 8;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            int intValue = next.intValue();
            if (intValue != 2 && intValue != 32) {
                if (intValue == 1) {
                    break;
                }
            } else {
                t = next;
            }
        }
        t = next;
        T t4 = t;
        if (t4 == null) {
            return 16;
        }
        t4.intValue();
        return 2;
    }
}
