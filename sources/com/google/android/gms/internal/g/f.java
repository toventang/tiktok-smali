package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import d.a.d.a.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final OutputStream f50604a = new e();

    static {
        Covode.recordClassIndex(31581);
    }

    public static byte[] a(InputStream inputStream) {
        MethodCollector.i(3741);
        d.a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i2 = 8192;
        int i3 = 0;
        while (i3 < 2147483639) {
            int min = Math.min(i2, a.f156613c - i3);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < min) {
                int read = inputStream.read(bArr, i4, min - i4);
                if (read == -1) {
                    byte[] a2 = a(arrayDeque, i3);
                    MethodCollector.o(3741);
                    return a2;
                }
                i4 += read;
                i3 += read;
            }
            long j2 = ((long) i2) << 1;
            if (j2 > 2147483647L) {
                i2 = Integer.MAX_VALUE;
            } else if (j2 < -2147483648L) {
                i2 = Integer.MIN_VALUE;
            } else {
                i2 = (int) j2;
            }
        }
        if (inputStream.read() == -1) {
            byte[] a3 = a(arrayDeque, a.f156613c);
            MethodCollector.o(3741);
            return a3;
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("input is too large to fit in a byte array");
        MethodCollector.o(3741);
        throw outOfMemoryError;
    }

    private static byte[] a(Deque<byte[]> deque, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = i2;
        while (i3 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i3, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i2 - i3, min);
            i3 -= min;
        }
        return bArr;
    }
}
