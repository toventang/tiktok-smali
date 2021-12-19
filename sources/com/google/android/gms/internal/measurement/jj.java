package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class jj implements PrivilegedExceptionAction<Unsafe> {
    static {
        Covode.recordClassIndex(31903);
    }

    jj() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Unsafe run() {
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
