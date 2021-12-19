package com.ss.android.ugc.playerkit.exp;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f148663a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f148664b;

    /* renamed from: c  reason: collision with root package name */
    private final T f148665c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f148666d;

    static {
        Covode.recordClassIndex(97979);
    }

    public final T a() {
        if (PlayerSettingService.getInstance() != null) {
            T t = (T) PlayerSettingService.getInstance().get(this.f148663a, this.f148664b, this.f148665c, this.f148666d);
            if (PlayerSettingService.isDebug()) {
                new StringBuilder("key ").append(this.f148663a).append(" type ").append(this.f148664b).append(" default ").append((Object) this.f148665c).append(" sticky ").append(this.f148666d).append(" value ").append((Object) t);
            }
            return t;
        } else if (!PlayerSettingService.isDebug()) {
            return this.f148665c;
        } else {
            throw new RuntimeException("Call getValue before PlayerSettingService init");
        }
    }

    public a(String str, T t) {
        this(str, (Class) t.getClass(), (Object) t);
    }

    private a(String str, Class<T> cls, T t) {
        this(str, (Class) cls, (Object) t, (byte) 0);
    }

    public a(String str, Type type, T t) {
        this(str, type, t, (byte) 0);
    }

    private a(String str, Class<T> cls, T t, byte b2) {
        this.f148663a = str;
        this.f148665c = t;
        this.f148664b = cls;
        this.f148666d = true;
    }

    private a(String str, Type type, T t, byte b2) {
        this.f148663a = str;
        this.f148665c = t;
        this.f148664b = type;
        this.f148666d = true;
    }
}
