package com.ss.videoarch.strategy.inferenceEngine.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f154499a = 600;

    /* renamed from: b  reason: collision with root package name */
    public static int f154500b = 1000;

    /* renamed from: c  reason: collision with root package name */
    public static int f154501c = 20;

    /* renamed from: d  reason: collision with root package name */
    public static double f154502d = 0.1d;

    /* renamed from: e  reason: collision with root package name */
    int f154503e;

    /* renamed from: f  reason: collision with root package name */
    public int f154504f = f154499a;

    /* renamed from: g  reason: collision with root package name */
    public int f154505g = f154500b;

    /* renamed from: h  reason: collision with root package name */
    public double f154506h = f154502d;

    /* renamed from: i  reason: collision with root package name */
    public int f154507i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public int[] f154508j = {8, 7, 6, 5, 4, 3, 2};

    /* renamed from: k  reason: collision with root package name */
    public ConcurrentHashMap<Integer, Pair> f154509k = new ConcurrentHashMap<>();

    /* renamed from: l  reason: collision with root package name */
    public String f154510l = null;

    /* renamed from: m  reason: collision with root package name */
    public Map<String, com.ss.videoarch.strategy.inferenceEngine.b.a.a> f154511m = new LinkedHashMap<String, com.ss.videoarch.strategy.inferenceEngine.b.a.a>() {
        /* class com.ss.videoarch.strategy.inferenceEngine.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(102946);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, com.ss.videoarch.strategy.inferenceEngine.b.a.a> entry) {
            if (size() > 20) {
                return true;
            }
            return false;
        }
    };

    static {
        Covode.recordClassIndex(102945);
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject optJSONObject;
        JSONObject jSONObject4 = null;
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has("LowLatencyFlvDefaultStrategy") || (optJSONObject = jSONObject.optJSONObject("LowLatencyFlvDefaultStrategy")) == null || !optJSONObject.has("netEffectiveConnectionTypeStrategy")) {
            jSONObject2 = null;
        } else {
            jSONObject2 = optJSONObject.optJSONObject("netEffectiveConnectionTypeStrategy");
        }
        if (str.length() == 0) {
            return null;
        }
        try {
            jSONObject3 = new JSONObject(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject3 = null;
        }
        if (jSONObject3 == null) {
            return null;
        }
        int optInt = jSONObject3.optInt("net_effective_connection_type");
        if (optInt == 1) {
            optInt = 7;
        }
        if (jSONObject2 == null || !jSONObject2.has(String.valueOf(optInt))) {
            return null;
        }
        try {
            jSONObject4 = jSONObject2.getJSONObject(String.valueOf(optInt));
            return jSONObject4;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return jSONObject4;
        }
    }

    public final <T> T a(T t, String str, String str2) {
        JSONObject jSONObject;
        int i2;
        double d2;
        String str3;
        com.ss.videoarch.strategy.inferenceEngine.b.a.a aVar;
        if (str2.length() == 0) {
            return t;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return t;
        }
        int optInt = jSONObject.optInt("net_effective_connection_type");
        if (optInt == 1) {
            optInt = 7;
        }
        Pair pair = this.f154509k.get(Integer.valueOf(optInt));
        if (pair == null) {
            return t;
        }
        try {
            jSONObject2 = new JSONObject(str);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        if (jSONObject2 == null) {
            return t;
        }
        int i3 = 0;
        if (jSONObject2.has("retryTotalCount")) {
            i2 = jSONObject2.optInt("retryTotalCount");
        } else {
            i2 = 0;
        }
        if (jSONObject2.has("stallTotalCount")) {
            i3 = jSONObject2.optInt("stallTotalCount");
        }
        if (i2 != this.f154503e || (str3 = this.f154510l) == null || (aVar = this.f154511m.get(str3)) == null) {
            d2 = 1.0d;
        } else {
            i3 = aVar.f154513b;
            i2 = aVar.f154514c;
            double d3 = this.f154506h;
            double currentTimeMillis = (double) (System.currentTimeMillis() - aVar.f154515d);
            Double.isNaN(currentTimeMillis);
            double d4 = d3 * currentTimeMillis;
            double d5 = (double) this.f154507i;
            Double.isNaN(d5);
            d2 = 1.0d / Math.exp(d4 / d5);
        }
        double d6 = (double) i2;
        Double.isNaN(d6);
        double d7 = (double) i3;
        Double.isNaN(d7);
        int i4 = (int) ((d6 * 0.41935483870967744d) + (d7 * 0.5806451612903226d));
        int intValue = ((Integer) pair.second).intValue() - ((Integer) pair.first).intValue();
        if (i4 < f154501c) {
            double d8 = (double) intValue;
            Double.isNaN(d8);
            intValue = (int) (((1.0d / (Math.exp((double) (-i4)) + 1.0d)) - 0.5d) * 2.0d * d8);
        }
        double d9 = (double) intValue;
        Double.isNaN(d9);
        return (T) Long.valueOf((long) (((Integer) pair.first).intValue() + ((int) (d2 * d9))));
    }
}
