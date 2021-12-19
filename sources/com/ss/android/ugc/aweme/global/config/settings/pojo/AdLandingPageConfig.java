package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class AdLandingPageConfig {
    @c(a = "ad_card_preload_common_channel")
    private List<String> adCardPreloadCommonChannel = new ArrayList();
    @c(a = "ad_card_preload_common_prefix")
    private List<String> adCardPreloadCommonPrefix = new ArrayList();
    @c(a = "ad_landing_page_auto_jump_allow_list")
    private List<String> adLandingPageAutoJumpAllowList = new ArrayList();
    @c(a = "ad_landing_page_auto_jump_control_enabled")
    private Boolean adLandingPageAutoJumpControlEnabled;
    @c(a = "ad_landing_page_auto_jump_intercept_list")
    private List<String> adLandingPageAutoJumpInterceptList = new ArrayList();
    @c(a = "ad_landing_page_click_jump_control_enabled")
    private Boolean adLandingPageClickJumpControlEnabled;
    @c(a = "ad_landing_page_click_jump_interval")
    private Integer adLandingPageClickJumpInterval;
    @c(a = "ad_landing_page_click_jump_interval_tips")
    private String adLandingPageClickJumpIntervalTips;
    @c(a = "ad_landing_page_pause_list")
    private List<String> adLandingPagePauseList = new ArrayList();
    @c(a = "ad_landing_page_preload_cache_count")
    private Integer adLandingPagePreloadCacheCount;
    @c(a = "ad_landing_page_preload_common_channel")
    private List<String> adLandingPagePreloadCommonChannel = new ArrayList();
    @c(a = "ad_landing_page_preload_common_prefix")
    private List<String> adLandingPagePreloadCommonPrefix = new ArrayList();
    @c(a = "ad_landing_page_preload_enabled")
    private Boolean adLandingPagePreloadEnabled;
    @c(a = "ad_landing_page_report_delay")
    private int adLandingPageReportDelay = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    @c(a = "ad_landing_page_report_limit_times")
    private Integer adLandingPageReportLimitTimes;
    @c(a = "ad_landing_page_report_packet_key")
    private String adLandingPageReportPacketKey;
    @c(a = "ad_landing_page_report_page_count")
    private Integer adLandingPageReportPageCount;
    @c(a = "ad_landing_page_report_url")
    private String adLandingPageReportUrl;
    @c(a = "ad_landing_page_report_wifi_only_enable")
    private Boolean adLandingPageReportWifiOnlyEnable;
    @c(a = "ad_lynx_page_preload_cache_count")
    private Integer adLynxPagePreloadCacheCount;
    @c(a = "allow_jump_control_enable")
    private Boolean allowJumpControlEnable = false;
    @c(a = "allow_jump_list")
    private List<String> allowJumpList = new ArrayList();
    @c(a = "analytics")
    private String analytics;
    @c(a = "enable_dynamic_navbar")
    private Boolean enableDynamicNavbar;
    @c(a = "enable_referer")
    private Boolean enableReferer = true;
    @c(a = "ad_hybrid_monitor_res_perf_enable")
    private boolean hybridMonitorResPerfEnable = false;
    @c(a = "ad_hybrid_monitor_sample_rate")
    private int hybridMonitorSampleRate = 3;
    @c(a = "modify_xrw")
    private boolean modifyXrw = true;
    @c(a = "premem_analytics")
    private String prememAnalytics;
    @c(a = "premem_cache_js_enable")
    private boolean prememCacheJsEnable = false;
    @c(a = "premem_cache_max_age_in_days")
    private int prememCacheMaxAgeInDays = 1;

    static {
        Covode.recordClassIndex(63009);
    }

    public List<String> getAdCardPreloadCommonChannel() {
        return this.adCardPreloadCommonChannel;
    }

    public List<String> getAdCardPreloadCommonPrefix() {
        return this.adCardPreloadCommonPrefix;
    }

    public List<String> getAdLandingPageAutoJumpAllowList() {
        return this.adLandingPageAutoJumpAllowList;
    }

    public List<String> getAdLandingPageAutoJumpInterceptList() {
        return this.adLandingPageAutoJumpInterceptList;
    }

    public List<String> getAdLandingPagePauseList() {
        return this.adLandingPagePauseList;
    }

    public List<String> getAdLandingPagePreloadCommonChannel() {
        return this.adLandingPagePreloadCommonChannel;
    }

    public List<String> getAdLandingPagePreloadCommonPrefix() {
        return this.adLandingPagePreloadCommonPrefix;
    }

    public int getAdLandingPageReportDelay() {
        return this.adLandingPageReportDelay;
    }

    public Boolean getAllowJumpControlEnable() {
        return this.allowJumpControlEnable;
    }

    public List<String> getAllowJumpList() {
        return this.allowJumpList;
    }

    public Boolean getEnableReferer() {
        return this.enableReferer;
    }

    public int getHybridMonitorSampleRate() {
        return this.hybridMonitorSampleRate;
    }

    public String getPrememAnalytics() {
        return this.prememAnalytics;
    }

    public boolean isHybridMonitorResPerfEnable() {
        return this.hybridMonitorResPerfEnable;
    }

    public boolean isModifyXrw() {
        return this.modifyXrw;
    }

    public boolean isPrememCacheJsEnable() {
        return this.prememCacheJsEnable;
    }

    public int getPrememCacheMaxAgeInDays() {
        return Math.max(0, this.prememCacheMaxAgeInDays);
    }

    public Boolean getAdLandingPageAutoJumpControlEnabled() {
        Boolean bool = this.adLandingPageAutoJumpControlEnabled;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getAdLandingPageClickJumpControlEnabled() {
        Boolean bool = this.adLandingPageClickJumpControlEnabled;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getAdLandingPageClickJumpInterval() {
        Integer num = this.adLandingPageClickJumpInterval;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getAdLandingPageClickJumpIntervalTips() {
        String str = this.adLandingPageClickJumpIntervalTips;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getAdLandingPagePreloadCacheCount() {
        Integer num = this.adLandingPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Boolean getAdLandingPagePreloadEnabled() {
        Boolean bool = this.adLandingPagePreloadEnabled;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getAdLandingPageReportLimitTimes() {
        Integer num = this.adLandingPageReportLimitTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getAdLandingPageReportPacketKey() {
        String str = this.adLandingPageReportPacketKey;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getAdLandingPageReportPageCount() {
        Integer num = this.adLandingPageReportPageCount;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getAdLandingPageReportUrl() {
        String str = this.adLandingPageReportUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Boolean getAdLandingPageReportWifiOnlyEnable() {
        Boolean bool = this.adLandingPageReportWifiOnlyEnable;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getAdLynxPagePreloadCacheCount() {
        Integer num = this.adLynxPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getAnalytics() {
        String str = this.analytics;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Boolean getEnableDynamicNavbar() {
        Boolean bool = this.enableDynamicNavbar;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
