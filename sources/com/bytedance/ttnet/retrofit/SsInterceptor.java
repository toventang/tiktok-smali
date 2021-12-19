package com.bytedance.ttnet.retrofit;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.a.a.a;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.g.g;
import com.bytedance.frameworks.baselib.network.http.g.h;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.s;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.d.d;
import com.bytedance.ttnet.utils.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class SsInterceptor extends BaseSsInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f44640a;

    static {
        Covode.recordClassIndex(27291);
    }

    private static String a(String str) {
        List<String> list;
        List list2;
        if (m.a(str)) {
            return str;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> b2 = i.b(str, linkedHashMap);
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!(entry == null || (list2 = (List) entry.getValue()) == null || list2.isEmpty())) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (linkedHashSet.contains(str2)) {
                                it.remove();
                            } else {
                                linkedHashSet.add(str2);
                            }
                        }
                    }
                }
            }
            h hVar = new h(((String) b2.first) + ((String) b2.second));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!(entry2 == null || entry2.getKey() == null || (list = (List) entry2.getValue()) == null || list.isEmpty())) {
                        for (String str3 : list) {
                            hVar.a((String) entry2.getKey(), str3);
                        }
                    }
                }
            }
            return hVar.a();
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor
    public final Request a(Request request) {
        Request a2 = super.a(request);
        String str = null;
        if (a2 == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Request.a newBuilder = a2.newBuilder();
        String a3 = a(a2.getUrl());
        newBuilder.a(a3);
        if (a2.getMetrics() != null) {
            a2.getMetrics().C = SystemClock.uptimeMillis() - uptimeMillis;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        ArrayList arrayList = new ArrayList();
        if (a2.getHeaders() != null) {
            arrayList.addAll(a2.getHeaders());
        }
        if (f44640a) {
            try {
                LinkedList<Pair> linkedList = new LinkedList();
                String a4 = a.a(a3, linkedList);
                if (a4 != null) {
                    newBuilder.a(a4);
                }
                if (!linkedList.isEmpty()) {
                    for (Pair pair : linkedList) {
                        if (pair != null) {
                            arrayList.add(new b((String) pair.first, (String) pair.second));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (a2.getMetrics() != null) {
            a2.getMetrics().D = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        try {
            String a5 = c.a(a3);
            if (!m.a(a5)) {
                arrayList.add(new b("X-SS-REQ-TICKET", a5));
            }
        } catch (Throwable unused2) {
        }
        if (a2.getMetrics() != null) {
            a2.getMetrics().E = SystemClock.uptimeMillis() - valueOf2.longValue();
        }
        Long valueOf3 = Long.valueOf(SystemClock.uptimeMillis());
        if (com.bytedance.ttnet.utils.a.f44647a) {
            try {
                if (com.bytedance.ttnet.utils.a.a(g.a(a3))) {
                    str = UUID.randomUUID().toString();
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new b("X-TT-VERIFY-ID", str));
                }
            } catch (Throwable unused3) {
            }
        }
        if (a2.getMetrics() != null) {
            a2.getMetrics().G = SystemClock.uptimeMillis() - valueOf3.longValue();
        }
        ClientKeyManager a6 = ClientKeyManager.a();
        s metrics = a2.getMetrics();
        if (ClientKeyManager.f44556a != null && ClientKeyManager.f44557b && !TextUtils.isEmpty(a6.f44562c) && !TextUtils.isEmpty(a6.f44565f)) {
            Long valueOf4 = Long.valueOf(SystemClock.uptimeMillis());
            arrayList.add(new b("x-bd-client-key", a6.f44562c));
            arrayList.add(new b("x-bd-kmsv", a6.f44565f));
            if (metrics != null) {
                metrics.H = SystemClock.uptimeMillis() - valueOf4.longValue();
            }
        }
        newBuilder.f42460c = arrayList;
        return newBuilder.a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor
    public final void a(Request request, u uVar) {
        com.bytedance.ttnet.d.b bVar;
        String str;
        String str2;
        String str3;
        List<b> b2;
        super.a(request, uVar);
        if (request != null && uVar != null) {
            com.bytedance.retrofit2.client.c cVar = uVar.f42629a;
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            try {
                if (e.f29333e != null) {
                    String a2 = e.f29333e.a();
                    if (!m.a(a2) && (b2 = cVar.b(a2)) != null && b2.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (b bVar2 : b2) {
                            arrayList.add(bVar2.f42472b);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            if (request.getMetrics() != null) {
                request.getMetrics().K = SystemClock.uptimeMillis() - valueOf.longValue();
            }
            ClientKeyManager.a().a(request, cVar);
            Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
            Object obj = cVar.f42478f;
            if (obj instanceof com.bytedance.ttnet.d.b) {
                bVar = (com.bytedance.ttnet.d.b) obj;
                if (bVar.f28914b != null) {
                    JSONObject jSONObject = new JSONObject();
                    List<b> list = cVar.f42476d;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        try {
                            b bVar3 = list.get(i2);
                            if (bVar3 != null) {
                                if (!TextUtils.isEmpty(bVar3.f42471a)) {
                                    jSONObject.put(bVar3.f42471a.toUpperCase(), bVar3.f42472b);
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (bVar.f28914b instanceof d) {
                        ((d) bVar.f28914b).u = jSONObject;
                    }
                    ((d) bVar.f28914b).f28941b = cVar.f42474b;
                    ((d) bVar.f28914b).f28940a = bVar.f28913a;
                }
            } else {
                bVar = null;
            }
            try {
                request.getUrl();
                request.getFirstHeader("X-SS-REQ-TICKET");
                cVar.a("X-SS-REQ-TICKET");
            } catch (Throwable unused2) {
            }
            try {
                String url = request.getUrl();
                Uri parse = Uri.parse(url);
                if (parse.getHost().endsWith(com.bytedance.ttnet.b.a())) {
                    String[] strArr = {"Set-Cookie"};
                    String[] strArr2 = {"sessionid", "tt_sessionid"};
                    int i3 = 0;
                    do {
                        List<b> b3 = cVar.b(strArr[i3]);
                        if (b3 != null && b3.size() > 0) {
                            for (b bVar4 : b3) {
                                int i4 = 0;
                                do {
                                    String str4 = strArr2[i4];
                                    Matcher matcher = Pattern.compile(".*(((" + str4 + "=[^;]*)|(" + str4 + "=\"[\";]*))|(" + str4 + "=.*$)).*").matcher(bVar4.f42472b);
                                    if (matcher.matches()) {
                                        str3 = matcher.group(1);
                                    } else {
                                        str3 = null;
                                    }
                                    Logger.debug();
                                    if (!m.a(str3)) {
                                        int i5 = cVar.f42474b;
                                        boolean z = bVar.M;
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            String encodedQuery = parse.getEncodedQuery();
                                            if (!m.a(encodedQuery)) {
                                                jSONObject2.put("url_query", encodedQuery);
                                            }
                                        } catch (Throwable unused3) {
                                        }
                                        if (!m.a(bVar.f28913a)) {
                                            jSONObject2.put("remote_ip", bVar.f28913a);
                                        }
                                        if (cVar.f42476d != null) {
                                            jSONObject2.put("header_list", cVar.f42476d.toString());
                                        }
                                        int indexOf = url.indexOf("?");
                                        if (indexOf == -1) {
                                            indexOf = url.length();
                                        }
                                        String substring = url.substring(0, indexOf);
                                        c.b bVar5 = c.f44655a;
                                        if (bVar5 != null) {
                                            bVar5.a(substring, i5, z, jSONObject2);
                                        }
                                    }
                                    i4++;
                                } while (i4 < 2);
                            }
                        }
                        i3++;
                    } while (i3 <= 0);
                    if (request.getMetrics() != null) {
                        request.getMetrics().F = SystemClock.uptimeMillis() - valueOf2.longValue();
                    }
                    Long valueOf3 = Long.valueOf(SystemClock.uptimeMillis());
                    if (com.bytedance.ttnet.utils.a.f44647a && bVar != null) {
                        b firstHeader = request.getFirstHeader("X-TT-VERIFY-ID");
                        if (firstHeader != null) {
                            str = firstHeader.f42472b;
                        } else {
                            str = null;
                        }
                        b a3 = cVar.a("X-TT-VERIFY-ID");
                        if (a3 != null) {
                            str2 = a3.f42472b;
                        } else {
                            str2 = null;
                        }
                        if (str != null) {
                            if (str2 == null) {
                                bVar.N = 1;
                            } else if (str.equals(str2)) {
                                bVar.N = 2;
                            } else {
                                bVar.N = 3;
                                try {
                                    cVar.f42477e.in().close();
                                } catch (Throwable unused4) {
                                }
                            }
                            if (c.f44656b != null) {
                                request.getUrl();
                            }
                            if (bVar.N == 3) {
                                throw new com.bytedance.frameworks.baselib.network.http.b.a("Fail to verify cdn cache");
                            }
                        }
                    }
                    if (request.getMetrics() != null) {
                        request.getMetrics().J = SystemClock.uptimeMillis() - valueOf3.longValue();
                    }
                }
            } catch (Throwable unused5) {
            }
        }
    }
}
