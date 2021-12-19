package com.google.vr.dynamite.client;

import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class ObjectWrapper<T> extends c {
    private final T wrappedObject;

    static {
        Covode.recordClassIndex(34127);
    }

    private ObjectWrapper(T t) {
        this.wrappedObject = t;
    }

    public static <T> IObjectWrapper a(T t) {
        return new ObjectWrapper(t);
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper, Class<T> cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        Field field = null;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Field field2 = declaredFields[i2];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i2++;
        }
        if (field == null) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                Object obj = field.get(asBinder);
                if (obj == null) {
                    return null;
                }
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
                throw new IllegalArgumentException("remoteBinder is the wrong class.");
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("Binder object is null.", e2);
            } catch (IllegalArgumentException e3) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e3);
            } catch (IllegalAccessException e4) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
