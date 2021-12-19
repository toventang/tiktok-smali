package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.b;
import h.k.e;

public class i extends c implements h, e {
    private final int arity;
    private final int flags;

    static {
        Covode.recordClassIndex(105220);
    }

    /* access modifiers changed from: protected */
    @Override // h.f.b.c
    public b computeReflected() {
        return this;
    }

    @Override // h.f.b.h
    public int getArity() {
        return this.arity;
    }

    /* access modifiers changed from: protected */
    @Override // h.f.b.c
    public e getReflected() {
        return (e) super.getReflected();
    }

    @Override // h.k.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // h.k.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // h.k.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // h.k.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // h.f.b.c, h.k.b, h.k.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public i(int i2) {
        this(i2, NO_RECEIVER, null, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (!l.a(getOwner(), iVar.getOwner()) || !getName().equals(iVar.getName()) || !getSignature().equals(iVar.getSignature()) || this.flags != iVar.flags || this.arity != iVar.arity || !l.a(getBoundReceiver(), iVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public i(int i2, Object obj) {
        this(i2, obj, null, null, null, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(int r7, java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r6 = this;
            r1 = r12 & 1
            r0 = 1
            if (r1 != r0) goto L_0x0015
            r5 = 1
        L_0x0006:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.arity = r7
            int r0 = r12 >> 1
            r6.flags = r0
            return
        L_0x0015:
            r0 = 0
            r5 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.b.i.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }
}
