package com.bytedance.sdk.xbridge.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final b f43914b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<String, a> f43915a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(26836);
    }

    public enum a {
        PUBLIC("public"),
        PROTECT("protect"),
        PRIVATE("private"),
        SECURE("secure");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(26837);
        }

        private a(String str) {
            this.value = str;
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(26838);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static a a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -977423767:
                        if (str.equals("public")) {
                            return a.PUBLIC;
                        }
                        break;
                    case -906273929:
                        if (str.equals("secure")) {
                            return a.SECURE;
                        }
                        break;
                    case -314497661:
                        if (str.equals("private")) {
                            return a.PRIVATE;
                        }
                        break;
                    case -309012785:
                        if (str.equals("protect")) {
                            return a.PROTECT;
                        }
                        break;
                }
            }
            return a.PUBLIC;
        }
    }

    public final a a(String str) {
        l.c(str, "");
        return this.f43915a.get(str);
    }
}
