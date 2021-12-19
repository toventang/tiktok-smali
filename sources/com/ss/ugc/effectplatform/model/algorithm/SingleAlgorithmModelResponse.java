package com.ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SingleAlgorithmModelResponse {
    private ModelInfo data;

    static {
        Covode.recordClassIndex(102475);
    }

    public static /* synthetic */ SingleAlgorithmModelResponse copy$default(SingleAlgorithmModelResponse singleAlgorithmModelResponse, ModelInfo modelInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            modelInfo = singleAlgorithmModelResponse.data;
        }
        return singleAlgorithmModelResponse.copy(modelInfo);
    }

    public final ModelInfo component1() {
        return this.data;
    }

    public final SingleAlgorithmModelResponse copy(ModelInfo modelInfo) {
        l.c(modelInfo, "");
        return new SingleAlgorithmModelResponse(modelInfo);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SingleAlgorithmModelResponse) && l.a(this.data, ((SingleAlgorithmModelResponse) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        ModelInfo modelInfo = this.data;
        if (modelInfo != null) {
            return modelInfo.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SingleAlgorithmModelResponse(data=" + this.data + ")";
    }

    public final ModelInfo getData() {
        return this.data;
    }

    public final void setData(ModelInfo modelInfo) {
        l.c(modelInfo, "");
        this.data = modelInfo;
    }

    public SingleAlgorithmModelResponse(ModelInfo modelInfo) {
        l.c(modelInfo, "");
        this.data = modelInfo;
    }
}
