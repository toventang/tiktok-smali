package com.google.b.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.b.a.g.a.a;
import com.google.b.a.g.b;
import com.google.b.a.g.c;
import com.google.b.a.g.d;
import com.google.b.a.g.f;
import com.google.b.a.g.j;
import com.google.b.a.g.m;
import com.google.b.a.g.n;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public final class i implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f53587a;

    static {
        String name;
        Covode.recordClassIndex(33153);
        e eVar = new e("application/x-www-form-urlencoded");
        Charset charset = c.f53618a;
        if (charset == null) {
            name = null;
        } else {
            name = charset.name();
        }
        eVar.a("charset", name);
        f53587a = eVar.a();
    }

    public static void a(Reader reader, Object obj) {
        j jVar;
        Map map;
        boolean z;
        ParameterizedType a2;
        Type type;
        Type type2;
        Class cls;
        MethodCollector.i(3613);
        Class<?> cls2 = obj.getClass();
        d a3 = d.a(cls2, false);
        List asList = Arrays.asList(cls2);
        if (j.class.isAssignableFrom(cls2)) {
            jVar = (j) obj;
        } else {
            jVar = null;
        }
        if (Map.class.isAssignableFrom(cls2)) {
            map = (Map) obj;
        } else {
            map = null;
        }
        b bVar = new b(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        boolean z2 = true;
        while (true) {
            int read = reader.read();
            if (read == -1 || read == 38) {
                String a4 = a.a(stringWriter.toString());
                if (a4.length() != 0) {
                    String a5 = a.a(stringWriter2.toString());
                    com.google.b.a.g.i a6 = a3.a(a4);
                    if (a6 != null) {
                        Type a7 = f.a((List<Type>) asList, a6.f53658b.getGenericType());
                        if ((a7 instanceof GenericArrayType) || ((a7 instanceof Class) && ((Class) a7).isArray())) {
                            Class<?> a8 = n.a(asList, n.a(a7));
                            Field field = a6.f53658b;
                            Object a9 = a(a8, asList, a5);
                            b.a aVar = bVar.f53613a.get(field);
                            if (aVar == null) {
                                aVar = new b.a(a8);
                                bVar.f53613a.put(field, aVar);
                            }
                            if (a8 == aVar.f53616a) {
                                z = true;
                            } else {
                                z = false;
                            }
                            com.google.b.a.f.a.a.a.a.b.a(z);
                            aVar.f53617b.add(a9);
                        } else {
                            Class<?> a10 = n.a(asList, a7);
                            if (a10.isAssignableFrom(Iterable.class) || Iterable.class.isAssignableFrom(a10)) {
                                Collection collection = (Collection) a6.a(obj);
                                if (collection == null) {
                                    if (a7 instanceof WildcardType) {
                                        type2 = n.a((WildcardType) a7);
                                    } else {
                                        type2 = a7;
                                    }
                                    if (type2 instanceof ParameterizedType) {
                                        type2 = ((ParameterizedType) type2).getRawType();
                                    }
                                    if (type2 instanceof Class) {
                                        cls = (Class) type2;
                                    } else {
                                        cls = null;
                                    }
                                    if (type2 != null && !(type2 instanceof GenericArrayType)) {
                                        if (cls == null) {
                                            String valueOf = String.valueOf(String.valueOf(type2));
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(new StringBuilder(valueOf.length() + 39).append("unable to create new instance of type: ").append(valueOf).toString());
                                            MethodCollector.o(3613);
                                            throw illegalArgumentException;
                                        } else if (!cls.isArray() && !cls.isAssignableFrom(ArrayList.class)) {
                                            if (cls.isAssignableFrom(HashSet.class)) {
                                                collection = new HashSet();
                                            } else if (cls.isAssignableFrom(TreeSet.class)) {
                                                collection = new TreeSet();
                                            } else {
                                                collection = (Collection) n.a(cls);
                                            }
                                            a6.a(obj, collection);
                                        }
                                    }
                                    collection = new ArrayList();
                                    a6.a(obj, collection);
                                }
                                if (a7 == Object.class || (a2 = n.a(a7, Iterable.class)) == null) {
                                    type = null;
                                } else {
                                    type = a2.getActualTypeArguments()[0];
                                    if (type instanceof TypeVariable) {
                                        Type a11 = n.a((List<Type>) Arrays.asList(a7), (TypeVariable<?>) ((TypeVariable) type));
                                        if (a11 != null) {
                                            type = a11;
                                        }
                                    }
                                }
                                collection.add(a(type, asList, a5));
                            } else {
                                a6.a(obj, a(a7, asList, a5));
                            }
                        }
                    } else if (map != null) {
                        ArrayList arrayList = (ArrayList) map.get(a4);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            if (jVar != null) {
                                jVar.b(a4, arrayList);
                            } else {
                                map.put(a4, arrayList);
                            }
                        }
                        arrayList.add(a5);
                    }
                }
                stringWriter = new StringWriter();
                stringWriter2 = new StringWriter();
                if (read == -1) {
                    bVar.a();
                    MethodCollector.o(3613);
                    return;
                }
                z2 = true;
            } else if (read == 61) {
                z2 = false;
            } else if (z2) {
                stringWriter.write(read);
            } else {
                stringWriter2.write(read);
            }
        }
    }

    private static Object a(Type type, List<Type> list, String str) {
        return f.a(f.a(list, type), str);
    }
}
