package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class HybridMonitorConfig {
    @c(a = "gecko_channel_monitor_allow_list")
    private List<String> geckoChannelMonitorAllowList = new ArrayList();
    @c(a = "h5_static_resource_report_allow_list")
    private List<String> h5StaticResourceReportAllowList = new ArrayList();
    @c(a = "h5_static_resource_report_enabled")
    private Boolean h5StaticResourceReportEnabled;
    @c(a = "jsb_host_allow_list")
    private List<String> jsbHostAllowList = new ArrayList();
    @c(a = "perf_monitor_regex_list")
    private List<String> perfMonitorRegexList = new ArrayList();
    @c(a = "rn_timing_interval")
    private Integer rnTimingInterval;
    @c(a = "slardar_sdk_config")
    private String slardarSdkConfig;

    static {
        Covode.recordClassIndex(63047);
    }

    public List<String> getGeckoChannelMonitorAllowList() {
        return this.geckoChannelMonitorAllowList;
    }

    public List<String> getH5StaticResourceReportAllowList() {
        return this.h5StaticResourceReportAllowList;
    }

    public List<String> getJsbHostAllowList() {
        return this.jsbHostAllowList;
    }

    public List<String> getPerfMonitorRegexList() {
        return this.perfMonitorRegexList;
    }

    public Boolean getH5StaticResourceReportEnabled() {
        Boolean bool = this.h5StaticResourceReportEnabled;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getRnTimingInterval() {
        Integer num = this.rnTimingInterval;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getSlardarSdkConfig() {
        String str = this.slardarSdkConfig;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
