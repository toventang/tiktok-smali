package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import h.f.b.l;

public final class ModelInfoCache {
    private LocalModelInfo localModelInfo;
    private ModelInfo serverModelInfo;

    static {
        Covode.recordClassIndex(95201);
    }

    public static /* synthetic */ ModelInfoCache copy$default(ModelInfoCache modelInfoCache, LocalModelInfo localModelInfo2, ModelInfo modelInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localModelInfo2 = modelInfoCache.localModelInfo;
        }
        if ((i2 & 2) != 0) {
            modelInfo = modelInfoCache.serverModelInfo;
        }
        return modelInfoCache.copy(localModelInfo2, modelInfo);
    }

    public final LocalModelInfo component1() {
        return this.localModelInfo;
    }

    public final ModelInfo component2() {
        return this.serverModelInfo;
    }

    public final ModelInfoCache copy(LocalModelInfo localModelInfo2, ModelInfo modelInfo) {
        l.c(localModelInfo2, "");
        l.c(modelInfo, "");
        return new ModelInfoCache(localModelInfo2, modelInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelInfoCache)) {
            return false;
        }
        ModelInfoCache modelInfoCache = (ModelInfoCache) obj;
        return l.a(this.localModelInfo, modelInfoCache.localModelInfo) && l.a(this.serverModelInfo, modelInfoCache.serverModelInfo);
    }

    public final int hashCode() {
        LocalModelInfo localModelInfo2 = this.localModelInfo;
        int i2 = 0;
        int hashCode = (localModelInfo2 != null ? localModelInfo2.hashCode() : 0) * 31;
        ModelInfo modelInfo = this.serverModelInfo;
        if (modelInfo != null) {
            i2 = modelInfo.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ModelInfoCache(localModelInfo=" + this.localModelInfo + ", serverModelInfo=" + this.serverModelInfo + ")";
    }

    public final LocalModelInfo getLocalModelInfo() {
        return this.localModelInfo;
    }

    public final ModelInfo getServerModelInfo() {
        return this.serverModelInfo;
    }

    public final void setLocalModelInfo(LocalModelInfo localModelInfo2) {
        l.c(localModelInfo2, "");
        this.localModelInfo = localModelInfo2;
    }

    public final void setServerModelInfo(ModelInfo modelInfo) {
        l.c(modelInfo, "");
        this.serverModelInfo = modelInfo;
    }

    public ModelInfoCache(LocalModelInfo localModelInfo2, ModelInfo modelInfo) {
        l.c(localModelInfo2, "");
        l.c(modelInfo, "");
        this.localModelInfo = localModelInfo2;
        this.serverModelInfo = modelInfo;
    }
}
