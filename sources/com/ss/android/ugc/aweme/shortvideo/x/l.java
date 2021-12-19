package com.ss.android.ugc.aweme.shortvideo.x;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final int f133004b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f133005c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f133006d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final a f133007e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f133008a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof l) && this.f133008a == ((l) obj).f133008a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f133008a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "RecorderConfigData(isBoy=" + this.f133008a + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86979);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(86978);
    }
}
