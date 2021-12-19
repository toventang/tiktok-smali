package com.bytedance.monitor.collector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class IOMonitor extends b {

    /* renamed from: f  reason: collision with root package name */
    private static List<a> f41414f = new ArrayList(100);

    /* renamed from: g  reason: collision with root package name */
    private static final Object f41415g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static volatile int f41416h = 0;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.b
    public final void b(int i2) {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.b
    public final Pair<String, ?> c() {
        try {
            return new Pair<>(this.f41450a, f41414f.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(25378);
    }

    private static List<a> d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f41415g) {
            int i2 = 0;
            if (f41414f.size() >= 100) {
                while (i2 < 100) {
                    arrayList.add(f41414f.get(((f41416h + i2) + 1) % 100));
                    i2++;
                }
            } else {
                while (i2 < f41414f.size()) {
                    arrayList.add(f41414f.get(i2));
                    i2++;
                }
            }
        }
        return arrayList;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f41417a;

        /* renamed from: b  reason: collision with root package name */
        public long f41418b;

        /* renamed from: c  reason: collision with root package name */
        public long f41419c;

        /* renamed from: d  reason: collision with root package name */
        public long f41420d;

        /* renamed from: e  reason: collision with root package name */
        public String f41421e;

        /* renamed from: f  reason: collision with root package name */
        public String f41422f;

        static {
            Covode.recordClassIndex(25379);
        }

        public final String toString() {
            return "{\"start\":" + this.f41417a + ",\"end\":" + this.f41418b + ",\"function:\":" + this.f41422f + ",\"file_size\":" + this.f41420d + ",\"cost_millis\":" + (this.f41418b - this.f41417a) + ",\"file_name\":\"" + this.f41421e + "\"}";
        }
    }

    public IOMonitor(int i2) {
        super(i2, "io_monitor");
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.b
    public final Pair<String, ?> a(long j2, long j3) {
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
            if (aVar.f41417a < j3 || aVar.f41418b > j2) {
                arrayList.add(aVar);
            }
            if (aVar.f41418b < j2) {
                break;
            }
        }
        return arrayList.toString();
    }

    public static void saveIOInfo(long j2, long j3, long j4, long j5, String str, String str2) {
        synchronized (f41415g) {
            if (f41416h >= 100) {
                f41416h -= 100;
            }
            if (f41414f.size() >= 100) {
                a aVar = f41414f.get(f41416h);
                aVar.f41417a = j2;
                aVar.f41418b = j3;
                aVar.f41419c = j4;
                aVar.f41420d = j5;
                aVar.f41421e = str;
                aVar.f41422f = str2;
            } else {
                a aVar2 = new a();
                aVar2.f41417a = j2;
                aVar2.f41418b = j3;
                aVar2.f41419c = j4;
                aVar2.f41420d = j5;
                aVar2.f41421e = str;
                aVar2.f41422f = str2;
                f41414f.add(aVar2);
            }
            f41416h++;
        }
    }
}
