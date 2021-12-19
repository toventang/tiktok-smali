package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.h;
import com.google.gson.internal.a.b;
import com.google.gson.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, h<?>> f54842a;

    /* renamed from: b  reason: collision with root package name */
    private final b f54843b = b.f54738a;

    static {
        Covode.recordClassIndex(34018);
    }

    public final String toString() {
        return this.f54842a.toString();
    }

    public c(Map<Type, h<?>> map) {
        this.f54842a = map;
    }

    private <T> h<T> a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f54843b.a(declaredConstructor);
            }
            return new h<T>() {
                /* class com.google.gson.internal.c.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(34031);
                }

                @Override // com.google.gson.internal.h
                public final T a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    } catch (IllegalAccessException e4) {
                        throw new AssertionError(e4);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> h<T> a(a<T> aVar) {
        final Type type = aVar.type;
        final Class<? super T> cls = aVar.rawType;
        final h<?> hVar = this.f54842a.get(type);
        if (hVar != null) {
            return new h<T>() {
                /* class com.google.gson.internal.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34019);
                }

                @Override // com.google.gson.internal.h
                public final T a() {
                    return (T) hVar.a();
                }
            };
        }
        final h<?> hVar2 = this.f54842a.get(cls);
        if (hVar2 != null) {
            return new h<T>() {
                /* class com.google.gson.internal.c.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(34030);
                }

                @Override // com.google.gson.internal.h
                public final T a() {
                    return (T) hVar2.a();
                }
            };
        }
        h<T> a2 = a(cls);
        if (a2 != null) {
            return a2;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new h<T>() {
                    /* class com.google.gson.internal.c.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(34032);
                    }

                    @Override // com.google.gson.internal.h
                    public final T a() {
                        return (T) new TreeSet();
                    }
                };
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new h<T>() {
                    /* class com.google.gson.internal.c.AnonymousClass10 */

                    static {
                        Covode.recordClassIndex(34020);
                    }

                    @Override // com.google.gson.internal.h
                    public final T a() {
                        Type type = type;
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2 instanceof Class) {
                                return (T) EnumSet.noneOf((Class) type2);
                            }
                            throw new m("Invalid EnumSet type: " + type.toString());
                        }
                        throw new m("Invalid EnumSet type: " + type.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new h<T>() {
                    /* class com.google.gson.internal.c.AnonymousClass11 */

                    static {
                        Covode.recordClassIndex(34021);
                    }

                    @Override // com.google.gson.internal.h
                    public final T a() {
                        return (T) new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new h<T>() {
                    /* class com.google.gson.internal.c.AnonymousClass12 */

                    static {
                        Covode.recordClassIndex(34022);
                    }

                    @Override // com.google.gson.internal.h
                    public final T a() {
                        return (T) new ArrayDeque();
                    }
                };
            }
            return new h<T>() {
                /* class com.google.gson.internal.c.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(34023);
                }

                @Override // com.google.gson.internal.h
                public final T a() {
                    return (T) new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return new h<T>() {
                /* class com.google.gson.internal.c.AnonymousClass6 */

                /* renamed from: d  reason: collision with root package name */
                private final l f54860d = l.a();

                static {
                    Covode.recordClassIndex(34029);
                }

                @Override // com.google.gson.internal.h
                public final T a() {
                    try {
                        return (T) this.f54860d.a(cls);
                    } catch (Exception e2) {
                        throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
                    }
                }
            };
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new h<T>() {
                    /* class com.google.gson.internal.c.AnonymousClass14 */

                    static {
                        Covode.recordClassIndex(34024);
                    }

                    @Override // com.google.gson.internal.h
                    public final T a() {
                        return (T) new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new h<T>() {
                    /* class com.google.gson.internal.c.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(34025);
                    }

                    @Override // com.google.gson.internal.h
                    public final T a() {
                        return (T) new ConcurrentHashMap();
                    }
                };
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new h<T>() {
                    /* class com.google.gson.internal.c.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(34026);
                    }

                    @Override // com.google.gson.internal.h
                    public final T a() {
                        return (T) new TreeMap();
                    }
                };
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(a.get(((ParameterizedType) type).getActualTypeArguments()[0]).rawType)) {
                return new h<T>() {
                    /* class com.google.gson.internal.c.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(34028);
                    }

                    @Override // com.google.gson.internal.h
                    public final T a() {
                        return (T) new g();
                    }
                };
            }
            return new h<T>() {
                /* class com.google.gson.internal.c.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(34027);
                }

                @Override // com.google.gson.internal.h
                public final T a() {
                    return (T) new LinkedHashMap();
                }
            };
        }
    }
}
