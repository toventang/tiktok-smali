package h.j;

import com.bytedance.covode.number.Covode;

final class a implements c<Double> {

    /* renamed from: a  reason: collision with root package name */
    private final double f158742a;

    /* renamed from: b  reason: collision with root package name */
    private final double f158743b;

    static {
        Covode.recordClassIndex(105266);
    }

    private boolean a() {
        if (this.f158742a > this.f158743b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Double.valueOf(this.f158742a).hashCode() * 31) + Double.valueOf(this.f158743b).hashCode();
    }

    public final String toString() {
        return this.f158742a + ".." + this.f158743b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // h.j.c, h.j.d
    public final /* synthetic */ boolean a(Double d2) {
        double doubleValue = d2.doubleValue();
        if (doubleValue < this.f158742a || doubleValue > this.f158743b) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (a() && ((a) obj).a()) {
            return true;
        }
        a aVar = (a) obj;
        if (this.f158742a == aVar.f158742a && this.f158743b == aVar.f158743b) {
            return true;
        }
        return false;
    }

    public a(double d2, double d3) {
        this.f158742a = d2;
        this.f158743b = d3;
    }
}
