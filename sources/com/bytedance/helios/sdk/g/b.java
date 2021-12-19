package com.bytedance.helios.sdk.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.e;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.b.p;
import com.bytedance.helios.sdk.utils.f;
import h.f.b.l;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Calendar f30987a;

    /* renamed from: b  reason: collision with root package name */
    public static p f30988b;

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, e> f30989c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static Map<Integer, e> f30990d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final b f30991e = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(17998);
        Calendar instance = Calendar.getInstance();
        l.a((Object) instance, "");
        f30987a = instance;
    }

    public static boolean a(int i2) {
        String str;
        p pVar = f30988b;
        if (pVar == null) {
            return false;
        }
        e eVar = f30990d.get(Integer.valueOf(i2));
        if (eVar == null) {
            com.bytedance.helios.sdk.d.e b2 = com.bytedance.helios.sdk.e.b(i2);
            if (b2 != null) {
                str = b2.f30873a;
            } else {
                str = null;
            }
            eVar = f30989c.get(str);
            if (eVar == null) {
                eVar = pVar.f30696d;
            }
        }
        if (eVar.f30656a || eVar.f30657b) {
            return true;
        }
        return false;
    }

    public static boolean a(n nVar, e eVar) {
        if (l.a((Object) nVar.p, (Object) "SensitiveApiInterceptException")) {
            nVar.h(nVar.o + "intercept_error");
            return eVar.f30658c;
        }
        Set<Object> set = nVar.y.f30655g;
        if ((set == null || set.isEmpty()) && !nVar.u.contains("pair_monitor")) {
            nVar.h(nVar.o + "monitor_normal");
            return eVar.f30656a;
        }
        nVar.h(nVar.o + "monitor_error");
        return eVar.f30657b;
    }

    public static boolean a(long j2, double d2) {
        if (d2 <= 0.0d) {
            return false;
        }
        if (d2 >= 1.0d) {
            return true;
        }
        String plainString = new BigDecimal(String.valueOf(d2)).toPlainString();
        l.a((Object) plainString, "");
        String a2 = h.m.p.a(plainString, "0.", "");
        long parseLong = Long.parseLong(a2);
        long j3 = 1;
        for (int i2 = 0; i2 < a2.length(); i2++) {
            j3 *= 10;
        }
        long j4 = parseLong;
        long j5 = j3;
        while (j5 != 0) {
            j5 = j4 % j5;
            j4 = j5;
        }
        long j6 = parseLong / j4;
        long j7 = j3 / j4;
        long j8 = j2 % j7;
        int i3 = f30987a.get(6);
        long j9 = (((long) i3) % (j7 / j6)) * j6;
        long j10 = j6 + j9;
        f.a("Helios-Common-Env", "generateSampleRate hashCode=" + j2 + " sampleRateValue=" + j6 + '/' + j7 + '(' + d2 + ") dayOfYear=" + i3 + " range=" + j9 + '-' + j10, (String) null, 12);
        if (j8 < j9 || j8 >= j10) {
            return false;
        }
        return true;
    }
}
