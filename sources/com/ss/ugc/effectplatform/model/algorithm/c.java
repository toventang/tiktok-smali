package com.ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(102478);
    }

    public static final String a(ModelInfo modelInfo) {
        l.c(modelInfo, "");
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }
}
