package com.ss.avframework.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.opengl.GLThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class SafeHandlerThreadPoolExecutor {
    private static boolean mCheckLeakWhenRef0 = true;
    private static AtomicInteger mRefInUse = new AtomicInteger(0);
    public static final List<SafeHandlerThread> mSafeHandlerThreadList = new ArrayList();
    private static JSONObject mSafeModeWhiteList;
    private static long mThreadAliveTimeMs = 0;
    private static boolean mThreadPoolMode = false;

    static {
        Covode.recordClassIndex(100602);
    }

    public static void checkMemoryLeak() {
        MethodCollector.i(13731);
        if (mRefInUse.get() != 0) {
            MethodCollector.o(13731);
            return;
        }
        StringBuilder sb = new StringBuilder("Checking Memory Leak.Pool size: ");
        List<SafeHandlerThread> list = mSafeHandlerThreadList;
        AVLog.ioi("SafeHandlerThreadPoolExecutor", sb.append(list.size()).toString());
        synchronized (list) {
            try {
                for (final SafeHandlerThread safeHandlerThread : list) {
                    if (safeHandlerThread.isAlive() && !safeHandlerThread.isLocked()) {
                        safeHandlerThread.getHandler().postDelayed(new Runnable() {
                            /* class com.ss.avframework.utils.SafeHandlerThreadPoolExecutor.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(100604);
                            }

                            public final void run() {
                                safeHandlerThread.release();
                            }
                        }, 500);
                    }
                }
                mSafeHandlerThreadList.clear();
            } finally {
                MethodCollector.o(13731);
            }
        }
    }

    public static SafeHandlerThread lockThread(String str) {
        if (!mThreadPoolMode) {
            return new SafeHandlerThread(str);
        }
        return lockThread(str, false);
    }

    public static GLThread lockGLThread(String str) {
        if (!mThreadPoolMode) {
            return new GLThread(str);
        }
        return (GLThread) lockThread(str, true);
    }

    public static void unlockThread(final SafeHandlerThread safeHandlerThread) {
        if (safeHandlerThread != null) {
            if (!mThreadPoolMode) {
                safeHandlerThread.release();
            } else if (safeHandlerThread.isAlive()) {
                safeHandlerThread.post(new Runnable() {
                    /* class com.ss.avframework.utils.SafeHandlerThreadPoolExecutor.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(100606);
                    }

                    public final void run() {
                        SafeHandlerThreadPoolExecutor.unlockThreadInner(safeHandlerThread);
                    }
                });
            }
        }
    }

    public static void unlockThreadInner(final SafeHandlerThread safeHandlerThread) {
        if (safeHandlerThread.isLocked()) {
            safeHandlerThread.unlock(new Runnable() {
                /* class com.ss.avframework.utils.SafeHandlerThreadPoolExecutor.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(100605);
                }

                public final void run() {
                    MethodCollector.i(12570);
                    synchronized (SafeHandlerThreadPoolExecutor.mSafeHandlerThreadList) {
                        try {
                            SafeHandlerThreadPoolExecutor.mSafeHandlerThreadList.remove(safeHandlerThread);
                        } finally {
                            MethodCollector.o(12570);
                        }
                    }
                }
            });
            AVLog.ioi("SafeHandlerThreadPoolExecutor", "unlockThread " + safeHandlerThread.getName() + " with refCnt:" + mRefInUse.decrementAndGet());
            if (mCheckLeakWhenRef0) {
                checkMemoryLeak();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r0.optJSONArray(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void enableSafeMode(com.ss.avframework.utils.SafeHandlerThread r2, java.lang.String r3) {
        /*
            org.json.JSONObject r0 = com.ss.avframework.utils.SafeHandlerThreadPoolExecutor.mSafeModeWhiteList
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            org.json.JSONArray r1 = r0.optJSONArray(r3)
            if (r1 == 0) goto L_0x0013
            com.ss.avframework.utils.SafeHandlerThreadPoolExecutor$1 r0 = new com.ss.avframework.utils.SafeHandlerThreadPoolExecutor$1
            r0.<init>(r1)
            r2.enableSafeMode(r0)
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.utils.SafeHandlerThreadPoolExecutor.enableSafeMode(com.ss.avframework.utils.SafeHandlerThread, java.lang.String):void");
    }

    private static SafeHandlerThread lockThread(String str, boolean z) {
        SafeHandlerThread safeHandlerThread;
        MethodCollector.i(13665);
        Iterator<SafeHandlerThread> it = mSafeHandlerThreadList.iterator();
        while (true) {
            if (it.hasNext()) {
                SafeHandlerThread next = it.next();
                if (next != null) {
                    if (z) {
                        if (!(next instanceof GLThread)) {
                            continue;
                        }
                    } else if (next instanceof GLThread) {
                        continue;
                    }
                    if (!next.isLocked() && next.isAlive() && (safeHandlerThread = next.lock()) != null) {
                        safeHandlerThread.setThreadName(str);
                        AVLog.ioi("SafeHandlerThreadPoolExecutor", "Get Thread from ThreadPool, name:" + str + ", isGL:" + z);
                        break;
                    }
                }
            } else {
                if (z) {
                    safeHandlerThread = new GLThread(str);
                } else {
                    safeHandlerThread = new SafeHandlerThread(str);
                }
                safeHandlerThread.start();
                safeHandlerThread.setAliveTimeMs(mThreadAliveTimeMs);
                safeHandlerThread.lock();
                AVLog.ioi("SafeHandlerThreadPoolExecutor", "Create new Thread, name:" + str + ", isGL:" + z);
                List<SafeHandlerThread> list = mSafeHandlerThreadList;
                synchronized (list) {
                    try {
                        list.add(safeHandlerThread);
                    } catch (Throwable th) {
                        MethodCollector.o(13665);
                        throw th;
                    }
                }
            }
        }
        AVLog.ioi("SafeHandlerThreadPoolExecutor", "lock thread with refCnt:".concat(String.valueOf(mRefInUse.incrementAndGet())));
        enableSafeMode(safeHandlerThread, str);
        MethodCollector.o(13665);
        return safeHandlerThread;
    }

    public static void setThreadPoolMode(boolean z, long j2, JSONObject jSONObject, boolean z2) {
        mThreadPoolMode = z;
        mThreadAliveTimeMs = j2;
        mSafeModeWhiteList = jSONObject;
        mCheckLeakWhenRef0 = z2;
    }
}
