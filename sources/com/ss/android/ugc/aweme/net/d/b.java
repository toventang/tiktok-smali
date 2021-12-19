package com.ss.android.ugc.aweme.net.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.am;
import h.f.b.l;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f112286a;

    /* renamed from: b  reason: collision with root package name */
    public static a f112287b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f112288c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final a f112289d = new a(am.a("/aweme/v2/feed/"), 30000, 30000, 0, 0, 24);

    private b() {
    }

    public static final class a {
        @c(a = "path")

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f112290a;
        @c(a = "socket_connect_timeout")

        /* renamed from: b  reason: collision with root package name */
        public final long f112291b;
        @c(a = "socket_read_timeout")

        /* renamed from: c  reason: collision with root package name */
        public final long f112292c;
        @c(a = "socket_write_timeout")

        /* renamed from: d  reason: collision with root package name */
        public final long f112293d;
        @c(a = "protect_timeout")

        /* renamed from: e  reason: collision with root package name */
        public final long f112294e;

        static {
            Covode.recordClassIndex(72160);
        }

        public a() {
            this(null, 0, 0, 0, 0, 31);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f112290a, aVar.f112290a) && this.f112291b == aVar.f112291b && this.f112292c == aVar.f112292c && this.f112293d == aVar.f112293d && this.f112294e == aVar.f112294e;
        }

        public final String toString() {
            return "NetTimeOutConfig(pathList=" + this.f112290a + ", connectLimit=" + this.f112291b + ", readLimit=" + this.f112292c + ", writeLimit=" + this.f112293d + ", protectLimit=" + this.f112294e + ")";
        }

        public final int hashCode() {
            int i2;
            Set<String> set = this.f112290a;
            if (set != null) {
                i2 = set.hashCode();
            } else {
                i2 = 0;
            }
            long j2 = this.f112291b;
            long j3 = this.f112292c;
            long j4 = this.f112293d;
            long j5 = this.f112294e;
            return (((((((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }

        private a(Set<String> set, long j2, long j3, long j4, long j5) {
            l.d(set, "");
            this.f112290a = set;
            this.f112291b = j2;
            this.f112292c = j3;
            this.f112293d = j4;
            this.f112294e = j5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.util.Set r11, long r12, long r14, long r16, long r18, int r20) {
            /*
                r10 = this;
                r8 = r18
                r4 = r14
                r2 = r12
                r1 = r11
                r0 = r20 & 1
                if (r0 == 0) goto L_0x000b
                h.a.ab r1 = h.a.ab.INSTANCE
            L_0x000b:
                r0 = r20 & 2
                r6 = 15000(0x3a98, double:7.411E-320)
                if (r0 == 0) goto L_0x0013
                r2 = 15000(0x3a98, double:7.411E-320)
            L_0x0013:
                r0 = r20 & 4
                if (r0 == 0) goto L_0x0019
                r4 = 15000(0x3a98, double:7.411E-320)
            L_0x0019:
                r0 = r20 & 8
                if (r0 == 0) goto L_0x0029
            L_0x001d:
                r0 = r20 & 16
                if (r0 == 0) goto L_0x0024
                long r8 = r2 + r4
                long r8 = r8 + r6
            L_0x0024:
                r0 = r10
                r0.<init>(r1, r2, r4, r6, r8)
                return
            L_0x0029:
                r6 = r16
                goto L_0x001d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.d.b.a.<init>(java.util.Set, long, long, long, long, int):void");
        }
    }

    static {
        Covode.recordClassIndex(72159);
        a aVar = new a(null, 0, 0, 0, 0, 31);
        f112286a = aVar;
        a aVar2 = (a) com.bytedance.ies.abmock.b.a().a(true, "net_common_time_out", a.class, aVar);
        if (aVar2 != null) {
            aVar = aVar2;
        }
        f112287b = aVar;
    }
}
