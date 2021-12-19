package com.ss.android.ugc.aweme.question.a;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.question.c;
import com.ss.android.ugc.aweme.question.e.a;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f119897a = 15000;

    /* renamed from: b  reason: collision with root package name */
    public static final e<String, C3091a> f119898b = new e<>(32);

    /* renamed from: c  reason: collision with root package name */
    public static final a f119899c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final e<String, b> f119900d = new e<>(32);

    private a() {
    }

    static {
        Covode.recordClassIndex(77900);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.a.a$a  reason: collision with other inner class name */
    public static final class C3091a {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.question.api.a f119901a;

        /* renamed from: b  reason: collision with root package name */
        public final long f119902b;

        static {
            Covode.recordClassIndex(77901);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3091a)) {
                return false;
            }
            C3091a aVar = (C3091a) obj;
            return l.a(this.f119901a, aVar.f119901a) && this.f119902b == aVar.f119902b;
        }

        public final int hashCode() {
            com.ss.android.ugc.aweme.question.api.a aVar = this.f119901a;
            int hashCode = aVar != null ? aVar.hashCode() : 0;
            long j2 = this.f119902b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "QuestionDetailNode(questionDetail=" + this.f119901a + ", timestamp=" + this.f119902b + ")";
        }

        public C3091a(com.ss.android.ugc.aweme.question.api.a aVar, long j2) {
            l.d(aVar, "");
            this.f119901a = aVar;
            this.f119902b = j2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.question.api.b f119903a;

        /* renamed from: b  reason: collision with root package name */
        public final long f119904b;

        static {
            Covode.recordClassIndex(77902);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f119903a, bVar.f119903a) && this.f119904b == bVar.f119904b;
        }

        public final int hashCode() {
            com.ss.android.ugc.aweme.question.api.b bVar = this.f119903a;
            int hashCode = bVar != null ? bVar.hashCode() : 0;
            long j2 = this.f119904b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "QuestionVideosNode(questionVideos=" + this.f119903a + ", timestamp=" + this.f119904b + ")";
        }

        public b(com.ss.android.ugc.aweme.question.api.b bVar, long j2) {
            l.d(bVar, "");
            this.f119903a = bVar;
            this.f119904b = j2;
        }
    }

    public static void a(a.C3094a aVar, com.ss.android.ugc.aweme.question.api.b bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        a(aVar.f119962c, aVar.f119961b, aVar.f119960a, bVar, aVar.f119963d);
    }

    public static com.ss.android.ugc.aweme.question.api.b a(long j2, int i2, int i3, c cVar) {
        int i4;
        Integer videosCount;
        if (i2 != 0) {
            return null;
        }
        e<String, b> eVar = f119900d;
        StringBuilder append = new StringBuilder().append(j2).append('&').append(i2).append('&').append(20).append('&');
        if (cVar == null || (videosCount = cVar.getVideosCount()) == null) {
            i4 = -1;
        } else {
            i4 = videosCount.intValue();
        }
        b a2 = eVar.a(append.append(i4).toString());
        if (a2 == null || System.currentTimeMillis() - a2.f119904b >= ((long) f119897a)) {
            return null;
        }
        return a2.f119903a;
    }

    private static void a(long j2, int i2, int i3, com.ss.android.ugc.aweme.question.api.b bVar, c cVar) {
        int i4;
        Integer videosCount;
        if (i2 == 0) {
            e<String, b> eVar = f119900d;
            StringBuilder append = new StringBuilder().append(j2).append('&').append(i2).append('&').append(i3).append('&');
            if (cVar == null || (videosCount = cVar.getVideosCount()) == null) {
                i4 = -1;
            } else {
                i4 = videosCount.intValue();
            }
            eVar.a(append.append(i4).toString(), new b(bVar, System.currentTimeMillis()));
        }
    }
}
