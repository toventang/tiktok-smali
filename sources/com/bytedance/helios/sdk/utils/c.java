package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.api.c.b;
import com.google.gson.f;
import h.a.ag;
import h.a.i;
import h.f.b.l;
import h.p;
import h.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30999a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final f f31000b = new f();

    private c() {
    }

    static {
        Covode.recordClassIndex(18006);
    }

    public static final String a(Object obj) {
        if (obj == null) {
            return "";
        }
        String b2 = f31000b.b(obj);
        l.a((Object) b2, "");
        return b2;
    }

    public static final <T> T a(String str, Type type) {
        l.c(type, "");
        try {
            return (T) f31000b.a(str, type);
        } catch (Exception e2) {
            p[] pVarArr = new p[1];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = v.a("json_string", str);
            o.a(new b(null, e2, "label_gson_utils", ag.b(pVarArr), 1));
            return null;
        }
    }

    public static final <T> T b(String str, Class<T> cls) {
        l.c(cls, "");
        try {
            return (T) f31000b.a(str, (Class) cls);
        } catch (Exception e2) {
            p[] pVarArr = new p[1];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = v.a("json_string", str);
            o.a(new b(null, e2, "label_gson_utils", ag.b(pVarArr), 1));
            return null;
        }
    }

    public static final <T> List<T> a(String str, Class<T[]> cls) {
        l.c(cls, "");
        try {
            Object[] objArr = (Object[]) f31000b.a(str, (Class) cls);
            if (objArr != null) {
                return i.k(objArr);
            }
            return new ArrayList();
        } catch (Exception e2) {
            p[] pVarArr = new p[1];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = v.a("json_string", str);
            o.a(new b(null, e2, "label_gson_utils", ag.b(pVarArr), 1));
            return new ArrayList();
        }
    }
}
