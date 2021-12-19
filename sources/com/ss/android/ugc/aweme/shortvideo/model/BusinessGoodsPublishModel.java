package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import java.util.Objects;

public class BusinessGoodsPublishModel {
    public String draftId;
    public String title;
    public String videoPath;

    static {
        Covode.recordClassIndex(84415);
    }

    public int hashCode() {
        String str = this.videoPath;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toJsonString() {
        return new f().b(this);
    }

    public static BusinessGoodsPublishModel toObj(String str) {
        return (BusinessGoodsPublishModel) new f().a(str, BusinessGoodsPublishModel.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.videoPath, ((BusinessGoodsPublishModel) obj).videoPath);
    }

    public BusinessGoodsPublishModel(String str, String str2) {
        this.draftId = str;
        this.title = str2;
    }

    public BusinessGoodsPublishModel(String str, String str2, String str3) {
        this.draftId = str;
        this.title = str2;
        this.videoPath = str3;
    }
}
