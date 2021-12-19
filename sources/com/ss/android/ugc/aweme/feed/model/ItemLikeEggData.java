package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class ItemLikeEggData implements Serializable {
    @c(a = "file_type")
    public String fileType;
    @c(a = "material_url")
    public String materialUrl;

    static {
        Covode.recordClassIndex(59413);
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }
}
