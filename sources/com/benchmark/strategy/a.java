package com.benchmark.strategy;

import com.benchmark.strategy.nativePort.BTCDataProviderPort;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f6346b = new a();

    /* renamed from: a  reason: collision with root package name */
    public BTCDataProviderPort f6347a = new BTCDataProviderPort();

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6348c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(3047);
    }

    private a() {
    }

    public final float a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        float f2 = this.f6347a.getFloat(0, str, 0.0f);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            jSONObject.put("appid", 0);
            jSONObject.put("request_key", str);
            com.benchmark.a.a.a("bytebench_strategy_get_operation_cost_time", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return f2;
    }

    public final void a(int i2, String str, float f2) {
        this.f6347a.storeFloat(i2, str, false, f2);
    }

    public final void a(int i2, String str, boolean z, String str2) {
        this.f6347a.storeString(i2, str, z, str2);
    }
}
