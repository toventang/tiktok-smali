package com.bytedance.crash.runtime.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.util.x;

/* access modifiers changed from: package-private */
public final class f extends b {
    static {
        Covode.recordClassIndex(16319);
    }

    @Override // com.bytedance.crash.runtime.a.b
    public final b a(int i2, b bVar) {
        b a2 = super.a(i2, bVar);
        if (i2 == 0) {
            Header a3 = Header.a(this.f27866b);
            a3.c();
            a2.a(a3);
            x.a(a2, a3, this.f27865a);
        } else if (i2 == 1) {
            Header a4 = a2.a();
            a4.d();
            a4.e();
        } else if (i2 == 2) {
            Header.addRuntimeHeader(a2.a().f27553a);
        } else if (i2 == 5) {
            Header.a(a2.a());
        }
        return a2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    f(android.content.Context r2, com.bytedance.crash.runtime.a.a r3, com.bytedance.crash.runtime.a.d r4, boolean r5) {
        /*
            r1 = this;
            if (r5 == 0) goto L_0x0008
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.LAUNCH
        L_0x0004:
            r1.<init>(r0, r2, r3, r4)
            return
        L_0x0008:
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.a.f.<init>(android.content.Context, com.bytedance.crash.runtime.a.a, com.bytedance.crash.runtime.a.d, boolean):void");
    }
}
