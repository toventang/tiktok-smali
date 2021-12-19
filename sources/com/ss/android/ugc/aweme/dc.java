package com.ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.t;
import com.ss.android.ugc.aweme.base.b.a.f;
import com.ss.android.ugc.aweme.base.b.a.k;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class dc {
    static {
        Covode.recordClassIndex(49274);
    }

    public static <T> T a(Context context, Class<T> cls) {
        T t;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c) {
            if (applicationContext == null) {
                applicationContext = a.f107166a;
            }
            if (cls.isInterface() || !t.class.equals(cls)) {
                return null;
            }
            t = (T) f.f68003a.get(cls);
            if (t == null && (t instanceof k)) {
                return t;
            }
            T t2 = (T) new k(applicationContext);
            f.f68003a.put(cls, t2);
            return t2;
        }
        if (applicationContext == null) {
            return null;
        }
        if (cls.isInterface()) {
            return null;
        }
        t = (T) f.f68003a.get(cls);
        if (t == null) {
        }
        T t22 = (T) new k(applicationContext);
        f.f68003a.put(cls, t22);
        return t22;
    }
}
