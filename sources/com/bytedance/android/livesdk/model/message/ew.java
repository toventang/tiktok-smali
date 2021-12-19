package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.bg;
import com.bytedance.covode.number.Covode;

public final class ew implements b<bg.a> {
    static {
        Covode.recordClassIndex(11643);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bg.a a(f fVar) {
        return b(fVar);
    }

    public static bg.a b(f fVar) {
        bg.a aVar = new bg.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f19313a = fVar.e();
            } else if (b2 == 3) {
                aVar.f19315c = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                aVar.f19316d = fVar.e();
            }
        }
    }
}
