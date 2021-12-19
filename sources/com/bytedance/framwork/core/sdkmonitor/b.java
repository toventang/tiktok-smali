package com.bytedance.framwork.core.sdkmonitor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.b.d.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<l> f29521a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedList<c> f29522b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList<a> f29523c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private int f29524d = 200;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29525e;

    static {
        Covode.recordClassIndex(17186);
    }

    public final void a(final k kVar) {
        if (!this.f29525e) {
            this.f29525e = true;
            a.C0627a.f29455a.a(new Runnable() {
                /* class com.bytedance.framwork.core.sdkmonitor.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17187);
                }

                public final void run() {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    LinkedList linkedList3;
                    MethodCollector.i(10074);
                    try {
                        synchronized (b.this.f29521a) {
                            try {
                                linkedList = new LinkedList(b.this.f29521a);
                                b.this.f29521a.clear();
                            } finally {
                                MethodCollector.o(10074);
                            }
                        }
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            k kVar = kVar;
                            if (lVar != null && !TextUtils.isEmpty(lVar.f29592a)) {
                                kVar.a(lVar.f29592a, lVar.f29593b, lVar.f29594c, lVar.f29595d, lVar.f29596e, lVar.f29597f, lVar.f29598g);
                            }
                        }
                        synchronized (b.this.f29522b) {
                            try {
                                linkedList2 = new LinkedList(b.this.f29522b);
                                b.this.f29522b.clear();
                            } finally {
                                MethodCollector.o(10074);
                            }
                        }
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            c cVar = (c) it2.next();
                            k kVar2 = kVar;
                            if (cVar != null) {
                                String str = cVar.f29528a;
                                JSONObject jSONObject = cVar.f29529b;
                                long j2 = cVar.f29530c;
                                try {
                                    jSONObject.put("log_type", str);
                                    jSONObject.put("network_type", kVar2.k());
                                    if (!TextUtils.isEmpty(kVar2.l())) {
                                        jSONObject.put("session_id", kVar2.l());
                                    }
                                    if (jSONObject.isNull("timestamp")) {
                                        jSONObject.put("timestamp", j2);
                                    }
                                    if (!(kVar2.f29550c == null || kVar2.f29553f == null)) {
                                        if (!TextUtils.isEmpty(str)) {
                                            if (kVar2.f29553f.opt(str) != null) {
                                                kVar2.f29550c.a("common_log", "common_log", jSONObject);
                                            }
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        synchronized (b.this.f29523c) {
                            try {
                                linkedList3 = new LinkedList(b.this.f29523c);
                                b.this.f29523c.clear();
                            } finally {
                                MethodCollector.o(10074);
                            }
                        }
                        Iterator it3 = linkedList3.iterator();
                        while (it3.hasNext()) {
                            a aVar = (a) it3.next();
                            k kVar3 = kVar;
                            if (aVar != null && !TextUtils.isEmpty(aVar.f29513a)) {
                                if (aVar.f29513a.equals("api_error")) {
                                    kVar3.b(aVar.f29514b, aVar.f29515c, aVar.f29516d, aVar.f29517e, aVar.f29518f, aVar.f29519g, aVar.f29520h);
                                } else if (aVar.f29513a.equals("api_all")) {
                                    kVar3.a(aVar.f29514b, aVar.f29515c, aVar.f29516d, aVar.f29517e, aVar.f29518f, aVar.f29519g, aVar.f29520h);
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        MethodCollector.o(10074);
                    }
                }
            });
        }
    }

    public final void a(a aVar) {
        MethodCollector.i(11403);
        synchronized (this.f29523c) {
            try {
                if (this.f29523c.size() > this.f29524d) {
                    this.f29523c.poll();
                }
                this.f29523c.add(aVar);
            } finally {
                MethodCollector.o(11403);
            }
        }
    }

    public final void a(l lVar) {
        MethodCollector.i(11240);
        synchronized (this.f29521a) {
            try {
                if (this.f29521a.size() > this.f29524d) {
                    this.f29521a.poll();
                }
                this.f29521a.add(lVar);
            } finally {
                MethodCollector.o(11240);
            }
        }
    }
}
