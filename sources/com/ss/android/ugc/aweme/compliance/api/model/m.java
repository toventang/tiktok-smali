package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f76683b = new a((byte) 0);
    @c(a = "status")

    /* renamed from: a  reason: collision with root package name */
    public final int f76684a = 2;

    static {
        Covode.recordClassIndex(47357);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && this.f76684a == ((m) obj).f76684a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f76684a;
    }

    public final String toString() {
        return "PrivacyAgreementRecord(status=" + this.f76684a + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47358);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
