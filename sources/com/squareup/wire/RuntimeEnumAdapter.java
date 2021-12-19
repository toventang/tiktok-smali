package com.squareup.wire;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.squareup.wire.WireEnum;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    private Method fromValueMethod;
    private final Class<E> type;

    static {
        Covode.recordClassIndex(36133);
    }

    private static Object com_squareup_wire_RuntimeEnumAdapter_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_squareup_wire_RuntimeEnumAdapter_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_squareup_wire_RuntimeEnumAdapter_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    private Method getFromValueMethod() {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.type.getMethod("fromValue", Integer.TYPE);
            this.fromValueMethod = method2;
            return method2;
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }

    RuntimeEnumAdapter(Class<E> cls) {
        super(cls);
        this.type = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RuntimeEnumAdapter) || ((RuntimeEnumAdapter) obj).type != this.type) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.squareup.wire.EnumAdapter
    public final E fromValue(int i2) {
        try {
            return (E) ((WireEnum) com_squareup_wire_RuntimeEnumAdapter_java_lang_reflect_Method_invoke(getFromValueMethod(), null, new Object[]{Integer.valueOf(i2)}));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }
}
