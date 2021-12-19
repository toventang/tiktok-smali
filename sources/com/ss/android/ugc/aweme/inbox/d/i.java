package com.ss.android.ugc.aweme.inbox.d;

import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final i f104179c = new i();

    /* renamed from: d  reason: collision with root package name */
    public static final a f104180d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f104181a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f104182b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f104181a == iVar.f104181a && this.f104182b == iVar.f104182b;
    }

    public final String toString() {
        return "LifecycleMeta(startTs=" + this.f104181a + ", endTs=" + this.f104182b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66705);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final long a() {
        return this.f104182b - this.f104181a;
    }

    private i() {
    }

    static {
        Covode.recordClassIndex(66704);
    }

    public final int hashCode() {
        long j2 = this.f104181a;
        long j3 = this.f104182b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }
}
