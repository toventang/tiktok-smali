package com.bytedance.frameworks.baselib.network.c;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.g.h;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f28902c;

    /* renamed from: f  reason: collision with root package name */
    private static final String f28903f = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f28904a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f28905b = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private volatile String f28906d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f28907e = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(16971);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(4113);
        if (f28902c == null) {
            synchronized (c.class) {
                try {
                    if (f28902c == null) {
                        f28902c = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4113);
                    throw th;
                }
            }
        }
        c cVar = f28902c;
        MethodCollector.o(4113);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public class a implements Comparator<b> {
        static {
            Covode.recordClassIndex(16972);
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
            return bVar.f28896a - bVar2.f28896a;
        }
    }

    public final void a(String str) {
        if (this.f28904a && !TextUtils.isEmpty(str)) {
            try {
                c(str);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f28907e.clear();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    this.f28907e.add(jSONArray.getString(i2));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static JSONArray a(List<a> list) {
        long j2;
        JSONArray jSONArray = new JSONArray();
        for (a aVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("hit", aVar.f28891a);
                jSONObject.put("priority", aVar.f28892b);
                if (aVar.f28893c < 0 || aVar.f28894d < 0 || aVar.f28893c > aVar.f28894d) {
                    j2 = -1;
                } else {
                    j2 = aVar.f28894d - aVar.f28893c;
                }
                jSONObject.put("consume", j2);
                jSONArray.put(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray;
    }

    private synchronized void c(String str) {
        MethodCollector.i(4206);
        if (TextUtils.isEmpty(this.f28906d) || !this.f28906d.equals(str)) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("action");
                int i3 = jSONObject.getInt("act_priority");
                if (i3 >= 0) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("param");
                    int optInt = jSONObject.optInt("set_req_priority", i3);
                    if (optInt == -1) {
                        optInt = Integer.MAX_VALUE;
                    }
                    b a2 = b.a(string, i3, optInt, jSONObject2);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            Collections.sort(arrayList, new a());
            this.f28905b.clear();
            this.f28905b.addAll(arrayList);
            this.f28906d = str;
            MethodCollector.o(4206);
            return;
        }
        MethodCollector.o(4206);
    }

    public final Request a(Request request) {
        List<String> value;
        if (!this.f28904a) {
            return null;
        }
        String url = request.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> b2 = i.b(url, linkedHashMap);
            if (linkedHashMap.isEmpty() || !a(request, linkedHashMap)) {
                return null;
            }
            h hVar = new h(((String) b2.first) + ((String) b2.second));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : linkedHashMap.entrySet()) {
                    if (!(entry == null || entry.getKey() == null || (value = entry.getValue()) == null || value.isEmpty())) {
                        for (String str : value) {
                            hVar.a(entry.getKey(), str);
                        }
                    }
                }
            }
            Request.a newBuilder = request.newBuilder();
            newBuilder.a(hVar.a());
            return newBuilder.a();
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean a(Request request, Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        request.setQueryFilterPriority(0);
        for (b bVar : this.f28905b) {
            if (bVar.a(request, map, arrayList)) {
                z = true;
            }
        }
        if (request.getMetrics() != null) {
            request.getMetrics().O = a(arrayList);
        }
        return z;
    }
}
