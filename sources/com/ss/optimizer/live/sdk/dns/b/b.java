package com.ss.optimizer.live.sdk.dns.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.optimizer.live.sdk.dns.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static int f151729a = 600;

    /* renamed from: b  reason: collision with root package name */
    public static int f151730b = 1000;

    /* renamed from: c  reason: collision with root package name */
    public static int f151731c = 20;

    /* renamed from: d  reason: collision with root package name */
    public static double f151732d = 0.1d;
    private static b n;

    /* renamed from: e  reason: collision with root package name */
    public d f151733e;

    /* renamed from: f  reason: collision with root package name */
    public String f151734f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, a> f151735g = new LinkedHashMap<String, a>() {
        /* class com.ss.optimizer.live.sdk.dns.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(101208);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, a> entry) {
            if (size() > 20) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: h  reason: collision with root package name */
    public int[] f151736h = {8, 7, 6, 5, 4, 3, 2};

    /* renamed from: i  reason: collision with root package name */
    public ConcurrentHashMap<Integer, Pair> f151737i = new ConcurrentHashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public int f151738j = f151729a;

    /* renamed from: k  reason: collision with root package name */
    public int f151739k = f151730b;

    /* renamed from: l  reason: collision with root package name */
    public double f151740l = f151732d;

    /* renamed from: m  reason: collision with root package name */
    public int f151741m = 1000;

    static {
        Covode.recordClassIndex(101207);
    }

    public static b a() {
        MethodCollector.i(4828);
        if (n == null) {
            synchronized (b.class) {
                try {
                    if (n == null) {
                        n = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4828);
                    throw th;
                }
            }
        }
        b bVar = n;
        MethodCollector.o(4828);
        return bVar;
    }

    public final JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        d dVar = this.f151733e;
        JSONObject jSONObject3 = null;
        if (dVar == null) {
            return null;
        }
        String str = (String) dVar.a("TTNet_NQE_INFO", "");
        if (str.length() == 0) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return null;
        }
        int optInt = jSONObject2.optInt("net_effective_connection_type");
        if (optInt == 1) {
            optInt = 7;
        }
        if (jSONObject == null || !jSONObject.has(String.valueOf(optInt))) {
            return null;
        }
        try {
            jSONObject3 = jSONObject.getJSONObject(String.valueOf(optInt));
            return jSONObject3;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return jSONObject3;
        }
    }

    public final long a(long j2, int i2, int i3) {
        double d2;
        String str;
        a aVar;
        d dVar = this.f151733e;
        if (dVar == null) {
            return j2;
        }
        String str2 = (String) dVar.a("TTNet_NQE_INFO", "");
        if (str2.length() == 0) {
            return j2;
        }
        try {
            int optInt = new JSONObject(str2).optInt("net_effective_connection_type");
            if (optInt == 1) {
                optInt = 7;
            }
            Pair pair = this.f151737i.get(Integer.valueOf(optInt));
            if (pair == null) {
                return j2;
            }
            if (i3 != 0 || (str = this.f151734f) == null || (aVar = this.f151735g.get(str)) == null) {
                d2 = 1.0d;
            } else {
                i2 = aVar.f151726b;
                i3 = aVar.f151727c;
                double d3 = this.f151740l;
                double currentTimeMillis = (double) (System.currentTimeMillis() - aVar.f151728d);
                Double.isNaN(currentTimeMillis);
                double d4 = d3 * currentTimeMillis;
                double d5 = (double) this.f151741m;
                Double.isNaN(d5);
                d2 = 1.0d / Math.exp(d4 / d5);
            }
            double d6 = (double) i3;
            Double.isNaN(d6);
            double d7 = (double) i2;
            Double.isNaN(d7);
            int i4 = (int) ((d6 * 0.41935483870967744d) + (d7 * 0.5806451612903226d));
            int intValue = ((Integer) pair.second).intValue() - ((Integer) pair.first).intValue();
            if (i4 < f151731c) {
                double d8 = (double) intValue;
                Double.isNaN(d8);
                intValue = (int) (((1.0d / (Math.exp((double) (-i4)) + 1.0d)) - 0.5d) * 2.0d * d8);
            }
            double d9 = (double) intValue;
            Double.isNaN(d9);
            return (long) (((Integer) pair.first).intValue() + ((int) (d2 * d9)));
        } catch (JSONException e2) {
            e2.printStackTrace();
            return j2;
        }
    }
}
