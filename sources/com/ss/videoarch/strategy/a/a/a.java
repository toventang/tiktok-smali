package com.ss.videoarch.strategy.a.a;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.ss.videoarch.strategy.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f154392a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public b f154393b = null;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.videoarch.strategy.a f154394c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Integer> f154395d = new ArrayMap();

    /* renamed from: e  reason: collision with root package name */
    public Map<String, JSONObject> f154396e = new ArrayMap();

    /* renamed from: f  reason: collision with root package name */
    public Map<String, C4108a> f154397f;

    /* renamed from: g  reason: collision with root package name */
    public long f154398g = 300000;

    /* renamed from: h  reason: collision with root package name */
    public int f154399h = 50;

    /* renamed from: i  reason: collision with root package name */
    private final String f154400i = "quic";

    static {
        Covode.recordClassIndex(102917);
    }

    public final void a() {
        for (String str : this.f154397f.keySet()) {
            C4108a aVar = this.f154397f.get(str);
            if (aVar != null) {
                long j2 = aVar.f154402b;
                if (j2 > 0 && System.currentTimeMillis() - j2 > this.f154398g) {
                    this.f154397f.remove(str);
                }
            }
        }
    }

    public a(b bVar) {
        if (bVar != null) {
            this.f154393b = bVar;
        }
    }

    public final void a(String str) {
        String optString;
        com.ss.videoarch.strategy.a aVar = this.f154394c;
        if (aVar != null) {
            String str2 = (String) aVar.a("live_stream_strategy_preconnect_protocol", "{}");
            this.f154392a = (List) this.f154394c.a("live_stream_strategy_preconnect_domains", new ArrayList());
            String str3 = (String) this.f154394c.a("live_stream_strategy_peconnect_params", "{}");
            this.f154398g = ((Long) this.f154394c.a("live_stream_strategy_peconnect_result_ttl", 300000L)).longValue();
            this.f154399h = ((Integer) this.f154394c.a("live_stream_strategy_peconnect_result_capacity", 50)).intValue();
            this.f154397f = new ArrayMap(this.f154399h);
            new StringBuilder("preconnect protocol info: ").append(str2).append(", domains: ").append(this.f154392a).append(", params: ").append(str3).append(", ttl: ").append(this.f154398g).append(", result capacity: ").append(this.f154399h);
            if (str2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f154395d.put(next, Integer.valueOf(jSONObject.optInt(next)));
                        if (!(str3 == null || (optString = new JSONObject(str3).optString(next)) == null)) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            if (next.equals("quic") && !TextUtils.isEmpty(str)) {
                                jSONObject2.put("scfg_address", str);
                            }
                            this.f154396e.put(next, jSONObject2);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.ss.videoarch.strategy.a.a.a$a  reason: collision with other inner class name */
    public class C4108a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f154401a;

        /* renamed from: b  reason: collision with root package name */
        public long f154402b;

        static {
            Covode.recordClassIndex(102918);
        }

        public C4108a(JSONObject jSONObject, long j2) {
            this.f154401a = jSONObject;
            this.f154402b = j2;
        }
    }
}
