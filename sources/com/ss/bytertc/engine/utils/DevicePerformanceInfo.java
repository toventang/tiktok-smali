package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;

public class DevicePerformanceInfo {
    public int cpuCores;
    public float cpuFrequency;
    public String cpuModel;
    public int cpuThreads;
    public String deviceModel;
    public String gpuModel;
    public float memory;
    public String os;
    public String osVersion;

    static {
        Covode.recordClassIndex(101038);
    }

    private static DevicePerformanceInfo create(float f2, int i2, int i3, float f3, String str, String str2, String str3, String str4, String str5) {
        return new DevicePerformanceInfo(f2, i2, i3, f3, str, str2, str3, str4, str5);
    }

    public DevicePerformanceInfo(float f2, int i2, int i3, float f3, String str, String str2, String str3, String str4, String str5) {
        this.memory = f2;
        this.cpuCores = i2;
        this.cpuThreads = i3;
        this.cpuFrequency = f3;
        this.cpuModel = str;
        this.gpuModel = str2;
        this.os = str3;
        this.osVersion = str4;
        this.deviceModel = str5;
    }
}
