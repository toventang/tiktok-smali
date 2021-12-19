package com.google.android.gms.internal.measurement;

import android.os.Binder;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class bk {
    static {
        Covode.recordClassIndex(31677);
    }

    public static <V> V a(bj<V> bjVar) {
        long clearCallingIdentity;
        try {
            return bjVar.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a2 = bjVar.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
