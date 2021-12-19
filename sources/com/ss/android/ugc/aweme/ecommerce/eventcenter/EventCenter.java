package com.ss.android.ugc.aweme.ecommerce.eventcenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.e.c;
import com.bytedance.ies.xbridge.e.d;
import com.bytedance.ies.xbridge.n;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import h.a.ag;
import h.f.b.ad;
import h.f.b.l;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class EventCenter implements IEventCenter {

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.ies.xbridge.platform.b.b f85946b = new com.bytedance.ies.xbridge.platform.b.b();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentHashMap<a<IEventCenter.b>, d>> f85947c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue<IEventCenter.b> f85948d = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(53817);
    }

    public static IEventCenter a() {
        MethodCollector.i(8629);
        Object a2 = com.ss.android.ugc.b.a(IEventCenter.class, false);
        if (a2 != null) {
            IEventCenter iEventCenter = (IEventCenter) a2;
            MethodCollector.o(8629);
            return iEventCenter;
        }
        if (com.ss.android.ugc.b.bi == null) {
            synchronized (IEventCenter.class) {
                try {
                    if (com.ss.android.ugc.b.bi == null) {
                        com.ss.android.ugc.b.bi = new EventCenter();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8629);
                    throw th;
                }
            }
        }
        EventCenter eventCenter = (EventCenter) com.ss.android.ugc.b.bi;
        MethodCollector.o(8629);
        return eventCenter;
    }

    private final void b() {
        Reference<? extends IEventCenter.b> poll = this.f85948d.poll();
        while (poll instanceof a) {
            String str = ((a) poll).f85949a;
            ConcurrentHashMap<a<IEventCenter.b>, d> a2 = a(str);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            d dVar = (d) ad.h(a2).remove(poll);
            if (dVar != null) {
                com.bytedance.ies.xbridge.e.b.b(str, dVar);
            }
            poll = this.f85948d.poll();
        }
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f85950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f85951b;

        static {
            Covode.recordClassIndex(53819);
        }

        @Override // com.bytedance.ies.xbridge.e.d
        public final void a(c cVar) {
            JSONObject jSONObject;
            l.d(cVar, "");
            IEventCenter.b bVar = (IEventCenter.b) this.f85950a.get();
            if (bVar != null) {
                n nVar = cVar.f35927b;
                if (nVar != null) {
                    jSONObject = com.bytedance.ies.xbridge.o.c.a(nVar);
                } else {
                    jSONObject = new JSONObject();
                }
                String str = cVar.f35926a;
                String jSONObject2 = jSONObject.toString();
                l.b(jSONObject2, "");
                bVar.a(str, jSONObject2);
                return;
            }
            com.bytedance.ies.xbridge.e.b.b(this.f85951b, this);
        }

        b(a aVar, String str) {
            this.f85950a = aVar;
            this.f85951b = str;
        }
    }

    private final ConcurrentHashMap<a<IEventCenter.b>, d> a(String str) {
        MethodCollector.i(8618);
        ConcurrentHashMap<a<IEventCenter.b>, d> concurrentHashMap = this.f85947c.get(str);
        if (concurrentHashMap == null) {
            synchronized (this) {
                try {
                    concurrentHashMap = this.f85947c.get(str);
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap<>();
                        this.f85947c.put(str, concurrentHashMap);
                    }
                } finally {
                    MethodCollector.o(8618);
                }
            }
        }
        return concurrentHashMap;
    }

    private final List<Object> a(JSONArray jSONArray, List<Object> list) {
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.add(linkedHashMap);
                a((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                list.add(arrayList);
                a((JSONArray) obj, arrayList);
            } else {
                Object obj2 = jSONArray.get(i2);
                l.b(obj2, "");
                list.add(obj2);
            }
        }
        return h.a.n.k(list);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final boolean b(String str, IEventCenter.b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        ConcurrentHashMap<a<IEventCenter.b>, d> a2 = a(str);
        Enumeration<a<IEventCenter.b>> keys = a2.keys();
        l.b(keys, "");
        ArrayList<a> list = Collections.list(keys);
        l.b(list, "");
        for (a aVar : list) {
            if (l.a(aVar.get(), bVar)) {
                d dVar = a2.get(aVar);
                if (dVar != null) {
                    l.b(dVar, "");
                    com.bytedance.ies.xbridge.e.b.b(str, dVar);
                }
                a2.remove(aVar);
            }
        }
        b();
        return true;
    }

    private final Map<String, Object> a(JSONObject jSONObject, Map<String, Object> map) {
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                l.b(next, "");
                map.put(next, linkedHashMap);
                a((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                l.b(next, "");
                map.put(next, arrayList);
                a((JSONArray) obj, arrayList);
            } else {
                l.b(next, "");
                l.b(obj, "");
                map.put(next, obj);
            }
        }
        return ag.c(map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        try {
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a(str, System.currentTimeMillis(), com.bytedance.ies.xbridge.platform.b.b.a(a(new JSONObject(str2), (Map<String, Object>) null))));
        } catch (Throwable th) {
            com.bytedance.services.apm.api.a.a(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final boolean a(String str, IEventCenter.b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        a<IEventCenter.b> aVar = new a<>(str, bVar, this.f85948d);
        b bVar2 = new b(aVar, str);
        a(str).put(aVar, bVar2);
        com.bytedance.ies.xbridge.e.b.a(str, bVar2);
        b();
        return true;
    }

    public static final class a<T> extends WeakReference<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f85949a;

        static {
            Covode.recordClassIndex(53818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, T t, ReferenceQueue<T> referenceQueue) {
            super(t, referenceQueue);
            l.d(str, "");
            l.d(referenceQueue, "");
            this.f85949a = str;
        }
    }
}
