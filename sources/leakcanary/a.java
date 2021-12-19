package leakcanary;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.TimeUnit;
import leakcanary.internal.j;
import m.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C4197a f159358a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f159359b = new a();

    private a() {
    }

    static {
        C4197a aVar;
        Covode.recordClassIndex(105809);
        if (j.a()) {
            aVar = new C4197a(false, false, false, false, 0, 31);
        } else {
            aVar = new C4197a(false, false, false, false, 0, 30);
        }
        f159358a = aVar;
    }

    public static void a(C4197a aVar) {
        l.c(aVar, "");
        f159358a = aVar;
        a.AbstractC4200a aVar2 = m.a.f159491a;
        if (aVar2 != null) {
            aVar2.a("Updated AppWatcher.config to ".concat(String.valueOf(aVar)));
        }
    }

    /* renamed from: leakcanary.a$a  reason: collision with other inner class name */
    public static final class C4197a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f159360a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f159361b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f159362c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f159363d;

        /* renamed from: e  reason: collision with root package name */
        public final long f159364e;

        static {
            Covode.recordClassIndex(105810);
        }

        public C4197a() {
            this(false, false, false, false, 0, 31);
        }

        public static /* synthetic */ C4197a a(C4197a aVar, boolean z, boolean z2, boolean z3, boolean z4, long j2, int i2) {
            long j3 = j2;
            boolean z5 = z;
            boolean z6 = z2;
            boolean z7 = z3;
            boolean z8 = z4;
            if ((i2 & 1) != 0) {
                z5 = aVar.f159360a;
            }
            if ((i2 & 2) != 0) {
                z6 = aVar.f159361b;
            }
            if ((i2 & 4) != 0) {
                z7 = aVar.f159362c;
            }
            if ((i2 & 8) != 0) {
                z8 = aVar.f159363d;
            }
            if ((i2 & 16) != 0) {
                j3 = aVar.f159364e;
            }
            return a(z5, z6, z7, z8, j3);
        }

        private static C4197a a(boolean z, boolean z2, boolean z3, boolean z4, long j2) {
            return new C4197a(z, z2, z3, z4, j2);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C4197a) {
                    C4197a aVar = (C4197a) obj;
                    if (!(this.f159360a == aVar.f159360a && this.f159361b == aVar.f159361b && this.f159362c == aVar.f159362c && this.f159363d == aVar.f159363d && this.f159364e == aVar.f159364e)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f159360a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            boolean z2 = this.f159361b;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            boolean z3 = this.f159362c;
            if (z3) {
                z3 = true;
            }
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = (i10 + i11) * 31;
            if (!this.f159363d) {
                i2 = 0;
            }
            long j2 = this.f159364e;
            return ((i14 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "Config(enabled=" + this.f159360a + ", watchActivities=" + this.f159361b + ", watchFragments=" + this.f159362c + ", watchFragmentViews=" + this.f159363d + ", watchDurationMillis=" + this.f159364e + ")";
        }

        private C4197a(boolean z, boolean z2, boolean z3, boolean z4, long j2) {
            this.f159360a = z;
            this.f159361b = z2;
            this.f159362c = z3;
            this.f159363d = z4;
            this.f159364e = j2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C4197a(boolean z, boolean z2, boolean z3, boolean z4, long j2, int i2) {
            this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) == 0 ? z4 : true, (i2 & 16) != 0 ? TimeUnit.SECONDS.toMillis(5) : j2);
        }
    }
}
