package com.ss.android.ugc.aweme.push.downgrade;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f118879a = new c();

    static {
        Covode.recordClassIndex(77231);
    }

    private c() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue() && !b.f118877a) {
            b.f118877a = true;
            new f.c().b((w) new OptimizePushAccount$1()).a();
        }
    }
}
