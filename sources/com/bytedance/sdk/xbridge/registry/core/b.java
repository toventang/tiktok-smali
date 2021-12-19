package com.bytedance.sdk.xbridge.registry.core;

import com.bytedance.covode.number.Covode;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1073b f44038a = C1073b.f44040a;

    static {
        Covode.recordClassIndex(26898);
    }

    a a();

    String b();

    public enum a {
        PUBLIC("public"),
        PRIVATE("private"),
        PROTECT("protect"),
        SECURE("secure");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(26899);
        }

        private a(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.bytedance.sdk.xbridge.registry.core.b$b  reason: collision with other inner class name */
    public static final class C1073b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C1073b f44040a = new C1073b();

        private C1073b() {
        }

        static {
            Covode.recordClassIndex(26900);
        }
    }
}
