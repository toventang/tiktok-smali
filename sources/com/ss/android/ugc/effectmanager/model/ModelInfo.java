package com.ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ModelInfo extends ModelInfoTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo;

    static {
        Covode.recordClassIndex(95597);
    }

    public ModelInfo() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public final com.ss.ugc.effectplatform.model.algorithm.ModelInfo getKModelInfo() {
        return this.kModelInfo;
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public final ExtendedUrlModel getFileUrl() {
        return super.getFileUrl();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public final String getMD5() {
        return super.getMD5();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final int getStatus() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            return kModelInfo2.getStatus();
        }
        return super.getStatus();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final long getTotalSize() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            return kModelInfo2.getTotalSize();
        }
        return super.getTotalSize();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final int getType() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            return kModelInfo2.getType();
        }
        return super.getType();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final ExtendedUrlModel getFile_url() {
        ExtendedUrlModel file_url;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (file_url = kModelInfo2.getFile_url()) == null) {
            return super.getFile_url();
        }
        return file_url;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final String getName() {
        String name;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (name = kModelInfo2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final String getName_sec() {
        String name_sec;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (name_sec = kModelInfo2.getName_sec()) == null) {
            return super.getName_sec();
        }
        return name_sec;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (version = kModelInfo2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public final void setFileUrl(ExtendedUrlModel extendedUrlModel) {
        super.setFileUrl(extendedUrlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final void setFile_url(ExtendedUrlModel extendedUrlModel) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setFile_url(extendedUrlModel);
        }
        super.setFile_url(extendedUrlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final void setStatus(int i2) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setStatus(i2);
        }
        super.setStatus(i2);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final void setTotalSize(long j2) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setTotalSize(j2);
        }
        super.setTotalSize(j2);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final void setType(int i2) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setType(i2);
        }
        super.setType(i2);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final void setName(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final void setName_sec(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setName_sec(str);
        }
        super.setName_sec(str);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public final void setVersion(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setVersion(str);
        }
        super.setVersion(str);
    }

    public ModelInfo(com.ss.ugc.effectplatform.model.algorithm.ModelInfo modelInfo) {
        super(modelInfo);
        this.kModelInfo = modelInfo;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            ExtendedUrlModel file_url = kModelInfo2.getFile_url();
            if (file_url != null) {
                super.setFile_url(file_url);
            }
            String name = kModelInfo2.getName();
            if (name != null) {
                super.setName(name);
            }
            String name_sec = kModelInfo2.getName_sec();
            if (name_sec != null) {
                super.setName_sec(name_sec);
            }
            super.setStatus(kModelInfo2.getStatus());
            super.setTotalSize(kModelInfo2.getTotalSize());
            super.setType(kModelInfo2.getType());
            String version = kModelInfo2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModelInfo(com.ss.ugc.effectplatform.model.algorithm.ModelInfo modelInfo, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : modelInfo);
    }
}
