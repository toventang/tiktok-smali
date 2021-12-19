package com.ss.android.ugc.aweme.music.i;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final e<String, b> f111507a = new e<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final e<String, a> f111508b = new e<>(16);

    /* renamed from: c  reason: collision with root package name */
    public static final d f111509c = new d();

    /* renamed from: d  reason: collision with root package name */
    private static int f111510d = 15000;

    private d() {
    }

    static {
        Covode.recordClassIndex(71628);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final MusicAwemeList f111511a;

        /* renamed from: b  reason: collision with root package name */
        public final long f111512b;

        static {
            Covode.recordClassIndex(71629);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f111511a, aVar.f111511a) && this.f111512b == aVar.f111512b;
        }

        public final int hashCode() {
            MusicAwemeList musicAwemeList = this.f111511a;
            int hashCode = musicAwemeList != null ? musicAwemeList.hashCode() : 0;
            long j2 = this.f111512b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "MusicAwemeListNode(musicAwemeList=" + this.f111511a + ", timeStamp=" + this.f111512b + ")";
        }

        public a(MusicAwemeList musicAwemeList, long j2) {
            l.d(musicAwemeList, "");
            this.f111511a = musicAwemeList;
            this.f111512b = j2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final MusicDetail f111513a;

        /* renamed from: b  reason: collision with root package name */
        public final long f111514b;

        static {
            Covode.recordClassIndex(71630);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f111513a, bVar.f111513a) && this.f111514b == bVar.f111514b;
        }

        public final int hashCode() {
            MusicDetail musicDetail = this.f111513a;
            int hashCode = musicDetail != null ? musicDetail.hashCode() : 0;
            long j2 = this.f111514b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "MusicDetailNode(musicDetail=" + this.f111513a + ", timeStamp=" + this.f111514b + ")";
        }

        public b(MusicDetail musicDetail, long j2) {
            l.d(musicDetail, "");
            this.f111513a = musicDetail;
            this.f111514b = j2;
        }
    }

    public static MusicDetail a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        b a2 = f111507a.a(str + '&' + str2);
        if (a2 == null || System.currentTimeMillis() - a2.f111514b >= ((long) f111510d)) {
            return null;
        }
        return a2.f111513a;
    }

    public static long b(String str, long j2, int i2, int i3) {
        l.d(str, "");
        a a2 = f111508b.a(str + '&' + j2 + '&' + 20 + '&' + i3);
        if (a2 != null) {
            return a2.f111512b;
        }
        return -1;
    }

    public static MusicAwemeList a(String str, long j2, int i2, int i3) {
        a a2;
        l.d(str, "");
        if (j2 == 0 && (a2 = f111508b.a(str + '&' + j2 + '&' + 20 + '&' + i3)) != null && System.currentTimeMillis() - a2.f111512b < ((long) f111510d)) {
            return a2.f111511a;
        }
        return null;
    }
}
