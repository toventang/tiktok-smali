package androidx.work.impl.b;

import android.os.Build;
import androidx.work.c;
import androidx.work.e;
import androidx.work.i;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class g {
    public static final androidx.a.a.c.a<List<a>, List<i>> q = new androidx.a.a.c.a<List<a>, List<i>>() {
        /* class androidx.work.impl.b.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1799);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.a.a.c.a
        public final /* synthetic */ List<i> a(List<a> list) {
            List<a> list2 = list;
            if (list2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list2.size());
            for (a aVar : list2) {
                arrayList.add(new i(UUID.fromString(aVar.f4591a), aVar.f4592b, aVar.f4593c, aVar.f4594d));
            }
            return arrayList;
        }
    };
    private static final String r = androidx.work.g.a("WorkSpec");

    /* renamed from: a  reason: collision with root package name */
    public String f4578a;

    /* renamed from: b  reason: collision with root package name */
    public i.a f4579b = i.a.ENQUEUED;

    /* renamed from: c  reason: collision with root package name */
    public String f4580c;

    /* renamed from: d  reason: collision with root package name */
    public String f4581d;

    /* renamed from: e  reason: collision with root package name */
    public e f4582e = e.f4499a;

    /* renamed from: f  reason: collision with root package name */
    public e f4583f = e.f4499a;

    /* renamed from: g  reason: collision with root package name */
    public long f4584g;

    /* renamed from: h  reason: collision with root package name */
    public long f4585h;

    /* renamed from: i  reason: collision with root package name */
    public long f4586i;

    /* renamed from: j  reason: collision with root package name */
    public c f4587j = c.f4479a;

    /* renamed from: k  reason: collision with root package name */
    public int f4588k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.a f4589l = androidx.work.a.EXPONENTIAL;

    /* renamed from: m  reason: collision with root package name */
    public long f4590m = 30000;
    public long n;
    public long o;
    public long p = -1;

    public final boolean a() {
        if (this.f4585h != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f4579b != i.a.ENQUEUED || this.f4588k <= 0) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        if (!c.f4479a.equals(this.f4587j)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(1798);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f4578a + "}";
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f4591a;

        /* renamed from: b  reason: collision with root package name */
        public i.a f4592b;

        /* renamed from: c  reason: collision with root package name */
        public e f4593c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f4594d;

        static {
            Covode.recordClassIndex(1800);
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            String str = this.f4591a;
            int i5 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = i2 * 31;
            i.a aVar = this.f4592b;
            if (aVar != null) {
                i3 = aVar.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            e eVar = this.f4593c;
            if (eVar != null) {
                i4 = eVar.hashCode();
            } else {
                i4 = 0;
            }
            int i8 = (i7 + i4) * 31;
            List<String> list = this.f4594d;
            if (list != null) {
                i5 = list.hashCode();
            }
            return i8 + i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                String str = this.f4591a;
                if (str == null ? aVar.f4591a != null : !str.equals(aVar.f4591a)) {
                    return false;
                }
                if (this.f4592b != aVar.f4592b) {
                    return false;
                }
                e eVar = this.f4593c;
                if (eVar == null ? aVar.f4593c != null : !eVar.equals(aVar.f4593c)) {
                    return false;
                }
                List<String> list = this.f4594d;
                List<String> list2 = aVar.f4594d;
                if (list != null) {
                    return list.equals(list2);
                }
                if (list2 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    public final long c() {
        long j2;
        long scalb;
        if (b()) {
            if (this.f4589l == androidx.work.a.LINEAR) {
                scalb = this.f4590m * ((long) this.f4588k);
            } else {
                scalb = (long) Math.scalb((float) this.f4590m, this.f4588k - 1);
            }
            return this.n + Math.min(18000000L, scalb);
        } else if (!a()) {
            return this.n + this.f4584g;
        } else {
            if (Build.VERSION.SDK_INT > 22) {
                return (this.n + this.f4585h) - this.f4586i;
            }
            long j3 = this.f4586i;
            long j4 = this.f4585h;
            if (j3 == j4) {
                return this.n + j4;
            }
            long j5 = this.n;
            if (j5 == 0) {
                j2 = j3 * -1;
            } else {
                j2 = 0;
            }
            if (j5 == 0) {
                j5 = System.currentTimeMillis();
            }
            return j5 + this.f4585h + j2;
        }
    }

    public final int hashCode() {
        int i2;
        int hashCode = ((((this.f4578a.hashCode() * 31) + this.f4579b.hashCode()) * 31) + this.f4580c.hashCode()) * 31;
        String str = this.f4581d;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f4584g;
        long j3 = this.f4585h;
        long j4 = this.f4586i;
        long j5 = this.f4590m;
        long j6 = this.n;
        long j7 = this.o;
        long j8 = this.p;
        return ((((((((((((((((((((((((hashCode + i2) * 31) + this.f4582e.hashCode()) * 31) + this.f4583f.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f4587j.hashCode()) * 31) + this.f4588k) * 31) + this.f4589l.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f4584g != gVar.f4584g || this.f4585h != gVar.f4585h || this.f4586i != gVar.f4586i || this.f4588k != gVar.f4588k || this.f4590m != gVar.f4590m || this.n != gVar.n || this.o != gVar.o || this.p != gVar.p || !this.f4578a.equals(gVar.f4578a) || this.f4579b != gVar.f4579b || !this.f4580c.equals(gVar.f4580c)) {
                return false;
            }
            String str = this.f4581d;
            if (str == null ? gVar.f4581d != null : !str.equals(gVar.f4581d)) {
                return false;
            }
            if (this.f4582e.equals(gVar.f4582e) && this.f4583f.equals(gVar.f4583f) && this.f4587j.equals(gVar.f4587j) && this.f4589l == gVar.f4589l) {
                return true;
            }
        }
        return false;
    }

    public g(String str, String str2) {
        this.f4578a = str;
        this.f4580c = str2;
    }
}
