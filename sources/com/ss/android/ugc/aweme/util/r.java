package com.ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import h.m.p;
import java.util.ArrayList;

public final class r {
    static {
        Covode.recordClassIndex(93224);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.ArrayList<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList<String> a(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object obj : p.c(str, new String[]{","})) {
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
