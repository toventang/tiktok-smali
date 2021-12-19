package com.bytedance.apm.c;

import android.text.TextUtils;
import com.bytedance.apm.c.b;
import com.bytedance.apm.d.b;
import com.bytedance.apm.h;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a<T extends b> implements com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    public static int f24698a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedList<T> f24699b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f24700c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f24701d;

    @Override // com.bytedance.services.slardar.config.a
    public void a(JSONObject jSONObject, boolean z) {
    }

    /* access modifiers changed from: protected */
    public boolean c(T t) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void d(T t) {
    }

    /* access modifiers changed from: protected */
    public abstract void e(T t);

    static {
        Covode.recordClassIndex(14508);
    }

    public final void a() {
        ((IConfigManager) c.a(IConfigManager.class)).registerConfigListener(this);
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void d() {
        this.f24700c = true;
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.c.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(14510);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: com.bytedance.apm.c.a */
            /* JADX WARN: Multi-variable type inference failed */
            public final void run() {
                LinkedList linkedList;
                synchronized (a.this.f24699b) {
                    linkedList = new LinkedList(a.this.f24699b);
                    a.this.f24699b.clear();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a.this.e((b) it.next());
                }
            }
        });
        if (com.bytedance.apm.c.e()) {
            b.a.f24903a.a("APM_SETTING_READY", (String) null);
        }
    }

    public final void a(final T t) {
        if (!b.a.f25210a.a()) {
            b.a.f25210a.a(new Runnable() {
                /* class com.bytedance.apm.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14509);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.apm.c.a */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    a.this.b(t);
                }
            });
        } else {
            b(t);
        }
    }

    public final void b(T t) {
        if (c(t)) {
            d(t);
            if (this.f24700c) {
                e(t);
            } else {
                f(t);
            }
        }
    }

    private void f(T t) {
        if (t != null) {
            synchronized (this.f24699b) {
                if (this.f24699b.size() > f24698a) {
                    T poll = this.f24699b.poll();
                    if (!this.f24701d) {
                        h.b.f24998a.a("apm_cache_buffer_full");
                        this.f24701d = true;
                    }
                    try {
                        poll.a();
                    } catch (Exception unused) {
                    }
                }
                this.f24699b.add(t);
            }
        }
    }

    protected static void a(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        JSONArray optJSONArray;
        if (jSONObject != null) {
            e<com.ss.android.ugc.aweme.net.model.b, Boolean> eVar = new e<>();
            eVar.f112458a = (Q) new com.ss.android.ugc.aweme.net.model.b(str, str2, jSONObject);
            n.f112474e.b_(eVar);
            if (eVar.f112463f == d.INTERCEPT) {
                return;
            }
        }
        if (com.bytedance.apm.c.e()) {
            String[] strArr = new String[1];
            String str3 = "type:" + str + " isSaveUnSampleLog:" + z2 + "isSampled:" + z + " log:" + jSONObject;
            com.bytedance.apm.d.a.a(str, jSONObject, z);
        }
        if (z) {
            JSONObject c2 = g.c(jSONObject);
            if (TextUtils.equals(str, "tracing")) {
                com.bytedance.w.a.c cVar = new com.bytedance.w.a.c(c2, str2);
                if ("batch_tracing".equals(cVar.f45896a)) {
                    JSONObject a2 = cVar.a();
                    JSONArray jSONArray = null;
                    if (!(a2 == null || (optJSONArray = a2.optJSONArray("wrapper_array_data")) == null)) {
                        jSONArray = optJSONArray;
                    }
                    com.bytedance.b.a.a.a(new com.bytedance.b.a.b.d(jSONArray));
                } else {
                    com.bytedance.b.a.a.a(new com.bytedance.b.a.b.d(cVar.a()));
                }
            } else if (TextUtils.equals(str, "common_log")) {
                com.bytedance.b.h.a.a(new com.bytedance.b.a.b.c(str2, c2));
            } else {
                com.bytedance.b.h.a.a(new com.bytedance.b.a.b.c(str, c2));
            }
        }
        com.bytedance.apm.j.a a3 = com.bytedance.apm.j.a.a();
        if (a3.f25051a.size() != 0) {
            b.a.f25210a.b(new Runnable(str, str2, jSONObject) {
                /* class com.bytedance.apm.j.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f25052a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f25053b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ JSONObject f25054c;

                static {
                    Covode.recordClassIndex(14631);
                }

                public final void run() {
                    Iterator<com.bytedance.apm.g.a> it = a.this.f25051a.iterator();
                    while (it.hasNext()) {
                        it.next().a(this.f25053b, this.f25054c);
                    }
                }

                {
                    this.f25052a = r2;
                    this.f25053b = r3;
                    this.f25054c = r4;
                }
            });
        }
        if (TextUtils.equals(str, "ui_action")) {
            com.bytedance.apm.o.a<JSONObject> aVar = com.bytedance.apm.c.c.a.a().f24757a;
            if (aVar.f25194a.size() > aVar.f25195b) {
                aVar.f25194a.removeFirst();
            }
            aVar.f25194a.addLast(jSONObject);
        }
    }
}
