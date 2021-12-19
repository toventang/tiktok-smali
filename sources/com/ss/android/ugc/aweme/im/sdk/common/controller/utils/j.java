package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson.BooleanDefaultFalseAdapter;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson.IntegerDefaultZeroAdater;
import h.f.b.l;
import java.lang.reflect.Type;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f102418a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final f f102419b;

    private j() {
    }

    static {
        Covode.recordClassIndex(65566);
        f b2 = new g().a((Type) Boolean.TYPE, (Object) new BooleanDefaultFalseAdapter()).a((Type) Integer.TYPE, (Object) new IntegerDefaultZeroAdater()).a((Type) Boolean.TYPE, (Object) new BooleanDefaultFalseAdapter()).b();
        l.b(b2, "");
        f102419b = b2;
    }

    public static final String a(Object obj) {
        String b2 = f102419b.b(obj);
        l.b(b2, "");
        return b2;
    }

    public static final <T> T a(String str, Class<T> cls) {
        l.d(cls, "");
        return (T) f102419b.a(str, (Class) cls);
    }
}
