package com.bytedance.helios.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.config.ApiConfig;
import com.bytedance.helios.api.config.CrpConfig;
import com.bytedance.helios.api.config.FrequencyGroupModel;
import com.bytedance.helios.api.config.ResourceCheckModel;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.api.config.SampleRateConfig;
import h.a.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class d extends AbstractSettingsModel {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30841a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f30842b;

    /* renamed from: c  reason: collision with root package name */
    private final long f30843c = TimeUnit.HOURS.toMillis(2);

    /* renamed from: d  reason: collision with root package name */
    private final long f30844d = TimeUnit.SECONDS.toMillis(6);

    /* renamed from: e  reason: collision with root package name */
    private final List<AnchorInfoModel> f30845e = z.INSTANCE;

    /* renamed from: f  reason: collision with root package name */
    private final List<ResourceCheckModel> f30846f = z.INSTANCE;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f30847g = z.INSTANCE;

    /* renamed from: h  reason: collision with root package name */
    private final List<RuleInfo> f30848h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final List<FrequencyGroupModel> f30849i = z.INSTANCE;

    /* renamed from: j  reason: collision with root package name */
    private final List<String> f30850j = z.INSTANCE;

    /* renamed from: k  reason: collision with root package name */
    private final SampleRateConfig f30851k = new SampleRateConfig(false, 0.0d, 0.0d, 0.0d, null, null, null, 127, null);

    /* renamed from: l  reason: collision with root package name */
    private final long f30852l = 500;

    /* renamed from: m  reason: collision with root package name */
    private final ApiConfig f30853m = new ApiConfig(null, null, 3, null);
    private final CrpConfig n = new CrpConfig(0, 0, 3, null);
    private final boolean o;

    static {
        Covode.recordClassIndex(17916);
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getAlogDuration() {
        return this.f30843c;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getAlogEnabled() {
        return this.f30842b;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<AnchorInfoModel> getAnchorConfigList() {
        return this.f30845e;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final ApiConfig getApiConfig() {
        return this.f30853m;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getApiTimeOutDuration() {
        return this.f30844d;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getAppOpsIgnoreKnownApi() {
        return this.o;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getBackgroundFreezeDuration() {
        return this.f30852l;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final CrpConfig getCrpConfig() {
        return this.n;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getEnabled() {
        return this.f30841a;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<FrequencyGroupModel> getFrequencyGroupModels() {
        return this.f30849i;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<String> getInterestedAppOps() {
        return this.f30850j;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<ResourceCheckModel> getResourceCheckList() {
        return this.f30846f;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<RuleInfo> getRuleInfoList() {
        return this.f30848h;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final SampleRateConfig getSampleRateConfig() {
        return this.f30851k;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<String> getTestEnvChannels() {
        return this.f30847g;
    }
}
