package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class FrequencyGroupModel {
    @c(a = "api_ids")
    private final List<Integer> apiIds;
    @c(a = "frequency_config")
    private final FrequencyConfig frequencyConfig;

    static {
        Covode.recordClassIndex(17838);
    }

    public FrequencyGroupModel() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.FrequencyGroupModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FrequencyGroupModel copy$default(FrequencyGroupModel frequencyGroupModel, List list, FrequencyConfig frequencyConfig2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = frequencyGroupModel.apiIds;
        }
        if ((i2 & 2) != 0) {
            frequencyConfig2 = frequencyGroupModel.frequencyConfig;
        }
        return frequencyGroupModel.copy(list, frequencyConfig2);
    }

    public final List<Integer> component1() {
        return this.apiIds;
    }

    public final FrequencyConfig component2() {
        return this.frequencyConfig;
    }

    public final FrequencyGroupModel copy(List<Integer> list, FrequencyConfig frequencyConfig2) {
        l.c(list, "");
        l.c(frequencyConfig2, "");
        return new FrequencyGroupModel(list, frequencyConfig2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyGroupModel)) {
            return false;
        }
        FrequencyGroupModel frequencyGroupModel = (FrequencyGroupModel) obj;
        return l.a(this.apiIds, frequencyGroupModel.apiIds) && l.a(this.frequencyConfig, frequencyGroupModel.frequencyConfig);
    }

    public final int hashCode() {
        List<Integer> list = this.apiIds;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        FrequencyConfig frequencyConfig2 = this.frequencyConfig;
        if (frequencyConfig2 != null) {
            i2 = frequencyConfig2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FrequencyGroupModel(apiIds=" + this.apiIds + ", frequencyConfig=" + this.frequencyConfig + ")";
    }

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    public final FrequencyConfig getFrequencyConfig() {
        return this.frequencyConfig;
    }

    public FrequencyGroupModel(List<Integer> list, FrequencyConfig frequencyConfig2) {
        l.c(list, "");
        l.c(frequencyConfig2, "");
        this.apiIds = list;
        this.frequencyConfig = frequencyConfig2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrequencyGroupModel(List list, FrequencyConfig frequencyConfig2, int i2, g gVar) {
        this((i2 & 1) != 0 ? z.INSTANCE : list, (i2 & 2) != 0 ? new FrequencyConfig(0, 0, 0, null, 15, null) : frequencyConfig2);
    }
}
