package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class w {
    static {
        Covode.recordClassIndex(103703);
    }

    public static v a(e eVar, String str, long j2, String str2, String str3, List<Object> list) {
        String str4 = eVar.f156061a;
        str4.hashCode();
        if (!str4.equals("tfw")) {
            return new aa(eVar, j2, str2, str3, list);
        }
        return new ab(eVar, str, j2, str2, str3, list);
    }
}
