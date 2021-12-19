package com.ss.android.ugc.aweme.commerce_sticker_impl.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static C1647a f73587a;

    /* renamed from: b  reason: collision with root package name */
    public static String f73588b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f73589c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45290);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce_sticker_impl.b.a.a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.b.a$a  reason: collision with other inner class name */
    public static final class C1647a {

        /* renamed from: a  reason: collision with root package name */
        public final String f73590a;

        /* renamed from: b  reason: collision with root package name */
        public final String f73591b;

        /* renamed from: c  reason: collision with root package name */
        public final String f73592c;

        /* renamed from: d  reason: collision with root package name */
        public final long f73593d;

        static {
            Covode.recordClassIndex(45291);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1647a)) {
                return false;
            }
            C1647a aVar = (C1647a) obj;
            return l.a(this.f73590a, aVar.f73590a) && l.a(this.f73591b, aVar.f73591b) && l.a(this.f73592c, aVar.f73592c) && this.f73593d == aVar.f73593d;
        }

        public final int hashCode() {
            String str = this.f73590a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f73591b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f73592c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            long j2 = this.f73593d;
            return ((hashCode2 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "EffectData(creationId=" + this.f73590a + ", shootWay=" + this.f73591b + ", propId=" + this.f73592c + ", startUseTime=" + this.f73593d + ")";
        }

        public C1647a(String str, String str2, String str3, long j2) {
            this.f73590a = str;
            this.f73591b = str2;
            this.f73592c = str3;
            this.f73593d = j2;
        }
    }
}
