package com.ss.android.ugc.aweme.base.h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, e> f68135a = new HashMap<>();

    static {
        Covode.recordClassIndex(41978);
    }

    public static e a(Context context, String str) {
        e eVar = f68135a.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(context, str);
        f68135a.put(str, eVar2);
        return eVar2;
    }
}
