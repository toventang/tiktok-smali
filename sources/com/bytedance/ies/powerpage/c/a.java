package com.bytedance.ies.powerpage.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34435a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20578);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(String str, Class<T> cls) {
        l.c(str, "");
        l.c(cls, "");
        return l.a(cls, Integer.class) ? (T) Integer.valueOf(Integer.parseInt(str)) : l.a(cls, Boolean.class) ? (T) Boolean.valueOf(Boolean.parseBoolean(str)) : l.a(cls, Short.class) ? (T) Short.valueOf(Short.parseShort(str)) : l.a(cls, Long.class) ? (T) Long.valueOf(Long.parseLong(str)) : l.a(cls, Float.class) ? (T) Float.valueOf(Float.parseFloat(str)) : l.a(cls, Double.class) ? (T) Double.valueOf(Double.parseDouble(str)) : l.a(cls, Byte.class) ? (T) Byte.valueOf(Byte.parseByte(str)) : l.a(cls, Character.class) ? (T) Character.valueOf(p.i((CharSequence) str)) : str;
    }
}
