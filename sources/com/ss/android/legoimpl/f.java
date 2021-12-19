package com.ss.android.legoimpl;

import android.content.Context;
import android.util.Log;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.lancet.d;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f59641a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(36824);
    }

    private static File a(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    static void a(Context context, int i2, String str) {
        long j2;
        if (context == null || a(context) == null) {
            j2 = -1;
        } else {
            File a2 = a(context);
            l.b(a2, "");
            j2 = a2.getUsableSpace();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", i2);
            jSONObject.put("reason", str);
            jSONObject.put("size", j2);
            jSONObject.put("flag", 0);
            jSONObject.put("desc", Log.getStackTraceString(new Exception()));
        } catch (Exception unused) {
        }
        b.a("migrate_err", jSONObject);
    }

    public static void a(Context context, String str, String str2, Exception exc) {
        HashSet<String> d2;
        l.d(context, "");
        l.d(exc, "");
        l.d(context, "");
        if (str != null && (d2 = com.bytedance.v.a.b.d(context)) != null && !d2.isEmpty()) {
            Iterator<String> it = d2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                l.b(next, "");
                if (p.a((CharSequence) str, (CharSequence) next, false)) {
                    return;
                }
            }
            HashSet<String> c2 = com.bytedance.v.a.b.c(context);
            if (c2 != null && !c2.isEmpty()) {
                Iterator<String> it2 = c2.iterator();
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    l.b(next2, "");
                    if (p.a((CharSequence) str, (CharSequence) next2, false)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("data_uri", str);
                            jSONObject.put("reason", str2 + "#" + e.a(exc));
                        } catch (Exception unused) {
                        }
                        b.a("storage_access_err", jSONObject);
                        return;
                    }
                }
            }
        }
    }
}
