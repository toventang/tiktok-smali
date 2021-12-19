package com.bytedance.android.live.core.f.b;

import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.f.b.a.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, d> f9055a = new HashMap<String, d>() {
        /* class com.bytedance.android.live.core.f.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(4629);
        }

        {
            put("HUAWEI", new d());
        }
    };

    static {
        Covode.recordClassIndex(4628);
    }

    public static int a() {
        return a(y.a().getConfiguration());
    }

    public static boolean b() {
        d dVar = f9055a.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return false;
        }
        return dVar.a();
    }

    private static int a(Configuration configuration) {
        d dVar = f9055a.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return -1;
        }
        return dVar.a(configuration);
    }
}
