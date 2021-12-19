package com.bytedance.b;

import android.content.Context;
import android.util.Pair;
import com.bytedance.apm.c;
import com.bytedance.apm.d;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.c;
import com.bytedance.b.b.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.e;
import com.bytedance.services.slardar.config.b;
import com.ss.android.common.util.f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static List<b> f25824a;

    static {
        Covode.recordClassIndex(15077);
    }

    public static Runnable a(final Context context) {
        return com.bytedance.b.f.a.a(new com.bytedance.b.f.b() {
            /* class com.bytedance.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15078);
            }

            @Override // com.bytedance.b.f.b
            public final IHttpService a() {
                return c.f24692h;
            }

            @Override // com.bytedance.b.e.a.b
            public final Context b() {
                return context;
            }

            @Override // com.bytedance.b.e.a.b
            public final String g() {
                return f.b(c.f24685a);
            }

            @Override // com.bytedance.b.f.b
            public final e o() {
                return ApmDelegate.a.f25042a.f25012f;
            }

            @Override // com.bytedance.b.f.b
            public final com.bytedance.b.j.b.a p() {
                return new com.bytedance.b.j.b.a() {
                    /* class com.bytedance.b.a.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15079);
                    }

                    @Override // com.bytedance.b.j.b.a
                    public final String a(String str, List<Pair<String, String>> list) {
                        return com.bytedance.frameworks.a.a.a.a(str, list);
                    }
                };
            }

            @Override // com.bytedance.b.e.a.b, com.bytedance.b.f.b
            public final JSONObject r() {
                return super.r();
            }

            @Override // com.bytedance.b.f.b
            public final g t() {
                return new g() {
                    /* class com.bytedance.b.a.AnonymousClass1.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15080);
                    }

                    @Override // com.bytedance.b.b.a.g
                    public final void a(final JSONObject jSONObject) {
                        if (c.b()) {
                            b.a.f25210a.a(new Runnable() {
                                /* class com.bytedance.b.a.AnonymousClass1.AnonymousClass2.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(15081);
                                }

                                public final void run() {
                                    if (a.f25824a != null) {
                                        Iterator<com.bytedance.services.slardar.config.b> it = a.f25824a.iterator();
                                        while (it.hasNext()) {
                                            it.next();
                                        }
                                    }
                                }
                            });
                        }
                    }
                };
            }

            @Override // com.bytedance.b.f.b
            public final com.bytedance.b.g.a.b u() {
                return new c();
            }

            @Override // com.bytedance.b.f.b
            public final com.bytedance.b.g.a v() {
                return new b();
            }

            @Override // com.bytedance.b.f.b
            public final com.bytedance.b.j.a.a w() {
                return new com.bytedance.b.j.a.a() {
                    /* class com.bytedance.b.a.AnonymousClass1.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(15082);
                    }

                    @Override // com.bytedance.b.j.a.a
                    public final JSONObject a() {
                        JSONObject jSONObject = new JSONObject();
                        c.a.f25246a.b(jSONObject, false);
                        return jSONObject;
                    }
                };
            }

            @Override // com.bytedance.b.e.a.b
            public final int c() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24879a;
                }
                return 0;
            }

            @Override // com.bytedance.b.e.a.b
            public final String d() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24880b;
                }
                return null;
            }

            @Override // com.bytedance.b.e.a.b
            public final String h() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24882d;
                }
                return null;
            }

            @Override // com.bytedance.b.e.a.b
            public final int i() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24883e;
                }
                return 0;
            }

            @Override // com.bytedance.b.e.a.b
            public final String j() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24884f;
                }
                return null;
            }

            @Override // com.bytedance.b.e.a.b
            public final int k() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24883e;
                }
                return 0;
            }

            @Override // com.bytedance.b.e.a.b
            public final String l() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24887i;
                }
                return null;
            }

            @Override // com.bytedance.b.e.a.b
            public final String m() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24888j;
                }
                return null;
            }

            @Override // com.bytedance.b.e.a.b
            public final int n() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24885g;
                }
                return 0;
            }

            @Override // com.bytedance.b.e.a.b, com.bytedance.b.f.b
            public final JSONObject q() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24889k;
                }
                return null;
            }

            @Override // com.bytedance.b.e.a.b, com.bytedance.b.f.b
            public final Map<String, String> s() {
                d g2 = com.bytedance.apm.c.g();
                if (g2 != null) {
                    return g2.f24890l;
                }
                return null;
            }

            @Override // com.bytedance.b.e.a.b
            public final long e() {
                if (com.bytedance.apm.c.g() == null || com.bytedance.apm.c.f24691g == null) {
                    return 0;
                }
                return com.bytedance.apm.c.f24691g.c();
            }

            @Override // com.bytedance.b.e.a.b
            public final String f() {
                if (com.bytedance.apm.c.g() == null || com.bytedance.apm.c.f24691g == null) {
                    return null;
                }
                return com.bytedance.apm.c.f24691g.b();
            }
        });
    }
}
