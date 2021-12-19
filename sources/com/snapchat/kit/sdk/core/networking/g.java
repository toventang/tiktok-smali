package com.snapchat.kit.sdk.core.networking;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.p;
import com.snapchat.kit.sdk.core.controller.b;
import com.snapchat.kit.sdk.m;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class g extends k {

    /* renamed from: a  reason: collision with root package name */
    private final m f57256a;

    /* renamed from: b  reason: collision with root package name */
    private final b f57257b;

    /* renamed from: c  reason: collision with root package name */
    private final f f57258c;

    static {
        Covode.recordClassIndex(35792);
    }

    /* renamed from: com.snapchat.kit.sdk.core.networking.g$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57259a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002d */
        static {
            /*
                r0 = 35793(0x8bd1, float:5.0157E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                int[] r0 = com.snapchat.kit.sdk.m.c.a()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.snapchat.kit.sdk.core.networking.g.AnonymousClass1.f57259a = r1
                r3 = 1
                int r0 = com.snapchat.kit.sdk.m.c.f57374e     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r0 = r0 - r3
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r2 = com.snapchat.kit.sdk.core.networking.g.AnonymousClass1.f57259a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = com.snapchat.kit.sdk.m.c.f57370a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1 - r3
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.snapchat.kit.sdk.core.networking.g.AnonymousClass1.f57259a     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = com.snapchat.kit.sdk.m.c.f57371b     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = r1 - r3
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                int[] r2 = com.snapchat.kit.sdk.core.networking.g.AnonymousClass1.f57259a     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = com.snapchat.kit.sdk.m.c.f57372c     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r1 - r3
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.snapchat.kit.sdk.core.networking.g.AnonymousClass1.f57259a     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = com.snapchat.kit.sdk.m.c.f57373d     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1 - r3
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.networking.g.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.snapchat.kit.sdk.core.networking.k
    public Request.Builder a(Interceptor.Chain chain) {
        m mVar = this.f57256a;
        if (mVar.f57355m.b()) {
            mVar.a();
        }
        Request.Builder a2 = super.a(chain);
        a2.header("authorization", "Bearer " + this.f57256a.f57355m.d());
        return a2;
    }

    @Override // okhttp3.Interceptor, com.snapchat.kit.sdk.core.networking.k
    public Response intercept(Interceptor.Chain chain) {
        boolean z;
        Response intercept = super.intercept(chain);
        if (!(intercept == null || intercept.body() == null || intercept.code() != 401)) {
            com.snapchat.kit.sdk.core.a.g gVar = null;
            try {
                gVar = (com.snapchat.kit.sdk.core.a.g) this.f57258c.a(intercept.body().charStream(), com.snapchat.kit.sdk.core.a.g.class);
            } catch (p unused) {
            }
            boolean z2 = false;
            if (gVar == null || TextUtils.isEmpty(gVar.f57091a) || !TextUtils.equals(gVar.f57091a.toLowerCase(), "invalid_token")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i2 = AnonymousClass1.f57259a[this.f57256a.a() - 1];
                if (i2 == 2 || i2 == 3) {
                    this.f57256a.clearToken();
                    this.f57257b.e();
                }
            } else {
                if (gVar != null && !TextUtils.isEmpty(gVar.f57091a) && TextUtils.equals(gVar.f57091a.toLowerCase(), "force_logout")) {
                    z2 = true;
                }
                if (z2) {
                    this.f57256a.clearToken();
                    this.f57257b.e();
                }
            }
        }
        return intercept;
    }

    g(m mVar, b bVar, String str, f fVar) {
        super(str);
        this.f57256a = mVar;
        this.f57257b = bVar;
        this.f57258c = fVar;
    }
}
