package com.bytedance.android.livesdk.ao;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public String f13991a;

    /* renamed from: b  reason: collision with root package name */
    public String f13992b;

    /* renamed from: c  reason: collision with root package name */
    public T f13993c;

    /* renamed from: d  reason: collision with root package name */
    public Class<T> f13994d;

    static {
        Covode.recordClassIndex(7766);
    }

    public T a() {
        return (T) d.a(this);
    }

    public void a(T t) {
        String str = this.f13992b;
        if (t == null) {
            d.a(str).edit().remove(this.f13991a).apply();
            return;
        }
        Class<T> cls = this.f13994d;
        if (cls == Boolean.class) {
            d.a(str).edit().putBoolean(this.f13991a, t.booleanValue()).apply();
        } else if (cls == Integer.class) {
            d.a(str).edit().putInt(this.f13991a, t.intValue()).apply();
        } else if (cls == Float.class) {
            d.a(str).edit().putFloat(this.f13991a, t.floatValue()).apply();
        } else if (cls == Long.class) {
            d.a(str).edit().putLong(this.f13991a, t.longValue()).apply();
        } else if (cls == Double.class) {
            d.a(str).edit().putString(this.f13991a, String.valueOf(t.doubleValue())).apply();
        } else if (cls == String.class) {
            d.a(str).edit().putString(this.f13991a, t).apply();
        } else {
            Map<String, Object> map = d.f13995a.get(str);
            if (map != null) {
                map.put(this.f13991a, t);
            }
            d.a(str).edit().putString(this.f13991a, d.f13996b.b(t)).apply();
        }
    }

    public c(String str, Class<T> cls) {
        this("tt_live_sdk", str, cls, null);
    }

    public c(String str, T t) {
        this("tt_live_sdk", str, t.getClass(), t);
    }

    public c(String str, String str2, T t) {
        this(str, str2, t.getClass(), t);
    }

    private c(String str, String str2, Class<T> cls, T t) {
        this.f13992b = str;
        this.f13991a = str2;
        this.f13993c = t;
        this.f13994d = cls;
        if (t != null) {
            return;
        }
        if (cls == Integer.class || cls == Short.class) {
            this.f13993c = (T) 0;
        } else if (cls == Long.class) {
            this.f13993c = (T) 0L;
        } else if (cls == Double.class) {
            this.f13993c = (T) Double.valueOf(0.0d);
        } else if (cls == Float.class) {
            this.f13993c = (T) Float.valueOf(0.0f);
        } else if (cls == Boolean.class) {
            this.f13993c = (T) false;
        }
    }
}
