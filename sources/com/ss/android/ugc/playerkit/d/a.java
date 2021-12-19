package com.ss.android.ugc.playerkit.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public final class a {
    static {
        Covode.recordClassIndex(97974);
    }

    public static File a(Context context) {
        File b2 = b(context);
        if (b2 == null) {
            return c(context);
        }
        return b2;
    }

    private static File b(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    private static File c(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }
}
