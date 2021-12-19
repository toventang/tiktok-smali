package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class AbstractSettingsModel {
    static {
        Covode.recordClassIndex(17828);
    }

    public abstract long getAlogDuration();

    public abstract boolean getAlogEnabled();

    public abstract List<AnchorInfoModel> getAnchorConfigList();

    public abstract ApiConfig getApiConfig();

    public abstract long getApiTimeOutDuration();

    public abstract boolean getAppOpsIgnoreKnownApi();

    public abstract long getBackgroundFreezeDuration();

    public abstract CrpConfig getCrpConfig();

    public abstract boolean getEnabled();

    public abstract List<FrequencyGroupModel> getFrequencyGroupModels();

    public abstract List<String> getInterestedAppOps();

    public abstract List<ResourceCheckModel> getResourceCheckList();

    public abstract List<RuleInfo> getRuleInfoList();

    public abstract SampleRateConfig getSampleRateConfig();

    public abstract List<String> getTestEnvChannels();

    public String toString() {
        return "EnvSettings(enabled=" + getEnabled() + ", alogEnabled=" + getAlogEnabled() + ", alogDuration=" + getAlogDuration() + ", apiTimeOutDuration=" + getApiTimeOutDuration() + ", backgroundFreezeDuration=" + getBackgroundFreezeDuration() + ", testEnvChannels=" + getTestEnvChannels() + ", interestedAppOps=" + getInterestedAppOps() + ", appOpsIgnoreKnownApi=" + getAppOpsIgnoreKnownApi() + ", sampleRateConfig=" + getSampleRateConfig() + ", ruleInfoList=" + getRuleInfoList() + ", frequencyGroupModels=" + getFrequencyGroupModels() + ", anchorConfigList=" + getAnchorConfigList() + ", apiConfig=" + getApiConfig() + ", resourceCheckList=" + getResourceCheckList() + ')';
    }
}
