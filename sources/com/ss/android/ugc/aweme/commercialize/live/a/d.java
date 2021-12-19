package com.ss.android.ugc.aweme.commercialize.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f74541b = new a((byte) 0);
    @c(a = "product_status")

    /* renamed from: a  reason: collision with root package name */
    public final int f74542a = 0;

    static {
        Covode.recordClassIndex(45965);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && this.f74542a == ((d) obj).f74542a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f74542a;
    }

    public final String toString() {
        return "LiveProduct(productStatus=" + this.f74542a + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45966);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private d() {
    }
}
