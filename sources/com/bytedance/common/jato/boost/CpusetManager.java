package com.bytedance.common.jato.boost;

import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class CpusetManager {
    private static volatile int[] bigCoreNum;
    private static boolean isAlreadyPreload;
    private static AtomicBoolean isCpuSetWork = new AtomicBoolean(false);
    private static volatile int[] smallCoreNum;

    private static native void resetCpuSet();

    private static native void resetCpuSetTid(int i2);

    private static native void setCpuSet(int[] iArr);

    private static native void setCpuSetTid(int i2, int[] iArr);

    private static boolean loadLibrary() {
        return c.a();
    }

    static {
        Covode.recordClassIndex(15803);
    }

    public static void bindBigCore() {
        MethodCollector.i(8025);
        if (!isCpuSetWork.get() || bigCoreNum == null) {
            Jato.getListener().a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSet(bigCoreNum);
            MethodCollector.o(8025);
            return;
        }
        MethodCollector.o(8025);
    }

    public static void bindLittleCore() {
        MethodCollector.i(8028);
        if (!isCpuSetWork.get()) {
            Jato.getListener().a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSet(smallCoreNum);
            MethodCollector.o(8028);
            return;
        }
        MethodCollector.o(8028);
    }

    public static synchronized void preload() {
        synchronized (CpusetManager.class) {
            MethodCollector.i(8247);
            if (isAlreadyPreload) {
                MethodCollector.o(8247);
                return;
            }
            if (c.a()) {
                smallCoreNum = c.f26791a;
                bigCoreNum = c.f26792b;
                isCpuSetWork.set(true);
            }
            isAlreadyPreload = true;
            MethodCollector.o(8247);
        }
    }

    public static void resetCoreBind() {
        MethodCollector.i(8032);
        if (!isCpuSetWork.get()) {
            Jato.getListener().a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            resetCpuSet();
            MethodCollector.o(8032);
            return;
        }
        MethodCollector.o(8032);
    }

    public static void init(ExecutorService executorService) {
        executorService.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.CpusetManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15804);
            }

            public final void run() {
                CpusetManager.preload();
            }
        });
    }

    private static void debug(String str) {
        if (Jato.isDebug() && Jato.getListener() != null) {
            Jato.getListener().a(str);
        }
    }

    public static void bindBigCore(int i2) {
        MethodCollector.i(8033);
        if (!isCpuSetWork.get() || bigCoreNum == null) {
            Jato.getListener().a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSetTid(i2, bigCoreNum);
            MethodCollector.o(8033);
            return;
        }
        MethodCollector.o(8033);
    }

    public static void bindLittleCore(int i2) {
        MethodCollector.i(8137);
        if (!isCpuSetWork.get() || smallCoreNum == null) {
            Jato.getListener().a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSetTid(i2, smallCoreNum);
            MethodCollector.o(8137);
            return;
        }
        MethodCollector.o(8137);
    }

    public static void resetCoreBind(int i2) {
        MethodCollector.i(8198);
        if (!isCpuSetWork.get()) {
            Jato.getListener().a("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            resetCpuSetTid(i2);
            MethodCollector.o(8198);
            return;
        }
        MethodCollector.o(8198);
    }
}
