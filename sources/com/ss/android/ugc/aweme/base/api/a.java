package com.ss.android.ugc.aweme.base.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p;
import com.google.gson.t;
import com.ss.android.ugc.aweme.base.api.a.a.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public abstract class a {
    private static final Object sLock = new Object();
    private static final Map<Class<?>, List<Field>> sRequiredMap = Collections.synchronizedMap(new androidx.c.a());

    static {
        Covode.recordClassIndex(41854);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.ugc.aweme.base.api.a */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T checkValid() {
        Class<?> cls = getClass();
        initRequiredFieldMap(cls);
        List<Field> list = sRequiredMap.get(cls);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                Field field = list.get(i2);
                if (field.get(this) == null) {
                    throw new t("Unexpected null value in " + cls.getName() + ", required field: " + field.getName());
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
        return this;
    }

    public static RuntimeException getCompatibleException(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            return (RuntimeException) cause;
        }
        if (cause instanceof p) {
            return new c(cause);
        }
        throw cause;
    }

    public static void initRequiredFieldMap(Class<?> cls) {
        if (sRequiredMap.get(cls) == null) {
            synchronized (sLock) {
                Field[] declaredFields = cls.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.getAnnotation(b.class) != null) {
                        field.setAccessible(true);
                        arrayList.add(field);
                    }
                }
                sRequiredMap.put(cls, Collections.unmodifiableList(arrayList));
            }
        }
    }
}
