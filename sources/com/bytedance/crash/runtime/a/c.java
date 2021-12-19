package com.bytedance.crash.runtime.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.util.x;

public final class c extends b {
    static {
        Covode.recordClassIndex(16312);
    }

    @Override // com.bytedance.crash.runtime.a.b
    public final b a(b bVar) {
        b a2 = super.a(bVar);
        Header a3 = Header.a(this.f27866b);
        Header.addRuntimeHeader(a3.f27553a);
        Header.a(a3);
        a3.c();
        a3.d();
        a3.e();
        a2.a(a3);
        a2.a("process_name", (Object) com.bytedance.crash.util.b.c(this.f27866b));
        x.a(a2, a3, this.f27865a);
        return a2;
    }

    c(CrashType crashType, Context context, a aVar, d dVar) {
        super(crashType, context, aVar, dVar);
    }
}
