package com.ss.android.ugc.aweme.challenge.b;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f69907a = 15000;

    /* renamed from: b  reason: collision with root package name */
    public static final e<String, b> f69908b = new e<>(16);

    /* renamed from: c  reason: collision with root package name */
    public static final e<String, C1582a> f69909c = new e<>(16);

    /* renamed from: d  reason: collision with root package name */
    public static final a f69910d = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(43107);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.b.a$a  reason: collision with other inner class name */
    public static final class C1582a {

        /* renamed from: a  reason: collision with root package name */
        public final ChallengeAwemeList f69911a;

        /* renamed from: b  reason: collision with root package name */
        public final long f69912b;

        static {
            Covode.recordClassIndex(43108);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1582a)) {
                return false;
            }
            C1582a aVar = (C1582a) obj;
            return l.a(this.f69911a, aVar.f69911a) && this.f69912b == aVar.f69912b;
        }

        public final int hashCode() {
            ChallengeAwemeList challengeAwemeList = this.f69911a;
            int hashCode = challengeAwemeList != null ? challengeAwemeList.hashCode() : 0;
            long j2 = this.f69912b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "ChallengeAwemeListNode(challengeAwemeList=" + this.f69911a + ", timestamp=" + this.f69912b + ")";
        }

        public C1582a(ChallengeAwemeList challengeAwemeList, long j2) {
            l.d(challengeAwemeList, "");
            this.f69911a = challengeAwemeList;
            this.f69912b = j2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ChallengeDetail f69913a;

        /* renamed from: b  reason: collision with root package name */
        public final long f69914b;

        static {
            Covode.recordClassIndex(43109);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f69913a, bVar.f69913a) && this.f69914b == bVar.f69914b;
        }

        public final int hashCode() {
            ChallengeDetail challengeDetail = this.f69913a;
            int hashCode = challengeDetail != null ? challengeDetail.hashCode() : 0;
            long j2 = this.f69914b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "ChallengeDetailNode(challengeDetail=" + this.f69913a + ", timestamp=" + this.f69914b + ")";
        }

        public b(ChallengeDetail challengeDetail, long j2) {
            l.d(challengeDetail, "");
            this.f69913a = challengeDetail;
            this.f69914b = j2;
        }
    }

    public static ChallengeAwemeList a(String str, long j2, int i2, int i3, boolean z, String str2, String str3, String str4) {
        C1582a a2;
        if (j2 != 0 || (a2 = f69909c.a(str + '&' + j2 + '&' + 20 + '&' + i3 + '&' + z + '&' + str2 + '&' + str3 + '&' + str4)) == null || System.currentTimeMillis() - a2.f69912b >= ((long) f69907a)) {
            return null;
        }
        return a2.f69911a;
    }

    public static long b(String str, long j2, int i2, int i3, boolean z, String str2, String str3, String str4) {
        C1582a a2 = f69909c.a(str + '&' + j2 + '&' + 20 + '&' + i3 + '&' + z + '&' + str2 + '&' + str3 + '&' + str4);
        if (a2 != null) {
            return a2.f69912b;
        }
        return -1;
    }
}
