package com.bytedance.android.livesdk.util;

import android.text.TextUtils;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.l;
import com.google.gson.p;
import com.google.gson.q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static q f22112a = new q();

    static {
        Covode.recordClassIndex(13023);
    }

    public static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return e.a.f9628b.b(obj);
        } catch (Throwable th) {
            throw new p(th);
        }
    }

    public static <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        try {
            return (T) e.a.f9628b.a(str, type);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) e.a.f9628b.a(str, (Class) cls);
        } catch (Throwable th) {
            throw new p(th);
        }
    }

    public static <T> List<T> b(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<l> it = q.a(str).k().iterator();
        while (it.hasNext()) {
            arrayList.add(e.a.f9628b.a(it.next(), (Class) cls));
        }
        return arrayList;
    }
}
