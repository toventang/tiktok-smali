package com.ss.android.ugc.aweme.tools.draft.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(91179);
    }

    public static final String a(List<String> list) {
        l.d(list, "");
        boolean z = true;
        String str = "(";
        for (String str2 : list) {
            if (z) {
                z = false;
            } else {
                str = str + ",";
            }
            str = str + "'" + str2 + "'";
        }
        return str + ")";
    }
}
