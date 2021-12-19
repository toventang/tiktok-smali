package leakcanary;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import leakcanary.internal.InternalLeakCanary;
import leakcanary.internal.j;

public final class e {

    /* renamed from: a */
    public static volatile a f159369a;

    /* renamed from: b */
    public static final e f159370b = new e();

    private e() {
    }

    static {
        a noInstallConfig;
        Covode.recordClassIndex(105816);
        if (j.a()) {
            noInstallConfig = new a(false, 0, false, 0, 127);
        } else {
            noInstallConfig = InternalLeakCanary.INSTANCE.getNoInstallConfig();
        }
        f159369a = noInstallConfig;
    }

    public static void a(a aVar) {
        l.c(aVar, "");
        f159369a = aVar;
    }

    public static final class a {

        /* renamed from: a */
        public final boolean f159371a;

        /* renamed from: b */
        public final boolean f159372b;

        /* renamed from: c */
        public final int f159373c;

        /* renamed from: d */
        public final boolean f159374d;

        /* renamed from: e */
        public final int f159375e;

        /* renamed from: f */
        public final boolean f159376f;

        /* renamed from: g */
        public final boolean f159377g;

        static {
            Covode.recordClassIndex(105817);
        }

        public a() {
            this(false, 0, false, 0, 127);
        }

        public static /* synthetic */ a a(a aVar, boolean z, boolean z2, int i2, boolean z3, int i3, boolean z4, boolean z5, int i4) {
            boolean z6 = z5;
            boolean z7 = z4;
            int i5 = i3;
            boolean z8 = z;
            boolean z9 = z2;
            int i6 = i2;
            boolean z10 = z3;
            if ((i4 & 1) != 0) {
                z8 = aVar.f159371a;
            }
            if ((i4 & 2) != 0) {
                z9 = aVar.f159372b;
            }
            if ((i4 & 4) != 0) {
                i6 = aVar.f159373c;
            }
            if ((i4 & 8) != 0) {
                z10 = aVar.f159374d;
            }
            if ((i4 & 16) != 0) {
                i5 = aVar.f159375e;
            }
            if ((i4 & 32) != 0) {
                z7 = aVar.f159376f;
            }
            if ((i4 & 64) != 0) {
                z6 = aVar.f159377g;
            }
            return a(z8, z9, i6, z10, i5, z7, z6);
        }

        private static a a(boolean z, boolean z2, int i2, boolean z3, int i3, boolean z4, boolean z5) {
            return new a(z, z2, i2, z3, i3, z4, z5);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!(this.f159371a == aVar.f159371a && this.f159372b == aVar.f159372b && this.f159373c == aVar.f159373c && this.f159374d == aVar.f159374d && this.f159375e == aVar.f159375e && this.f159376f == aVar.f159376f && this.f159377g == aVar.f159377g)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f159371a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            boolean z2 = this.f159372b;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (((i6 + i7) * 31) + this.f159373c) * 31;
            boolean z3 = this.f159374d;
            if (z3) {
                z3 = true;
            }
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = (((i10 + i11) * 31) + this.f159375e) * 31;
            boolean z4 = this.f159376f;
            if (z4) {
                z4 = true;
            }
            int i15 = z4 ? 1 : 0;
            int i16 = z4 ? 1 : 0;
            int i17 = z4 ? 1 : 0;
            int i18 = (i14 + i15) * 31;
            if (!this.f159377g) {
                i2 = 0;
            }
            return i18 + i2;
        }

        public final String toString() {
            return "Config(dumpHeap=" + this.f159371a + ", dumpHeapWhenDebugging=" + this.f159372b + ", retainedVisibleThreshold=" + this.f159373c + ", computeRetainedHeapSize=" + this.f159374d + ", maxStoredHeapDumps=" + this.f159375e + ", requestWriteExternalStoragePermission=" + this.f159376f + ", useExperimentalLeakFinders=" + this.f159377g + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z, int i2, boolean z2, int i3, int i4) {
            this((i4 & 1) != 0 ? true : z, false, (i4 & 4) != 0 ? 5 : i2, (i4 & 8) != 0 ? true : z2, (i4 & 16) != 0 ? 7 : i3, false, false);
        }

        private a(boolean z, boolean z2, int i2, boolean z3, int i3, boolean z4, boolean z5) {
            this.f159371a = z;
            this.f159372b = z2;
            this.f159373c = i2;
            this.f159374d = z3;
            this.f159375e = i3;
            this.f159376f = z4;
            this.f159377g = z5;
        }
    }
}
