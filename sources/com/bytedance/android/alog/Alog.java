package com.bytedance.android.alog;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.ArrayList;

public class Alog {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6730a = d.SAFE.value;

    /* renamed from: b  reason: collision with root package name */
    public static final int f6731b = g.RAW.value;

    /* renamed from: c  reason: collision with root package name */
    public static final int f6732c = e.DEFAULT.value;

    /* renamed from: d  reason: collision with root package name */
    public static final int f6733d = c.ZSTD.value;

    /* renamed from: e  reason: collision with root package name */
    public static final int f6734e = f.TEA_16.value;

    /* renamed from: f  reason: collision with root package name */
    public static final int f6735f = a.EC_SECP256K1.value;

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayList<String> f6736g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public static boolean f6737h = false;

    /* renamed from: i  reason: collision with root package name */
    public int f6738i;

    /* renamed from: j  reason: collision with root package name */
    public String f6739j;

    /* renamed from: k  reason: collision with root package name */
    public String f6740k;

    /* renamed from: l  reason: collision with root package name */
    public int f6741l;

    /* renamed from: m  reason: collision with root package name */
    public int f6742m;
    public String n;
    public String o;
    public long p;
    private Context q;

    private static native void nativeAsyncFlush(long j2);

    private static native long nativeCreate(int i2, boolean z, String str, String str2, int i3, int i4, int i5, String str3, int i6, int i7, String str4, int i8, int i9, int i10, int i11, int i12, int i13, String str5);

    private static native void nativeDestroy(long j2);

    public static native long nativeGetLegacyFlushFuncAddr();

    public static native long nativeGetLegacyGetLogFileDirFuncAddr();

    static native long nativeGetLegacyWriteFuncAddr();

    public static native long nativeGetNativeWriteFuncAddr();

    public static native void nativeSetDefaultInstance(long j2);

    private static native void nativeSetLevel(long j2, int i2);

    private static native void nativeSetSyslog(long j2, boolean z);

    private static native void nativeSyncFlush(long j2);

    private static native void nativeTimedSyncFlush(long j2, int i2);

    private static native void nativeWrite(long j2, int i2, String str, String str2);

    public static native void nativeWriteAsyncMsg(long j2, int i2, String str, String str2, long j3, long j4);

    public void finalize() {
        try {
            super.finalize();
        } finally {
            a();
        }
    }

    public final void b() {
        MethodCollector.i(3296);
        long j2 = this.p;
        if (j2 != 0) {
            nativeAsyncFlush(j2);
        }
        MethodCollector.o(3296);
    }

    public final void c() {
        MethodCollector.i(3298);
        long j2 = this.p;
        if (j2 != 0) {
            nativeSyncFlush(j2);
        }
        MethodCollector.o(3298);
    }

    public enum a {
        NONE(0),
        EC_SECP256K1(1),
        EC_SECP256R1(2);
        
        public final int value;

        static {
            Covode.recordClassIndex(3243);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    public enum c {
        NONE(0),
        ZLIB(1),
        ZSTD(2);
        
        public final int value;

        static {
            Covode.recordClassIndex(3245);
        }

        private c(int i2) {
            this.value = i2;
        }
    }

    public enum d {
        SPEED(0),
        SAFE(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(3246);
        }

        private d(int i2) {
            this.value = i2;
        }
    }

    public enum e {
        DEFAULT(0),
        LEGACY(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(3247);
        }

        private e(int i2) {
            this.value = i2;
        }
    }

    public enum f {
        NONE(0),
        TEA_16(1),
        TEA_32(2),
        TEA_64(3);
        
        public final int value;

        static {
            Covode.recordClassIndex(3248);
        }

        private f(int i2) {
            this.value = i2;
        }
    }

    public enum g {
        RAW(0),
        ISO_8601(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(3249);
        }

        private g(int i2) {
            this.value = i2;
        }
    }

    static {
        Covode.recordClassIndex(3241);
    }

    public final void a() {
        MethodCollector.i(2939);
        synchronized (this) {
            try {
                long j2 = this.p;
                if (j2 != 0) {
                    this.q = null;
                    this.f6738i = 6;
                    nativeDestroy(j2);
                    this.p = 0;
                }
            } finally {
                MethodCollector.o(2939);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f6746a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6747b;

        /* renamed from: c  reason: collision with root package name */
        public String f6748c;

        /* renamed from: d  reason: collision with root package name */
        public int f6749d = 2097152;

        /* renamed from: e  reason: collision with root package name */
        public int f6750e = 20971520;

        /* renamed from: f  reason: collision with root package name */
        public int f6751f = 7;

        /* renamed from: g  reason: collision with root package name */
        public String f6752g;

        /* renamed from: h  reason: collision with root package name */
        public int f6753h = 65536;

        /* renamed from: i  reason: collision with root package name */
        public int f6754i = 196608;

        /* renamed from: j  reason: collision with root package name */
        public String f6755j = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a";

        /* renamed from: k  reason: collision with root package name */
        private Context f6756k;

        /* renamed from: l  reason: collision with root package name */
        private String f6757l;

        /* renamed from: m  reason: collision with root package name */
        private String f6758m;
        private int n = Alog.f6730a;
        private int o = Alog.f6731b;
        private int p = Alog.f6732c;
        private int q = Alog.f6733d;
        private int r = Alog.f6734e;
        private int s = Alog.f6735f;

        static {
            Covode.recordClassIndex(3244);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            if (r37.f6748c != null) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
            r2 = r37.f6756k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
            if (android.text.TextUtils.isEmpty(null) != false) goto L_0x0128;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
            r1 = r2.getExternalFilesDir(null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            if (r1 == null) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            r37.f6748c = r1.getPath() + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
            if (r37.f6752g != null) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            r37.f6752g = a(r37.f6756k) + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
            if (r37.f6758m != null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
            r37.f6758m = com.bytedance.android.alog.d.a(r37.f6756k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
            r2 = (r37.f6753h / 4096) * 4096;
            r37.f6753h = r2;
            r3 = (r37.f6754i / 4096) * 4096;
            r37.f6754i = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a0, code lost:
            if (r2 >= 4096) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
            r37.f6753h = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
            r2 = r37.f6753h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
            if (r3 >= (r2 * 2)) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
            r37.f6754i = r2 * 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
            r16 = new com.bytedance.android.alog.Alog(r37.f6756k, r37.f6746a, r37.f6747b, r37.f6757l, r37.f6748c, r37.f6749d, r37.f6750e, r37.f6751f, r37.f6752g, r37.f6753h, r37.f6754i, r37.f6758m, r37.n, r37.o, r37.p, r37.q, r37.r, r37.s, r37.f6755j);
            com.bytedance.frameworks.apm.trace.MethodCollector.o(3377);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x010a, code lost:
            return r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x010b, code lost:
            r37.f6748c = a(r37.f6756k) + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x012a, code lost:
            if (com.ss.android.ugc.aweme.lancet.d.f107196d == null) goto L_0x0130;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
            if (com.ss.android.ugc.aweme.lancet.d.f107197e != false) goto L_0x0136;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0130, code lost:
            com.ss.android.ugc.aweme.lancet.d.f107196d = r2.getExternalFilesDir(null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0136, code lost:
            r1 = com.ss.android.ugc.aweme.lancet.d.f107196d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.android.alog.Alog a() {
            /*
            // Method dump skipped, instructions count: 322
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.Alog.b.a():com.bytedance.android.alog.Alog");
        }

        public final b a(a aVar) {
            this.s = aVar.value;
            return this;
        }

        public final b a(c cVar) {
            this.q = cVar.value;
            return this;
        }

        private static File a(Context context) {
            if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
                return com.ss.android.ugc.aweme.lancet.d.f107195c;
            }
            File filesDir = context.getFilesDir();
            com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
            return filesDir;
        }

        public final b a(d dVar) {
            this.n = dVar.value;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x003a, code lost:
            if (r1 != null) goto L_0x003c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.content.Context r3) {
            /*
                r2 = this;
                r2.<init>()
                r0 = 2097152(0x200000, float:2.938736E-39)
                r2.f6749d = r0
                r0 = 20971520(0x1400000, float:3.526483E-38)
                r2.f6750e = r0
                r0 = 7
                r2.f6751f = r0
                r0 = 65536(0x10000, float:9.18355E-41)
                r2.f6753h = r0
                r0 = 196608(0x30000, float:2.75506E-40)
                r2.f6754i = r0
                int r0 = com.bytedance.android.alog.Alog.f6730a
                r2.n = r0
                int r0 = com.bytedance.android.alog.Alog.f6731b
                r2.o = r0
                int r0 = com.bytedance.android.alog.Alog.f6732c
                r2.p = r0
                int r0 = com.bytedance.android.alog.Alog.f6733d
                r2.q = r0
                int r0 = com.bytedance.android.alog.Alog.f6734e
                r2.r = r0
                int r0 = com.bytedance.android.alog.Alog.f6735f
                r2.s = r0
                java.lang.String r0 = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a"
                r2.f6755j = r0
                android.content.Context r1 = r3.getApplicationContext()
                boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
                if (r0 != 0) goto L_0x0040
            L_0x003a:
                if (r1 == 0) goto L_0x003d
            L_0x003c:
                r3 = r1
            L_0x003d:
                r2.f6756k = r3
                return
            L_0x0040:
                if (r1 == 0) goto L_0x0043
                goto L_0x003c
            L_0x0043:
                android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
                goto L_0x003a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.Alog.b.<init>(android.content.Context):void");
        }

        public final b a(e eVar) {
            this.p = eVar.value;
            return this;
        }

        public final b a(f fVar) {
            this.r = fVar.value;
            return this;
        }

        public final b a(g gVar) {
            this.o = gVar.value;
            return this;
        }

        public final b a(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("-")) {
                    str = str.replace("-", "");
                }
                if (str.contains("_")) {
                    str = str.replace("_", "");
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f6757l = str;
                }
            }
            return this;
        }
    }

    public static synchronized void a(b bVar) {
        synchronized (Alog.class) {
            MethodCollector.i(2935);
            if (f6737h) {
                MethodCollector.o(2935);
                return;
            }
            bVar.a();
            f6737h = true;
            MethodCollector.o(2935);
        }
    }

    public final void b(int i2) {
        MethodCollector.i(3304);
        long j2 = this.p;
        if (j2 != 0) {
            nativeSetLevel(j2, i2);
        }
        MethodCollector.o(3304);
    }

    public final void a(int i2) {
        MethodCollector.i(3300);
        long j2 = this.p;
        if (j2 != 0) {
            nativeTimedSyncFlush(j2, i2);
        }
        MethodCollector.o(3300);
    }

    public final void a(boolean z) {
        MethodCollector.i(3306);
        long j2 = this.p;
        if (j2 != 0) {
            nativeSetSyslog(j2, z);
        }
        MethodCollector.o(3306);
    }

    public final void a(int i2, String str, String str2) {
        MethodCollector.i(2941);
        long j2 = this.p;
        if (!(j2 == 0 || i2 < this.f6738i || str == null || str2 == null)) {
            nativeWrite(j2, i2, str, str2);
        }
        MethodCollector.o(2941);
    }

    public Alog(Context context, int i2, boolean z, String str, String str2, int i3, int i4, int i5, String str3, int i6, int i7, String str4, int i8, int i9, int i10, int i11, int i12, int i13, String str5) {
        MethodCollector.i(2937);
        this.q = context;
        this.f6738i = i2;
        this.f6739j = str2;
        this.f6740k = str3;
        this.f6741l = i6;
        this.f6742m = i7 / i6;
        this.o = str;
        this.p = nativeCreate(i2, z, str, str2, i3, i4, i5, str3, i6, i7, str4, i8, i9, i10, i11, i12, i13, str5);
        MethodCollector.o(2937);
    }
}
