package com.bytedance.crash.j;

import android.content.Context;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.m;
import com.bytedance.crash.nativecrash.g;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.runtime.p;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import com.bytedance.crash.util.w;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f27668b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27669a;

    static {
        Covode.recordClassIndex(16227);
    }

    public static e a() {
        if (f27668b == null) {
            f27668b = new e(m.f27724a);
        }
        return f27668b;
    }

    private e(Context context) {
        this.f27669a = context;
    }

    public final void b(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            n.b().a(new Runnable() {
                /* class com.bytedance.crash.j.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16228);
                }

                public final void run() {
                    String javaCrashUploadUrl = m.f27730g.getJavaCrashUploadUrl();
                    try {
                        jSONObject.put("upload_scene", "direct");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    f.a(javaCrashUploadUrl, jSONObject.toString());
                }
            });
        }
    }

    public final boolean a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String javaCrashUploadUrl = m.f27730g.getJavaCrashUploadUrl();
                File file = new File(r.a(this.f27669a), "dart_".concat(String.valueOf(m.d())));
                j.a(file, file.getName(), javaCrashUploadUrl, jSONObject);
                jSONObject.put("upload_scene", "direct");
                if (!f.a(javaCrashUploadUrl, jSONObject.toString()).a()) {
                    return false;
                }
                j.a(file);
                return true;
            } catch (Throwable unused) {
                m.f27730g.isDebugMode();
            }
        }
        return false;
    }

    public final void a(String str, JSONObject jSONObject) {
        if (!com.bytedance.crash.util.n.a(jSONObject)) {
            try {
                File file = new File(r.a(this.f27669a), a.a("ensure_%s", new Object[]{m.d()}));
                j.a(file, file.getName(), str, jSONObject);
                if (f.a(str, jSONObject.toString()).a()) {
                    j.a(file);
                }
            } catch (Throwable unused) {
                m.f27730g.isDebugMode();
            }
        }
    }

    public static boolean a(JSONObject jSONObject, File file, File file2) {
        boolean z = false;
        try {
            String asanReportUploadUrl = m.f27730g.getAsanReportUploadUrl();
            w.a(jSONObject, file2);
            z = f.a(asanReportUploadUrl, jSONObject.toString(), new j.b(file), new j.b(file2)).a();
            return z;
        } catch (Throwable unused) {
            m.f27730g.isDebugMode();
            return z;
        }
    }

    public static boolean a(String str, String str2, String str3, List<String> list) {
        v.a("npth", "real upload alog " + str3 + ": " + list);
        try {
            return f.a(m.f27730g.getAlogUploadUrl(), str, str2, str3, list);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(JSONObject jSONObject, File file, File file2, long j2) {
        try {
            String nativeCrashUploadUrl = m.f27730g.getNativeCrashUploadUrl();
            try {
                w.a(jSONObject, file2);
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
            return f.a(nativeCrashUploadUrl, jSONObject.toString(), new j.b(file), new j.b(file2), p.b(j2), g.a(jSONObject.optJSONArray("alive_pids"))).a();
        } catch (Throwable unused) {
            m.f27730g.isDebugMode();
            return false;
        }
    }
}
