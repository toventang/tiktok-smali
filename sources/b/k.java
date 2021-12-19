package b;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    i<?> f4870a;

    static {
        Covode.recordClassIndex(1913);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            i<?> iVar = this.f4870a;
            if (!(iVar == null || i.f4827d == null)) {
                new l(iVar.e());
            }
        } finally {
            super.finalize();
        }
    }

    public k(i<?> iVar) {
        this.f4870a = iVar;
    }
}
