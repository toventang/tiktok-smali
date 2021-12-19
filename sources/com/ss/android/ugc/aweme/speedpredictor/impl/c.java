package com.ss.android.ugc.aweme.speedpredictor.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.a;
import com.ss.android.ugc.h.e;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class c implements e.a {

    /* renamed from: a  reason: collision with root package name */
    private final ISpeedCalculatorConfig f134676a;

    static {
        Covode.recordClassIndex(88002);
    }

    c(ISpeedCalculatorConfig iSpeedCalculatorConfig) {
        this.f134676a = iSpeedCalculatorConfig;
    }

    @Override // com.ss.android.ugc.h.e.a
    public final Map a() {
        ISpeedCalculatorConfig iSpeedCalculatorConfig = this.f134676a;
        HashMap hashMap = new HashMap();
        a intelligentAlgoConfig = iSpeedCalculatorConfig.getIntelligentAlgoConfig();
        if (intelligentAlgoConfig == null) {
            return hashMap;
        }
        hashMap.put("country", intelligentAlgoConfig.e());
        hashMap.put("access", intelligentAlgoConfig.f());
        hashMap.put("signal", Integer.valueOf(intelligentAlgoConfig.g()));
        return hashMap;
    }
}
