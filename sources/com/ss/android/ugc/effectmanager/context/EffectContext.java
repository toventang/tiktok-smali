package com.ss.android.ugc.effectmanager.context;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;

public class EffectContext {
    private EffectConfiguration mEffectConfiguration;

    static {
        Covode.recordClassIndex(95352);
    }

    public EffectConfiguration getEffectConfiguration() {
        return this.mEffectConfiguration;
    }

    public Context getContext() {
        return this.mEffectConfiguration.getContext();
    }

    public String getBestHostUrl() {
        List<Host> hosts = this.mEffectConfiguration.getHosts();
        if (CollectionUtil.isListEmpty(hosts)) {
            return "";
        }
        return hosts.get(0).getItemName();
    }

    public EffectContext(EffectConfiguration effectConfiguration) {
        this.mEffectConfiguration = effectConfiguration;
    }
}
