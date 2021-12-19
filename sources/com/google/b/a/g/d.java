package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.b.a.f.a.a.a.a.b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Class<?>, d> f53620d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Map<Class<?>, d> f53621e = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f53622a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f53623b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f53624c;

    /* renamed from: f  reason: collision with root package name */
    private final IdentityHashMap<String, i> f53625f = new IdentityHashMap<>();

    static {
        Covode.recordClassIndex(33178);
    }

    public final i a(String str) {
        if (str != null) {
            if (this.f53623b) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return this.f53625f.get(str);
    }

    public static d a(Class<?> cls, boolean z) {
        Map<Class<?>, d> map;
        d dVar;
        MethodCollector.i(3926);
        if (cls == null) {
            MethodCollector.o(3926);
            return null;
        }
        if (z) {
            map = f53621e;
        } else {
            map = f53620d;
        }
        synchronized (map) {
            try {
                dVar = map.get(cls);
                if (dVar == null) {
                    dVar = new d(cls, z);
                    map.put(cls, dVar);
                }
            } finally {
                MethodCollector.o(3926);
            }
        }
        return dVar;
    }

    private d(Class<?> cls, boolean z) {
        boolean z2;
        List<String> unmodifiableList;
        boolean z3;
        String str;
        Field field;
        this.f53622a = cls;
        this.f53623b = z;
        if (!z || !cls.isEnum()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String valueOf = String.valueOf(String.valueOf(cls));
        b.a(z2, new StringBuilder(valueOf.length() + 31).append("cannot ignore case on an enum: ").append(valueOf).toString());
        TreeSet treeSet = new TreeSet(new Comparator<String>() {
            /* class com.google.b.a.g.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33179);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                if (str3 == str4) {
                    return 0;
                }
                if (str3 == null) {
                    return -1;
                }
                if (str4 == null) {
                    return 1;
                }
                return str3.compareTo(str4);
            }
        });
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field2 : declaredFields) {
            i a2 = i.a(field2);
            if (a2 != null) {
                String str2 = a2.f53659c;
                str2 = z ? str2.toLowerCase().intern() : str2;
                i iVar = this.f53625f.get(str2);
                if (iVar == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object[] objArr = new Object[4];
                if (z) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = field2;
                if (iVar == null) {
                    field = null;
                } else {
                    field = iVar.f53658b;
                }
                objArr[3] = field;
                b.a(z3, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.f53625f.put(str2, a2);
                treeSet.add(str2);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            d a3 = a(superclass, z);
            treeSet.addAll(a3.f53624c);
            for (Map.Entry<String, i> entry : a3.f53625f.entrySet()) {
                String key = entry.getKey();
                if (!this.f53625f.containsKey(key)) {
                    this.f53625f.put(key, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.f53624c = unmodifiableList;
    }
}
