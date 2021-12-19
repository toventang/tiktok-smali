package com.google.gson.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class a<T> {
    final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    static {
        Covode.recordClassIndex(33914);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return b.d(this.type);
    }

    public a() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = (Class<? super T>) b.c(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    public static <T> a<T> get(Class<T> cls) {
        return new a<>(cls);
    }

    public boolean isAssignableFrom(a<?> aVar) {
        return isAssignableFrom(aVar.type);
    }

    public static a<?> get(Type type2) {
        return new a<>(type2);
    }

    public static a<?> getArray(Type type2) {
        return new a<>(b.a(type2));
    }

    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a) || !b.a(this.type, ((a) obj).type)) {
            return false;
        }
        return true;
    }

    a(Type type2) {
        Type b2 = b.b((Type) com.google.gson.internal.a.a(type2));
        this.type = b2;
        this.rawType = (Class<? super T>) b.c(b2);
        this.hashCode = b2.hashCode();
    }

    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(b.c(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return isAssignableFrom(type2, (ParameterizedType) type3, new HashMap());
        }
        if (!(type3 instanceof GenericArrayType)) {
            throw buildUnexpectedTypeError(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
        } else if (!this.rawType.isAssignableFrom(b.c(type2)) || !isAssignableFrom(type2, (GenericArrayType) this.type)) {
            return false;
        } else {
            return true;
        }
    }

    public static a<?> getParameterized(Type type2, Type... typeArr) {
        return new a<>(b.a((Type) null, type2, typeArr));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0012 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private static boolean isAssignableFrom(Type type2, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            type2 = ((GenericArrayType) type2).getGenericComponentType();
        } else if (type2 instanceof Class) {
            type2 = (Class) type2;
            while (type2.isArray()) {
                type2 = type2.getComponentType();
            }
        }
        return isAssignableFrom(type2, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static AssertionError buildUnexpectedTypeError(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName()).append(", ");
        }
        sb.append("but got: ").append(type2.getClass().getName()).append(", for type token: ").append(type2.toString()).append('.');
        return new AssertionError(sb.toString());
    }

    private static boolean matches(Type type2, Type type3, Map<String, Type> map) {
        if (type3.equals(type2)) {
            return true;
        }
        if (!(type2 instanceof TypeVariable) || !type3.equals(map.get(((TypeVariable) type2).getName()))) {
            return false;
        }
        return true;
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            if (!matches(actualTypeArguments[i2], actualTypeArguments2[i2], map)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAssignableFrom(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        ParameterizedType parameterizedType2;
        while (true) {
            if (type2 == null) {
                return false;
            }
            if (parameterizedType.equals(type2)) {
                return true;
            }
            Class<?> c2 = b.c(type2);
            if ((type2 instanceof ParameterizedType) && (parameterizedType2 = (ParameterizedType) type2) != null) {
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                TypeVariable<Class<?>>[] typeParameters = c2.getTypeParameters();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    Type type3 = actualTypeArguments[i2];
                    TypeVariable<Class<?>> typeVariable = typeParameters[i2];
                    while (type3 instanceof TypeVariable) {
                        type3 = map.get(((TypeVariable) type3).getName());
                    }
                    map.put(typeVariable.getName(), type3);
                }
                if (typeEquals(parameterizedType2, parameterizedType, map)) {
                    return true;
                }
            }
            for (Type type4 : c2.getGenericInterfaces()) {
                if (isAssignableFrom(type4, parameterizedType, new HashMap(map))) {
                    return true;
                }
            }
            type2 = c2.getGenericSuperclass();
            map = new HashMap(map);
        }
    }
}
