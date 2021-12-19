package com.bytedance.frameworks.baselib.network.http.d.a.a;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.a.a;
import com.bytedance.frameworks.baselib.network.http.d.a.a.a.b;
import com.bytedance.frameworks.baselib.network.http.d.a.a.a.c;
import com.bytedance.frameworks.baselib.network.http.d.a.a.a.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f29145a = f.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final String f29146b;

    /* renamed from: c  reason: collision with root package name */
    private final d f29147c;

    /* renamed from: d  reason: collision with root package name */
    private String f29148d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f29149e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<String> f29150f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private a.EnumC0624a f29151g;

    /* renamed from: h  reason: collision with root package name */
    private int f29152h = 0;

    /* renamed from: i  reason: collision with root package name */
    private final WeakHandler f29153i;

    static {
        Covode.recordClassIndex(17052);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2 A[LOOP:2: B:26:0x009c->B:28:0x00a2, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void call() {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.a.f.call():java.lang.Void");
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (!d.f29109a.get()) {
            this.f29152h = 1;
        }
        sb.append("https://").append(str).append("/q?host=").append(this.f29148d).append("&aid=").append(e.a().f29142j.c()).append("&okhttp_version=").append(this.f29146b).append("&p=android&source=tt-ok&f=").append(this.f29152h).append("&reason=").append(this.f29151g.ordinal() - 1);
        if (this.f29147c.f29126h.get() < 3) {
            sb.append("&refresh_bkup_ip=1");
            this.f29147c.a();
        }
        return b.a(sb.toString(), str);
    }

    private void b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (this.f29149e.size() > 1) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("dns");
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            a(optJSONArray.optJSONObject(i2));
                        }
                    } else {
                        return;
                    }
                } else {
                    a(jSONObject);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("httpdns_backup_ip");
                if (optJSONArray2 != null) {
                    e.a().a(optJSONArray2);
                }
            }
        } catch (JSONException unused) {
        }
    }

    private void a(JSONObject jSONObject) {
        MethodCollector.i(4536);
        if (jSONObject == null) {
            MethodCollector.o(4536);
            return;
        }
        String optString = jSONObject.optString("host");
        int optInt = jSONObject.optInt("ttl");
        JSONArray optJSONArray = jSONObject.optJSONArray("ips");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString2 = optJSONArray.optString(i2);
                if (c.a(optString2)) {
                    arrayList2.add(optString2);
                } else if (c.b(optString2)) {
                    arrayList.add(optString2);
                }
            }
        }
        if (this.f29149e.contains(optString) && (arrayList.size() > 0 || arrayList2.size() > 0)) {
            a aVar = new a(optString, System.currentTimeMillis(), arrayList, arrayList2, optInt);
            d dVar = this.f29147c;
            a b2 = dVar.b(optString);
            if (b2 != null) {
                if (e.a().f29134b.get()) {
                    b2.a();
                } else {
                    b2.b();
                }
            }
            if (e.a().f29134b.get()) {
                Message obtain = Message.obtain();
                obtain.obj = aVar;
                obtain.what = 12;
                aVar.a(obtain);
                aVar.f29102f.sendMessageDelayed(obtain, aVar.f29100d * 1000);
                Message obtain2 = Message.obtain();
                obtain2.obj = aVar;
                obtain2.what = 10;
                aVar.a(obtain2);
                aVar.f29102f.sendMessageDelayed(obtain2, (aVar.f29100d * 1000) + (((long) e.a().f29140h.get()) * 1000));
            } else {
                Message obtain3 = Message.obtain();
                obtain3.obj = aVar;
                obtain3.what = 13;
                aVar.a(obtain3);
                aVar.f29102f.sendMessageDelayed(obtain3, aVar.f29100d * 1000);
            }
            synchronized (dVar.f29119a.c()) {
                try {
                    dVar.f29119a.a(optString, aVar);
                } finally {
                    MethodCollector.o(4536);
                }
            }
            this.f29147c.e(optString);
            this.f29149e.remove(optString);
        }
    }

    f(String str, String str2, d dVar, a.EnumC0624a aVar, WeakHandler weakHandler) {
        this.f29148d = str;
        this.f29146b = str2;
        this.f29147c = dVar;
        this.f29151g = aVar;
        this.f29153i = weakHandler;
    }
}
