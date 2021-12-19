package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import h.f.b.l;

public final class AlgorithmConfigUtil {
    public static final AlgorithmConfigUtil INSTANCE = new AlgorithmConfigUtil();

    private AlgorithmConfigUtil() {
    }

    static {
        Covode.recordClassIndex(95202);
    }

    public static final boolean isOnlineEnv(DownloadableModelConfig downloadableModelConfig) {
        l.c(downloadableModelConfig, "");
        EffectConfiguration effectConfiguration = downloadableModelConfig.getEffectConfiguration();
        if (effectConfiguration != null && effectConfiguration.getChannel() != null) {
            return EffectRequestUtil.isOnlineEnv(effectConfiguration);
        }
        if (downloadableModelConfig.getModelFileEnv() == DownloadableModelConfig.ModelFileEnv.ONLINE) {
            return true;
        }
        return false;
    }
}
