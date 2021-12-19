package com.bytedance.apm.f;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(14581);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f24977a = -1;

        /* renamed from: b  reason: collision with root package name */
        public long f24978b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f24979c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f24980d = -1;

        /* renamed from: e  reason: collision with root package name */
        public double f24981e = -1.0d;

        /* renamed from: f  reason: collision with root package name */
        public long f24982f = -1;

        /* renamed from: g  reason: collision with root package name */
        public long f24983g = -1;

        /* renamed from: h  reason: collision with root package name */
        public double f24984h = -1.0d;

        /* renamed from: i  reason: collision with root package name */
        public double f24985i = -1.0d;

        /* renamed from: j  reason: collision with root package name */
        public double f24986j = -1.0d;

        /* renamed from: k  reason: collision with root package name */
        public long f24987k = -1;

        /* renamed from: l  reason: collision with root package name */
        public long f24988l = -1;

        /* renamed from: m  reason: collision with root package name */
        public long f24989m = -1;
        public long n = -1;
        public long o = -1;
        public List<String> p;

        static {
            Covode.recordClassIndex(14582);
        }

        public final String toString() {
            return "LaunchTraceData{gcCount=" + this.f24977a + ", gcTime=" + this.f24978b + ", blockGcCount=" + this.f24979c + ", blockGcTime=" + this.f24980d + ", cpuTime=" + this.f24981e + ", voluntarySwitches=" + this.f24982f + ", inVoluntarySwitches=" + this.f24983g + ", iowaitTime=" + this.f24984h + ", runnableTime=" + this.f24985i + ", sleepTime=" + this.f24986j + ", minorFault=" + this.f24989m + ", majorFault=" + this.n + ", allThreadCount=" + this.o + ", javaThreadNameList=" + this.p + ", lockTime=" + this.f24987k + ", binderTime=" + this.f24988l + '}';
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:5|6|(3:8|(2:10|54)(2:11|(2:13|55)(2:14|(2:16|56)(2:17|(2:19|57)(2:20|(2:22|58)(2:23|(2:25|60)(1:59))))))|53)|(3:28|29|(2:30|31))|36|37|(1:39)|40|41|(2:44|45)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00d5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x014f */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011f A[Catch:{ all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0154 A[SYNTHETIC, Splitter:B:44:0x0154] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.apm.f.e.a a() {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.f.e.a():com.bytedance.apm.f.e$a");
    }

    private static void a(a aVar) {
        try {
            int length = new File("/proc/self/task/").listFiles().length;
            if (length != 0) {
                ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup != null) {
                    while (threadGroup.getParent() != null) {
                        threadGroup = threadGroup.getParent();
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
                    int enumerate = threadGroup.enumerate(threadArr);
                    LinkedList linkedList = new LinkedList();
                    for (int i2 = 0; i2 < enumerate; i2++) {
                        String name = threadArr[i2].getName();
                        if (!TextUtils.isEmpty(name)) {
                            linkedList.add(name);
                        }
                    }
                    aVar.o = (long) length;
                    aVar.p = linkedList;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
