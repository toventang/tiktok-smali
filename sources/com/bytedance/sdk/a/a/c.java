package com.bytedance.sdk.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.o.d;
import com.ss.android.account.f;

public final class c {
    static {
        Covode.recordClassIndex(26416);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static String f43087a = "https://";

        /* renamed from: b  reason: collision with root package name */
        public static String f43088b = "http://";

        static {
            Covode.recordClassIndex(26417);
        }

        public static String a() {
            return f.a().a();
        }

        public static String a(String str) {
            d dVar = f.f58196c;
            if (dVar == null || !dVar.a()) {
                return f43087a + a() + str;
            }
            return f43088b + a() + str;
        }
    }

    public static class b {
        static {
            Covode.recordClassIndex(26418);
        }

        private static String a() {
            return f.a().a();
        }

        public static String a(String str) {
            d dVar = f.f58196c;
            if (dVar == null || !dVar.a()) {
                return "https://" + a() + str;
            }
            return "http://" + a() + str;
        }
    }
}
