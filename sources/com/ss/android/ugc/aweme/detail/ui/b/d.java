package com.ss.android.ugc.aweme.detail.ui.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(49734);
    }

    public static final int a(List<? extends Aweme> list, int i2) {
        HashSet hashSet = new HashSet();
        int min = Math.min(i2, list.size() - 1);
        int i3 = 0;
        if (min >= 0) {
            int i4 = 0;
            while (true) {
                if (!hashSet.contains(((Aweme) list.get(i3)).getAid())) {
                    hashSet.add(((Aweme) list.get(i3)).getAid());
                } else {
                    i4++;
                }
                if (i3 == min) {
                    break;
                }
                i3++;
            }
            i3 = i4;
        }
        return i2 - i3;
    }
}
