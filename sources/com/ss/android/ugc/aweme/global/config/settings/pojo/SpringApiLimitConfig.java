package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class SpringApiLimitConfig {
    @c(a = "batch_event_interval")
    private Long batchEventInterval;
    @c(a = "config_list")
    private List<ApiConfigEntity> configList = new ArrayList();
    @c(a = "disable_fetch_setting")
    private Boolean disableFetchSetting;
    @c(a = "enable_delay_applog")
    private Boolean enableDelayApplog;
    @c(a = "end_time")
    private Long endTime;
    @c(a = "limit_end_time")
    private Long limitEndTime;
    @c(a = "limit_start_time")
    private Long limitStartTime;
    @c(a = "send_launch_timely")
    private Integer sendLaunchTimely;
    @c(a = "start_time")
    private Long startTime;

    static {
        Covode.recordClassIndex(63081);
    }

    public List<ApiConfigEntity> getConfigList() {
        return this.configList;
    }

    public Long getBatchEventInterval() {
        Long l2 = this.batchEventInterval;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public Boolean getDisableFetchSetting() {
        Boolean bool = this.disableFetchSetting;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getEnableDelayApplog() {
        Boolean bool = this.enableDelayApplog;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Long getEndTime() {
        Long l2 = this.endTime;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public Long getLimitEndTime() {
        Long l2 = this.limitEndTime;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public Long getLimitStartTime() {
        Long l2 = this.limitStartTime;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public Integer getSendLaunchTimely() {
        Integer num = this.sendLaunchTimely;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Long getStartTime() {
        Long l2 = this.startTime;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }
}
