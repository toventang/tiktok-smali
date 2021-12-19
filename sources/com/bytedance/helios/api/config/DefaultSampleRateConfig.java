package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public class DefaultSampleRateConfig implements Serializable {
    @c(a = "intercept_error")
    private final double interceptError;
    @c(a = "monitor_error")
    private final double monitorError;
    @c(a = "monitor_normal")
    private final double monitorNormal;

    static {
        Covode.recordClassIndex(17836);
    }

    public DefaultSampleRateConfig() {
        this(0.0d, 0.0d, 0.0d, 7, null);
    }

    public final double getInterceptError() {
        return this.interceptError;
    }

    public final double getMonitorError() {
        return this.monitorError;
    }

    public final double getMonitorNormal() {
        return this.monitorNormal;
    }

    public DefaultSampleRateConfig(double d2, double d3, double d4) {
        this.monitorNormal = d2;
        this.monitorError = d3;
        this.interceptError = d4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultSampleRateConfig(double d2, double d3, double d4, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0.0d : d2, (i2 & 2) != 0 ? 0.01d : d3, (i2 & 4) != 0 ? 1.0d : d4);
    }
}
