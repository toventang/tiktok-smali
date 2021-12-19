package b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

final class c {

    /* renamed from: a  reason: collision with root package name */
    static final c f4808a = new c();

    /* renamed from: b  reason: collision with root package name */
    final Executor f4809b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f4810c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f4811d;

    static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal<Integer> f4812a;

        static {
            Covode.recordClassIndex(1894);
        }

        private a() {
            this.f4812a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f4812a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f4812a.remove();
            } else {
                this.f4812a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void execute(Runnable runnable) {
            Integer num = this.f4812a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f4812a.set(Integer.valueOf(intValue));
            if (intValue <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            } else {
                g.b().execute(runnable);
            }
            a();
        }
    }

    static {
        Covode.recordClassIndex(1893);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c() {
        /*
            r11 = this;
            r11.<init>()
            r3 = 463(0x1cf, float:6.49E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            java.lang.String r0 = "java.runtime.name"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x0054
            r0 = 0
        L_0x0012:
            r1 = 1
            if (r0 != 0) goto L_0x003a
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newCachedThreadPool()
        L_0x0019:
            r11.f4810c = r4
            com.ss.android.ugc.aweme.cw.o r0 = com.ss.android.ugc.aweme.cw.o.SCHEDULED
            com.ss.android.ugc.aweme.cw.l$a r0 = com.ss.android.ugc.aweme.cw.l.a(r0)
            r0.f79174c = r1
            com.ss.android.ugc.aweme.cw.l r0 = r0.a()
            java.util.concurrent.ExecutorService r0 = com.ss.android.ugc.aweme.cw.g.a(r0)
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r11.f4811d = r0
            b.c$a r0 = new b.c$a
            r0.<init>(r2)
            r11.f4809b = r0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x003a:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            int r5 = b.b.f4804c
            int r6 = b.b.f4805d
            r7 = 1
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r4.<init>(r5, r6, r7, r9, r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 9
            r4.allowCoreThreadTimeOut(r1)
            goto L_0x0019
        L_0x0054:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "android"
            boolean r0 = r1.contains(r0)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.<init>():void");
    }
}
