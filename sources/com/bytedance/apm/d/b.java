package com.bytedance.apm.d;

import com.bytedance.b.k.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.a;
import com.bytedance.monitor.a.b.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f24892a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24893b;

    /* renamed from: c  reason: collision with root package name */
    private List<Object> f24894c;

    static {
        Covode.recordClassIndex(14555);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f24903a = new b((byte) 0);

        static {
            Covode.recordClassIndex(14558);
        }
    }

    private b() {
        this.f24893b = "doctor";
        this.f24894c = new ArrayList();
        this.f24892a = false;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(final String str, final String str2) {
        if (!f.a(this.f24894c)) {
            final ArrayList arrayList = new ArrayList(this.f24894c);
            a.C1013a.f41371a.a(new e() {
                /* class com.bytedance.apm.d.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14556);
                }

                @Override // com.bytedance.monitor.a.b.e
                public final String a() {
                    return "doctor";
                }

                @Override // com.bytedance.monitor.a.b.e
                public final com.bytedance.monitor.a.b.b b() {
                    return com.bytedance.monitor.a.b.b.LIGHT_WEIGHT;
                }

                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }
    }

    public final void a(final String str, final JSONObject jSONObject) {
        if (!f.a(this.f24894c) && jSONObject != null) {
            final ArrayList arrayList = new ArrayList(this.f24894c);
            a.C1013a.f41371a.a(new e() {
                /* class com.bytedance.apm.d.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14557);
                }

                @Override // com.bytedance.monitor.a.b.e
                public final String a() {
                    return "doctor";
                }

                @Override // com.bytedance.monitor.a.b.e
                public final com.bytedance.monitor.a.b.b b() {
                    return com.bytedance.monitor.a.b.b.LIGHT_WEIGHT;
                }

                public final void run() {
                    try {
                        JSONObject jSONObject = jSONObject.getJSONObject("DATA_DOCTOR");
                        jSONObject.put(str, System.currentTimeMillis());
                        jSONObject.optInt("DATA_ID");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
