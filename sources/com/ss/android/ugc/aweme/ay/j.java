package com.ss.android.ugc.aweme.ay;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f67820a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static i f67821b = new i();

    private j() {
    }

    static {
        Covode.recordClassIndex(41742);
    }

    public final synchronized void a(boolean z, JSONObject jSONObject) {
        MethodCollector.i(5436);
        l.d(jSONObject, "");
        String optString = jSONObject.optString("uri");
        if (optString == null || optString.length() == 0) {
            MethodCollector.o(5436);
            return;
        }
        boolean a2 = p.a((CharSequence) optString, (CharSequence) "~tplv-tiktok-shrink", false);
        jSONObject.optInt("file_size");
        jSONObject.optInt("duration");
        if (z) {
            f67821b.f67812a++;
            f67821b.f67814c += jSONObject.optInt("file_size") / 1024;
            f67821b.f67816e += jSONObject.optInt("duration");
            if (a2) {
                f67821b.f67813b++;
                f67821b.f67815d += jSONObject.optInt("file_size") / 1024;
                f67821b.f67817f += jSONObject.optInt("duration");
                MethodCollector.o(5436);
                return;
            }
        } else {
            f67821b.f67818g++;
            if (a2) {
                f67821b.f67819h++;
            }
        }
        MethodCollector.o(5436);
    }
}
