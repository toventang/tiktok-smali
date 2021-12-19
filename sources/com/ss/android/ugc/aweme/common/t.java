package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.BitSet;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public int f76483a = 30;

    /* renamed from: b  reason: collision with root package name */
    public final int f76484b;

    /* renamed from: c  reason: collision with root package name */
    public final FileOutputStream f76485c;

    /* renamed from: d  reason: collision with root package name */
    public final int f76486d;

    /* renamed from: e  reason: collision with root package name */
    public final int f76487e;

    static {
        Covode.recordClassIndex(47234);
    }

    public final void a(int i2) {
        byte[] array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array();
        l.b(array, "");
        a(array, 3);
    }

    public final void b(int i2) {
        byte[] array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array();
        l.b(array, "");
        a(array, 4);
    }

    public final void a(byte[] bArr) {
        MethodCollector.i(3842);
        l.d(bArr, "");
        int i2 = 12;
        if (a(bArr, 12, new byte[]{86, 80, 56, 88})) {
            i2 = 30;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i3 = i2 + 4;
            if (i3 < bArr.length) {
                boolean a2 = a(bArr, i2, new byte[]{65, 76, 80, 72});
                boolean a3 = a(bArr, i2, new byte[]{86, 80, 56, 76});
                boolean a4 = a(bArr, i2, new byte[]{86, 80, 56, 32});
                ByteBuffer order = ByteBuffer.wrap(bArr, i3, 4).order(ByteOrder.LITTLE_ENDIAN);
                l.b(order, "");
                int i4 = order.getInt();
                int i5 = i4 + (i4 & 1);
                if (a2 || a3 || a4) {
                    byteArrayOutputStream.write(bArr, i2, i5 + 8);
                }
                i2 += i5 + 8;
            } else {
                a(new byte[]{65, 78, 77, 70}, 4);
                b(byteArrayOutputStream.size() + 16);
                a(0);
                a(0);
                a(this.f76486d - 1);
                a(this.f76487e - 1);
                a(1000 / this.f76483a);
                BitSet bitSet = new BitSet(8);
                bitSet.set(1, true);
                bitSet.set(0, false);
                byte[] byteArray = bitSet.toByteArray();
                l.b(byteArray, "");
                a(byteArray, byteArray.length);
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                l.b(byteArray2, "");
                a(byteArray2, byteArray2.length);
                MethodCollector.o(3842);
                return;
            }
        }
    }

    public final void a(byte[] bArr, int i2) {
        MethodCollector.i(3845);
        if (i2 > 0 && i2 <= bArr.length) {
            this.f76485c.write(bArr, 0, i2);
        }
        MethodCollector.o(3845);
    }

    public t(FileOutputStream fileOutputStream, int i2, int i3) {
        l.d(fileOutputStream, "");
        this.f76485c = fileOutputStream;
        this.f76486d = i2;
        this.f76487e = i3;
    }

    private static boolean a(byte[] bArr, int i2, byte[] bArr2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (bArr[i2] == bArr2[0]) {
            z = true;
        } else {
            z = false;
        }
        if (bArr[i2 + 1] == bArr2[1]) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bArr[i2 + 2] == bArr2[2]) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bArr[i2 + 3] == bArr2[3]) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }
}
