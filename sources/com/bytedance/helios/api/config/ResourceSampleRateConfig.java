package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ResourceSampleRateConfig extends DefaultSampleRateConfig implements Serializable {
    @c(a = "resource_id")
    private final String resourceId;

    static {
        Covode.recordClassIndex(17841);
    }

    public ResourceSampleRateConfig() {
        this(null, 0.0d, 0.0d, 0.0d, 15, null);
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResourceSampleRateConfig(String str, double d2, double d3, double d4) {
        super(d2, d3, d4);
        l.c(str, "");
        this.resourceId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceSampleRateConfig(String str, double d2, double d3, double d4, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) != 0 ? 0.01d : d3, (i2 & 8) != 0 ? 1.0d : d4);
    }
}
