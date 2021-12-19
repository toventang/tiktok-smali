package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class SysStats {
    public double cpu_app_usage;
    public int cpu_cores;
    public double cpu_total_usage;
    public long free_memory;
    public long full_memory;
    public double memory_ratio;
    public double memory_usage;
    public double total_memory_ratio;
    public long total_memory_usage;

    static {
        Covode.recordClassIndex(100818);
    }

    public SysStats() {
    }

    public String toString() {
        return "SysStats{cpu_cores=" + this.cpu_cores + '\'' + " cpu_app_usage=" + this.cpu_app_usage + '\'' + ", cpu_total_usage=" + this.cpu_total_usage + ", memory_usage=" + this.memory_usage + "full_memory=" + this.full_memory + '\'' + "total_memory_usage=" + this.total_memory_usage + '\'' + "free_memory=" + this.free_memory + '\'' + "memory_ratio=" + this.memory_ratio + '\'' + "total_memory_ratio=" + this.total_memory_ratio + '}';
    }

    private static SysStats create(int i2, double d2, double d3, double d4, long j2, long j3, long j4, double d5, double d6) {
        return new SysStats(i2, d2, d3, d4, j2, j3, j4, d5, d6);
    }

    public SysStats(int i2, double d2, double d3, double d4, long j2, long j3, long j4, double d5, double d6) {
        this.cpu_cores = i2;
        this.cpu_app_usage = d2;
        this.cpu_total_usage = d3;
        this.memory_usage = d4;
        this.full_memory = j2;
        this.total_memory_usage = j3;
        this.free_memory = j4;
        this.memory_ratio = d5;
        this.total_memory_ratio = d6;
    }
}
