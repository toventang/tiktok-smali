package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;

public class BusinessGoodsPublishSetting implements Serializable {
    private List<BusinessGoodsPublishModel> goodsPublishModels;
    private String userId;

    static {
        Covode.recordClassIndex(84416);
    }

    public List<BusinessGoodsPublishModel> getGoodsPublishModels() {
        return this.goodsPublishModels;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setGoodsPublishModels(List<BusinessGoodsPublishModel> list) {
        this.goodsPublishModels = list;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.userId;
            String str2 = ((BusinessGoodsPublishSetting) obj).userId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }
}
