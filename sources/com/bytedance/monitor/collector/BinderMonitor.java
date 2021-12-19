package com.bytedance.monitor.collector;

import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinderMonitor extends b {

    /* renamed from: f  reason: collision with root package name */
    private static final List<a> f41407f = new ArrayList(200);

    /* renamed from: g  reason: collision with root package name */
    private static final Object f41408g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static volatile int f41409h = 0;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.b
    public final void b(int i2) {
    }

    private static String getStacktrace() {
        return Log.getStackTraceString(new Exception());
    }

    @Override // com.bytedance.monitor.collector.b
    public final Pair<String, String> c() {
        try {
            return new Pair<>(this.f41450a, f41407f.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(25376);
    }

    public static List<a> d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f41408g) {
            int i2 = 0;
            if (f41407f.size() < 200) {
                while (true) {
                    List<a> list = f41407f;
                    if (i2 >= list.size()) {
                        break;
                    }
                    arrayList.add(list.get(i2));
                    i2++;
                }
            } else {
                while (i2 < 200) {
                    arrayList.add(f41407f.get(((f41409h + i2) + 1) % 200));
                    i2++;
                }
            }
        }
        return arrayList;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f41410a;

        /* renamed from: b  reason: collision with root package name */
        public long f41411b;

        /* renamed from: c  reason: collision with root package name */
        long f41412c;

        /* renamed from: d  reason: collision with root package name */
        public StackTraceElement[] f41413d;

        static {
            Covode.recordClassIndex(25377);
        }

        public final String toString() {
            return "{\"start\":" + this.f41410a + ",\"end\":" + this.f41411b + ",\"parcel_size\":" + this.f41412c + ",\"cost_millis\":" + (this.f41411b - this.f41410a) + ",\"java_stack\":\"" + o.b(BinderMonitor.a(this.f41413d)) + "\"}";
        }
    }

    public BinderMonitor(int i2) {
        super(i2, "binder_monitor");
    }

    public static StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return stackTraceElementArr;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= stackTraceElementArr.length) {
                break;
            } else if ("saveBinderInfo".equals(stackTraceElementArr[i3].getMethodName())) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        int i4 = i2 + 1;
        if (i4 <= stackTraceElementArr.length) {
            return (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i4, stackTraceElementArr.length);
        }
        return stackTraceElementArr;
    }

    @Override // com.bytedance.monitor.collector.b
    public final Pair<String, String> a(long j2, long j3) {
        try {
            return new Pair<>(this.f41450a, b(j2, j3));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String b(long j2, long j3) {
        List<a> d2 = d();
        ArrayList arrayList = new ArrayList();
        for (int size = d2.size() - 1; size >= 0; size--) {
            a aVar = d2.get(size);
            if (aVar.f41410a < j3 || aVar.f41411b > j2) {
                arrayList.add(aVar);
            }
            if (aVar.f41411b < j2) {
                break;
            }
        }
        return arrayList.toString();
    }

    public static void saveBinderInfo(long j2, long j3, long j4) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        synchronized (f41408g) {
            if (f41409h >= 200) {
                f41409h -= 200;
            }
            List<a> list = f41407f;
            if (list.size() >= 200) {
                a aVar = list.get(f41409h);
                aVar.f41410a = j2;
                aVar.f41411b = j3;
                aVar.f41412c = j4;
                aVar.f41413d = stackTrace;
            } else {
                a aVar2 = new a();
                aVar2.f41410a = j2;
                aVar2.f41411b = j3;
                aVar2.f41412c = j4;
                aVar2.f41413d = stackTrace;
                list.add(aVar2);
            }
            f41409h++;
        }
    }
}
