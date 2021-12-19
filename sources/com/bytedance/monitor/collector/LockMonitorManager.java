package com.bytedance.monitor.collector;

import android.os.Looper;
import android.os.Process;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class LockMonitorManager {
    private static a[] buffer = new a[100];
    private static int bufferSize = 100;
    public static volatile String lastJavaStack;
    public static volatile boolean openFetchStack;
    private static int position;
    private static ExecutorService sLockHandler = com_bytedance_monitor_collector_LockMonitorManager_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor(new ThreadFactory() {
        /* class com.bytedance.monitor.collector.LockMonitorManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25381);
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("lock_handler_time");
            return thread;
        }
    });
    public static BlockingQueue<String> sStackBlockingQueue = new LinkedBlockingQueue();
    private static ExecutorService sStackFetcher = com_bytedance_monitor_collector_LockMonitorManager_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor(new ThreadFactory() {
        /* class com.bytedance.monitor.collector.LockMonitorManager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(25382);
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Process.setThreadPriority(-20);
            thread.setName("lock_stack_fetch");
            return thread;
        }
    });

    private static void nativeGetJavaStack() {
        if (openFetchStack) {
            sStackFetcher.execute(new Runnable() {
                /* class com.bytedance.monitor.collector.LockMonitorManager.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(25384);
                }

                public final void run() {
                    try {
                        String a2 = o.a(Looper.getMainLooper().getThread().getStackTrace());
                        synchronized (LockMonitorManager.sStackBlockingQueue) {
                            if (LockMonitorManager.sStackBlockingQueue.size() != 0) {
                                LockMonitorManager.sStackBlockingQueue.clear();
                            }
                            LockMonitorManager.sStackBlockingQueue.put(a2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(25380);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f41424a;

        /* renamed from: b  reason: collision with root package name */
        public long f41425b;

        /* renamed from: c  reason: collision with root package name */
        public String f41426c;

        /* renamed from: d  reason: collision with root package name */
        public String f41427d;

        static {
            Covode.recordClassIndex(25385);
        }

        public String toString() {
            String str;
            StringBuilder append = new StringBuilder("{\"timestamp\":").append(this.f41424a).append(",\"duration\":").append(this.f41425b).append(",\"msg:\":").append(this.f41427d).append(",\"javaStack\":\"");
            String str2 = this.f41426c;
            if (str2 == null || str2.isEmpty()) {
                str = "null";
            } else {
                str = this.f41426c;
            }
            return append.append(str).append("\"}").toString();
        }

        static void a(String str) {
            String poll;
            if (str != null && !str.isEmpty()) {
                try {
                    String[] split = str.split("&#&");
                    if (split.length == 3) {
                        if (LockMonitorManager.openFetchStack) {
                            synchronized (LockMonitorManager.sStackBlockingQueue) {
                                poll = LockMonitorManager.sStackBlockingQueue.poll(200, TimeUnit.MILLISECONDS);
                                if (poll != null || LockMonitorManager.lastJavaStack == null) {
                                    LockMonitorManager.lastJavaStack = poll;
                                } else {
                                    poll = LockMonitorManager.lastJavaStack;
                                }
                                if (!LockMonitorManager.sStackBlockingQueue.isEmpty()) {
                                    LockMonitorManager.sStackBlockingQueue.clear();
                                }
                            }
                            if (poll != null) {
                                b.a.f25210a.a(new Runnable(new a(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2], poll)) {
                                    /* class com.bytedance.monitor.collector.LockMonitorManager.a.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ a f41428a;

                                    static {
                                        Covode.recordClassIndex(25386);
                                    }

                                    public final void run() {
                                        LockMonitorManager.put(this.f41428a);
                                    }

                                    {
                                        this.f41428a = r1;
                                    }
                                });
                                return;
                            }
                            b.a.f25210a.a(new Runnable(new a(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2], "")) {
                                /* class com.bytedance.monitor.collector.LockMonitorManager.a.AnonymousClass2 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ a f41429a;

                                static {
                                    Covode.recordClassIndex(25387);
                                }

                                public final void run() {
                                    LockMonitorManager.put(this.f41429a);
                                }

                                {
                                    this.f41429a = r1;
                                }
                            });
                            return;
                        }
                        b.a.f25210a.a(new Runnable(new a(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2], "")) {
                            /* class com.bytedance.monitor.collector.LockMonitorManager.a.AnonymousClass3 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ a f41430a;

                            static {
                                Covode.recordClassIndex(25388);
                            }

                            public final void run() {
                                LockMonitorManager.put(this.f41430a);
                            }

                            {
                                this.f41430a = r1;
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        }

        private a(long j2, long j3, String str, String str2) {
            this.f41424a = j2;
            this.f41425b = j3;
            this.f41426c = str2;
            this.f41427d = str;
        }
    }

    public static List<String> dumpLockInfo() {
        a aVar;
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        while (true) {
            int i3 = bufferSize;
            if (i2 >= i3 || (aVar = buffer[(((position + i3) - i2) - 1) % i3]) == null) {
                return linkedList;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.f41424a).append("&#&").append(aVar.f41425b).append("&#&").append(aVar.f41427d).append("&#&").append(aVar.f41426c).append("&#&");
            linkedList.add(sb.toString());
            i2++;
        }
        return linkedList;
    }

    public static void setOpenFetchStack(boolean z) {
        openFetchStack = z;
        if (!z) {
            lastJavaStack = null;
        }
    }

    private static void nativePut(final String str) {
        sLockHandler.execute(new Runnable() {
            /* class com.bytedance.monitor.collector.LockMonitorManager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(25383);
            }

            public final void run() {
                try {
                    a.a(str);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static ExecutorService com_bytedance_monitor_collector_LockMonitorManager_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return g.a(a2.a());
    }

    public static void put(a aVar) {
        if (aVar != null) {
            a[] aVarArr = buffer;
            int i2 = position;
            aVarArr[i2] = aVar;
            position = (i2 + 1) % bufferSize;
        }
    }

    public static String dumpLockInfo(long j2, long j3) {
        a[] aVarArr = new a[100];
        int i2 = 0;
        System.arraycopy(buffer, 0, aVarArr, 0, 100);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i3 = bufferSize;
            if (i2 >= i3) {
                break;
            }
            a aVar = aVarArr[((position + i2) + 1) % i3];
            if (aVar != null) {
                if (aVar.f41424a < j3 || aVar.f41424a + aVar.f41425b > j2) {
                    arrayList.add(aVar);
                }
                if (aVar.f41424a + aVar.f41425b < j2) {
                    break;
                }
            }
            i2++;
        }
        return arrayList.toString();
    }
}
