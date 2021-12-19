package com.bytedance.helios.sdk.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.g;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30738a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f30739b = HeliosEnvImpl.INSTANCE.getInterestedAppOps();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f30740c = HeliosEnvImpl.INSTANCE.getAppOpsIgnoreKnownApi();

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f30741d = new LinkedHashSet();

    private a() {
    }

    /* renamed from: com.bytedance.helios.sdk.a.a$a  reason: collision with other inner class name */
    static final class RunnableC0644a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f30742a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f30743b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30744c = 3;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f30745d;

        static {
            Covode.recordClassIndex(17871);
        }

        RunnableC0644a(String str, Throwable th, boolean z) {
            this.f30742a = str;
            this.f30743b = th;
            this.f30745d = z;
        }

        public final void run() {
            a.a(this.f30742a, this.f30743b, this.f30744c);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f30746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f30747b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30748c;

        static {
            Covode.recordClassIndex(17872);
        }

        b(String str, Throwable th, int i2) {
            this.f30746a = str;
            this.f30747b = th;
            this.f30748c = i2;
        }

        public final void run() {
            a.a(this.f30746a, this.f30747b, this.f30748c);
        }
    }

    static {
        Covode.recordClassIndex(17870);
    }

    public static void a(String str, int i2, Throwable th) {
        l.c(str, "");
        l.c(th, "");
        g.b().post(new b(str, th, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r30, java.lang.Throwable r31, int r32) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.a.a.a(java.lang.String, java.lang.Throwable, int):void");
    }
}
