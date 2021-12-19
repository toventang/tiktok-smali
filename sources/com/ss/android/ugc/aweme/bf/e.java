package com.ss.android.ugc.aweme.bf;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.global.config.settings.a;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.HashSet;

public final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f68656a = new e();

    static {
        Covode.recordClassIndex(42252);
    }

    private e() {
    }

    @Override // com.ss.android.ugc.aweme.global.config.settings.a
    public final void a(IESSettingsProxy iESSettingsProxy) {
        MethodCollector.i(6321);
        boolean z = false;
        SharedPreferences.Editor edit = d.a().getSharedPreferences("keva_switch_repo", 0).edit();
        if (iESSettingsProxy.getKevaSwitch().intValue() == 1) {
            z = true;
        }
        edit.putBoolean("keva_switch", z).putStringSet("keva_blacklist", new HashSet(iESSettingsProxy.getKevaBlacklist())).apply();
        iESSettingsProxy.getKevaBlacklist();
        MethodCollector.o(6321);
    }
}
