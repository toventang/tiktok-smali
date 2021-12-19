package com.bytedance.crash.h;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27605a;

    /* renamed from: b  reason: collision with root package name */
    private static AbstractC0589a f27606b;

    /* renamed from: com.bytedance.crash.h.a$a  reason: collision with other inner class name */
    public interface AbstractC0589a {
        static {
            Covode.recordClassIndex(16202);
        }

        JSONArray a();
    }

    static {
        Covode.recordClassIndex(16201);
    }

    public static JSONArray a() {
        try {
            AbstractC0589a aVar = f27606b;
            if (aVar == null) {
                return null;
            }
            return aVar.a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
