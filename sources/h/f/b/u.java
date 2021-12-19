package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.b;
import h.k.i;

public abstract class u extends c implements i {
    static {
        Covode.recordClassIndex(105232);
    }

    public u() {
    }

    /* access modifiers changed from: protected */
    @Override // h.f.b.c
    public i getReflected() {
        return (i) super.getReflected();
    }

    @Override // h.k.i
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // h.k.i
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public u(Object obj) {
        super(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            c cVar = (c) obj;
            if (!getOwner().equals(cVar.getOwner()) || !getName().equals(cVar.getName()) || !getSignature().equals(cVar.getSignature()) || !l.a(getBoundReceiver(), cVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof i) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(java.lang.Object r7, java.lang.Class r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r6 = this;
            r0 = 1
            r11 = r11 & r0
            if (r11 != r0) goto L_0x000e
            r5 = 1
        L_0x0005:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x000e:
            r0 = 0
            r5 = 0
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.b.u.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }
}
