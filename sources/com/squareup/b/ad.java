package com.squareup.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class ad implements j {

    /* renamed from: a  reason: collision with root package name */
    static volatile Object f57997a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f57998b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f57999c = new ThreadLocal<StringBuilder>() {
        /* class com.squareup.b.ad.AnonymousClass1 */

        static {
            Covode.recordClassIndex(36038);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final Context f58000d;

    static {
        Covode.recordClassIndex(36037);
    }

    public ad(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f58000d = applicationContext;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
    @Override // com.squareup.b.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.b.j.a a(android.net.Uri r8, int r9) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.b.ad.a(android.net.Uri, int):com.squareup.b.j$a");
    }
}
