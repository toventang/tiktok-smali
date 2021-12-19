package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;

public final class h {
    static {
        Covode.recordClassIndex(26032);
    }

    /* access modifiers changed from: package-private */
    public static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private final String f42507a;

        /* renamed from: b  reason: collision with root package name */
        private final String f42508b;

        static {
            Covode.recordClassIndex(26033);
        }

        @Override // com.bytedance.retrofit2.g
        public final String a() {
            return this.f42507a;
        }

        a(String str, String str2) {
            this.f42507a = str;
            this.f42508b = str2;
        }
    }

    public static g a(String str) {
        return new a(str, "default");
    }
}
