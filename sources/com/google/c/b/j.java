package com.google.c.b;

import com.bytedance.covode.number.Covode;
import com.google.c.b.o;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class j extends o implements h, Serializable {
    private static final long serialVersionUID = 7249069246863182397L;

    static {
        Covode.recordClassIndex(33336);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.b.o
    public final long a(long j2, long j3) {
        return j2 + j3;
    }

    @Override // com.google.c.b.h
    public final void a() {
        a(1);
    }

    public final double doubleValue() {
        return (double) d();
    }

    public final float floatValue() {
        return (float) d();
    }

    public final int intValue() {
        return (int) d();
    }

    public final long longValue() {
        return d();
    }

    public final String toString() {
        return Long.toString(d());
    }

    private long d() {
        long j2 = this.f53851e;
        o.a[] aVarArr = this.f53850d;
        if (aVarArr != null) {
            for (o.a aVar : aVarArr) {
                if (aVar != null) {
                    j2 += aVar.f53855a;
                }
            }
        }
        return j2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f53852f = 0;
        this.f53850d = null;
        this.f53851e = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a3, code lost:
        if (r13.f53850d != r7) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a5, code lost:
        r2 = new com.google.c.b.o.a[(r8 << 1)];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00aa, code lost:
        r2[r1] = r7[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b0, code lost:
        if (r1 >= r8) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b3, code lost:
        r13.f53850d = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0035 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0035 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0105 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x006d A[SYNTHETIC] */
    @Override // com.google.c.b.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r14) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.b.j.a(long):void");
    }
}
