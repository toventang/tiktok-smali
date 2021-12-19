package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final com.bytedance.push.settings.storage.h f42313a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f42314b;

    /* renamed from: c  reason: collision with root package name */
    private static final g f42315c = new g();

    static {
        Covode.recordClassIndex(25851);
        com.bytedance.push.settings.storage.h hVar = new com.bytedance.push.settings.storage.h();
        f42313a = hVar;
        f42314b = new f(hVar);
    }

    public static <T> T a(Context context, Class<T> cls) {
        if (ISettings.class.isAssignableFrom(cls)) {
            return (T) f42315c.a(context, cls);
        }
        if (ILocalSettings.class.isAssignableFrom(cls)) {
            return (T) f42314b.a(context, cls);
        }
        throw new IllegalArgumentException("tClass must be child of ISettings or ILocalSettings");
    }
}
