package androidx.e.a;

import androidx.e.a.b;
import com.bytedance.covode.number.Covode;

public final class d extends b<d> {
    public e x;
    private float y;
    private boolean z;

    static {
        Covode.recordClassIndex(961);
    }

    @Override // androidx.e.a.b
    public final void a() {
        e eVar = this.x;
        if (eVar != null) {
            double d2 = (double) ((float) eVar.f2736e);
            if (d2 > ((double) this.u)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d2 >= ((double) this.v)) {
                e eVar2 = this.x;
                eVar2.f2734c = Math.abs((double) (this.w * 0.75f));
                eVar2.f2735d = eVar2.f2734c * 62.5d;
                super.a();
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public final d a(e eVar) {
        this.x = eVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.e.a.b
    public final boolean b(long j2) {
        if (this.z) {
            float f2 = this.y;
            if (f2 != Float.MAX_VALUE) {
                this.x.f2736e = (double) f2;
                this.y = Float.MAX_VALUE;
            }
            this.p = (float) this.x.f2736e;
            this.o = 0.0f;
            this.z = false;
            return true;
        }
        if (this.y != Float.MAX_VALUE) {
            long j3 = j2 / 2;
            b.a a2 = this.x.a((double) this.p, (double) this.o, j3);
            this.x.f2736e = (double) this.y;
            this.y = Float.MAX_VALUE;
            b.a a3 = this.x.a((double) a2.f2729a, (double) a2.f2730b, j3);
            this.p = a3.f2729a;
            this.o = a3.f2730b;
        } else {
            b.a a4 = this.x.a((double) this.p, (double) this.o, j2);
            this.p = a4.f2729a;
            this.o = a4.f2730b;
        }
        this.p = Math.max(this.p, this.v);
        this.p = Math.min(this.p, this.u);
        float f3 = this.p;
        float f4 = this.o;
        e eVar = this.x;
        if (((double) Math.abs(f4)) >= eVar.f2735d || ((double) Math.abs(f3 - ((float) eVar.f2736e))) >= eVar.f2734c) {
            return false;
        }
        this.p = (float) this.x.f2736e;
        this.o = 0.0f;
        return true;
    }

    public <K> d(K k2, c<K> cVar) {
        super(k2, cVar);
        this.y = Float.MAX_VALUE;
    }

    public <K> d(K k2, c<K> cVar, byte b2) {
        super(k2, cVar);
        this.y = Float.MAX_VALUE;
        this.x = new e((byte) 0);
    }
}
