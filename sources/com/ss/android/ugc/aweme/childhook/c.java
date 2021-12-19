package com.ss.android.ugc.aweme.childhook;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.childhook.a.b.a;
import h.f.b.l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f70251a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(43342);
    }

    public static void a() {
        Class<?> cls;
        Field field;
        try {
            Class<?> cls2 = Class.forName("android.app.ActivityThread");
            Method method = cls2.getMethod("currentActivityThread", new Class[0]);
            l.b(method, "");
            method.setAccessible(true);
            Object invoke = method.invoke(cls2, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mBoundApplication");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = obj.getClass().getDeclaredField("providers");
            l.b(declaredField2, "");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    Object obj4 = null;
                    if (!(obj3 == null || (cls = obj3.getClass()) == null || (field = cls.getField(StringSet.name)) == null)) {
                        obj4 = field.get(obj3);
                    }
                    String str = (String) obj4;
                    if (str == null) {
                        str = "";
                    }
                    if (a(str) && obj3 != null) {
                        arrayList.add(obj3);
                    }
                }
                declaredField2.set(obj, arrayList);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
        } catch (Exception e2) {
            e2.printStackTrace();
            b.a(e2, "ChildContentProviderHook.startHook");
        }
    }

    private static boolean a(String str) {
        l.d(str, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new com.ss.android.ugc.aweme.childhook.a.b.b());
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((com.ss.android.ugc.aweme.childhook.a.b.c) arrayList.get(i2)).a(str)) {
                    return ((com.ss.android.ugc.aweme.childhook.a.b.c) arrayList.get(i2)).b(str);
                }
            }
        }
        return true;
    }
}
