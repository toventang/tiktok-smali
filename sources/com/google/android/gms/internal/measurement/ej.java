package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Set;

public final class ej {
    static {
        Covode.recordClassIndex(31757);
    }

    static int a(Set<?> set) {
        int i2;
        int i3 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i3 = ((i3 + i2) ^ -1) ^ -1;
        }
        return i3;
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
