package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AlgoFreeSettings extends BaseResponse implements Serializable {
    @c(a = "algo_free_enabled")
    private final Boolean algoFreeEnabled;
    @c(a = "algo_free_info")
    private final AlgoFreeInfo algoFreeInfo;

    static {
        Covode.recordClassIndex(47326);
    }

    public AlgoFreeSettings() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AlgoFreeSettings copy$default(AlgoFreeSettings algoFreeSettings, Boolean bool, AlgoFreeInfo algoFreeInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = algoFreeSettings.algoFreeEnabled;
        }
        if ((i2 & 2) != 0) {
            algoFreeInfo2 = algoFreeSettings.algoFreeInfo;
        }
        return algoFreeSettings.copy(bool, algoFreeInfo2);
    }

    public final Boolean component1() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo component2() {
        return this.algoFreeInfo;
    }

    public final AlgoFreeSettings copy(Boolean bool, AlgoFreeInfo algoFreeInfo2) {
        return new AlgoFreeSettings(bool, algoFreeInfo2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgoFreeSettings)) {
            return false;
        }
        AlgoFreeSettings algoFreeSettings = (AlgoFreeSettings) obj;
        return l.a(this.algoFreeEnabled, algoFreeSettings.algoFreeEnabled) && l.a(this.algoFreeInfo, algoFreeSettings.algoFreeInfo);
    }

    public final int hashCode() {
        Boolean bool = this.algoFreeEnabled;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        AlgoFreeInfo algoFreeInfo2 = this.algoFreeInfo;
        if (algoFreeInfo2 != null) {
            i2 = algoFreeInfo2.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AlgoFreeSettings(algoFreeEnabled=" + this.algoFreeEnabled + ", algoFreeInfo=" + this.algoFreeInfo + ")";
    }

    public final Boolean getAlgoFreeEnabled() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo getAlgoFreeInfo() {
        return this.algoFreeInfo;
    }

    public AlgoFreeSettings(Boolean bool, AlgoFreeInfo algoFreeInfo2) {
        this.algoFreeEnabled = bool;
        this.algoFreeInfo = algoFreeInfo2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AlgoFreeSettings(Boolean bool, AlgoFreeInfo algoFreeInfo2, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : bool, (i2 & 2) != 0 ? null : algoFreeInfo2);
    }
}
