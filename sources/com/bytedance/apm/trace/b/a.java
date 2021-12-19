package com.bytedance.apm.trace.b;

import com.bytedance.apm.c;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.f;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class a implements b.AbstractC0531b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, C0533a> f25294a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25295b;

    static {
        Covode.recordClassIndex(14732);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25308a = new a((byte) 0);

        static {
            Covode.recordClassIndex(14735);
        }
    }

    private a() {
        this.f25294a = new HashMap<>();
        this.f25295b = true;
        b.a.f25210a.a(this);
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.bytedance.apm.p.b.AbstractC0531b
    public final void a(long j2) {
        float f2;
        if (!this.f25294a.isEmpty()) {
            Iterator<Map.Entry<String, C0533a>> it = this.f25294a.entrySet().iterator();
            int i2 = f.f25249b;
            while (it.hasNext()) {
                Map.Entry<String, C0533a> next = it.next();
                String key = next.getKey();
                C0533a value = next.getValue();
                boolean z = false;
                if (j2 - value.f25306c > 120000) {
                    it.remove();
                    if (value.f25307d > 0) {
                        f2 = value.f25305b / ((float) value.f25307d);
                    } else {
                        f2 = -1.0f;
                    }
                    if (c.e()) {
                        String[] strArr = new String[1];
                        String str = "aggregate fps: " + key + " , value: " + f2;
                    }
                    if (f2 > 0.0f) {
                        float f3 = (float) i2;
                        if (f2 > f3) {
                            f2 = f3;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", (double) f2);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("scene", key);
                            com.bytedance.apm.c.b.f fVar = new com.bytedance.apm.c.b.f("fps", key, jSONObject, jSONObject2, null, (byte) 0);
                            com.bytedance.b.i.a.b.a(fVar, true);
                            JSONObject jSONObject3 = fVar.f24750f;
                            jSONObject3.put("refresh_rate", i2);
                            if (this.f25295b) {
                                this.f25295b = false;
                                jSONObject3.put("device_max_refresh_rate", f.f25250c);
                                if (!f.f25251d) {
                                    z = true;
                                }
                                jSONObject3.put("refresh_rate_restricted", z);
                            }
                            com.bytedance.apm.c.a.a.b().a(fVar);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    public final void a(final String str, final float f2) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.trace.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14733);
            }

            public final void run() {
                C0533a aVar = a.this.f25294a.get(str);
                if (aVar == null) {
                    a.this.f25294a.put(str, new C0533a(str, f2));
                    return;
                }
                aVar.f25305b += f2;
                aVar.f25307d++;
            }
        });
    }

    /* renamed from: com.bytedance.apm.trace.b.a$a  reason: collision with other inner class name */
    static class C0533a {

        /* renamed from: a  reason: collision with root package name */
        public String f25304a;

        /* renamed from: b  reason: collision with root package name */
        public float f25305b;

        /* renamed from: c  reason: collision with root package name */
        long f25306c = System.currentTimeMillis();

        /* renamed from: d  reason: collision with root package name */
        int f25307d = 1;

        static {
            Covode.recordClassIndex(14734);
        }

        C0533a(String str, float f2) {
            this.f25304a = str;
            this.f25305b = f2;
        }
    }
}
