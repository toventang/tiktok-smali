package com.bytedance.b.b.a.d;

import com.bytedance.b.b.a.c.b;
import com.bytedance.b.b.a.d.a;
import com.bytedance.b.b.a.d.f;
import com.bytedance.b.e.a.a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final List<f> f25959a;

    /* renamed from: b  reason: collision with root package name */
    private static AtomicInteger f25960b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f25961c = Arrays.asList("tracing");

    /* renamed from: d  reason: collision with root package name */
    private static final f.a f25962d;

    /* renamed from: e  reason: collision with root package name */
    private static final f.c f25963e;

    /* renamed from: f  reason: collision with root package name */
    private static final f.b f25964f;

    static {
        Covode.recordClassIndex(15133);
        f.a aVar = new f.a();
        f25962d = aVar;
        f.c cVar = new f.c();
        f25963e = cVar;
        f.b bVar = new f.b();
        f25964f = bVar;
        ArrayList arrayList = new ArrayList();
        f25959a = arrayList;
        arrayList.add(aVar);
        arrayList.add(cVar);
        arrayList.add(bVar);
    }

    private static void a(Map<Long, List<b>> map) {
        if (a.r()) {
            map.size();
            for (Long l2 : map.keySet()) {
                List<b> list = map.get(l2);
                com.bytedance.b.b.a.b.b.a().a(String.valueOf(l2));
                for (int i2 = 0; i2 < list.size(); i2++) {
                    list.get(i2);
                }
            }
        }
    }

    public static Map<f, byte[]> a(List<com.bytedance.b.b.a.c.a> list, int i2) {
        int i3;
        Object obj;
        String[] list2;
        try {
            HashMap hashMap = new HashMap();
            long size = (long) list.size();
            long j2 = 0;
            long j3 = 0;
            for (com.bytedance.b.b.a.c.a aVar : list) {
                long j4 = aVar.f25893a;
                List list3 = (List) hashMap.get(Long.valueOf(j4));
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put(Long.valueOf(j4), list3);
                }
                j2 += (long) aVar.f25895c;
                j3 += (long) aVar.f25894b;
                list3.addAll(aVar.f25897e);
            }
            a(hashMap);
            File a2 = a.C0553a.f25916a.a();
            if (a2 == null || (list2 = a2.list()) == null) {
                i3 = 0;
            } else {
                i3 = list2.length;
            }
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Long l2 : hashMap.keySet()) {
                List list4 = (List) hashMap.get(l2);
                if (list4 != null) {
                    for (int i4 = 0; i4 < list4.size(); i4++) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(((b) list4.get(i4)).f25898a));
                            String optString = jSONObject.optString("log_type");
                            if (com.bytedance.b.b.a.a.f25848b.contains(optString)) {
                                obj = f25962d;
                            } else if (f25961c.contains(optString)) {
                                obj = f25963e;
                            } else {
                                obj = f25964f;
                            }
                            if (obj instanceof f.b) {
                                try {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("_debug_self");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                        jSONObject.put("_debug_self", optJSONObject);
                                    }
                                    optJSONObject.put("debug_sender_number", f25960b.getAndIncrement());
                                    optJSONObject.put("debug_sender_sid", com.bytedance.b.e.a.a.a());
                                    optJSONObject.put("debug_total_bytes", j2);
                                    optJSONObject.put("debug_total_count", j3);
                                    optJSONObject.put("debug_merge_file_count", size);
                                    optJSONObject.put("debug_second_file_count", i3);
                                    optJSONObject.put("debug_left_file_count", i2);
                                } catch (Exception unused) {
                                }
                                if (jSONObject.has("seq_no")) {
                                    arrayList.add(String.valueOf(jSONObject.get("seq_no")));
                                }
                            }
                            Map map = (Map) hashMap2.get(obj);
                            if (map == null) {
                                map = new HashMap();
                                hashMap2 = hashMap2;
                                hashMap2.put(obj, map);
                            }
                            if (!map.containsKey(l2)) {
                                map.put(l2, new JSONArray());
                            }
                            ((JSONArray) map.get(l2)).put(jSONObject);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            HashMap hashMap3 = new HashMap();
            for (f fVar : hashMap2.keySet()) {
                hashMap3.put(fVar, fVar.a((HashMap) hashMap2.get(fVar)));
            }
            return hashMap3;
        } catch (Throwable th) {
            com.bytedance.b.k.b.b.a(com.bytedance.b.b.a.a.f25847a, "LogSender serialize failed.", th);
            return null;
        }
    }
}
