package ms.bd.o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.ss.android.ugc.aweme.lancet.receiver.a;
import com.ss.ugc.effectplatform.b.a.e;
import java.util.ArrayList;
import java.util.List;

public class x1 {

    /* renamed from: c  reason: collision with root package name */
    private static x1 f159563c;

    /* renamed from: a  reason: collision with root package name */
    Context f159564a = null;

    /* renamed from: b  reason: collision with root package name */
    List<Integer> f159565b = new ArrayList();

    static {
        Covode.recordClassIndex(105972);
    }

    private x1(Context context) {
        this.f159564a = context;
    }

    public static x1 a(Context context) {
        MethodCollector.i(8371);
        if (f159563c == null) {
            synchronized (x1.class) {
                try {
                    if (f159563c == null) {
                        f159563c = new x1(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8371);
                    throw th;
                }
            }
        }
        x1 x1Var = f159563c;
        MethodCollector.o(8371);
        return x1Var;
    }

    private int e() {
        MethodCollector.i(8380);
        Intent a2 = a(this.f159564a, new IntentFilter((String) h.a(16777217, 0, 0, "17bc9f", new byte[]{33, 59, 21, 5, 9, 120, 54, 88, 58, 61, 52, 48, 31, 3, 72, 112, 49, 2, 58, 60, 46, 123, 51, 54, 50, 69, 23, 36, 10, 12, 3, 29, 48, 57, 33, 84, 22})));
        if (a2 == null) {
            MethodCollector.o(8380);
            return -1;
        }
        int round = Math.round(((((float) a2.getIntExtra((String) h.a(16777217, 0, 0, "e75799", new byte[]{120, 48, 80, 70, 10}), -1)) / ((float) a2.getIntExtra((String) h.a(16777217, 0, 0, "b7db8f", new byte[]{96, 54, 22, 26, 2}), -1))) * 100.0f) * 10.0f) / 10;
        MethodCollector.o(8380);
        return round;
    }

    public final String a() {
        int i2;
        MethodCollector.i(8373);
        try {
            synchronized (this) {
                try {
                    i2 = e();
                } catch (Throwable th) {
                    MethodCollector.o(8373);
                    throw th;
                }
            }
        } catch (Exception unused) {
            i2 = -1;
        } catch (Throwable th2) {
            MethodCollector.o(8373);
            throw th2;
        }
        String valueOf = String.valueOf(i2);
        MethodCollector.o(8373);
        return valueOf;
    }

    public final int b() {
        MethodCollector.i(8392);
        Intent a2 = a(this.f159564a, new IntentFilter((String) h.a(16777217, 0, 0, "87ef26", new byte[]{40, 59, 18, 0, 2, 40, 63, 88, 61, 56, 61, 48, 24, 6, 67, 32, 56, 2, 61, 57, 39, 123, 52, 51, 57, 21, 30, 36, e.f153515b, 9, 10, 29, 55, 60, 42, 4, 31})));
        if (a2 == null) {
            MethodCollector.o(8392);
            return -1;
        }
        int intExtra = a2.getIntExtra((String) h.a(16777217, 0, 0, "183605", new byte[]{48, 54, 85, 69, 8, 39, 54}), -1);
        MethodCollector.o(8392);
        return intExtra;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r0 = -10001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8395);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r0 = java.lang.Integer.valueOf((r2 * 10000) + r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:1:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer c() {
        /*
            r5 = this;
            r4 = 8395(0x20cb, float:1.1764E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = -1
            java.lang.Integer.valueOf(r3)
            monitor-enter(r5)     // Catch:{ Exception -> 0x0032, all -> 0x0026 }
            int r2 = r5.b()     // Catch:{ all -> 0x001d }
            int r1 = r5.e()     // Catch:{ all -> 0x001b }
            monitor-exit(r5)
            int r0 = r2 * 10000
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0038
        L_0x001b:
            r0 = move-exception
            goto L_0x001f
        L_0x001d:
            r0 = move-exception
            r2 = -1
        L_0x001f:
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)     // Catch:{ Exception -> 0x0032, all -> 0x0024 }
            throw r0     // Catch:{ Exception -> 0x0032, all -> 0x0024 }
        L_0x0024:
            r1 = move-exception
            goto L_0x0028
        L_0x0026:
            r1 = move-exception
            r2 = -1
        L_0x0028:
            int r0 = r2 * 10000
            int r0 = r0 + r3
            java.lang.Integer.valueOf(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        L_0x0032:
            r0 = -10001(0xffffffffffffd8ef, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0038:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.x1.c():java.lang.Integer");
    }

    public final synchronized int[] d() {
        MethodCollector.i(8552);
        int size = this.f159565b.size();
        if (size <= 0) {
            int[] iArr = new int[0];
            MethodCollector.o(8552);
            return iArr;
        } else if (size == 1) {
            int[] iArr2 = {this.f159565b.get(0).intValue()};
            MethodCollector.o(8552);
            return iArr2;
        } else {
            try {
                List<Integer> list = this.f159565b;
                int i2 = size - 10;
                if (i2 <= 0) {
                    i2 = 0;
                }
                List<Integer> subList = list.subList(i2, size);
                int[] iArr3 = new int[subList.size()];
                for (int i3 = 0; i3 < subList.size(); i3++) {
                    iArr3[i3] = subList.get(i3).intValue();
                }
                MethodCollector.o(8552);
                return iArr3;
            } catch (Throwable unused) {
                int[] iArr4 = new int[0];
                MethodCollector.o(8552);
                return iArr4;
            }
        }
    }

    private static Intent b(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    public static Intent a(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        a.a(g.a());
        try {
            return b(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e2) {
                securityException = e2;
                b.a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                securityException = e3;
                if (message != null) {
                    boolean contains = e3.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e3;
                    if (contains) {
                        throw e3;
                    }
                }
                b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}
