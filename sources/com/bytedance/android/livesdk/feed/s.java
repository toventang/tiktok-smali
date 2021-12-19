package com.bytedance.android.livesdk.feed;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class s<T> implements o<T> {
    static {
        Covode.recordClassIndex(9783);
    }

    @Override // com.bytedance.android.livesdk.feed.o
    public final boolean a(List<T> list, List<T> list2) {
        if (list == null) {
            if (list2 == null) {
                return true;
            }
        } else if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            T t2 = list2.get(i2);
            if (t != null) {
                if (t2 != null && t.equals(t2)) {
                }
                return false;
            } else if (t2 != null) {
                return false;
            }
        }
        return true;
    }
}
