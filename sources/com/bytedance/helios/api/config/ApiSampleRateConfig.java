package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class ApiSampleRateConfig extends DefaultSampleRateConfig implements Serializable {
    @c(a = "api_ids")
    private final List<Integer> apiIds;

    static {
        Covode.recordClassIndex(17833);
    }

    public ApiSampleRateConfig() {
        this(null, 0.0d, 0.0d, 0.0d, 15, null);
    }

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiSampleRateConfig(List<Integer> list, double d2, double d3, double d4) {
        super(d2, d3, d4);
        l.c(list, "");
        this.apiIds = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiSampleRateConfig(List list, double d2, double d3, double d4, int i2, g gVar) {
        this((i2 & 1) != 0 ? z.INSTANCE : list, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) != 0 ? 0.01d : d3, (i2 & 8) != 0 ? 1.0d : d4);
    }
}
