package com.bytedance.crash.runtime.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.util.x;

/* access modifiers changed from: package-private */
public final class g extends b {
    static {
        Covode.recordClassIndex(16320);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.crash.runtime.a.b
    public final boolean a() {
        return false;
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
        }
        return a2;
    }

    g(Context context, a aVar, d dVar) {
        super(CrashType.NATIVE, context, aVar, dVar);
    }
}
