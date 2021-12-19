package com.bytedance.android.live.liveinteract.api.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f10012a = i.a((h.f.a.a) a.f10013a);

    static {
        Covode.recordClassIndex(5184);
    }

    public final HashMap<String, Object> a() {
        return (HashMap) this.f10012a.getValue();
    }

    static final class a extends m implements h.f.a.a<HashMap<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10013a = new a();

        static {
            Covode.recordClassIndex(5185);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, Object> invoke() {
            return new HashMap();
        }
    }

    public final Object a(String str) {
        l.d(str, "");
        return a().get(str);
    }

    public final void a(Object obj) {
        boolean z;
        String str;
        l.d(obj, "");
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        while (cls != null && (!l.a(cls, Object.class))) {
            Field[] declaredFields = cls.getDeclaredFields();
            l.b(declaredFields, "");
            n.a((Collection) arrayList, (Object[]) declaredFields);
            cls = cls.getSuperclass();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Field) obj2).getAnnotation(d.class) != null) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<Field> arrayList3 = arrayList2;
        ArrayList<p> arrayList4 = new ArrayList(n.a((Iterable) arrayList3, 10));
        for (Field field : arrayList3) {
            d dVar = (d) field.getAnnotation(d.class);
            if (dVar != null) {
                str = dVar.a();
            } else {
                str = null;
            }
            arrayList4.add(v.a(field, str));
        }
        for (p pVar : arrayList4) {
            Object obj3 = a().get(pVar.getSecond());
            d dVar2 = (d) ((Field) pVar.getFirst()).getAnnotation(d.class);
            if (dVar2 != null) {
                z = dVar2.b();
            } else {
                z = false;
            }
            if (obj3 != null) {
                ((Field) pVar.getFirst()).setAccessible(true);
                ((Field) pVar.getFirst()).set(obj, a().get(pVar.getSecond()));
            } else if (!z) {
                throw new IllegalStateException(((String) pVar.getSecond()) + " has not provided, please check it's provider");
            }
        }
    }

    public final void b(Object obj) {
        String str;
        l.d(obj, "");
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        while (cls != null && (!l.a(cls, Object.class))) {
            Field[] declaredFields = cls.getDeclaredFields();
            l.b(declaredFields, "");
            n.a((Collection) arrayList, (Object[]) declaredFields);
            cls = cls.getSuperclass();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Field) obj2).getAnnotation(c.class) != null) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<Field> arrayList3 = arrayList2;
        ArrayList<p> arrayList4 = new ArrayList(n.a((Iterable) arrayList3, 10));
        for (Field field : arrayList3) {
            c cVar = (c) field.getAnnotation(c.class);
            if (cVar != null) {
                str = cVar.a();
            } else {
                str = null;
            }
            arrayList4.add(v.a(field, str));
        }
        for (p pVar : arrayList4) {
            if (a().get(pVar.getSecond()) == null) {
                com.bytedance.android.live.core.c.a.a("Injector", new IllegalStateException(((String) pVar.getSecond()) + " has not provided, please check it's provider"));
            } else {
                ((Field) pVar.getFirst()).setAccessible(true);
                ((Field) pVar.getFirst()).set(obj, a().get(pVar.getSecond()));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.c.a
    public final void a(Object obj, String str) {
        String a2;
        l.d(obj, "");
        f fVar = (f) obj.getClass().getAnnotation(f.class);
        if (fVar != null && (a2 = fVar.a()) != null) {
            str = a2;
        } else if (str == null) {
            return;
        }
        a().get(str);
        a().put(str, obj);
    }
}
