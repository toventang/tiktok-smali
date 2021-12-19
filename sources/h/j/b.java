package h.j;

import com.bytedance.covode.number.Covode;

final class b implements c<Float> {

    /* renamed from: a  reason: collision with root package name */
    private final float f158744a;

    /* renamed from: b  reason: collision with root package name */
    private final float f158745b;

    static {
        Covode.recordClassIndex(105267);
    }

    private boolean a() {
        if (this.f158744a > this.f158745b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.valueOf(this.f158744a).hashCode() * 31) + Float.valueOf(this.f158745b).hashCode();
    }

    public final String toString() {
        return this.f158744a + ".." + this.f158745b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // h.j.c, h.j.d
    public final /* synthetic */ boolean a(Float f2) {
        float floatValue = f2.floatValue();
        if (floatValue < this.f158744a || floatValue > this.f158745b) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (a() && ((b) obj).a()) {
            return true;
        }
        b bVar = (b) obj;
        if (this.f158744a == bVar.f158744a && this.f158745b == bVar.f158745b) {
            return true;
        }
        return false;
    }

    public b(float f2, float f3) {
        this.f158744a = f2;
        this.f158745b = f3;
    }
}
