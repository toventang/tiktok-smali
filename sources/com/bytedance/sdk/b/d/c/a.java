package com.bytedance.sdk.b.d.c;

import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.u;
import com.bytedance.sdk.b.a.c;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.LinkedHashMap;
import java.util.Map;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private static a f43569a;

    static {
        Covode.recordClassIndex(26670);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(3545);
        if (f43569a == null) {
            synchronized (a.class) {
                try {
                    if (f43569a == null) {
                        f43569a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3545);
                    throw th;
                }
            }
        }
        a aVar = f43569a;
        MethodCollector.o(3545);
        return aVar;
    }

    @Override // com.bytedance.sdk.b.a.c
    public final String a(String str, Map<String, String> map) {
        try {
            if (m.a(str)) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a2 = i.a(str, linkedHashMap);
            String str2 = (String) a2.second;
            INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.a((String) a2.first, INetworkApi.class);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (map != null && !map.isEmpty()) {
                linkedHashMap2.putAll(map);
            }
            if (iNetworkApi != null) {
                u<String> execute = iNetworkApi.doPost(102400, str2, linkedHashMap, linkedHashMap2, null, null).execute();
                if (execute.f42629a.a()) {
                    return execute.f42630b;
                }
                throw new RuntimeException("request fail, ".concat(String.valueOf(com.bytedance.sdk.b.f.a.a(execute.f42631c.in()))));
            }
            throw new RuntimeException("netWorkApi == null");
        } catch (Throwable th) {
            throw new RuntimeException(th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.b.a.c
    public final String a(boolean z, String str) {
        try {
            if (m.a(str)) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a2 = i.a(str, linkedHashMap);
            String str2 = (String) a2.second;
            INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.a((String) a2.first, INetworkApi.class);
            if (iNetworkApi != null) {
                u<String> execute = iNetworkApi.doGet(z, 102400, str2, linkedHashMap, null, null).execute();
                if (execute.f42629a.a()) {
                    return execute.f42630b;
                }
                throw new RuntimeException("request fail, ".concat(String.valueOf(com.bytedance.sdk.b.f.a.a(execute.f42631c.in()))));
            }
            throw new RuntimeException("netWorkApi == null");
        } catch (Throwable th) {
            throw new RuntimeException(th.getMessage());
        }
    }
}
