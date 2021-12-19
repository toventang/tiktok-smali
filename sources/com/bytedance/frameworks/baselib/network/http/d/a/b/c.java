package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.a;
import com.bytedance.frameworks.baselib.network.http.d.a.b.a;
import com.bytedance.frameworks.baselib.network.http.g.e;
import com.bytedance.frameworks.baselib.network.http.g.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f29179l = c.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    private int f29180m;
    private int n;
    private int o;
    private final Map<String, Set<String>> p = new HashMap();

    static {
        Covode.recordClassIndex(17061);
    }

    private int b() {
        int i2 = this.f29180m;
        if (i2 > 0) {
            return i2;
        }
        if (this.n < this.o) {
            return new Random().nextInt(this.o - this.n) + this.n;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v8. Raw type applied. Possible types: java.util.Map<java.lang.String, java.util.Set<java.lang.String>>, java.util.Map */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Set, java.lang.Object] */
    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.a
    public final boolean a(JSONObject jSONObject) {
        int i2;
        int i3;
        JSONException e2;
        b(jSONObject);
        String optString = jSONObject.optString("tag");
        int i4 = 0;
        if (!TextUtils.isEmpty(optString)) {
            String[] split = optString.split(";");
            for (String str : split) {
                ArrayList<Pair> arrayList = new ArrayList();
                if (e.a(str, ",", "=", arrayList)) {
                    for (Pair pair : arrayList) {
                        Set<String> set = this.p.get(pair.first);
                        if (set == null) {
                            set = new HashSet<>();
                        }
                        set.add(pair.second);
                        this.p.put(pair.first, set);
                    }
                }
            }
        }
        this.f29180m = jSONObject.optInt("delay");
        JSONArray optJSONArray = jSONObject.optJSONArray("random");
        if (this.f29180m > 0 || optJSONArray == null) {
            i2 = 0;
        } else if (optJSONArray.length() != 2) {
            return false;
        } else {
            try {
                i3 = optJSONArray.getInt(0);
                try {
                    i2 = optJSONArray.getInt(1);
                } catch (JSONException e3) {
                    e2 = e3;
                }
            } catch (JSONException e4) {
                e2 = e4;
                i3 = 0;
                e2.printStackTrace();
                i2 = 0;
                if (i3 > 0) {
                }
                return false;
            }
            if (i3 > 0 || i2 <= 0 || i3 >= i2) {
                return false;
            }
            i4 = i3;
        }
        this.n = i4;
        this.o = i2;
        Logger.debug();
        return true;
    }

    public final a.EnumC0625a a(String str, String str2, List<Integer> list) {
        boolean z;
        a.EnumC0618a aVar;
        if (!a() || TextUtils.isEmpty(str)) {
            list.set(0, 0);
            return a.EnumC0625a.DISPATCH_NONE;
        }
        Uri parse = Uri.parse(str);
        if (parse.getHost() == null || !a(parse)) {
            return a.EnumC0625a.DISPATCH_NONE;
        }
        if (this.p.isEmpty()) {
            list.set(0, Integer.valueOf(b()));
            Logger.debug();
            return a.EnumC0625a.DISPATCH_DELAY;
        } else if (!com.bytedance.frameworks.baselib.network.a.f28819b.get()) {
            Logger.debug();
            return a.EnumC0625a.DISPATCH_NONE;
        } else {
            if ("".equals(str2)) {
                str2 = "s=0;p=0";
            }
            HashMap hashMap = new HashMap();
            ArrayList<Pair> arrayList = new ArrayList();
            if (!e.a(str2, ";", "=", arrayList)) {
                return a.EnumC0625a.DISPATCH_NONE;
            }
            for (Pair pair : arrayList) {
                hashMap.put(pair.first, pair.second);
            }
            String num = Integer.toString(a.EnumC0618a.NormalStart.getValue());
            if (com.bytedance.frameworks.baselib.network.a.f28818a != a.EnumC0618a.NormalStart) {
                Logger.debug();
                int i2 = a.AnonymousClass1.f28825a[com.bytedance.frameworks.baselib.network.a.f28818a.ordinal()];
                if (i2 == 1) {
                    if (com.bytedance.frameworks.baselib.network.a.a(com.bytedance.frameworks.baselib.network.a.f28820c.get(), com.bytedance.frameworks.baselib.network.a.f28821d.get())) {
                        com.bytedance.frameworks.baselib.network.a.f28818a = a.EnumC0618a.NormalStart;
                    }
                    aVar = com.bytedance.frameworks.baselib.network.a.f28818a;
                } else if (i2 == 2) {
                    if (com.bytedance.frameworks.baselib.network.a.a(com.bytedance.frameworks.baselib.network.a.f28820c.get(), com.bytedance.frameworks.baselib.network.a.f28822e.get())) {
                        com.bytedance.frameworks.baselib.network.a.f28818a = a.EnumC0618a.NormalStart;
                    }
                    aVar = com.bytedance.frameworks.baselib.network.a.f28818a;
                } else if (i2 != 3) {
                    aVar = com.bytedance.frameworks.baselib.network.a.f28818a;
                } else {
                    if (com.bytedance.frameworks.baselib.network.a.a(com.bytedance.frameworks.baselib.network.a.f28820c.get(), com.bytedance.frameworks.baselib.network.a.f28823f.get())) {
                        com.bytedance.frameworks.baselib.network.a.f28818a = a.EnumC0618a.NormalStart;
                    }
                    aVar = com.bytedance.frameworks.baselib.network.a.f28818a;
                }
                num = Integer.toString(aVar.getValue());
            }
            hashMap.put("s", num);
            Context context = k.a().f29204a;
            if (context != null) {
                z = f.a(context);
            } else {
                z = true;
            }
            hashMap.put("p", Integer.toString(!z ? 1 : 0));
            Logger.debug();
            a.EnumC0625a aVar2 = a.EnumC0625a.DISPATCH_DELAY;
            Iterator<Map.Entry<String, Set<String>>> it = this.p.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Set<String>> next = it.next();
                Object obj = hashMap.get(next.getKey());
                if (obj != null) {
                    if (!next.getValue().contains(obj)) {
                        aVar2 = a.EnumC0625a.DISPATCH_NONE;
                        break;
                    }
                } else {
                    aVar2 = a.EnumC0625a.DISPATCH_NONE;
                    break;
                }
            }
            if (aVar2 == a.EnumC0625a.DISPATCH_DELAY) {
                list.set(0, Integer.valueOf(b()));
            }
            Logger.debug();
            return aVar2;
        }
    }
}
