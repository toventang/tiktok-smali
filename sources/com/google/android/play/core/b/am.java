package com.google.android.play.core.b;

import com.a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

public final class am<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Field f53116a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f53117b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<T> f53118c;

    static {
        Covode.recordClassIndex(32794);
    }

    am(Object obj, Field field, Class<T> cls) {
        this.f53117b = obj;
        this.f53116a = field;
        this.f53118c = cls;
    }

    am(Object obj, Field field, Class cls, byte b2) {
        this(obj, field, Array.newInstance(cls, 0).getClass());
    }

    private Class b() {
        return this.f53116a.getType().getComponentType();
    }

    public final T a() {
        try {
            return this.f53118c.cast(this.f53116a.get(this.f53117b));
        } catch (Exception e2) {
            throw new ao(a.a("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f53116a.getName(), this.f53117b.getClass().getName(), this.f53118c.getName()}), e2);
        }
    }

    public final void a(T t) {
        try {
            this.f53116a.set(this.f53117b, t);
        } catch (Exception e2) {
            throw new ao(a.a("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f53116a.getName(), this.f53117b.getClass().getName(), this.f53118c.getName()}), e2);
        }
    }

    public final void a(Collection collection) {
        Object[] objArr = (Object[]) a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(b(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        a(objArr2);
    }

    public final void b(Collection collection) {
        Object[] objArr = (Object[]) a();
        int i2 = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(b(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i2] = obj;
            i2++;
        }
        a(objArr2);
    }
}
