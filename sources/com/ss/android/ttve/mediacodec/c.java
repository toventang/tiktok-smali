package com.ss.android.ttve.mediacodec;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.an;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f61141a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f61142b;

    /* renamed from: c  reason: collision with root package name */
    private static int f61143c;

    /* renamed from: d  reason: collision with root package name */
    private static List<Integer> f61144d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private static int f61145e = 2304000;

    static {
        Covode.recordClassIndex(37640);
    }

    public static synchronized int a() {
        int i2;
        synchronized (c.class) {
            MethodCollector.i(12524);
            i2 = f61143c;
            MethodCollector.o(12524);
        }
        return i2;
    }

    public static synchronized int b() {
        int i2;
        synchronized (c.class) {
            MethodCollector.i(12525);
            i2 = f61142b;
            MethodCollector.o(12525);
        }
        return i2;
    }

    public static synchronized void b(int i2, int i3) {
        synchronized (c.class) {
            MethodCollector.i(12241);
            if (!f61144d.contains(Integer.valueOf(i3))) {
                MethodCollector.o(12241);
                return;
            }
            f61142b -= i2;
            f61144d.remove(Integer.valueOf(i3));
            an.b("TEMediaCodecResourceManager", "freeCodecBlocksSize blocksSize: " + i2 + ", sUsedCodecBlocksSize: " + f61142b + ", " + i3);
            if (f61142b < 0) {
                an.c("TEMediaCodecResourceManager", "freeCodecBlocksSize sUsedCodecBlocksSize < 0");
                f61142b = 0;
            }
            MethodCollector.o(12241);
        }
    }

    public static synchronized boolean a(int i2, int i3) {
        synchronized (c.class) {
            MethodCollector.i(12087);
            if (f61143c == 0) {
                f61143c = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                an.a("TEMediaCodecResourceManager", "sMaxCodecBlocksSize: " + f61143c);
            }
            if (f61143c == -1) {
                MethodCollector.o(12087);
                return true;
            } else if (f61144d.contains(Integer.valueOf(i3))) {
                MethodCollector.o(12087);
                return true;
            } else {
                int i4 = f61142b;
                if (i4 + i2 > f61143c) {
                    an.c("TEMediaCodecResourceManager", "sUsedCodecBlocksSize + blocksSize > sMaxCodecBlocksSize, sUsedCodecBlocksSize: " + f61142b + ", blocksSize:" + i2);
                    MethodCollector.o(12087);
                    return false;
                }
                f61142b = i4 + i2;
                f61144d.add(Integer.valueOf(i3));
                an.b("TEMediaCodecResourceManager", "tryUseCodecBlocksSize success blocksSize: " + i2 + ", sUsedCodecBlocksSize: " + f61142b + ", " + i3);
                MethodCollector.o(12087);
                return true;
            }
        }
    }

    public static synchronized boolean a(int i2, int i3, int i4) {
        synchronized (c.class) {
            MethodCollector.i(12386);
            if (f61143c == 0) {
                f61143c = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                an.a("TEMediaCodecResourceManager", "sMaxCodecBlocksSize: " + f61143c);
            }
            int i5 = f61143c;
            if (i5 == -1) {
                MethodCollector.o(12386);
                return true;
            }
            int i6 = f61142b;
            int i7 = i2 * i3 * i4;
            if (i6 + i7 > i5) {
                an.b("TEMediaCodecResourceManager", "checkCanFastImport is false, sUsedCodecBlocksSize: " + f61142b + ", width: " + i2 + ", height: " + i3 + ", fps: " + i4);
                MethodCollector.o(12386);
                return false;
            }
            if (i6 > 0) {
                int i8 = f61145e;
                if (i5 - i8 > 0 && i6 + i7 > i5 - i8) {
                    an.b("TEMediaCodecResourceManager", "checkCanFastImport is false, sUsedCodecBlocksSize: " + f61142b + ", width: " + i2 + ", height: " + i3 + ", fps: " + i4);
                    MethodCollector.o(12386);
                    return false;
                }
            }
            an.b("TEMediaCodecResourceManager", "checkCanFastImport is true");
            MethodCollector.o(12386);
            return true;
        }
    }
}
