package com.ss.android.ugc.aweme.im.service;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public interface b {

    public interface a {
        static {
            Covode.recordClassIndex(66500);
        }

        void a(c cVar);

        void b(c cVar);

        void c(c cVar);
    }

    static {
        Covode.recordClassIndex(66499);
    }

    void a();

    void a(long j2);

    void a(a aVar);

    void a(String str);

    void b();

    void b(long j2);

    c c();

    /* renamed from: com.ss.android.ugc.aweme.im.service.b$b  reason: collision with other inner class name */
    public static final class C2642b {

        /* renamed from: a  reason: collision with root package name */
        public final String f103825a;

        /* renamed from: b  reason: collision with root package name */
        public final long f103826b;

        static {
            Covode.recordClassIndex(66501);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2642b)) {
                return false;
            }
            C2642b bVar = (C2642b) obj;
            return l.a(this.f103825a, bVar.f103825a) && this.f103826b == bVar.f103826b;
        }

        public final int hashCode() {
            String str = this.f103825a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j2 = this.f103826b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "IMAweme(aid=" + this.f103825a + ", index=" + this.f103826b + ")";
        }

        public C2642b(String str, long j2) {
            l.d(str, "");
            this.f103825a = str;
            this.f103826b = j2;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final List<C2642b> f103827a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f103828b;

        static {
            Covode.recordClassIndex(66502);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f103827a, cVar.f103827a) && this.f103828b == cVar.f103828b;
        }

        public final int hashCode() {
            List<C2642b> list = this.f103827a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            boolean z = this.f103828b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public final String toString() {
            return "IMResponse(data=" + this.f103827a + ", hasMore=" + this.f103828b + ")";
        }

        public c(List<C2642b> list, boolean z) {
            l.d(list, "");
            this.f103827a = list;
            this.f103828b = z;
        }
    }
}
