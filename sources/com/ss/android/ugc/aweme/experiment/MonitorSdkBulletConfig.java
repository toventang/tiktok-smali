package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class MonitorSdkBulletConfig {
    @c(a = "monitor_sdk_blank_enable")
    private boolean blankMonitorEnable;
    @c(a = "monitor_sdk_error_enable")
    private boolean errorMonitorEnable;
    @c(a = "monitor_sdk_fetch_error_enable")
    private boolean fetchErrorMonitorEnable;
    @c(a = "monitor_sdk_jsb_error_enable")
    private boolean jsbErrorMonitorEnable;
    @c(a = "monitor_sdk_perf_enable")
    private boolean perfMonitorEnable;
    @c(a = "monitor_sdk_enable")
    private boolean totalEnable;

    static {
        Covode.recordClassIndex(56252);
    }

    public final boolean getBlankMonitorEnable() {
        return this.blankMonitorEnable;
    }

    public final boolean getErrorMonitorEnable() {
        return this.errorMonitorEnable;
    }

    public final boolean getFetchErrorMonitorEnable() {
        return this.fetchErrorMonitorEnable;
    }

    public final boolean getJsbErrorMonitorEnable() {
        return this.jsbErrorMonitorEnable;
    }

    public final boolean getPerfMonitorEnable() {
        return this.perfMonitorEnable;
    }

    public final boolean getTotalEnable() {
        return this.totalEnable;
    }

    public final void setBlankMonitorEnable(boolean z) {
        this.blankMonitorEnable = z;
    }

    public final void setErrorMonitorEnable(boolean z) {
        this.errorMonitorEnable = z;
    }

    public final void setFetchErrorMonitorEnable(boolean z) {
        this.fetchErrorMonitorEnable = z;
    }

    public final void setJsbErrorMonitorEnable(boolean z) {
        this.jsbErrorMonitorEnable = z;
    }

    public final void setPerfMonitorEnable(boolean z) {
        this.perfMonitorEnable = z;
    }

    public final void setTotalEnable(boolean z) {
        this.totalEnable = z;
    }
}
