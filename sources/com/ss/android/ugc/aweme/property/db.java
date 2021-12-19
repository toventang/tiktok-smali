package com.ss.android.ugc.aweme.property;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.k;

public final class db {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f118436a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.c.a<String, Object> f118437b = new androidx.c.a<>();

    public interface a {
        static {
            Covode.recordClassIndex(76928);
        }

        String a();

        b b();

        Object c();
    }

    static {
        Covode.recordClassIndex(76927);
    }

    public final synchronized void a() {
        MethodCollector.i(3393);
        this.f118437b.clear();
        this.f118436a.edit().clear().apply();
        MethodCollector.o(3393);
    }

    public enum b {
        Boolean,
        Integer,
        Long,
        Float,
        String;

        static {
            Covode.recordClassIndex(76929);
        }
    }

    public db(SharedPreferences sharedPreferences) {
        this.f118436a = sharedPreferences;
    }

    public final synchronized boolean f(a aVar) {
        boolean contains;
        MethodCollector.i(3387);
        contains = this.f118436a.contains(aVar.a());
        MethodCollector.o(3387);
        return contains;
    }

    public final synchronized void g(a aVar) {
        MethodCollector.i(3390);
        this.f118437b.remove(aVar.a());
        this.f118436a.edit().remove(aVar.a()).apply();
        MethodCollector.o(3390);
    }

    public final synchronized int b(a aVar) {
        boolean z;
        int intValue;
        MethodCollector.i(2971);
        if (aVar.b() == b.Integer) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        Integer num = (Integer) this.f118437b.get(aVar.a());
        if (num == null) {
            num = Integer.valueOf(this.f118436a.getInt(aVar.a(), ((Integer) aVar.c()).intValue()));
            this.f118437b.put(aVar.a(), num);
        }
        intValue = num.intValue();
        MethodCollector.o(2971);
        return intValue;
    }

    public final synchronized long c(a aVar) {
        boolean z;
        long longValue;
        MethodCollector.i(2974);
        if (aVar.b() == b.Long) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        Long l2 = (Long) this.f118437b.get(aVar.a());
        if (l2 == null) {
            l2 = Long.valueOf(this.f118436a.getLong(aVar.a(), ((Long) aVar.c()).longValue()));
            this.f118437b.put(aVar.a(), l2);
        }
        longValue = l2.longValue();
        MethodCollector.o(2974);
        return longValue;
    }

    public final synchronized float d(a aVar) {
        boolean z;
        float floatValue;
        MethodCollector.i(2976);
        if (aVar.b() == b.Float) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        Float f2 = (Float) this.f118437b.get(aVar.a());
        if (f2 == null) {
            f2 = Float.valueOf(this.f118436a.getFloat(aVar.a(), ((Float) aVar.c()).floatValue()));
            this.f118437b.put(aVar.a(), f2);
        }
        floatValue = f2.floatValue();
        MethodCollector.o(2976);
        return floatValue;
    }

    public final synchronized String e(a aVar) {
        boolean z;
        String str;
        MethodCollector.i(2980);
        if (aVar.b() == b.String) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        str = (String) this.f118437b.get(aVar.a());
        if (str == null) {
            str = this.f118436a.getString(aVar.a(), (String) aVar.c());
            this.f118437b.put(aVar.a(), str);
        }
        MethodCollector.o(2980);
        return str;
    }

    public final synchronized boolean a(a aVar) {
        boolean z;
        boolean booleanValue;
        MethodCollector.i(2969);
        if (aVar.b() == b.Boolean) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        Boolean bool = (Boolean) this.f118437b.get(aVar.a());
        if (bool == null) {
            bool = Boolean.valueOf(this.f118436a.getBoolean(aVar.a(), ((Boolean) aVar.c()).booleanValue()));
            this.f118437b.put(aVar.a(), bool);
        }
        booleanValue = bool.booleanValue();
        MethodCollector.o(2969);
        return booleanValue;
    }

    public final synchronized void a(a aVar, float f2) {
        boolean z;
        MethodCollector.i(2978);
        if (aVar.b() == b.Float) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        this.f118437b.put(aVar.a(), Float.valueOf(f2));
        this.f118436a.edit().putFloat(aVar.a(), f2).apply();
        MethodCollector.o(2978);
    }

    public final synchronized void a(a aVar, int i2) {
        boolean z;
        MethodCollector.i(2972);
        if (aVar.b() == b.Integer) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        this.f118437b.put(aVar.a(), Integer.valueOf(i2));
        this.f118436a.edit().putInt(aVar.a(), i2).apply();
        MethodCollector.o(2972);
    }

    public final synchronized void a(a aVar, long j2) {
        boolean z;
        MethodCollector.i(2975);
        if (aVar.b() == b.Long) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        this.f118437b.put(aVar.a(), Long.valueOf(j2));
        this.f118436a.edit().putLong(aVar.a(), j2).apply();
        MethodCollector.o(2975);
    }

    public final synchronized void a(a aVar, String str) {
        boolean z;
        MethodCollector.i(3385);
        if (aVar.b() == b.String) {
            z = true;
        } else {
            z = false;
        }
        k.a(z);
        this.f118437b.put(aVar.a(), str);
        this.f118436a.edit().putString(aVar.a(), str).apply();
        MethodCollector.o(3385);
    }

    public final synchronized void a(a aVar, boolean z) {
        boolean z2;
        Boolean bool;
        MethodCollector.i(2970);
        if (aVar.b() == b.Boolean) {
            z2 = true;
        } else {
            z2 = false;
        }
        k.a(z2);
        androidx.c.a<String, Object> aVar2 = this.f118437b;
        String a2 = aVar.a();
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        aVar2.put(a2, bool);
        this.f118436a.edit().putBoolean(aVar.a(), z).apply();
        MethodCollector.o(2970);
    }
}
