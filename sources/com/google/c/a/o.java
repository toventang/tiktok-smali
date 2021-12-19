package com.google.c.a;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public boolean f53699a;

    /* renamed from: b  reason: collision with root package name */
    private final t f53700b;

    /* renamed from: c  reason: collision with root package name */
    private long f53701c;

    /* renamed from: d  reason: collision with root package name */
    private long f53702d;

    static {
        Covode.recordClassIndex(33256);
    }

    public o() {
        this.f53700b = t.f53707a;
    }

    public final o d() {
        this.f53701c = 0;
        this.f53699a = false;
        return this;
    }

    public static o a() {
        return new o().b();
    }

    private long e() {
        if (this.f53699a) {
            return (this.f53700b.a() - this.f53702d) + this.f53701c;
        }
        return this.f53701c;
    }

    public final o b() {
        k.b(!this.f53699a, "This stopwatch is already running.");
        this.f53699a = true;
        this.f53702d = this.f53700b.a();
        return this;
    }

    public final o c() {
        long a2 = this.f53700b.a();
        k.b(this.f53699a, "This stopwatch is already stopped.");
        this.f53699a = false;
        this.f53701c += a2 - this.f53702d;
        return this;
    }

    /* renamed from: com.google.c.a.o$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53703a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 33257(0x81e9, float:4.6603E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.google.c.a.o.AnonymousClass1.f53703a = r2
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.google.c.a.o.AnonymousClass1.f53703a     // Catch:{ NoSuchFieldError -> 0x0023 }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.google.c.a.o.AnonymousClass1.f53703a     // Catch:{ NoSuchFieldError -> 0x002e }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.google.c.a.o.AnonymousClass1.f53703a     // Catch:{ NoSuchFieldError -> 0x0039 }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.google.c.a.o.AnonymousClass1.f53703a     // Catch:{ NoSuchFieldError -> 0x0044 }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.google.c.a.o.AnonymousClass1.f53703a     // Catch:{ NoSuchFieldError -> 0x004f }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r2 = com.google.c.a.o.AnonymousClass1.f53703a     // Catch:{ NoSuchFieldError -> 0x005a }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.c.a.o.AnonymousClass1.<clinit>():void");
        }
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long e2 = e();
        if (TimeUnit.DAYS.convert(e2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(e2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(e2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(e2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(e2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(e2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        double d2 = (double) e2;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, timeUnit);
        Double.isNaN(d2);
        Double.isNaN(convert);
        StringBuilder append = new StringBuilder().append(a.a(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d2 / convert)})).append(" ");
        switch (AnonymousClass1.f53703a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                str = "min";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                str = "h";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return append.append(str).toString();
    }

    public static o a(t tVar) {
        return new o(tVar);
    }

    private o(t tVar) {
        this.f53700b = (t) k.a(tVar, "ticker");
    }

    public static o b(t tVar) {
        return new o(tVar).b();
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.NANOSECONDS);
    }
}
