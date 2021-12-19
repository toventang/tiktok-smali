package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class dg {

    /* renamed from: a  reason: collision with root package name */
    private static f f142820a;

    static {
        Covode.recordClassIndex(93432);
    }

    public static f a() {
        if (f142820a == null) {
            f142820a = new f();
        }
        return f142820a;
    }

    public static <T> T a(String str, Class<T> cls) {
        return (T) a().a(str, (Class) cls);
    }

    public static <T> List<T> b(String str, Class<T[]> cls) {
        Object[] objArr = (Object[]) a().a(str, (Class) cls);
        if (objArr == null) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }
}
