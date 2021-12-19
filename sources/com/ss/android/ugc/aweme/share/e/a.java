package com.ss.android.ugc.aweme.share.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final C3198a f123473b = new C3198a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f123474a;

    static {
        Covode.recordClassIndex(81069);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f123474a == ((a) obj).f123474a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f123474a;
    }

    public final String toString() {
        return "ShareFinishedEvent(type=" + this.f123474a + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.share.e.a$a  reason: collision with other inner class name */
    public static final class C3198a {
        static {
            Covode.recordClassIndex(81070);
        }

        private C3198a() {
        }

        public /* synthetic */ C3198a(byte b2) {
            this();
        }
    }

    public a(int i2) {
        this.f123474a = i2;
    }
}
