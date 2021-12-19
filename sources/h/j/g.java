package h.j;

import com.bytedance.covode.number.Covode;

public final class g extends e implements d<Integer> {

    /* renamed from: e  reason: collision with root package name */
    public static final g f158754e = new g(1, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final a f158755f = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(105274);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // h.j.e
    public final boolean a() {
        if (this.f158747a > this.f158748b) {
            return true;
        }
        return false;
    }

    @Override // h.j.e
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.f158747a * 31) + this.f158748b;
    }

    static {
        Covode.recordClassIndex(105273);
    }

    @Override // h.j.e
    public final String toString() {
        return this.f158747a + ".." + this.f158748b;
    }

    public final boolean a(int i2) {
        if (this.f158747a > i2 || i2 > this.f158748b) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // h.j.d
    public final /* synthetic */ boolean a(Integer num) {
        return a(num.intValue());
    }

    @Override // h.j.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (a() && ((e) obj).a()) {
            return true;
        }
        e eVar = (e) obj;
        if (this.f158747a == eVar.f158747a && this.f158748b == eVar.f158748b) {
            return true;
        }
        return false;
    }

    public g(int i2, int i3) {
        super(i2, i3, 1);
    }
}
