package com.bytedance.geckox.statistic.model;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.e;
import com.google.gson.a.c;

public class SyncEventModel {
    @c(a = "aid")
    private long aid;
    @c(a = "app_version")
    private String appVersion;
    @c(a = "device_id")
    private String deviceId;
    @c(a = "device_model")
    private String deviceModel = Build.MODEL;
    @c(a = "os")
    private int os;
    @c(a = "os_version")
    public String osVersion = new StringBuilder().append(Build.VERSION.SDK_INT).toString();
    @c(a = "params_for_special")
    private String params = "gecko";
    @c(a = "region")
    private String region;
    @c(a = "sdk_version")
    private String sdkVersion = "3.0.0-rc.4-mt";
    @c(a = "sync_stats_type")
    private int syncStatsType;
    @c(a = "sync_task_id")
    private int syncTaskId;
    @c(a = "sync_task_type")
    private int syncTaskType;

    static {
        Covode.recordClassIndex(17475);
    }

    public void setSyncStatsType(int i2) {
        this.syncStatsType = i2;
    }

    public void setSyncTaskId(int i2) {
        this.syncTaskId = i2;
    }

    public void setSyncTaskType(int i2) {
        this.syncTaskType = i2;
    }

    public SyncEventModel(e eVar) {
        this.aid = eVar.f29790i.longValue();
        this.appVersion = eVar.f29791j;
        this.region = eVar.f29794m;
        this.deviceId = eVar.f29792k;
    }
}
