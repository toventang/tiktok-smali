package com.bytedance.android.livesdk.feed.drawerfeed;

import com.bytedance.android.livesdk.feed.e.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final l f17413a;

    static {
        Covode.recordClassIndex(9651);
    }

    m(l lVar) {
        this.f17413a = lVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        l lVar = this.f17413a;
        int i2 = ((a) obj).f17429a;
        if (i2 == 0) {
            lVar.f17411f.b();
        } else if (i2 == 1) {
            lVar.f17411f.a();
        }
    }
}
