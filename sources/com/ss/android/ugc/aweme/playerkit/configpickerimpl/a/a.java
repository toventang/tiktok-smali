package com.ss.android.ugc.aweme.playerkit.configpickerimpl.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.util.Comparator;

public final class a implements Comparator<ConditionConfig> {
    static {
        Covode.recordClassIndex(74134);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ConditionConfig conditionConfig, ConditionConfig conditionConfig2) {
        return conditionConfig2.a() - conditionConfig.a();
    }
}
