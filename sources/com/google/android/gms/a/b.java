package com.google.android.gms.a;

import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.a;
import java.lang.reflect.Field;

public final class b<T> extends a.AbstractBinderC1201a {

    /* renamed from: a  reason: collision with root package name */
    private final T f49677a;

    static {
        Covode.recordClassIndex(31043);
    }

    private b(T t) {
        this.f49677a = t;
    }

    public static <T> a a(T t) {
        return new b(t);
    }

    public static <T> T a(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f49677a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            throw new IllegalArgumentException(new StringBuilder(64).append("Unexpected number of IObjectWrapper declared fields: ").append(declaredFields.length).toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("Binder object is null.", e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
