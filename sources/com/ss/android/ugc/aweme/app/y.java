package com.ss.android.ugc.aweme.app;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.es;
import com.ss.android.ugc.aweme.experiment.eu;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.z;
import com.ss.android.ugc.aweme.launcher.a;
import com.ss.android.ugc.aweme.lego.a.e;
import com.ss.android.ugc.aweme.main.MainActivity;

final /* synthetic */ class y implements a.AbstractC2756a {

    /* renamed from: a  reason: collision with root package name */
    private final InitAllServiceImpl f66912a;

    static {
        Covode.recordClassIndex(41237);
    }

    y(InitAllServiceImpl initAllServiceImpl) {
        this.f66912a = initAllServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.launcher.a.AbstractC2756a
    public final String a(String str, Intent intent) {
        InitAllServiceImpl initAllServiceImpl = this.f66912a;
        if (initAllServiceImpl.f66492a || intent == null || !TextUtils.equals(MainActivity.class.getName(), str) || !p.a.a().h()) {
            return str;
        }
        initAllServiceImpl.f66492a = true;
        es.f89970e = true;
        if (eu.b()) {
            e eVar = e.f107374b;
            if (eVar.hasMessages(1205)) {
                eVar.removeMessages(1205);
            }
        }
        return z.f105220a.a(intent).getName();
    }
}
