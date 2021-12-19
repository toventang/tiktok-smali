package com.linecorp.linesdk.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.linecorp.a.a.a.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f54942a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54943b;

    /* renamed from: c  reason: collision with root package name */
    private final b f54944c;

    static {
        Covode.recordClassIndex(34508);
    }

    public final String a(long j2) {
        return this.f54944c.a(this.f54942a, String.valueOf(j2));
    }

    public final String a(String str) {
        return this.f54944c.a(this.f54942a, str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
            if (r0 != 0) goto L_0x000e
        L_0x0008:
            com.linecorp.a.a.a.b r0 = com.linecorp.linesdk.a.c.f54970a
            r2.<init>(r1, r4, r0)
            return
        L_0x000e:
            if (r1 == 0) goto L_0x0011
            goto L_0x0008
        L_0x0011:
            android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.a.a.<init>(android.content.Context, java.lang.String):void");
    }

    private a(Context context, String str, b bVar) {
        this.f54942a = context;
        this.f54943b = "com.linecorp.linesdk.accesstoken.".concat(String.valueOf(str));
        this.f54944c = bVar;
    }
}
