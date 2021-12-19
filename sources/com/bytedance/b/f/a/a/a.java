package com.bytedance.b.f.a.a;

import android.text.TextUtils;
import com.bytedance.b.k.d.b;
import com.bytedance.b.k.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f26221e;

    /* renamed from: a  reason: collision with root package name */
    public volatile JSONObject f26222a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.b.k.d.a f26223b;

    /* renamed from: c  reason: collision with root package name */
    IConfigManager f26224c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.b.k.d.a f26225d;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f26226f;

    /* renamed from: g  reason: collision with root package name */
    private List<b> f26227g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26228h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f26229i;

    static {
        Covode.recordClassIndex(15230);
    }

    private a() {
    }

    public static a a() {
        if (f26221e == null) {
            synchronized (a.class) {
                if (f26221e == null) {
                    f26221e = new a();
                }
            }
        }
        return f26221e;
    }

    public final synchronized void b() {
        if (!this.f26226f) {
            this.f26226f = true;
            if (com.bytedance.b.e.a.a.c()) {
                this.f26223b = new com.bytedance.b.k.d.a() {
                    /* class com.bytedance.b.f.a.a.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15231);
                    }

                    public final void run() {
                        if (!TextUtils.isEmpty(com.bytedance.b.e.a.a.n())) {
                            if (a.this.f26222a == null) {
                                a aVar = a.this;
                                if (aVar.f26224c == null) {
                                    aVar.f26224c = (IConfigManager) c.a(IConfigManager.class);
                                }
                                if (aVar.f26224c != null) {
                                    String queryConfig = aVar.f26224c.queryConfig();
                                    try {
                                        if (!TextUtils.isEmpty(queryConfig)) {
                                            aVar.a(new JSONObject(queryConfig), true);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).b(a.this.f26223b);
                        }
                    }
                };
                b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).a(this.f26223b);
            }
            IConfigManager iConfigManager = (IConfigManager) c.a(IConfigManager.class);
            this.f26224c = iConfigManager;
            iConfigManager.registerConfigListener(new com.bytedance.services.slardar.config.a() {
                /* class com.bytedance.b.f.a.a.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(15232);
                }

                @Override // com.bytedance.services.slardar.config.a
                public final void d() {
                }

                @Override // com.bytedance.services.slardar.config.a
                public final void a(JSONObject jSONObject, final boolean z) {
                    if (jSONObject != null) {
                        try {
                            if (!com.bytedance.b.e.a.a.c() || a.this.f26222a == null || !z) {
                                final JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                a.this.f26225d = new com.bytedance.b.k.d.a() {
                                    /* class com.bytedance.b.f.a.a.a.AnonymousClass2.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(15233);
                                    }

                                    public final void run() {
                                        try {
                                            b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).b(a.this.f26225d);
                                            a.this.f26225d = null;
                                            a.this.a(jSONObject2, z);
                                        } catch (Exception e2) {
                                            com.bytedance.b.k.b.b.a("APM-Config", "onConfigChanged", e2);
                                        }
                                    }
                                };
                                b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).a(a.this.f26225d);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public final void a(b bVar) {
        if (this.f26227g == null) {
            this.f26227g = new CopyOnWriteArrayList();
        }
        if (!this.f26227g.contains(bVar)) {
            this.f26227g.add(bVar);
        }
        if (this.f26229i) {
            bVar.a(this.f26222a);
        }
    }

    public final void a(JSONObject jSONObject, boolean z) {
        if (!e.a(jSONObject)) {
            this.f26222a = jSONObject;
            this.f26228h = z;
            this.f26229i = true;
            List<b> list = this.f26227g;
            if (list != null) {
                for (b bVar : list) {
                    try {
                        bVar.a(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
