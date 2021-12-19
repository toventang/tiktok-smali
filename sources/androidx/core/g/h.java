package androidx.core.g;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2402a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static char[] f2403b = new char[24];

    static {
        Covode.recordClassIndex(777);
    }

    public static void a(long j2, PrintWriter printWriter) {
        char c2;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (f2402a) {
            int length = f2403b.length;
            char[] cArr = f2403b;
            int i5 = 1;
            if (j2 == 0) {
                cArr[0] = '0';
            } else {
                if (j2 > 0) {
                    c2 = '+';
                } else {
                    c2 = '-';
                    j2 = -j2;
                }
                int i6 = (int) (j2 % 1000);
                int floor = (int) Math.floor((double) (j2 / 1000));
                if (floor > 86400) {
                    i2 = floor / 86400;
                    floor -= 86400 * i2;
                } else {
                    i2 = 0;
                }
                if (floor > 3600) {
                    i3 = floor / 3600;
                    floor -= i3 * 3600;
                } else {
                    i3 = 0;
                }
                if (floor > 60) {
                    i4 = floor / 60;
                    floor -= i4 * 60;
                } else {
                    i4 = 0;
                }
                cArr[0] = c2;
                int a2 = a(cArr, i2, 'd', 1, false);
                if (a2 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                int a3 = a(cArr, i3, 'h', a2, z);
                if (a3 != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int a4 = a(cArr, i4, 'm', a3, z2);
                if (a4 != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int a5 = a(cArr, i6, 'm', a(cArr, floor, 's', a4, z3), true);
                cArr[a5] = 's';
                i5 = 1 + a5;
            }
            printWriter.print(new String(f2403b, 0, i5));
        }
    }

    private static int a(char[] cArr, int i2, char c2, int i3, boolean z) {
        int i4;
        if (!z && i2 <= 0) {
            return i3;
        }
        if (i2 > 99) {
            int i5 = i2 / 100;
            cArr[i3] = (char) (i5 + 48);
            i4 = i3 + 1;
            i2 -= i5 * 100;
        } else {
            i4 = i3;
        }
        if (i2 > 9 || i3 != i4) {
            int i6 = i2 / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i2 -= i6 * 10;
        }
        cArr[i4] = (char) (i2 + 48);
        int i7 = i4 + 1;
        cArr[i7] = c2;
        return i7 + 1;
    }
}
