package com.google.android.gms.common.a;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.j;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f49953a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49954b;

    /* renamed from: c  reason: collision with root package name */
    private final j f49955c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49956d;

    static {
        Covode.recordClassIndex(31181);
    }

    public a(String str) {
        this(str, "");
    }

    public final void a(String str, Object... objArr) {
        if (this.f49956d <= 3) {
            b(str, objArr);
        }
    }

    public final String b(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = com.a.a(Locale.US, str, objArr);
        }
        return this.f49954b.concat(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.f49954b = r4
            r2.f49953a = r3
            com.google.android.gms.common.internal.j r1 = new com.google.android.gms.common.internal.j
            r0 = 0
            r1.<init>(r3, r0)
            r2.f49955c = r1
            r1 = 2
        L_0x0010:
            java.lang.String r0 = r2.f49953a
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x001e
            int r1 = r1 + 1
            r0 = 7
            if (r0 < r1) goto L_0x001e
            goto L_0x0010
        L_0x001e:
            r2.f49956d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.a.a.<init>(java.lang.String, java.lang.String):void");
    }
}
