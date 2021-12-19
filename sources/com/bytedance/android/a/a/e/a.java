package com.bytedance.android.a.a.e;

import com.bytedance.android.a.a.e;
import com.bytedance.android.a.a.g;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static b f6653a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile int f6654b;

    static {
        Covode.recordClassIndex(3193);
    }

    private static b a() {
        if (f6653a == null) {
            b();
        }
        return f6653a;
    }

    private static synchronized void b() {
        synchronized (a.class) {
            if (f6653a == null) {
                if (f6654b < 3) {
                    g gVar = e.d().f6651i;
                    if (gVar != null) {
                        com.bytedance.android.a.a.f.a aVar = e.d().f6645c;
                        if (aVar != null && aVar.f6662f) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (e.d().f6650h != null) {
                                    try {
                                        jSONObject.putOpt("device_id", "");
                                        jSONObject.putOpt("channel", "");
                                        jSONObject.putOpt("app_version", "1.6.0-i18n");
                                        jSONObject.putOpt("update_version_code", "");
                                    } catch (Throwable unused) {
                                    }
                                }
                                e.d();
                                f6653a = gVar.a();
                                f6654b++;
                            } catch (Throwable unused2) {
                                f6654b++;
                            }
                        }
                    }
                }
            }
        }
    }

    protected static JSONObject b(long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cost", j2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public final void a(String str, long j2, JSONObject jSONObject) {
        a(str, b(j2), jSONObject);
    }

    @Override // com.bytedance.android.a.a.e.b
    public final void a(String str, int i2, JSONObject jSONObject) {
        b a2 = a();
        if (a2 != null) {
            try {
                a2.a(str, i2, jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.android.a.a.e.b
    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        b a2 = a();
        if (a2 != null) {
            try {
                a2.a(str, jSONObject, jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.android.a.a.e.b
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        b a2 = a();
        if (a2 != null) {
            try {
                a2.a(str, i2, jSONObject, jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
