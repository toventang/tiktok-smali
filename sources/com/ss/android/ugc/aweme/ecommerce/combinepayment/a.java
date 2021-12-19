package com.ss.android.ugc.aweme.ecommerce.combinepayment;

import android.util.Pair;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.utils.fd;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a extends j {
    static {
        Covode.recordClassIndex(52890);
    }

    @Override // com.bytedance.common.utility.j
    public final String a(String str, Map<String, String> map) {
        List<b> list;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new b(entry.getKey(), entry.getValue()));
            }
            list = n.g((Collection) arrayList);
        } else {
            list = new ArrayList<>();
        }
        if (str == null) {
            l.b();
        }
        HashMap hashMap = new HashMap();
        l.d(str, "");
        l.d(hashMap, "");
        l.d(str, "");
        l.d(hashMap, "");
        String str2 = (String) i.a(str, (Map<String, String>) null).first;
        l.b(str2, "");
        CommonApi a2 = fd.a(str2);
        if (a2 != null) {
            u<String> execute = a2.doGet(str, hashMap, list).execute();
            if (execute == null) {
                l.b();
            }
            T t = execute.f42630b;
            if (t == null) {
                l.b();
            }
            return t;
        }
        throw new RuntimeException("CommonApi is null,url=".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.common.utility.j
    public final String a(String str, List<Pair<String, String>> list, Map<String, String> map) {
        JSONObject jSONObject;
        List<b> list2;
        if (list != null) {
            jSONObject = new JSONObject();
            for (T t : list) {
                jSONObject.put((String) ((Pair) t).first, ((Pair) t).second);
            }
        } else {
            jSONObject = null;
        }
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new b(entry.getKey(), entry.getValue()));
            }
            list2 = n.g((Collection) arrayList);
        } else {
            list2 = new ArrayList<>();
        }
        fd fdVar = fd.f142903a;
        if (str == null) {
            l.b();
        }
        return fdVar.b(str, jSONObject, null, list2);
    }

    @Override // com.bytedance.common.utility.j
    public final String a(String str, byte[] bArr, Map<String, String> map) {
        List<b> list;
        TypedByteArray typedByteArray = new TypedByteArray(null, bArr, new String[0]);
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new b(entry.getKey(), entry.getValue()));
            }
            list = n.g((Collection) arrayList);
        } else {
            list = new ArrayList<>();
        }
        if (str == null) {
            l.b();
        }
        l.d(str, "");
        l.d(str, "");
        String str2 = (String) i.a(str, (Map<String, String>) null).first;
        l.b(str2, "");
        CommonApi a2 = fd.a(str2);
        if (a2 != null) {
            u<String> execute = a2.postBody(str, typedByteArray, list).execute();
            if (execute == null) {
                l.b();
            }
            T t = execute.f42630b;
            if (t == null) {
                l.b();
            }
            return t;
        }
        throw new RuntimeException("CommonApi is null,url=".concat(String.valueOf(str)));
    }
}
