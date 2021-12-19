package com.ss.android.account.adapter;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.u;
import com.bytedance.sdk.a.d;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.g;
import com.ss.android.h;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NetworkAdapter implements d {
    static {
        Covode.recordClassIndex(36163);
    }

    @Override // com.bytedance.sdk.a.d
    public final int a(Context context, Throwable th) {
        return 0;
    }

    private static h a(u<String> uVar) {
        String str;
        int i2;
        if (uVar == null) {
            return null;
        }
        if (uVar.f42629a != null) {
            str = uVar.f42629a.f42473a;
            i2 = uVar.f42629a.f42474b;
        } else {
            str = "";
            i2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        List<b> list = uVar.f42629a.f42476d;
        if (list != null && list.size() > 0) {
            for (b bVar : list) {
                if (bVar != null) {
                    arrayList.add(new g(bVar.f42471a, bVar.f42472b));
                }
            }
        }
        return new h(str, i2, arrayList, uVar.f42630b);
    }

    @Override // com.bytedance.sdk.a.d
    public final h a(String str, List<g> list) {
        u<String> uVar = null;
        if (!m.a(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a2 = i.a(str, linkedHashMap);
            String str2 = (String) a2.second;
            INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.a((String) a2.first, INetworkApi.class);
            LinkedList linkedList = new LinkedList();
            if (!list.isEmpty()) {
                for (g gVar : list) {
                    if (gVar != null) {
                        linkedList.add(new b(gVar.f59519a, gVar.f59520b));
                    }
                }
            }
            if (iNetworkApi != null) {
                uVar = iNetworkApi.doGet(true, Integer.MAX_VALUE, str2, linkedHashMap, linkedList, null).execute();
            }
        }
        return a(uVar);
    }

    @Override // com.bytedance.sdk.a.d
    public final h a(String str, Map<String, String> map, List<g> list) {
        u<String> uVar = null;
        if (!m.a(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a2 = i.a(str, linkedHashMap);
            String str2 = (String) a2.second;
            INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.a((String) a2.first, INetworkApi.class);
            LinkedList linkedList = new LinkedList();
            if (list.size() != 0) {
                for (g gVar : list) {
                    if (gVar != null) {
                        linkedList.add(new b(gVar.f59519a, gVar.f59520b));
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (!map.isEmpty()) {
                linkedHashMap2.putAll(map);
            }
            if (iNetworkApi != null) {
                uVar = iNetworkApi.doPost(Integer.MAX_VALUE, str2, linkedHashMap, linkedHashMap2, linkedList, null).execute();
            }
        }
        return a(uVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.Map<java.lang.String, com.bytedance.retrofit2.mime.TypedOutput> */
    /* JADX WARN: Multi-variable type inference failed */
    private static u<String> a(int i2, String str, Map<String, TypedOutput> map, List<g> list) {
        if (m.a(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a2 = i.a(str, linkedHashMap);
        String str2 = (String) a2.second;
        INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.a((String) a2.first, INetworkApi.class);
        LinkedList linkedList = new LinkedList();
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                linkedList.add(new b(gVar.f59519a, gVar.f59520b));
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!linkedHashMap2.isEmpty()) {
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (entry != null) {
                    map.put(entry.getKey(), new TypedString((String) entry.getValue()));
                }
            }
        }
        if (iNetworkApi != null) {
            return iNetworkApi.postMultiPart(Integer.MAX_VALUE, str2, linkedHashMap, map, linkedList).execute();
        }
        return null;
    }

    @Override // com.bytedance.sdk.a.d
    public final h a(String str, Map<String, String> map, String str2, String str3, List<g> list) {
        if (m.a(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), new TypedString(entry.getValue()));
            }
        }
        linkedHashMap.put(str2, new TypedFile(null, new File(str3)));
        return a(a(Integer.MAX_VALUE, str, linkedHashMap, list));
    }
}
