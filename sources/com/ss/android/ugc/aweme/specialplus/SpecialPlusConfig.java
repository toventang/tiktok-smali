package com.ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class SpecialPlusConfig {
    @c(a = "app_version")
    private String appVersion = "";
    @c(a = "appearance_period_in_hours")
    private float appearance_period_in_hours = 24.0f;
    @c(a = "cool_down_period_in_hours")
    private float cool_down_period_in_hours = 4.0f;
    @c(a = "condition")
    private SpecialPlusLabels labels = new SpecialPlusLabels();
    @c(a = "plus_icon")
    private SpecialPlusMedia plusIcon = new SpecialPlusMedia();
    @c(a = "tips")
    private SpecialPlusTips tips = new SpecialPlusTips();
    @c(a = "valid_time")
    private SpecialPlusTimePeriod[] validTime = new SpecialPlusTimePeriod[0];
    @c(a = "version")
    private int version;

    static {
        Covode.recordClassIndex(87967);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final float getAppearance_period_in_hours() {
        return this.appearance_period_in_hours;
    }

    public final float getCool_down_period_in_hours() {
        return this.cool_down_period_in_hours;
    }

    public final SpecialPlusLabels getLabels() {
        return this.labels;
    }

    public final SpecialPlusMedia getPlusIcon() {
        return this.plusIcon;
    }

    public final SpecialPlusTips getTips() {
        return this.tips;
    }

    public final SpecialPlusTimePeriod[] getValidTime() {
        return this.validTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setAppearance_period_in_hours(float f2) {
        this.appearance_period_in_hours = f2;
    }

    public final void setCool_down_period_in_hours(float f2) {
        this.cool_down_period_in_hours = f2;
    }

    public final void setVersion(int i2) {
        this.version = i2;
    }

    public final void setAppVersion(String str) {
        l.d(str, "");
        this.appVersion = str;
    }

    public final void setLabels(SpecialPlusLabels specialPlusLabels) {
        l.d(specialPlusLabels, "");
        this.labels = specialPlusLabels;
    }

    public final void setPlusIcon(SpecialPlusMedia specialPlusMedia) {
        l.d(specialPlusMedia, "");
        this.plusIcon = specialPlusMedia;
    }

    public final void setTips(SpecialPlusTips specialPlusTips) {
        l.d(specialPlusTips, "");
        this.tips = specialPlusTips;
    }

    public final void setValidTime(SpecialPlusTimePeriod[] specialPlusTimePeriodArr) {
        l.d(specialPlusTimePeriodArr, "");
        this.validTime = specialPlusTimePeriodArr;
    }
}
