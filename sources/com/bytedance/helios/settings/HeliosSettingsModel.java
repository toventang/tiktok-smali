package com.bytedance.helios.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.config.ApiConfig;
import com.bytedance.helios.api.config.CrpConfig;
import com.bytedance.helios.api.config.FrequencyGroupModel;
import com.bytedance.helios.api.config.ResourceCheckModel;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.api.config.SampleRateConfig;
import com.google.gson.a.c;
import h.a.n;
import h.a.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class HeliosSettingsModel extends AbstractSettingsModel {
    @c(a = "alog_duration")
    private final long alogDuration = TimeUnit.HOURS.toMillis(2);
    @c(a = "alog_enabled")
    private final boolean alogEnabled;
    @c(a = "anchor_config_list")
    private final List<AnchorInfoModel> anchorConfigList = z.INSTANCE;
    @c(a = "api_config")
    private final ApiConfig apiConfig = new ApiConfig(null, null, 3, null);
    @c(a = "api_time_out_duration")
    private final long apiTimeOutDuration = TimeUnit.SECONDS.toMillis(6);
    @c(a = "appops_ignore_known_api")
    private final boolean appOpsIgnoreKnownApi;
    @c(a = "background_freeze_duration")
    private final long backgroundFreezeDuration = 500;
    @c(a = "crp_config")
    private final CrpConfig crpConfig = new CrpConfig(0, 0, 3, null);
    @c(a = "enabled")
    private final boolean enabled;
    @c(a = "frequency_group_models")
    private final List<FrequencyGroupModel> frequencyGroupModels = z.INSTANCE;
    @c(a = "interested_appops")
    private final List<String> interestedAppOps = z.INSTANCE;
    @c(a = "resource_check_list")
    private final List<ResourceCheckModel> resourceCheckList = z.INSTANCE;
    @c(a = "rule_info_list")
    private final List<RuleInfo> ruleInfoList = new ArrayList();
    @c(a = "sample_rate_config")
    private final SampleRateConfig sampleRateConfig = new SampleRateConfig(false, 0.0d, 0.0d, 0.0d, null, null, null, 127, null);
    @c(a = "test_env_channels")
    private final List<String> testEnvChannels = n.b("snpqa_permission_test", "tools_autotest", "local_test");

    static {
        Covode.recordClassIndex(18014);
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getAlogDuration() {
        return this.alogDuration;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getAlogEnabled() {
        return this.alogEnabled;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<AnchorInfoModel> getAnchorConfigList() {
        return this.anchorConfigList;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final ApiConfig getApiConfig() {
        return this.apiConfig;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getApiTimeOutDuration() {
        return this.apiTimeOutDuration;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getAppOpsIgnoreKnownApi() {
        return this.appOpsIgnoreKnownApi;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getBackgroundFreezeDuration() {
        return this.backgroundFreezeDuration;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final CrpConfig getCrpConfig() {
        return this.crpConfig;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<FrequencyGroupModel> getFrequencyGroupModels() {
        return this.frequencyGroupModels;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<String> getInterestedAppOps() {
        return this.interestedAppOps;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<ResourceCheckModel> getResourceCheckList() {
        return this.resourceCheckList;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<RuleInfo> getRuleInfoList() {
        return this.ruleInfoList;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final SampleRateConfig getSampleRateConfig() {
        return this.sampleRateConfig;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<String> getTestEnvChannels() {
        return this.testEnvChannels;
    }
}
