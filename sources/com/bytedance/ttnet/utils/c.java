package com.bytedance.ttnet.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.g;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static b f44655a;

    /* renamed from: b  reason: collision with root package name */
    public static a f44656b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f44657c = true;

    public interface a {
        static {
            Covode.recordClassIndex(27305);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(27306);
        }

        void a(String str, int i2, boolean z, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(27304);
    }

    public static String a(String str) {
        if (!f44657c) {
            return null;
        }
        try {
            if (g.a(str).getHost().endsWith(com.bytedance.ttnet.b.a())) {
                return String.valueOf(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
