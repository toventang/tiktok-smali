package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.a;
import com.google.gson.internal.f;
import java.math.BigInteger;

public final class r extends l {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f54899b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f54900a;

    @Override // com.google.gson.l
    public final /* bridge */ /* synthetic */ l i() {
        return this;
    }

    @Override // com.google.gson.l
    public final String c() {
        Object obj = this.f54900a;
        if (obj instanceof Number) {
            return b().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    @Override // com.google.gson.l
    public final double d() {
        if (this.f54900a instanceof Number) {
            return b().doubleValue();
        }
        return Double.parseDouble(c());
    }

    @Override // com.google.gson.l
    public final float e() {
        if (this.f54900a instanceof Number) {
            return b().floatValue();
        }
        return Float.parseFloat(c());
    }

    @Override // com.google.gson.l
    public final long f() {
        if (this.f54900a instanceof Number) {
            return b().longValue();
        }
        return Long.parseLong(c());
    }

    @Override // com.google.gson.l
    public final int g() {
        if (this.f54900a instanceof Number) {
            return b().intValue();
        }
        return Integer.parseInt(c());
    }

    @Override // com.google.gson.l
    public final boolean h() {
        Object obj = this.f54900a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(c());
    }

    @Override // com.google.gson.l
    public final Number b() {
        Object obj = this.f54900a;
        if (obj instanceof String) {
            return new f((String) this.f54900a);
        }
        return (Number) obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f54900a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = b().longValue();
        } else {
            Object obj = this.f54900a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    static {
        Covode.recordClassIndex(34063);
    }

    public r(Boolean bool) {
        a(bool);
    }

    public r(Number number) {
        a(number);
    }

    r(Object obj) {
        a(obj);
    }

    private static boolean a(r rVar) {
        Object obj = rVar.f54900a;
        if (!(obj instanceof Number)) {
            return false;
        }
        if ((obj instanceof BigInteger) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return true;
        }
        return false;
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f54899b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public r(String str) {
        a(str);
    }

    private void a(Object obj) {
        boolean z;
        if (obj instanceof Character) {
            this.f54900a = String.valueOf(((Character) obj).charValue());
            return;
        }
        if ((obj instanceof Number) || b(obj)) {
            z = true;
        } else {
            z = false;
        }
        a.a(z);
        this.f54900a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f54900a == null) {
            if (rVar.f54900a == null) {
                return true;
            }
            return false;
        } else if (!a(this) || !a(rVar)) {
            Object obj2 = this.f54900a;
            if (!(obj2 instanceof Number) || !(rVar.f54900a instanceof Number)) {
                return obj2.equals(rVar.f54900a);
            }
            double doubleValue = b().doubleValue();
            double doubleValue2 = rVar.b().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                return true;
            }
            return false;
        } else if (b().longValue() == rVar.b().longValue()) {
            return true;
        } else {
            return false;
        }
    }
}
