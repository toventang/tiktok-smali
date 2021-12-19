package com.google.android.play.core.e.b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.a;
import com.google.android.play.core.e.f;
import java.util.ArrayList;

final /* synthetic */ class e implements k {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.play.core.e.e f53289a;

    static {
        Covode.recordClassIndex(32922);
    }

    e(com.google.android.play.core.e.e eVar) {
        this.f53289a = eVar;
    }

    @Override // com.google.android.play.core.e.b.k
    public final f a(f fVar) {
        int i2;
        com.google.android.play.core.e.e eVar = this.f53289a;
        if (fVar != null) {
            int b2 = fVar.b();
            if (b2 == 0 || b2 == 5 || b2 == 6 || b2 == 7) {
                i2 = 1 + fVar.a();
            } else {
                throw new a(-1);
            }
        } else {
            i2 = 1;
        }
        return f.a(i2, 1, 0, 0, 0, eVar.f53312a, new ArrayList());
    }
}
