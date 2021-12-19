package com.ss.android.ugc.aweme.im.sdk.notification.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ag;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import h.a.n;
import h.a.z;
import h.j.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final a f102881c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ag f102882a;

    /* renamed from: b  reason: collision with root package name */
    public final String f102883b;

    static {
        Covode.recordClassIndex(65954);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65955);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static /* synthetic */ Map a(Map map) {
            return a(map, c.b().toString());
        }

        public static b a(Map<String, ? extends List<? extends ag>> map, Map<String, ? extends List<? extends ag>> map2) {
            Map map3;
            Map map4;
            Integer num;
            if (map != null) {
                try {
                    map3 = a(map);
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                    return null;
                }
            } else {
                map3 = null;
            }
            if (map2 != null) {
                map4 = a(map2);
            } else {
                map4 = null;
            }
            ArrayList arrayList = new ArrayList();
            List<n> a2 = a(map3, map4, a.REMOVE);
            List<n> a3 = a(map4, map3, a.ADD);
            m.a(arrayList, a2);
            m.a(arrayList, a3);
            if (map4 != null) {
                num = Integer.valueOf(map4.size());
            } else {
                num = null;
            }
            return new b(arrayList, num);
        }

        private static Map<String, ag> a(Map<String, ? extends List<? extends ag>> map, String str) {
            ArrayList arrayList;
            if (map == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, ? extends List<? extends ag>> entry : map.entrySet()) {
                List list = (List) entry.getValue();
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        if (!TextUtils.equals(String.valueOf(((ag) obj).uid.longValue()), str)) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = z.INSTANCE;
                }
                n.a((Collection) arrayList2, arrayList);
            }
            ArrayList arrayList4 = arrayList2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(h.a.ag.a(n.a((Iterable) arrayList4, 10)), 16));
            for (Object obj2 : arrayList4) {
                ag agVar = (ag) obj2;
                linkedHashMap.put(agVar.key + agVar.msgUuid + agVar.conversationId + agVar.idempotent_id, obj2);
            }
            return linkedHashMap;
        }

        private static List<n> a(Map<String, ? extends ag> map, Map<String, ? extends ag> map2, a aVar) {
            if (map == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends ag> entry : map.entrySet()) {
                String key = entry.getKey();
                if (map2 == null || !map2.containsKey(key)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = ((ag) entry2.getValue()).key;
                h.f.b.l.b(str, "");
                arrayList.add(new n(new l((ag) entry2.getValue(), str), aVar));
            }
            return arrayList;
        }
    }

    public l(ag agVar, String str) {
        h.f.b.l.d(agVar, "");
        h.f.b.l.d(str, "");
        this.f102882a = agVar;
        this.f102883b = str;
    }
}
