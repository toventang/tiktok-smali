package com.ss.android.ugc.aweme.setting;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import java.util.concurrent.Callable;

final /* synthetic */ class bd implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final bc f122089a;

    static {
        Covode.recordClassIndex(80050);
    }

    bd(bc bcVar) {
        this.f122089a = bcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        bc bcVar = this.f122089a;
        SettingsManagerProxy.inst().notifySettingsChange();
        i.b(new be(bcVar), g.a());
        return null;
    }
}
