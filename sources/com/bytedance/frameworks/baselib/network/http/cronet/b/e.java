package com.bytedance.frameworks.baselib.network.http.cronet.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class e {

    /* renamed from: e  reason: collision with root package name */
    private static volatile e f29047e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f29048f = e.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    volatile int f29049a;

    /* renamed from: b  reason: collision with root package name */
    volatile int f29050b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f29051c = 4;

    /* renamed from: d  reason: collision with root package name */
    List<a> f29052d = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(17021);
    }

    private e() {
    }

    public static e a() {
        MethodCollector.i(895);
        if (f29047e == null) {
            synchronized (e.class) {
                try {
                    if (f29047e == null) {
                        f29047e = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(895);
                    throw th;
                }
            }
        }
        e eVar = f29047e;
        MethodCollector.o(895);
        return eVar;
    }

    static boolean a(List<?> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    private a b(String str) {
        for (a aVar : this.f29052d) {
            if (aVar.f29061i.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private void a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        a(jSONObject, "host_group", arrayList);
        ArrayList arrayList2 = new ArrayList();
        a(jSONObject, "concurrent_hosts", arrayList2);
        if (!arrayList.isEmpty() && arrayList2.size() >= 2) {
            a aVar = new a(arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            if (a(jSONObject, "equal_group", arrayList3)) {
                aVar.f29055c = arrayList3;
            }
            ArrayList arrayList4 = new ArrayList();
            if (a(jSONObject, "prefix_group", arrayList4)) {
                aVar.f29056d = arrayList4;
            }
            ArrayList arrayList5 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString = optJSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            arrayList5.add(Pattern.compile(optString, 2));
                        } catch (Throwable unused) {
                        }
                    }
                }
                aVar.f29057e = arrayList5;
            }
            aVar.f29060h = jSONObject.optInt("fail_count", Integer.MAX_VALUE);
            aVar.f29059g = jSONObject.optInt("forbid_seconds", 0);
            HashSet hashSet = new HashSet();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("block_code_list");
            if (optJSONArray2 != null) {
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    hashSet.add(Integer.valueOf(optJSONArray2.optInt(i3)));
                }
                aVar.f29058f = hashSet;
            }
            this.f29052d.add(aVar);
        }
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f29049a = jSONObject.optInt("enabled", 0);
                this.f29051c = jSONObject.optInt("connect_interval", 4);
                this.f29050b = jSONObject.optInt("retry_for_not_2xx_code", 0);
                this.f29052d.clear();
                JSONArray jSONArray = jSONObject.getJSONArray("match_rules");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    a((JSONObject) jSONArray.get(i2));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str, boolean z) {
        a b2;
        if (!TextUtils.isEmpty(str) && (b2 = b(str)) != null) {
            a(b2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<String> f29053a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f29054b;

        /* renamed from: c  reason: collision with root package name */
        List<String> f29055c;

        /* renamed from: d  reason: collision with root package name */
        List<String> f29056d;

        /* renamed from: e  reason: collision with root package name */
        List<Pattern> f29057e;

        /* renamed from: f  reason: collision with root package name */
        Set<Integer> f29058f;

        /* renamed from: g  reason: collision with root package name */
        int f29059g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f29060h = Integer.MAX_VALUE;

        /* renamed from: i  reason: collision with root package name */
        public String f29061i = UUID.randomUUID().toString();

        /* renamed from: j  reason: collision with root package name */
        volatile int f29062j = 0;

        /* renamed from: k  reason: collision with root package name */
        volatile long f29063k = SystemClock.uptimeMillis();

        /* renamed from: l  reason: collision with root package name */
        volatile boolean f29064l = false;

        static {
            Covode.recordClassIndex(17022);
        }

        public a(List<String> list, List<String> list2) {
            this.f29053a = list;
            this.f29054b = list2;
        }
    }

    private static void a(a aVar, boolean z) {
        Logger.debug();
        if (!z) {
            int i2 = aVar.f29062j + 1;
            aVar.f29062j = i2;
            if (i2 >= aVar.f29060h) {
                if (!aVar.f29064l) {
                    aVar.f29064l = true;
                    aVar.f29063k = SystemClock.uptimeMillis();
                }
                Logger.debug();
            }
        } else if (aVar.f29062j != 0 || aVar.f29064l) {
            aVar.f29062j = 0;
            aVar.f29064l = false;
        }
    }

    public final boolean a(int i2, String str) {
        a b2;
        if (i2 == 0 || TextUtils.isEmpty(str) || (b2 = b(str)) == null || b2.f29058f == null) {
            return false;
        }
        return b2.f29058f.contains(Integer.valueOf(i2));
    }

    private static boolean a(JSONObject jSONObject, String str, List<String> list) {
        JSONArray optJSONArray;
        if (jSONObject == null || TextUtils.isEmpty(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return false;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            String optString = optJSONArray.optString(i2);
            if (!TextUtils.isEmpty(optString)) {
                list.add(optString);
            }
        }
        return true;
    }
}
