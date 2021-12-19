package com.ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import h.f.b.g;

public class ModelInfoTemplate extends ModelInfo {
    private ExtendedUrlModel fileUrl;
    private final transient ModelInfo kModelInfo;

    static {
        Covode.recordClassIndex(95598);
    }

    public ModelInfoTemplate() {
        this(null, 1, null);
    }

    public ModelInfo getKModelInfo() {
        return this.kModelInfo;
    }

    public String getMD5() {
        ExtendedUrlModel file_url = getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }

    public ExtendedUrlModel getFileUrl() {
        ExtendedUrlModel extendedUrlModel;
        ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (extendedUrlModel = kModelInfo2.getFile_url()) == null) {
            extendedUrlModel = super.getFile_url();
        }
        return new ExtendedUrlModel(extendedUrlModel);
    }

    public void setFileUrl(ExtendedUrlModel extendedUrlModel) {
        this.fileUrl = extendedUrlModel;
        ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setFile_url(extendedUrlModel);
        }
        super.setFile_url(extendedUrlModel);
    }

    public ModelInfoTemplate(ModelInfo modelInfo) {
        super(null, null, null, null, 0, 0, 0, 127, null);
        this.kModelInfo = modelInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModelInfoTemplate(ModelInfo modelInfo, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : modelInfo);
    }
}
