package com.ss.android.i;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.i.a.c;
import com.ss.android.ugc.aweme.lego.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static HashMap<String, Boolean> f59580d = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, c> f59581a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f59582b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f59583c;

    /* renamed from: e  reason: collision with root package name */
    public final Queue<c> f59584e;

    /* renamed from: f  reason: collision with root package name */
    public Application f59585f;

    /* renamed from: g  reason: collision with root package name */
    public a f59586g;

    /* renamed from: h  reason: collision with root package name */
    private final Queue<c> f59587h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f59589a = new d((byte) 0);

        static {
            Covode.recordClassIndex(36781);
        }
    }

    static {
        Covode.recordClassIndex(36779);
    }

    private d() {
        this.f59581a = new ConcurrentHashMap();
        this.f59582b = new AtomicBoolean(false);
        this.f59583c = new AtomicBoolean(false);
        this.f59587h = new LinkedList();
        this.f59584e = new LinkedList();
    }

    public final void a() {
        LinkedList linkedList;
        MethodCollector.i(7170);
        if (!this.f59582b.get()) {
            MethodCollector.o(7170);
            return;
        }
        synchronized (this.f59587h) {
            try {
                linkedList = new LinkedList(this.f59587h);
                this.f59587h.clear();
            } finally {
                MethodCollector.o(7170);
            }
        }
        long j2 = 0;
        while (!linkedList.isEmpty()) {
            j2 += 100;
            c cVar = (c) linkedList.poll();
            if (com.bytedance.ies.ugc.statisticlogger.b.a.c()) {
                p.f107614a.postDelayed(new f(this, cVar), j2);
            } else {
                a(cVar);
            }
        }
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public final void a(Context context) {
        if (this.f59582b.get()) {
            AppLog.onResume(context);
        }
    }

    public final void a(a aVar) {
        this.f59586g = aVar;
        Iterator<c> it = this.f59581a.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(c cVar) {
        MethodCollector.i(7180);
        if (f59580d.get(cVar.f59577a) != null) {
            synchronized (this.f59584e) {
                try {
                    if (!this.f59583c.get()) {
                        this.f59584e.offer(cVar);
                        if (this.f59584e.size() > 50) {
                            this.f59584e.poll();
                        }
                        return;
                    }
                } finally {
                    MethodCollector.o(7180);
                }
            }
        } else {
            synchronized (this.f59587h) {
                try {
                    if (!this.f59582b.get()) {
                        this.f59587h.offer(cVar);
                        if (this.f59587h.size() > 50) {
                            this.f59587h.poll();
                        }
                        return;
                    }
                } finally {
                    MethodCollector.o(7180);
                }
            }
        }
        for (c cVar2 : this.f59581a.values()) {
            cVar2.b(cVar);
        }
        MethodCollector.o(7180);
    }

    public final void a(String str, Map<String, String> map, int i2) {
        Set<Map.Entry<String, String>> entrySet;
        HashMap hashMap = new HashMap();
        if (!(map == null || (entrySet = map.entrySet()) == null)) {
            for (Map.Entry<String, String> entry : entrySet) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a(new c(str, hashMap, i2));
    }

    public final void a(String str, String str2, String str3, int i2) {
        a(str, str2, str3, null, null, null, i2);
    }

    public final void a(String str, String str2, String str3, Long l2, Long l3, JSONObject jSONObject, int i2) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(b.q, str);
        }
        if (str3 != null) {
            hashMap.put(b.n, str3);
        }
        if (l2 != null) {
            hashMap.put(b.r, l2);
        }
        if (l3 != null) {
            hashMap.put(b.s, l3);
        }
        if (jSONObject != null) {
            hashMap.put(b.t, jSONObject);
        }
        a(new c(str2, hashMap, i2));
    }
}
