package com.bytedance.router.autowire;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeWrapper<T> {
    protected final Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    static {
        Covode.recordClassIndex(26178);
    }

    public Type getType() {
        return this.type;
    }

    protected TypeWrapper() {
    }
}
