package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class SampleRateConfig {
    @c(a = "api_high_priority_configs")
    private final List<ApiSampleRateConfig> apiHighPriorityConfigs;
    @c(a = "app_ops_config")
    private final double appOpsConfig;
    @c(a = "auto_start_config")
    private final double autoStartConfig;
    @c(a = "default_low_priority_config")
    private final DefaultSampleRateConfig defaultLowPriorityConfig;
    @c(a = "enable_monitor")
    private final boolean enableMonitor;
    @c(a = "exception_config")
    private final double exceptionConfig;
    @c(a = "resource_medium_priority_configs")
    private final List<ResourceSampleRateConfig> resourceMediumPriorityConfigs;

    static {
        Covode.recordClassIndex(17845);
    }

    public SampleRateConfig() {
        this(false, 0.0d, 0.0d, 0.0d, null, null, null, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.SampleRateConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SampleRateConfig copy$default(SampleRateConfig sampleRateConfig, boolean z, double d2, double d3, double d4, DefaultSampleRateConfig defaultSampleRateConfig, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = sampleRateConfig.enableMonitor;
        }
        if ((i2 & 2) != 0) {
            d2 = sampleRateConfig.appOpsConfig;
        }
        if ((i2 & 4) != 0) {
            d3 = sampleRateConfig.autoStartConfig;
        }
        if ((i2 & 8) != 0) {
            d4 = sampleRateConfig.exceptionConfig;
        }
        if ((i2 & 16) != 0) {
            defaultSampleRateConfig = sampleRateConfig.defaultLowPriorityConfig;
        }
        if ((i2 & 32) != 0) {
            list = sampleRateConfig.resourceMediumPriorityConfigs;
        }
        if ((i2 & 64) != 0) {
            list2 = sampleRateConfig.apiHighPriorityConfigs;
        }
        return sampleRateConfig.copy(z, d2, d3, d4, defaultSampleRateConfig, list, list2);
    }

    public final boolean component1() {
        return this.enableMonitor;
    }

    public final double component2() {
        return this.appOpsConfig;
    }

    public final double component3() {
        return this.autoStartConfig;
    }

    public final double component4() {
        return this.exceptionConfig;
    }

    public final DefaultSampleRateConfig component5() {
        return this.defaultLowPriorityConfig;
    }

    public final List<ResourceSampleRateConfig> component6() {
        return this.resourceMediumPriorityConfigs;
    }

    public final List<ApiSampleRateConfig> component7() {
        return this.apiHighPriorityConfigs;
    }

    public final SampleRateConfig copy(boolean z, double d2, double d3, double d4, DefaultSampleRateConfig defaultSampleRateConfig, List<ResourceSampleRateConfig> list, List<ApiSampleRateConfig> list2) {
        l.c(defaultSampleRateConfig, "");
        l.c(list, "");
        l.c(list2, "");
        return new SampleRateConfig(z, d2, d3, d4, defaultSampleRateConfig, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SampleRateConfig)) {
            return false;
        }
        SampleRateConfig sampleRateConfig = (SampleRateConfig) obj;
        return this.enableMonitor == sampleRateConfig.enableMonitor && Double.compare(this.appOpsConfig, sampleRateConfig.appOpsConfig) == 0 && Double.compare(this.autoStartConfig, sampleRateConfig.autoStartConfig) == 0 && Double.compare(this.exceptionConfig, sampleRateConfig.exceptionConfig) == 0 && l.a(this.defaultLowPriorityConfig, sampleRateConfig.defaultLowPriorityConfig) && l.a(this.resourceMediumPriorityConfigs, sampleRateConfig.resourceMediumPriorityConfigs) && l.a(this.apiHighPriorityConfigs, sampleRateConfig.apiHighPriorityConfigs);
    }

    public final int hashCode() {
        boolean z = this.enableMonitor;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.appOpsConfig);
        long doubleToLongBits2 = Double.doubleToLongBits(this.autoStartConfig);
        long doubleToLongBits3 = Double.doubleToLongBits(this.exceptionConfig);
        int i5 = ((((((i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31;
        DefaultSampleRateConfig defaultSampleRateConfig = this.defaultLowPriorityConfig;
        int i6 = 0;
        int hashCode = (i5 + (defaultSampleRateConfig != null ? defaultSampleRateConfig.hashCode() : 0)) * 31;
        List<ResourceSampleRateConfig> list = this.resourceMediumPriorityConfigs;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<ApiSampleRateConfig> list2 = this.apiHighPriorityConfigs;
        if (list2 != null) {
            i6 = list2.hashCode();
        }
        return hashCode2 + i6;
    }

    public final String toString() {
        return "SampleRateConfig(enableMonitor=" + this.enableMonitor + ", appOpsConfig=" + this.appOpsConfig + ", autoStartConfig=" + this.autoStartConfig + ", exceptionConfig=" + this.exceptionConfig + ", defaultLowPriorityConfig=" + this.defaultLowPriorityConfig + ", resourceMediumPriorityConfigs=" + this.resourceMediumPriorityConfigs + ", apiHighPriorityConfigs=" + this.apiHighPriorityConfigs + ")";
    }

    public final List<ApiSampleRateConfig> getApiHighPriorityConfigs() {
        return this.apiHighPriorityConfigs;
    }

    public final double getAppOpsConfig() {
        return this.appOpsConfig;
    }

    public final double getAutoStartConfig() {
        return this.autoStartConfig;
    }

    public final DefaultSampleRateConfig getDefaultLowPriorityConfig() {
        return this.defaultLowPriorityConfig;
    }

    public final boolean getEnableMonitor() {
        return this.enableMonitor;
    }

    public final double getExceptionConfig() {
        return this.exceptionConfig;
    }

    public final List<ResourceSampleRateConfig> getResourceMediumPriorityConfigs() {
        return this.resourceMediumPriorityConfigs;
    }

    public SampleRateConfig(boolean z, double d2, double d3, double d4, DefaultSampleRateConfig defaultSampleRateConfig, List<ResourceSampleRateConfig> list, List<ApiSampleRateConfig> list2) {
        l.c(defaultSampleRateConfig, "");
        l.c(list, "");
        l.c(list2, "");
        this.enableMonitor = z;
        this.appOpsConfig = d2;
        this.autoStartConfig = d3;
        this.exceptionConfig = d4;
        this.defaultLowPriorityConfig = defaultSampleRateConfig;
        this.resourceMediumPriorityConfigs = list;
        this.apiHighPriorityConfigs = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SampleRateConfig(boolean z, double d2, double d3, double d4, DefaultSampleRateConfig defaultSampleRateConfig, List list, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 1.0E-5d : d2, (i2 & 4) != 0 ? 0.01d : d3, (i2 & 8) != 0 ? 0.1d : d4, (i2 & 16) != 0 ? new DefaultSampleRateConfig(0.0d, 0.0d, 0.0d, 7, null) : defaultSampleRateConfig, (i2 & 32) != 0 ? z.INSTANCE : list, (i2 & 64) != 0 ? z.INSTANCE : list2);
    }
}
