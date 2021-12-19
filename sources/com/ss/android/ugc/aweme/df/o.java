package com.ss.android.ugc.aweme.df;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.HashMap;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, p> f80061a = new HashMap<>();

    static {
        Covode.recordClassIndex(49836);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static p a(Context context, String str) {
        p pVar = f80061a.get(str);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(a(context), str);
        f80061a.put(str, pVar2);
        return pVar2;
    }
}
