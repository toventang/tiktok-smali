package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import java.util.List;

public interface IBusinessGoodsService {
    static {
        Covode.recordClassIndex(79458);
    }

    void clearCache();

    List<k> createBridges(b bVar);

    BusinessGoodsPublishModel getCurBusinessDraftModel(String str);

    void removeUserSetting(String str);

    void saveBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel);
}
