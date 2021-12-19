package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import com.google.b.a.f.a.a.a.a.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class n {
    static {
        Covode.recordClassIndex(33196);
    }

    public static Type a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    public static Type a(List<Type> list, TypeVariable<?> typeVariable) {
        ParameterizedType a2;
        Type a3;
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            do {
                size--;
                if (size >= 0) {
                    a2 = a(list.get(size), cls);
                }
            } while (a2 == null);
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            int i2 = 0;
            while (i2 < typeParameters.length && !typeParameters[i2].equals(typeVariable)) {
                i2++;
            }
            Type type = a2.getActualTypeArguments()[i2];
            return (!(type instanceof TypeVariable) || (a3 = a(list, (TypeVariable) type)) == null) ? type : a3;
        }
        return null;
    }

    private static Class<?> a(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static <T> T a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e2) {
            throw a((Exception) e2, (Class<?>) cls);
        } catch (InstantiationException e3) {
            throw a((Exception) e3, (Class<?>) cls);
        }
    }

    public static <T> Iterable<T> a(final Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        b.a(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new Iterable<T>() {
            /* class com.google.b.a.g.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33197);
            }

            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return new Iterator<T>() {
                    /* class com.google.b.a.g.n.AnonymousClass1.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final int f53670a;

                    /* renamed from: b  reason: collision with root package name */
                    int f53671b = 0;

                    static {
                        Covode.recordClassIndex(33198);
                    }

                    public final void remove() {
                        throw new UnsupportedOperationException();
                    }

                    public final boolean hasNext() {
                        if (this.f53671b < this.f53670a) {
                            return true;
                        }
                        return false;
                    }

                    @Override // java.util.Iterator
                    public final T next() {
                        if (hasNext()) {
                            Object obj = obj;
                            int i2 = this.f53671b;
                            this.f53671b = i2 + 1;
                            return (T) Array.get(obj, i2);
                        }
                        throw new NoSuchElementException();
                    }

                    {
                        this.f53670a = Array.getLength(obj);
                    }
                };
            }
        };
    }

    public static Type a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Class<?> a(List<Type> list, Type type) {
        boolean z;
        if (type instanceof TypeVariable) {
            type = a(list, (TypeVariable<?>) ((TypeVariable) type));
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(a(list, a(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return a((ParameterizedType) type);
        }
        if (type == null) {
            z = true;
        } else {
            z = false;
        }
        b.a(z, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    private static IllegalArgumentException a(Exception exc, Class<?> cls) {
        StringBuilder append = new StringBuilder("unable to create new instance of class ").append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                append.append(" and");
            } else {
                z = true;
            }
            append.append(" ").append(str);
        }
        return new IllegalArgumentException(append.toString(), exc);
    }

    public static Object a(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i2 = 0;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            Array.set(newInstance, i2, it.next());
            i2++;
        }
        return newInstance;
    }

    public static ParameterizedType a(Type type, Class<?> cls) {
        Class<?> cls2;
        Class<?> a2;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> a3 = a(parameterizedType);
                if (a3 == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    Type[] genericInterfaces = a3.getGenericInterfaces();
                    int length = genericInterfaces.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        type = genericInterfaces[i2];
                        if (type instanceof Class) {
                            a2 = (Class) type;
                        } else {
                            a2 = a((ParameterizedType) type);
                        }
                        if (cls.isAssignableFrom(a2)) {
                            break;
                        }
                        i2++;
                    }
                }
                cls2 = a3;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }
}
