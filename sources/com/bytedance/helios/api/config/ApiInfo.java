package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ApiInfo {
    @c(a = "api_ids")
    private final List<Integer> apiIds;
    @c(a = "block_configs")
    private final List<ControlConfig> blockConfigs;
    @c(a = "frequency_config")
    private final FrequencyConfig frequencyConfig;
    @c(a = "monitor_configs")
    private final List<ControlConfig> monitorConfigs;
    @c(a = "resource_ids")
    private final List<String> resourceIds;
    @c(a = "return_config")
    private final ReturnConfig returnConfig;

    static {
        Covode.recordClassIndex(17832);
    }

    public ApiInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.ApiInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiInfo copy$default(ApiInfo apiInfo, List list, List list2, FrequencyConfig frequencyConfig2, ReturnConfig returnConfig2, List list3, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = apiInfo.apiIds;
        }
        if ((i2 & 2) != 0) {
            list2 = apiInfo.resourceIds;
        }
        if ((i2 & 4) != 0) {
            frequencyConfig2 = apiInfo.frequencyConfig;
        }
        if ((i2 & 8) != 0) {
            returnConfig2 = apiInfo.returnConfig;
        }
        if ((i2 & 16) != 0) {
            list3 = apiInfo.monitorConfigs;
        }
        if ((i2 & 32) != 0) {
            list4 = apiInfo.blockConfigs;
        }
        return apiInfo.copy(list, list2, frequencyConfig2, returnConfig2, list3, list4);
    }

    public final List<Integer> component1() {
        return this.apiIds;
    }

    public final List<String> component2() {
        return this.resourceIds;
    }

    public final FrequencyConfig component3() {
        return this.frequencyConfig;
    }

    public final ReturnConfig component4() {
        return this.returnConfig;
    }

    public final List<ControlConfig> component5() {
        return this.monitorConfigs;
    }

    public final List<ControlConfig> component6() {
        return this.blockConfigs;
    }

    public final ApiInfo copy(List<Integer> list, List<String> list2, FrequencyConfig frequencyConfig2, ReturnConfig returnConfig2, List<ControlConfig> list3, List<ControlConfig> list4) {
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        l.c(list4, "");
        return new ApiInfo(list, list2, frequencyConfig2, returnConfig2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiInfo)) {
            return false;
        }
        ApiInfo apiInfo = (ApiInfo) obj;
        return l.a(this.apiIds, apiInfo.apiIds) && l.a(this.resourceIds, apiInfo.resourceIds) && l.a(this.frequencyConfig, apiInfo.frequencyConfig) && l.a(this.returnConfig, apiInfo.returnConfig) && l.a(this.monitorConfigs, apiInfo.monitorConfigs) && l.a(this.blockConfigs, apiInfo.blockConfigs);
    }

    public final int hashCode() {
        List<Integer> list = this.apiIds;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.resourceIds;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        FrequencyConfig frequencyConfig2 = this.frequencyConfig;
        int hashCode3 = (hashCode2 + (frequencyConfig2 != null ? frequencyConfig2.hashCode() : 0)) * 31;
        ReturnConfig returnConfig2 = this.returnConfig;
        int hashCode4 = (hashCode3 + (returnConfig2 != null ? returnConfig2.hashCode() : 0)) * 31;
        List<ControlConfig> list3 = this.monitorConfigs;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<ControlConfig> list4 = this.blockConfigs;
        if (list4 != null) {
            i2 = list4.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "ApiInfo(apiIds=" + this.apiIds + ", resourceIds=" + this.resourceIds + ", frequencyConfig=" + this.frequencyConfig + ", returnConfig=" + this.returnConfig + ", monitorConfigs=" + this.monitorConfigs + ", blockConfigs=" + this.blockConfigs + ")";
    }

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    public final List<ControlConfig> getBlockConfigs() {
        return this.blockConfigs;
    }

    public final FrequencyConfig getFrequencyConfig() {
        return this.frequencyConfig;
    }

    public final List<ControlConfig> getMonitorConfigs() {
        return this.monitorConfigs;
    }

    public final List<String> getResourceIds() {
        return this.resourceIds;
    }

    public final ReturnConfig getReturnConfig() {
        return this.returnConfig;
    }

    public ApiInfo(List<Integer> list, List<String> list2, FrequencyConfig frequencyConfig2, ReturnConfig returnConfig2, List<ControlConfig> list3, List<ControlConfig> list4) {
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        l.c(list4, "");
        this.apiIds = list;
        this.resourceIds = list2;
        this.frequencyConfig = frequencyConfig2;
        this.returnConfig = returnConfig2;
        this.monitorConfigs = list3;
        this.blockConfigs = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiInfo(List list, List list2, FrequencyConfig frequencyConfig2, ReturnConfig returnConfig2, List list3, List list4, int i2, g gVar) {
        this((i2 & 1) != 0 ? z.INSTANCE : list, (i2 & 2) != 0 ? z.INSTANCE : list2, (i2 & 4) != 0 ? null : frequencyConfig2, (i2 & 8) == 0 ? returnConfig2 : null, (i2 & 16) != 0 ? z.INSTANCE : list3, (i2 & 32) != 0 ? z.INSTANCE : list4);
    }
}
