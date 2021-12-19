package com.bytedance.b.b.a.d;

import com.bytedance.b.b.a.d.a;
import com.bytedance.b.k.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class d implements com.bytedance.b.b.a.e.d {

    /* renamed from: a  reason: collision with root package name */
    LinkedHashMap<f, ConcurrentLinkedQueue<b>> f25942a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.b.k.d.a f25943b;

    /* renamed from: c  reason: collision with root package name */
    public long f25944c;

    /* renamed from: d  reason: collision with root package name */
    public long f25945d;

    /* renamed from: e  reason: collision with root package name */
    long f25946e;

    static {
        Covode.recordClassIndex(15124);
    }

    @Override // com.bytedance.b.b.a.e.d
    public final String c() {
        return "second_log_dir";
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f25948a = new d((byte) 0);

        static {
            Covode.recordClassIndex(15126);
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f25946e = 1;
        this.f25944c = 30000;
    }

    private d() {
        this.f25942a = new LinkedHashMap<>();
        this.f25944c = 30000;
        this.f25945d = 0;
        this.f25946e = 1;
    }

    @Override // com.bytedance.b.b.a.e.d
    public final long d() {
        File[] b2 = a.C0553a.f25916a.b();
        long j2 = 0;
        if (b2 == null) {
            return 0;
        }
        for (File file : b2) {
            j2 += file.length();
        }
        return j2;
    }

    public static boolean a() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean e2 = e();
        j.f107226e = e2;
        return e2;
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    private static void a(List<com.bytedance.b.b.a.c.a> list) {
        for (com.bytedance.b.b.a.c.a aVar : list) {
            try {
                if (aVar.f25896d != null) {
                    c.b(aVar.f25896d);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.b.b.a.e.d
    public final void b(long j2) {
        File[] b2 = a.C0553a.f25916a.b();
        if (b2 != null) {
            for (File file : b2) {
                if (a.c(file) <= j2) {
                    c.b(file);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((java.lang.System.currentTimeMillis() - r2.f25938k.get()) <= r2.d()) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<com.bytedance.b.b.a.c.a> r21, int r22) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.b.a.d.d.a(java.util.List, int):void");
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        byte[] f25949a;

        /* renamed from: b  reason: collision with root package name */
        int f25950b;

        /* renamed from: c  reason: collision with root package name */
        long f25951c;

        static {
            Covode.recordClassIndex(15127);
        }

        b(byte[] bArr, int i2, long j2) {
            this.f25949a = bArr;
            this.f25950b = i2;
            this.f25951c = j2;
        }
    }
}
